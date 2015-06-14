package logic;

import java.util.ArrayList;

import VO.MatchShortVO;
import VO.PlayerHotVO;
import VO.PlayerShortVO;
import VO.PlayerVO;
import VO.TeamInfoVO;
import VO.TeamNumberVO;
import VO.TeamRateVO;
import VO.TeamVO;

public interface TeamBL {
	
	public ArrayList<PlayerShortVO> getTeamPlayers(String teamname);
	
	public TeamRateVO getTeamRate(String teamname,String season,int isAfter);
	
	public TeamNumberVO getTeamAverageNumber(String teamname,String season,int isAfter);
	
	public TeamNumberVO getTeamAllNumber(String teamname,String season,int isAfter);
	

//	/**
//	 * 根据球队的缩写名获得球队的信息
//	 * @param name
//	 * @return
//	 */
//	public TeamInfoVO getTeamInfo(String name);
//	
//	/**
//	 * 根据球队的缩写名获得球队的数据信息
//	 * @param name
//	 * @return
//	 */
//	public TeamNumberVO getTeamNumberVO(String name);
//	
//	/**
//	 * 根据球队的缩写名获得球队的数率信息
//	 * @param teamname
//	 * @return
//	 */
//	public TeamRateVO getTeamRateVO(String teamname);
//	
//	/**
//	 * 获得当前赛季常规赛球队所有球队的平均数值信息
//	 * @return
//	 */
//	public ArrayList<TeamNumberVO> getAllTeamNumber();
//	
//	/**
//	 * 获得当前赛季所有球队常规赛的数率信息
//	 * @return
//	 */
//	public ArrayList<TeamRateVO> getAllTeamRate();
//	
//	/**
//	 * 
//	 * @return
//	 */
//	public ArrayList<TeamNumberVO> getAllTeamNumberRaising(String season,boolean isAfter,String rate);
//	
//	public ArrayList<TeamNumberVO> getAllTeamNumberDeclining(String season,boolean isAfter,String rate);
//	
//	public ArrayList<TeamRateVO> getAllTeamRateRaising(String season,boolean isAfter,String rate);
//	
//	public ArrayList<TeamRateVO> getAllTeamRateDeclining(String season,boolean isAfter,String rate);
//	
//	public ArrayList<TeamNumberVO> getAverageTeamNumberRaising(String season,boolean isAfter,String rate);
//	
//	
//	public ArrayList<TeamNumberVO> getAverageTeamNumberDeclining(String season,boolean isAfter,String rate);
//	
//	
//
//	/**
//	 * 获取该球队当前所有球员的简略信息-
//	 * @param teamname
//	 * @return
//	 */
//	public ArrayList<PlayerShortVO> getPlayersShortByTeam(String teamname);
//	
//	/**
//	 * 获取球员该赛季的数值数据
//	 * @param sesaon
//	 * @param teamname
//	 * @param isAfter
//	 * @return
//	 */
//	public ArrayList<TeamVO> getTeamSeasonVO(String sesaon,String teamname,boolean isAfter);
//	
//	/**
//	 * 根据球队缩写名获得球队所有赛季平均的数值数据
//	 * @param shortname
//	 * @return
//	 */
//	public TeamVO getTeamVOByShortName(String shortname);
//	
//	/**
//	 * 获取球队参加过的比赛的简略信息
//	 * @param teamname
//	 * @return
//	 */
//	public ArrayList<MatchShortVO> getMatchByTeam(String teamname);
//	
//	/**
//	 * 获取赛季中球队的数据王
//	 * 0得分
//	 * 1篮板
//	 * 2助攻
//	 * 3盖帽
//	 * 4抢断
//	 * 5投篮命中率
//	 * @param num
//	 * @param season
//	 * @param isAfter
//	 * @return
//	 */
//	public PlayerHotVO getTeamBestPlayer(int num,int season,boolean isAfter);
//	
//	/**
//	 * 根据汉语名字获取缩写名
//	 * @param chinesename
//	 * @return
//	 */
//	public String getTeamShortName(String chinesename);
//	
//	/**
//	 * 
//	 */
//	public PlayerVO getTeamPlayerAverage(String season,String isAfter);
//	
//	
}
