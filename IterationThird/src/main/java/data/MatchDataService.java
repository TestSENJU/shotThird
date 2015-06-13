package data;

import java.util.ArrayList;

import po.MatchPO;
import po.MatchShortPO;

public interface MatchDataService {
/**
 * 获取num个最近比赛的简略信息
 * @param num
 * @return
 */
	public ArrayList<MatchShortPO> getRecentShortMatch(int num);
/**	
 * 根据球队、赛季获取比赛的简略信息
 * @param team
 * @param season
 * @return
 */
	public ArrayList<MatchShortPO> getShortMatchByTeamSeason(String team,String season);
	
	/**
	 * 根据球员、赛季获取比赛的简略信息
	 * @param playerid
	 * @param season
	 * @return
	 */
	public ArrayList<MatchShortPO> getShortMatchByPlayerSeason(String playerid,String season);
	
/**
 * 	根据球员姓名，球队名，赛季，是否季后赛获取比赛的简略信息 根据比赛的id获取比赛的详细信息
 * @param playername
 * @param teamname
 * @param season
 * @param isAfter true代表季后赛，false代表常规赛
 * @return
 */
	public ArrayList<MatchShortPO> getShortMatchByConditions(String playername,String teamname,String season,boolean isAfter);
	
	/**
	 * 根据比赛的id获取比赛的详细信息
	 * @param matchid
	 * @return
	 */
	public MatchPO getMatchById(String matchid);

	
}
