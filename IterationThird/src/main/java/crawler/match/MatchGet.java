package crawler.match;

import java.net.URL;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Calendar;

import org.apache.log4j.Logger;
import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;

import specialpo.MatchBasicInfo;
import specialpo.OverTime;
import specialpo.PlayerMatchInfo;
import specialpo.TeamMatchInfo;

import com.gargoylesoftware.htmlunit.WebClient;
import com.gargoylesoftware.htmlunit.WebRequest;
import com.gargoylesoftware.htmlunit.WebResponse;

public class MatchGet {
	private final static Logger log = Logger.getRootLogger();
	final String URL_PREFIX = "http://china.nba.com/wap/static/data/scores/daily_";
	final String URL_POSTFIX = ".json";
	
	public void getMatchBasicInfo() {		
		log.info("开始采集比赛基本信息");
		
		WebClient webClient = new WebClient();
		webClient.getOptions().setCssEnabled(false);
		webClient.getOptions().setJavaScriptEnabled(false);

		ArrayList<MatchBasicInfo> matchBasicInfoList = new ArrayList<MatchBasicInfo>();
		ArrayList<TeamMatchInfo> teamMatchInfoList = new ArrayList<TeamMatchInfo>();
		ArrayList<PlayerMatchInfo> playerMatchInfoList = new ArrayList<PlayerMatchInfo>();
		
		Calendar to = Calendar.getInstance();
		Calendar from = Calendar.getInstance();
		//2014-10-29 14-15赛季第一次常规赛
		from.set(2013, 9, 5);
		//from.set(2015, 5, 8);
		for (Calendar calendar = from; calendar.compareTo(to)<=0; calendar.add(Calendar.DAY_OF_MONTH, 1)) {
			SimpleDateFormat simpleDateFormat = new SimpleDateFormat("yyyy-MM-dd");
			String date = simpleDateFormat.format(calendar.getTime());
			try {
				WebRequest request = new WebRequest(new URL(URL_PREFIX + date + URL_POSTFIX));
				WebResponse response = webClient.loadWebResponse(request);
				if (response.getStatusCode() == 404) {
					continue;
				}
				String json = new String(response.getContentAsString().getBytes("iso-8859-1"),"utf-8");
				JSONObject jsonObject = new JSONObject(json);
				jsonObject = new JSONObject(jsonObject.getString("payload"));
				try {
					jsonObject = new JSONObject(jsonObject.getString("date"));
				} catch (JSONException e) {
					continue;
				}
				JSONArray jsonArray = new JSONArray(jsonObject.getString("games"));
				for (int i = 0; i < jsonArray.length(); i++) {
					jsonObject = new JSONObject(jsonArray.get(i).toString());
					
					MatchBasicInfo matchBasicInfo = new MatchBasicInfo();
					matchBasicInfo.setDate(date);
					
					JSONObject seasonJson = new JSONObject(json);
					seasonJson = new JSONObject(seasonJson.getString("payload"));
					seasonJson = new JSONObject(seasonJson.getString("season"));
					matchBasicInfo.setSeason(seasonJson.getString("yearDisplay").replace("-", ""));
					
					JSONObject profileJson = new JSONObject(jsonObject.getString("profile"));
					matchBasicInfo.setId(profileJson.getString("gameId"));
					
					JSONObject homeTeamJson = new JSONObject(jsonObject.getString("homeTeam"));
					JSONObject homeTeamProfileJson = new JSONObject(homeTeamJson.getString("profile"));
					matchBasicInfo.setHomeTeam(homeTeamProfileJson.getString("abbr"));
					JSONObject homeTeamScoreJson = new JSONObject(homeTeamJson.getString("score"));
					matchBasicInfo.setHomeScore(homeTeamScoreJson.getString("score"));
					matchBasicInfo.setHomeScore1(homeTeamScoreJson.getString("q1Score"));
					matchBasicInfo.setHomeScore2(homeTeamScoreJson.getString("q2Score"));
					matchBasicInfo.setHomeScore3(homeTeamScoreJson.getString("q3Score"));
					matchBasicInfo.setHomeScore4(homeTeamScoreJson.getString("q4Score"));
					
					JSONObject awayTeamJson = new JSONObject(jsonObject.getString("awayTeam"));
					JSONObject awayTeamProfileJson = new JSONObject(awayTeamJson.getString("profile"));
					matchBasicInfo.setAwayTeam(awayTeamProfileJson.getString("abbr"));
					JSONObject awayTeamScoreJson = new JSONObject(awayTeamJson.getString("score"));
					matchBasicInfo.setAwayScore(awayTeamScoreJson.getString("score"));
					matchBasicInfo.setAwayScore1(awayTeamScoreJson.getString("q1Score"));
					matchBasicInfo.setAwayScore2(awayTeamScoreJson.getString("q2Score"));
					matchBasicInfo.setAwayScore3(awayTeamScoreJson.getString("q3Score"));
					matchBasicInfo.setAwayScore4(awayTeamScoreJson.getString("q4Score"));
					
					if (homeTeamScoreJson.getString("ot1Score").equals("0")
							&& awayTeamScoreJson.getString("ot1Score").equals("0")) {
						matchBasicInfo.setOverTime(false);
					} else {
						matchBasicInfo.setOverTime(true);
						ArrayList<OverTime> overTimeList = new ArrayList<OverTime>();
						for (int j = 1; j < 11; j++) {
							if (homeTeamScoreJson.getString("ot"+j+"Score").equals("0")
									&& awayTeamScoreJson.getString("ot"+j+"Score").equals("0")) {
								break;
							} else {
								OverTime overTime = new OverTime();
								overTime.setSerial(Integer.toString(j));
								overTime.setHomeScore(homeTeamScoreJson.getString("ot"+j+"Score"));
								overTime.setAwayScore(awayTeamScoreJson.getString("ot"+j+"Score"));
								overTimeList.add(overTime);
							}
						}
						matchBasicInfo.setOverTimeList(overTimeList);
					}
					
					matchBasicInfoList.add(matchBasicInfo);
				}
			} catch (Exception e) {
				e.printStackTrace();
			}
		}
		
		for (MatchBasicInfo matchBasicInfo : matchBasicInfoList) {
			final String URL_PREFIX = "http://china.nba.com/wap/static/data/game/snapshot_";
			final String URL_POSTFIX = ".json";
			try {
				WebRequest request = new WebRequest(
						new URL(URL_PREFIX + matchBasicInfo.getId() + URL_POSTFIX));
				WebResponse response = webClient.loadWebResponse(request);
				if (response.getStatusCode() == 404) {
					continue;
				}
				String json = new String(response.getContentAsString().getBytes("iso-8859-1"),"utf-8");
				JSONObject jsonObject = new JSONObject(json);
				jsonObject = new JSONObject(jsonObject.getString("payload"));
				
				TeamMatchInfo homeTeamMatchInfo = new TeamMatchInfo();
				
				JSONObject homeTeamJson = new JSONObject(jsonObject.getString("homeTeam"));
				homeTeamMatchInfo.setSeason(matchBasicInfo.getSeason());
				homeTeamMatchInfo.setMatchID(matchBasicInfo.getId());
				
				JSONObject homeTeamProfileJson = new JSONObject(homeTeamJson.getString("profile"));
				homeTeamMatchInfo.setName(homeTeamProfileJson.getString("abbr"));
				
				JSONObject homeTeamScoreJson = new JSONObject(homeTeamJson.getString("score"));
				homeTeamMatchInfo.setShootings(homeTeamScoreJson.getString("fgm"));
				homeTeamMatchInfo.setShots(homeTeamScoreJson.getString("fga"));
				homeTeamMatchInfo.setThreePointShootings(homeTeamScoreJson.getString("tpm"));
				homeTeamMatchInfo.setThreePointShots(homeTeamScoreJson.getString("tpa"));
				homeTeamMatchInfo.setFreeThrowShootings(homeTeamScoreJson.getString("ftm"));
				homeTeamMatchInfo.setFreeThrowShots(homeTeamScoreJson.getString("fta"));
				homeTeamMatchInfo.setOffensiveRebounds(homeTeamScoreJson.getString("offRebs"));
				homeTeamMatchInfo.setDefensiveRebounds(homeTeamScoreJson.getString("defRebs"));
				homeTeamMatchInfo.setRebounds(homeTeamScoreJson.getString("rebs"));
				homeTeamMatchInfo.setAssists(homeTeamScoreJson.getString("assists"));
				homeTeamMatchInfo.setSteals(homeTeamScoreJson.getString("steals"));
				homeTeamMatchInfo.setBlockShots(homeTeamScoreJson.getString("blocks"));
				homeTeamMatchInfo.setTurnOvers(homeTeamScoreJson.getString("turnovers"));
				homeTeamMatchInfo.setFouls(homeTeamScoreJson.getString("fouls"));
				homeTeamMatchInfo.setScore(homeTeamScoreJson.getString("score"));
				
				teamMatchInfoList.add(homeTeamMatchInfo);
				
				JSONArray homeTeamPlayersJson = new JSONArray(homeTeamJson.getString("gamePlayers"));
				for (int i = 0; i < homeTeamPlayersJson.length(); i++) {
					JSONObject playerJson = new JSONObject(homeTeamPlayersJson.get(i).toString());
					PlayerMatchInfo playerMatchInfo = new PlayerMatchInfo();
					playerMatchInfo.setSeason(matchBasicInfo.getSeason());
					playerMatchInfo.setMatchId(matchBasicInfo.getId());
					playerMatchInfo.setTeam(matchBasicInfo.getHomeTeam());
					
					JSONObject playerProfileJson = new JSONObject(playerJson.getString("profile"));
					playerMatchInfo.setName(playerProfileJson.getString("displayNameEn"));
					playerMatchInfo.setPosition(playerProfileJson.getString("position"));
					
					JSONObject playerStatJson = new JSONObject(playerJson.getString("statTotal"));
					playerMatchInfo.setPresenceTime(playerStatJson.getString("mins"));
					playerMatchInfo.setShootings(playerStatJson.getString("fgm"));
					playerMatchInfo.setShots(playerStatJson.getString("fga"));
					playerMatchInfo.setThreePointShootings(playerStatJson.getString("tpm"));
					playerMatchInfo.setThreePointShots(playerStatJson.getString("tpa"));
					playerMatchInfo.setFreeThrowShootings(playerStatJson.getString("ftm"));
					playerMatchInfo.setFreeThrowShots(playerStatJson.getString("fta"));
					playerMatchInfo.setOffensiveRebounds(playerStatJson.getString("offRebs"));
					playerMatchInfo.setDefensiveRebounds(playerStatJson.getString("defRebs"));
					playerMatchInfo.setRebounds(playerStatJson.getString("rebs"));
					playerMatchInfo.setAssists(playerStatJson.getString("assists"));
					playerMatchInfo.setSteals(playerStatJson.getString("steals"));
					playerMatchInfo.setBlockShots(playerStatJson.getString("blocks"));
					playerMatchInfo.setTurnOvers(playerStatJson.getString("turnovers"));
					playerMatchInfo.setFouls(playerStatJson.getString("fouls"));
					playerMatchInfo.setScore(playerStatJson.getString("points"));
					
					playerMatchInfoList.add(playerMatchInfo);
				}
				
				TeamMatchInfo awayTeamMatchInfo = new TeamMatchInfo();
				
				JSONObject awayTeamJson = new JSONObject(jsonObject.getString("awayTeam"));
				awayTeamMatchInfo.setSeason(matchBasicInfo.getSeason());
				awayTeamMatchInfo.setMatchID(matchBasicInfo.getId());
				
				JSONObject awayTeamProfileJson = new JSONObject(awayTeamJson.getString("profile"));
				awayTeamMatchInfo.setName(awayTeamProfileJson.getString("abbr"));
				
				JSONObject awayTeamScoreJson = new JSONObject(awayTeamJson.getString("score"));
				awayTeamMatchInfo.setShootings(awayTeamScoreJson.getString("fgm"));
				awayTeamMatchInfo.setShots(awayTeamScoreJson.getString("fga"));
				awayTeamMatchInfo.setThreePointShootings(awayTeamScoreJson.getString("tpm"));
				awayTeamMatchInfo.setThreePointShots(awayTeamScoreJson.getString("tpa"));
				awayTeamMatchInfo.setFreeThrowShootings(awayTeamScoreJson.getString("ftm"));
				awayTeamMatchInfo.setFreeThrowShots(awayTeamScoreJson.getString("fta"));
				awayTeamMatchInfo.setOffensiveRebounds(awayTeamScoreJson.getString("offRebs"));
				awayTeamMatchInfo.setDefensiveRebounds(awayTeamScoreJson.getString("defRebs"));
				awayTeamMatchInfo.setRebounds(awayTeamScoreJson.getString("rebs"));
				awayTeamMatchInfo.setAssists(awayTeamScoreJson.getString("assists"));
				awayTeamMatchInfo.setSteals(awayTeamScoreJson.getString("steals"));
				awayTeamMatchInfo.setBlockShots(awayTeamScoreJson.getString("blocks"));
				awayTeamMatchInfo.setTurnOvers(awayTeamScoreJson.getString("turnovers"));
				awayTeamMatchInfo.setFouls(awayTeamScoreJson.getString("fouls"));
				awayTeamMatchInfo.setScore(awayTeamScoreJson.getString("score"));
				
				teamMatchInfoList.add(awayTeamMatchInfo);
				
				JSONArray awayTeamPlayersJson = new JSONArray(awayTeamJson.getString("gamePlayers"));
				for (int i = 0; i < awayTeamPlayersJson.length(); i++) {
					JSONObject playerJson = new JSONObject(awayTeamPlayersJson.get(i).toString());
					PlayerMatchInfo playerMatchInfo = new PlayerMatchInfo();
					playerMatchInfo.setSeason(matchBasicInfo.getSeason());
					playerMatchInfo.setMatchId(matchBasicInfo.getId());
					playerMatchInfo.setTeam(matchBasicInfo.getAwayTeam());
					
					JSONObject playerProfileJson = new JSONObject(playerJson.getString("profile"));
					playerMatchInfo.setName(playerProfileJson.getString("displayNameEn"));
					playerMatchInfo.setPosition(playerProfileJson.getString("position"));
					
					JSONObject playerStatJson = new JSONObject(playerJson.getString("statTotal"));
					playerMatchInfo.setPresenceTime(playerStatJson.getString("mins"));
					playerMatchInfo.setShootings(playerStatJson.getString("fgm"));
					playerMatchInfo.setShots(playerStatJson.getString("fga"));
					playerMatchInfo.setThreePointShootings(playerStatJson.getString("tpm"));
					playerMatchInfo.setThreePointShots(playerStatJson.getString("tpa"));
					playerMatchInfo.setFreeThrowShootings(playerStatJson.getString("ftm"));
					playerMatchInfo.setFreeThrowShots(playerStatJson.getString("fta"));
					playerMatchInfo.setOffensiveRebounds(playerStatJson.getString("offRebs"));
					playerMatchInfo.setDefensiveRebounds(playerStatJson.getString("defRebs"));
					playerMatchInfo.setRebounds(playerStatJson.getString("rebs"));
					playerMatchInfo.setAssists(playerStatJson.getString("assists"));
					playerMatchInfo.setSteals(playerStatJson.getString("steals"));
					playerMatchInfo.setBlockShots(playerStatJson.getString("blocks"));
					playerMatchInfo.setTurnOvers(playerStatJson.getString("turnovers"));
					playerMatchInfo.setFouls(playerStatJson.getString("fouls"));
					playerMatchInfo.setScore(playerStatJson.getString("points"));
					
					playerMatchInfoList.add(playerMatchInfo);
				}
			} catch (Exception e) {
				e.printStackTrace();
			}
		}
		
		//TODO 在这里调用data层对应方法储存list里的内容
		//DataJdbcImp dataJdbcImp = new DataJdbcImp();
		//dataJdbcImp.storeMatchBasicInfo(matchBasicInfoList);
		
		webClient.close();

		log.info("比赛基本信息采集完成");
	}
}
