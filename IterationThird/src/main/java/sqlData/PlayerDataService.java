package sqlData;

import java.util.ArrayList;

import po.PlayerHotPO;
import po.PlayerMatchPO;
import po.PlayerNumberPO;
import po.PlayerRatePO;
import po.PlayerShortPO;
import VO.PlayerNumberVO;
import VO.PlayerRateVO;

public interface PlayerDataService {
	/*
	 * 1需要所有球员的简略信息
	 */
	public ArrayList<PlayerShortPO> getAllPlayer();

	/*
	 * 2需要根据一个球员的id获取该球员的基本信息
	 */
	public PlayerShortPO getPlayerbase(String id);

	/*
	 * 3需要根据一个球员的id获取该球员某个赛季季前或季后或常规赛的赛季总数值信息
	 */
	public PlayerNumberPO getPlayerTotal(String id, int isAfter);

	/*
	 * 4需要根据一个球员的id获取该球员某个赛季季前或季后或常规赛的场均总数值信息
	 */
	public PlayerNumberPO getPlayerAverage(String id, int isAfter);

	/*
	 * 5需要根据一个球员的id获取该球员某个赛季季前或季后或常规赛的数率信息
	 */
	public PlayerRatePO getPlayerRate(String id, int isAfter);

	/*
	 * 6根据球员id、赛季、季后赛季前赛或是常规赛返回所有的playermatchpo
	 */
	public ArrayList<PlayerMatchPO> getPlayerMatch(String id, String season,
			int isAfter);

	/*
	 * 7根据球员的位置，联盟，是否现役，赛季，是场均，还有排序依据返回球员的数据信息
	 */
	public ArrayList<PlayerNumberVO> getPlayerAverageNumberByConditions(
			String location, String league, boolean isActive, String season,
			int rate);

	/*
	 * 7根据球员的位置，联盟，是否现役，赛季，否场均，还有排序依据返回球员的数据信息
	 */
	public ArrayList<PlayerNumberVO> getPlayerAllNumberByConditions(
			String location, String league, boolean isActive, String season,
			int rate);

	/*
	 * 8根据球员的位置，联盟，是否现役，赛季，还有排序依据返回球员的数据数率信息
	 */
	public ArrayList<PlayerRateVO> getPlayerRateByConditions(String location,
			String league, boolean isActive, String season, int rate);

	/*
	 * 9根据位置，球队，是否现役，首字母来返回球员的简略信息
	 */
	public ArrayList<PlayerShortPO> getPlayerSimple(String location,
			String team, boolean isActive, String FirstChar);

	/*
	 * 10根据球队、赛季、常规赛季后赛季前赛还有是哪一项返回球队所有球员的平均数值
	 */
	public PlayerHotPO getPlayerTeamAverage(String team, String season,
			int isAfter, int rate);

	/*
	 * 11根据赛季，常规赛季后赛季前赛还有是哪一项返回所有该赛季的球员的平均数值
	 */
	public PlayerHotPO getPlayerSeasonAllAverage(String season, int isAfter,
			int rate);

	/*
	 * 12根据赛季，球员id常规赛季后季前赛还有是哪一项返回该球员这个赛季的平均数值
	 */
	public PlayerHotPO getPlayerSeasonAverage(String season, String playerid,
			int isAfter, int rate);

	/*
	 * 13根据球队、赛季、常规赛季后赛季前赛还有是哪一项返回球队所有球员的中位数
	 */
	public PlayerHotPO getTeamMedian(String team, String season, int isAfter,
			int rate);

	/*
	 * 14根据赛季，常规赛季后赛季前赛还有是哪一项返回所有该赛季的球员的中位数
	 */
	public PlayerHotPO getSeasonMedian(String season, int isAfter, int rate);

	/*
	 * 15根据赛季，球员id常规赛季后季前赛还有是哪一项返回该球员这个赛季的中位数
	 */
	public PlayerHotPO getThePlayerMedian(String season, String id,
			int isAfter, int rate);

	/*
	 * 16根据球队、赛季、常规赛季后赛季前赛还有是哪一项返回球队所有球员的方差
	 */
	public PlayerHotPO getTeamVariance(String team, String season, int isAfter,
			int rate);

	/*
	 * 17根据赛季，球员id常规赛季后季前赛还有是哪一项返回该球员这个赛季的方差
	 */
	public PlayerHotPO getThePlayerVariance(String season, String id,
			int isAfter, int rate);

	/*
	 * 18根据赛季、球队、球员id、常规赛季前季后赛还有是哪一项返回球员这一项本赛季在球队中占到的比例
	 */
	public double getSeasonVariance(String season, String team, String id,
			int isAfter, int rate);

	/*
	 * 19根据赛季，季前季后常规，还有哪一项返回该球员每一次比赛的数值
	 */
	public ArrayList<PlayerHotPO> getEveryMatch(String season, int isAfter,
			int rate);

	/*
	 * 20根据哪一项返回本赛季常规赛进步最快的五名球员,选条件有场均得分、场均篮板、场均助攻
	 */
	public ArrayList<PlayerHotPO> getProgress(int rate);

	/*
	 * 21根据哪一项返回本赛季的热点球员
	 */
	public ArrayList<PlayerHotPO> getSeasonHotPlayer(int rate);

	/*
	 * 22根据哪一项返回当天的热点球员
	 */
	public ArrayList<PlayerHotPO> getDayHotPlayer(int rate);
}