package data;

import java.util.ArrayList;

import po.MatchPO;
import po.PlayerHotPO;
import po.PlayerShortPO;
import po.TeamInfoPO;
import po.TeamNumberPO;
import po.TeamPO;
import po.TeamRatePO;

public interface TeamDataService {
/**
 * 根据球队的缩写名获得球队的基本信息
 * @param shortname
 * @return
 */
	public TeamInfoPO getTeamInfo(String shortname);
	
	/**
	 * 根据球队的缩写名和赛季获得球队的平均数据
	 * @param shortname
	 * @param season
	 * @return
	 */
	public TeamPO getTeamSeasonAverage(String shortname,String season);
	
	/**
	 * 根据球队的缩写名获取球队每一个赛季的平均数据
	 * @param shortname
	 * @return
	 */
	public ArrayList<TeamPO> getTeamAverage(String shortname);
	
	/**
	 * 根据球队的缩写名获取比赛数据
	 * @param shortname
	 * @return
	 */
	public ArrayList<MatchPO> getTeamMatches(String shortname);
	
	/**
	 * 根据赛季获取该赛季所有球队的平均数据()就是所有的球员的数字加起来然后每一场的加起来最后除以场数
	 * @param season
	 * @return
	 */
	public TeamPO getAllTeamSeason(String season);
	
	/**
	 * 获取该球队某个赛季的平均数据
	 * @param shortname
	 * @param season
	 * @return
	 */
	public TeamPO getTeamSeason(String shortname,String season);
	
	/**
	 * 获取该球队所有赛季的平均数据
	 * @param shortname
	 * @return
	 */
	public ArrayList<TeamPO> getTeamPO(String shortname);
	
	/**
	 * 根据球队名和赛季名获取数据王
	 * 0得分 
	 * 1篮板
	 * 2盖帽
	 * 3助攻
	 * 4抢断
	 * 5投篮命中率
	 * @param shortname
	 * @param season
	 * @param num
	 * @return
	 */
	public PlayerHotPO getPlayerHot(String shortname,String season,int num);
	
	/**
	 * 根据球队的缩写名和赛季获取球队的赛季总数据信息
	 * @param shortname
	 * @param season
	 * @return
	 */
	public TeamNumberPO getTeamNumberAllPO(String shortname,String season);
	
	/**
	 * 根据球队的缩写名和赛季获取球队的赛季平均数据信息
	 * @param shortname
	 * @param season
	 * @return
	 */
	public TeamNumberPO getTeamNumberAveragePO(String shortname,String season);
	
	/**
	 * 根据赛季获得所有球队的赛季平均数据信息
	 * @param season
	 * @return
	 */
	public ArrayList<TeamNumberPO> getAllTeamNumberAverage(String season);
	
	/**
	 * 根据缩写名和赛季获取球队的数率信息
	 * @param shortname
	 * @param season
	 * @return
	 */
	public TeamRatePO getTeamRatePO(String shortname,String season);
	
	/**
	 * 根据赛季获取所有球队的数率信息
	 * @param season
	 * @return
	 */
	public ArrayList<TeamRatePO> getAllTeamRatePO(String season);
	
	/**
	 * 根据赛季获取所有球队的赛季总数据信息
	 * @param season
	 * @return
	 */
	public ArrayList<TeamNumberPO> getAllTeamNumberAll(String season);
	 
	
	/**
	 * 获得一个球队所有球员的简略信息
	 * @param teamname
	 * @return
	 */
	public ArrayList<PlayerShortPO> getPlayerShortByTeam(String teamname);
	
}
