package data;

import java.util.ArrayList;

import po.PlayerMatchPO;
import po.PlayerNumberPO;
import po.PlayerPO;
import po.PlayerRatePO;
import po.PlayerShortPO;

public interface PlayerDataService {
/**
 * 获得所有球员的简略信息的列表
 * @return
 */
	public ArrayList<PlayerShortPO> getPlayerShortList();
	
	/**
	 * 根据位置，球队缩写名，首字母，是否现役获得球员的简略信息
	 * @param location
	 * @param teamname
	 * @param begin
	 * @param isOn
	 * @return
	 */
	public ArrayList<PlayerShortPO> getPlayerShortByConditions(String location,String teamname,String begin,boolean isOn);
	
	/**根据球员id和赛季获得该赛季球员所有比赛信息
	 * @param playerid
	 * @param season
	 * @return
	 */
	public ArrayList<PlayerMatchPO> getPlayerMatchesSeason(String playerid,String season);
	
	/**
	 * 根据位置联盟赛季是否季后赛是否退役获取球员的数值信息
	 * @param location
	 * @param league
	 * @param season
	 * @param isAfter true代表季后赛
	 * @param isOn true代表现役
	 * @return
	 */
	public ArrayList<PlayerNumberPO> getPlayerNumberAverageByConditions(String location,String league,String season,boolean isAfter,boolean isOn);;
	
	/**
	 * 根据位置联盟赛季是否季后赛是否退役获取球员的数值信息
	 * @param location
	 * @param league
	 * @param season
	 * @param isAfter true代表季后赛
	 * @param isOn true代表现役
	 * @return
	 */
	public ArrayList<PlayerNumberPO> getPlayerNumberAllByConditions(String location,String league,String season,boolean isAfter,boolean isOn);;

	/**
	 * 根据位置联盟赛季是否季后赛是否退役获取球员的数率信息
	 * @param location
	 * @param league
	 * @param season
	 * @param isAfter true代表季后赛
	 * @param isOn true代表现役
	 * @return
	 */
	public ArrayList<PlayerRatePO> getPlayerRateByConditions(String location,String league,String season,boolean isAfter,boolean isOn);
	
	/**
	 * 根据球员id获取他参加过的比赛所有的数据信息
	 * @param playerid
	 * @return
	 */
	public ArrayList<PlayerPO> getPlayerPO(String playerid);
	
	/**
	 * 根据赛季和球员id获取该赛季球员每一场比赛的数据信息
	 * @param playerid
	 * @param season
	 * @return
	 */
	public ArrayList<PlayerPO> getPlayerSeasonPO(String playerid,String season);
	
	/**
	 * 根据赛季获取该赛季所有球员的平均值
	 * @param season
	 * @return
	 */
	public PlayerPO getAllPlayerSeasonPO(String season);
	
	/**
	 * 根据球员的id获得所有球员的比赛信息
	 * @param playerid
	 * @return
	 */
	public ArrayList<PlayerMatchPO> getPlayerMatches(String playerid);
	
	
}
