package logic;

import java.util.ArrayList;

import VO.PlayerHotVO;
import VO.PlayerInfoVO;
import VO.PlayerMatchVO;
import VO.PlayerNumberVO;
import VO.PlayerRateVO;
import VO.PlayerShortVO;
import VO.PlayerVO;

public interface PlayerBL {
	
	public ArrayList<PlayerShortVO> getPlayerList();
	
	public PlayerInfoVO getPlayerInfoVO(String playerid);
	
	public PlayerNumberVO getPlayerAverageNumber(String playerid,String season,int isAfter);
	
	public PlayerNumberVO getPlayerAllNumber(String playerid,String season,int isAfter);
	
	public PlayerRateVO getPlayerRate(String playerid,String season,int isAfter);
	
	
//	/**
//	 * 
//	 * @param num
//	 * 0得分
//	 * 1篮板
//	 * 2助攻
//	 * 3盖帽
//	 * 4抢断
//	 * @return
//	 */
//	public ArrayList<PlayerHotVO> getTodayHotPlayer(int num);
//	
//	/**
//	 * 
//	 * @param num
//	 * @return
//	 * 0场均得分
//	 * 1场均篮板
//	 * 2场均助攻
//	 * 3场均盖帽
//	 * 4场均抢断
//	 * 5三分命中率
//	 * 6投篮命中率
//	 * 7罚球命中率
//	 */
//	public ArrayList<PlayerHotVO> getSeasonHotPlayer(int num);
//	
//	/**
//	 * 
//	 * @param num
//	 * @return
//	 * 0场均得分
//	 * 1场均篮板
//	 * 2场均助攻
//	 */
//	public ArrayList<PlayerHotVO> getImprovedPlayer(int num);
//	
//	/**
//	 * @param num
//	 * @return
//	 * 获得球员面板显示所需要的球员简略信息的列表
//	 */
//	public ArrayList<PlayerShortVO> getPlayersShortVO(int num);
//	
//   /**
//    * 
//    * @param str
//    * @return
//    * 根据字符串获取球员简略信息的列表
//    */
//	public ArrayList<PlayerShortVO> getPlayerShortVOByStr(String str);
//	
//	/**
//	 * 
//	 * @param playerid
//	 * @return
//	 * 根据球员id获取球员的基础信息
//	 */
//	public PlayerInfoVO getPlayerInfo(String playerid);
//	
//	/**
//	 * 根据球员的id获取球员的数值信息
//	 * @param playerid
//	 * @return
//	 */
//	public PlayerNumberVO getPlayerNumber(String playerid);
//	
//	/**
//	 * 根据球员的id获取球员的命中率等数率信息
//	 * @param playerid
//	 * @return
//	 */
//	public PlayerRateVO getPlayerRate(String playerid);
//	
//	/**
//	 * 根据球队，位置，是否现役，首字母搜索球员，其中任意条件可为空
//	 * @param team
//	 * @param location
//	 * @param isAfter
//	 * @param begin
//	 * @return
//	 */
//	public ArrayList<PlayerShortVO> getPlayerShortByConditions(String team,String location,String isAfter,String begin);
//	
//	/**
//	 * 获得球员参加过的比赛他自己的数值信息
//	 * @param playerid
//	 * @return
//	 */
//	public ArrayList<PlayerMatchVO> getPlayerMatchData(String playerid);
//	
//	/**
//	 * 获得球员这个赛季的平均数值信息
//	 * @param playerid
//	 * @param season
//	 * @return
//	 */
//	public PlayerVO getPlayerSeasonVO(String playerid,String season,boolean isAfter);
//	
//	/**
//	 * 获得球员职业生涯的平均数值信息
//	 * @param playerid
//	 * @return
//	 */
//	public PlayerVO getPlayerVO(String playerid);
//	
//	/**
//	 * 获得所有球员的赛季平均数值信息
//	 * @param season
//	 * @return
//	 */
//	public PlayerVO getAllPlayerSeasonVO(String season,boolean isAfter);
//	
//	/**
//	 * 获得球员这个赛季的中位数数值信息
//	 * @param playerid
//	 * @param season
//	 * @return
//	 */
//	public PlayerVO getPlayerSeasonCenter(String playerid,String season,boolean isAfter);
//	
//	/**
//	 * 获得球员职业生涯的中位数
//	 * @param playerid
//	 * @return
//	 */
//	public PlayerVO getPlayerCenter(String playerid);
//	
//	/**
//	 * 获得所有球员该赛季的中位数
//	 * @param season
//	 * @return
//	 */
//	public PlayerVO getAllPlayerSeasonCenter(String season,boolean isAfter);
//	
//	/**
//	 * 获得球员该赛季的方差
//	 * @param playerid
//	 * @param season
//	 * @return
//	 */
//	public PlayerVO getPlayerSeasonCha(String playerid,String season,boolean isAfter);
//	
//	/**
//	 * 获得该球员职业生涯的方差
//	 * @param playerid
//	 * @return
//	 */
//	public PlayerVO getPlayerCha(String playerid);
//	
//	/**
//	 * 获得所有球员该赛季的方差
//	 * @param season
//	 * @return
//	 */
//	public PlayerVO getAllPlayerSeasonCha(String season,boolean isAfter);
//	
//	/**
//	 * 获得该球员所有赛季的数值数据
//	 * @param playerid
//	 * @param season
//	 * @return
//	 */
//	public ArrayList<PlayerVO> getPlayerSeasonVOList(String playerid,String season,boolean isAfter);
//	
//	/**
//	 * 获得该球员每一场比赛的数值信息
//	 * @param playerid
//	 * @return
//	 */
//	public ArrayList<PlayerVO> getPlayerVOList(String playerid);
//	
//	/**
//	 * 
//	 * @param rate
//	 * @param location
//	 * @param league
//	 * @param season
//	 * @param isAfter
//	 * @param isOn
//	 * @return
//	 */
//	public ArrayList<PlayerNumberVO> getPlayerAllNumberDeclining(String rate,String location,String league,String season,boolean isAfter,boolean isOn);
//	
//	/**
//	 * 
//	 * @param rate
//	 * @param location
//	 * @param league
//	 * @param season
//	 * @param isAfter
//	 * @param isOn
//	 * @return
//	 */
//	public ArrayList<PlayerNumberVO> getPlayerAllNumberRaising(String rate,String location,String league,String season,boolean isAfter,boolean isOn);
//	
//	/**
//	 * 
//	 * @param rate
//	 * @param location
//	 * @param league
//	 * @param season
//	 * @param isAfter
//	 * @param isOn
//	 * @return
//	 */
//	public ArrayList<PlayerNumberVO> getPlayerAverageNumberDeclining(String rate,String location,String league,String season,boolean isAfter,boolean isOn);
//	
//	/**
//	 * 
//	 * @param rate
//	 * @param location
//	 * @param league
//	 * @param season
//	 * @param isAfter
//	 * @param isOn
//	 * @return
//	 */
//	public ArrayList<PlayerNumberVO> getPlayerAverageNumberRaising(String rate,String location,String league,String season,boolean isAfter,boolean isOn);
//	
//	/**
//	 * 
//	 * @param rate
//	 * @param location
//	 * @param league
//	 * @param season
//	 * @param isAfter
//	 * @param isOn
//	 * @return
//	 */
//	public ArrayList<PlayerRateVO> getPlayerAllRateDeclining(String rate,String location,String league,String season,boolean isAfter,boolean isOn);
//	
//	/**
//	 * 
//	 * @param rate
//	 * @param location
//	 * @param league
//	 * @param season
//	 * @param isAfter
//	 * @param isOn
//	 * @return
//	 */
//	public ArrayList<PlayerRateVO> getPlayerAllRateRaising(String rate,String location,String league,String season,boolean isAfter,boolean isOn);
//	
//	
//	public ArrayList<PlayerNumberVO> getPlayerAllNumber();
//	
//	
//	public ArrayList<PlayerRateVO> getPlayerAllRate();
//	
//	
//	public ArrayList<PlayerNumberVO> getPlayerAverageNumber();
//	
	
}
