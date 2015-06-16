package crawler.team;

import java.net.URL;
import java.util.ArrayList;

import org.apache.log4j.Logger;
import org.json.JSONArray;
import org.json.JSONObject;
import org.jsoup.Jsoup;
import org.jsoup.nodes.Document;
import org.jsoup.nodes.Element;
import org.jsoup.select.Elements;

import specialpo.TeamBasicInfo;
import specialpo.TeamSeasonInfo;

import com.gargoylesoftware.htmlunit.WebClient;
import com.gargoylesoftware.htmlunit.WebRequest;
import com.gargoylesoftware.htmlunit.WebResponse;
import com.gargoylesoftware.htmlunit.html.HtmlAnchor;
import com.gargoylesoftware.htmlunit.html.HtmlPage;


public class TeamGet {

	private final static Logger log = Logger.getRootLogger();
	final String INDEX_URL = "http://china.nba.com";
	final String URL_PREFIX = "http://china.nba.com/wap/static/data/team/stats_";
	final String URL_POSTFIX = ".json";
	
	public void getTeam() {
		log.info("开始采集球队信息");
		
		WebClient webClient = new WebClient();
		webClient.getOptions().setCssEnabled(false);
		webClient.getOptions().setJavaScriptEnabled(false);
		
		ArrayList<TeamBasicInfo> teamBasicInfoList = new ArrayList<TeamBasicInfo>();
		ArrayList<TeamSeasonInfo> teamSeasonInfoList = new ArrayList<TeamSeasonInfo>();
		
		try {
			HtmlPage indexPage = webClient.getPage(INDEX_URL);
			HtmlAnchor teamBtn = indexPage.getAnchorByText("球队");
			HtmlPage teamPage = teamBtn.click();
			Document document = Jsoup.parse(teamPage.asXml(), "UTF-8");
			
			Elements section = document.getElementsByClass("area");
			for (Element teams : section) {
				for (Element team : teams.getElementsByTag("a")) {
					TeamBasicInfo teamBasicInfo = new TeamBasicInfo();
					
					teamBasicInfo.setCode(team.attr("href").split("/")[1]);
					
					if (teamBasicInfo.getCode().equals("76ers")) {
						teamBasicInfo.setCode("sixers");
					}
					
					WebRequest request;
					try {
						request = new WebRequest(new URL(
								URL_PREFIX + teamBasicInfo.getCode() + URL_POSTFIX));
						WebResponse response = webClient.loadWebResponse(request);
						String json = new String(response.getContentAsString().getBytes("iso-8859-1"),"utf-8");
						JSONObject jsonObject = new JSONObject(json);
						jsonObject = new JSONObject(jsonObject.getString("payload"));
						
						JSONObject profileJson = new JSONObject(jsonObject.getString("profile"));
						teamBasicInfo.setId(profileJson.getString("id"));
						teamBasicInfo.setDivision(profileJson.getString("conference"));
						teamBasicInfo.setSection(profileJson.getString("division"));
						teamBasicInfo.setLocation(profileJson.getString("cityEn"));
						teamBasicInfo.setFullName(profileJson.getString("nameEn"));
						teamBasicInfo.setAbbreviation(profileJson.getString("abbr"));
						
						JSONArray seasonsJson = new JSONArray(jsonObject.getString("seasons"));
						for (int i = 0; i < seasonsJson.length(); i++) {
							JSONObject seasonJson = new JSONObject(seasonsJson.get(i).toString());
							JSONObject teamJson = new JSONObject(seasonJson.getString("team"));
							JSONObject opponentJson = new JSONObject(seasonJson.getString("opponent"));
							JSONObject teamAverageJson = new JSONObject(teamJson.getString("statAverage"));
							JSONObject teamTotalJson = new JSONObject(teamJson.getString("statTotal"));
							opponentJson = new JSONObject(opponentJson.getString("statTotal"));
							
							TeamSeasonInfo teamSeasonInfo = new TeamSeasonInfo();
							
							teamSeasonInfo.setName(teamBasicInfo.getAbbreviation());
							String season = seasonJson.getString("year");
							teamSeasonInfo.setSeason(season+Integer.toString((Integer.parseInt(season)+1)));
							
							teamSeasonInfo.setNumOfMatch(teamAverageJson.getString("games"));
							teamSeasonInfo.setShootingPersentage(teamAverageJson.getString("fgpct"));
							teamSeasonInfo.setThreePointShootingPersentage(teamAverageJson.getString("tppct"));
							teamSeasonInfo.setFreeThrowShootingPersentage(teamAverageJson.getString("ftpct"));
							
							teamSeasonInfo.setShootings(teamTotalJson.getString("fgm"));
							teamSeasonInfo.setShots(teamTotalJson.getString("fga"));
							teamSeasonInfo.setThreePointShootings(teamTotalJson.getString("tpm"));
							teamSeasonInfo.setThreePointShots(teamTotalJson.getString("tpa"));
							teamSeasonInfo.setFreeThrowShootings(teamTotalJson.getString("ftm"));
							teamSeasonInfo.setFreeThrowShots(teamTotalJson.getString("fta"));
							teamSeasonInfo.setOffensiveRebounds(teamTotalJson.getString("offRebs"));
							teamSeasonInfo.setDefensiveRebounds(teamTotalJson.getString("defRebs"));
							teamSeasonInfo.setRebounds(teamTotalJson.getString("rebs"));
							teamSeasonInfo.setAssists(teamTotalJson.getString("assists"));
							teamSeasonInfo.setSteals(teamTotalJson.getString("steals"));
							teamSeasonInfo.setBlockShots(teamTotalJson.getString("blocks"));
							teamSeasonInfo.setTurnOvers(teamTotalJson.getString("turnovers"));
							teamSeasonInfo.setFouls(teamTotalJson.getString("fouls"));
							teamSeasonInfo.setScore(teamTotalJson.getString("points"));
							
							teamSeasonInfo.setOpponentOffensiveRebounds(opponentJson.getString("offRebs"));
							teamSeasonInfo.setOpponentDefensiveRebounds(opponentJson.getString("defRebs"));
							teamSeasonInfo.setOpponentScore(opponentJson.getString("points"));
							
							teamSeasonInfoList.add(teamSeasonInfo);
						}
					} catch (Exception e) {
						e.printStackTrace();
					}
					
					teamBasicInfoList.add(teamBasicInfo);
				}
			}
		} catch (Exception e) {
			e.printStackTrace();
		}
		
		//DataJdbcImp dataJdbcImp = new DataJdbcImp();
		//dataJdbcImp.storeTeamBasicInfo(teamBasicInfoList);
		//dataJdbcImp.storeTeamSeasonInfo(teamSeasonInfoList);
		//dataJdbcImp.close();
		
		webClient.close();
		
		log.info("球队信息采集完成");
	}

}
