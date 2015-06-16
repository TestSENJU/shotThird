package crawler.player;

import java.io.BufferedInputStream;
import java.io.BufferedOutputStream;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.net.URL;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Calendar;

import org.apache.log4j.Logger;
import org.json.JSONArray;
import org.json.JSONObject;
import org.jsoup.Jsoup;
import org.jsoup.nodes.Document;
import org.jsoup.nodes.Element;
import org.jsoup.select.Elements;

import specialpo.PlayerBasicInfo;
import specialpo.PlayerSeasonInfo;

import com.gargoylesoftware.htmlunit.WebClient;
import com.gargoylesoftware.htmlunit.WebRequest;
import com.gargoylesoftware.htmlunit.WebResponse;
import com.gargoylesoftware.htmlunit.html.HtmlAnchor;
import com.gargoylesoftware.htmlunit.html.HtmlPage;


public class PlayerGet {

	private final static Logger log = Logger.getRootLogger();
	final String INDEX_URL = "http://china.nba.com";
	final String DATA_PATH = "./res";
	
	public void getPlayer() {
		log.info("开始采集球员信息");

		final String URL_PREFIX = "http://china.nba.com/wap/static/data/player/stats_";
		final String URL_POSTFIX = ".json";
		
		WebClient webClient = new WebClient();
		webClient.getOptions().setCssEnabled(false);
		webClient.getOptions().setJavaScriptEnabled(false);
		
		ArrayList<PlayerBasicInfo> playerBasicInfoList = new ArrayList<PlayerBasicInfo>();
		ArrayList<PlayerSeasonInfo> playerSeasonInfoList = new ArrayList<PlayerSeasonInfo>();
		
		try {
			HtmlPage indexPage = webClient.getPage(INDEX_URL);
			HtmlAnchor playerBtn = indexPage.getAnchorByText("球员");
			HtmlPage playerPage = playerBtn.click();
			Document document = Jsoup.parse(playerPage.asXml(), "UTF-8");
			Elements playerList = document.select("tr");
			for (int i = 1; i < playerList.size()-1; i++) {
			//for (int i = 1; i < 2; i++) {
				Element player = playerList.get(i);
				if (!player.text().contains("team.")) {
					Elements playerInfoList = player.select("td");
					
					PlayerBasicInfo playerBasicInfo = new PlayerBasicInfo();
					
					HtmlAnchor playerPersonalBtn = playerPage.getAnchorByHref(
							playerInfoList.get(0).select("a").attr("href"));
					HtmlPage playerPersonalPage = playerPersonalBtn.click();
					
					Document playerPersonalDoc = Jsoup.parse(playerPersonalPage.asXml(), "UTF-8");
					
					String urlName = playerPersonalDoc.getElementsByClass("infoImg").get(0)
							.getElementsByTag("img").get(0).attr("src");
					playerBasicInfo.setCode(
							urlName.substring(urlName.indexOf("_")+1, urlName.lastIndexOf(".")));
					
					playerBasicInfoList.add(playerBasicInfo);
				}
			}
		} catch (Exception e) {
			e.printStackTrace();
		}

		for (PlayerBasicInfo playerBasicInfo : playerBasicInfoList) {
			WebRequest request;
			try {
				request = new WebRequest(new URL(
						URL_PREFIX + playerBasicInfo.getCode() + URL_POSTFIX));
				WebResponse response = webClient.loadWebResponse(request);
				String json = new String(response.getContentAsString().getBytes("iso-8859-1"),"utf-8");
				JSONObject jsonObject = new JSONObject(json);
				jsonObject = new JSONObject(jsonObject.getString("payload"));
				jsonObject = new JSONObject(jsonObject.getString("player"));
				
				JSONObject teamJson = new JSONObject(jsonObject.getString("teamProfile"));
				playerBasicInfo.setTeam(teamJson.getString("abbr"));
				JSONObject playerJson = new JSONObject(jsonObject.getString("playerProfile"));
				playerBasicInfo.setId(playerJson.getString("playerId"));
				playerBasicInfo.setName(playerJson.getString("displayNameEn"));
				playerBasicInfo.setPosition(playerJson.getString("position"));
				playerBasicInfo.setHeight(playerJson.getString("height"));
				playerBasicInfo.setWeight(playerJson.getString("weight"));
				playerBasicInfo.setExp(playerJson.getString("experience"));
				playerBasicInfo.setJerseyNo(playerJson.getString("jerseyNo"));
				
				Calendar calendar = Calendar.getInstance();
				calendar.setTimeInMillis(Long.parseLong(playerJson.getString("dob")));
				SimpleDateFormat simpleDateFormat = new SimpleDateFormat("yyyy-MM-dd");
				String date = simpleDateFormat.format(calendar.getTime());
				playerBasicInfo.setBirthday(date);
				
				playerBasicInfo.setSchool(playerJson.getString("displayAffiliation"));
				
				jsonObject = new JSONObject(jsonObject.getString("stats"));
				jsonObject = new JSONObject(jsonObject.getString("regularSeasonStat"));
				JSONArray jsonArray = new JSONArray(jsonObject.getString("playerTeams"));
				for (int i = 0; i < jsonArray.length(); i++) {
					JSONObject seasonJson = new JSONObject(jsonArray.get(i).toString());
					if (i != jsonArray.length()-1) {
						JSONObject nextJson = new JSONObject(jsonArray.get(i+1).toString());
						if (seasonJson.getString("season").equals(nextJson.getString("season"))) {
							continue;
						}
					}
					JSONObject statAverageJson = new JSONObject(seasonJson.getString("statAverage"));
					JSONObject statTotalJson = new JSONObject(seasonJson.getString("statTotal"));
					
					PlayerSeasonInfo playerSeasonInfo = new PlayerSeasonInfo();
					playerSeasonInfo.setName(playerBasicInfo.getName());
					String season = seasonJson.getString("season");
					playerSeasonInfo.setSeason(season+Integer.toString((Integer.parseInt(season)+1)));
					
					playerSeasonInfo.setNumOfMatch(statAverageJson.getString("games"));
					playerSeasonInfo.setNumOfStart(statAverageJson.getString("gamesStarted"));
					playerSeasonInfo.setShootingPersentage(statAverageJson.getString("fgpct"));
					playerSeasonInfo.setThreePointShootingPersentage(statAverageJson.getString("tppct"));
					playerSeasonInfo.setFreeThrowShootingPersentage(statAverageJson.getString("ftpct"));
					playerSeasonInfo.setEffiency(statAverageJson.getString("efficiency"));
					
					playerSeasonInfo.setPresenceTime(statTotalJson.getString("mins"));
					playerSeasonInfo.setShooting(statTotalJson.getString("fgm"));
					playerSeasonInfo.setShot(statTotalJson.getString("fga"));
					playerSeasonInfo.setThreePointShooting(statTotalJson.getString("tpm"));
					playerSeasonInfo.setThreePointShot(statTotalJson.getString("tpa"));
					playerSeasonInfo.setFreeThrowShooting(statTotalJson.getString("ftm"));
					playerSeasonInfo.setFreeThrowShot(statTotalJson.getString("fta"));
					playerSeasonInfo.setOffensiveRebounds(statTotalJson.getString("offRebs"));
					playerSeasonInfo.setDefensiveRebounds(statTotalJson.getString("defRebs"));
					playerSeasonInfo.setRebounds(statTotalJson.getString("rebs"));
					playerSeasonInfo.setAssists(statTotalJson.getString("assists"));
					playerSeasonInfo.setSteals(statTotalJson.getString("steals"));
					playerSeasonInfo.setBlockshots(statTotalJson.getString("blocks"));
					playerSeasonInfo.setTurnOvers(statTotalJson.getString("turnovers"));
					playerSeasonInfo.setFouls(statTotalJson.getString("fouls"));
					playerSeasonInfo.setScore(statTotalJson.getString("points"));
					
					playerSeasonInfoList.add(playerSeasonInfo);
				}
			} catch (Exception e) {
				e.printStackTrace();
			}
		}
		
		//DataJdbcImp dataJdbcImp = new DataJdbcImp();
		//dataJdbcImp.storePlayerBasicInfo(playerBasicInfoList);
		//dataJdbcImp.close();
		
		for (PlayerBasicInfo playerBasicInfo : playerBasicInfoList) {
			getPlayerHeadPicture(playerBasicInfo, DATA_PATH + "/player/head/");
		}
		
		webClient.close();
		
		log.info("球员信息采集完成");
	}

	private void getPlayerHeadPicture(PlayerBasicInfo player, String path) {
		try {
			String url = "http://china.nba.com/media/img/players/head/230x185/"
					+ player.getId() + ".png";
			BufferedInputStream in;
			try {
				in = new BufferedInputStream(new URL(url).openStream());
			} catch (FileNotFoundException e) {
				in = new BufferedInputStream(
						new URL("http://china.nba.com/media/img/players/head/230x185/"
								+ "not_found.png").openStream());
			}
			
			BufferedOutputStream out = new BufferedOutputStream(
					new FileOutputStream(new File(path + player.getName() + ".png")));
			byte[] buff = new byte[2048];
			int length = in.read(buff);
			while (length != -1) {
				out.write(buff, 0, length);
				length = in.read(buff);
			}
			in.close();
			out.close();
		} catch (Exception e) {
			e.printStackTrace();
		}
	}
}
