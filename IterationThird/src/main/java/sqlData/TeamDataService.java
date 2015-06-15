package sqlData;

import java.util.ArrayList;

import po.MatchPO;
import po.PlayerShortPO;
import po.TeamHotPO;
import po.TeamInfoPO;
import po.TeamNumberPO;
import po.TeamRatePO;

public interface TeamDataService {
	/*
	 * 1获取一个球队当前所有球员的简略信息
	 */
	public ArrayList<PlayerShortPO> getAllPlayer(String shortname);

	/*
	 * 2根据球队的缩写名获取球队的基本信息
	 */
	public TeamInfoPO getTeamBase(String shortname);

	/*
	 * 3根据球队的缩写名，赛季，季后赛季前赛或常规赛获取球队的赛季总数值信息
	 */
	public TeamNumberPO getTeamTotal(String shortname);

	/*
	 * 4根据球队的缩写名，赛季，季后赛季前赛或常规赛获取球队的数率信息
	 */
	public TeamRatePO getTeamRate(String shortname);

	/*
	 * 5根据球队的缩写名，赛季，季后赛季前赛或常规赛获取球队的场均数值信息
	 */
	public TeamNumberPO getTeamAverage(String shortname);

	/*
	 * 6根据球队的缩写名获取球队参加过的比赛的详细信息
	 */
	public ArrayList<MatchPO> getTeamMatch(String shortname);

	/*
	 * 7根据赛季。季前季后常规、球队的缩写名还有哪一项返回球队这一项的平均数
	 */
	public TeamHotPO getTeamHotAverage(String season, int isAfter,
			String shortname, int rate);

	/*
	 * 8根据赛季、季前季后常规、球队的缩写名还有哪一项返回球队每一场的数值
	 */
	public ArrayList<TeamHotPO> getTeamHotAll(String season, int isAfter,
			String shortname, int rate);

	/*
	 * 9根据赛季、季前季后常规、球队的缩写名还有哪一项返回球队的中位数
	 */
	public TeamHotPO getMedian(String season, int isAfter, String shortname,
			int rate);

	/*
	 * 10根据赛季。季前季后常规、球队的缩写名还有哪一项返回球队这一项的方差
	 */
	public TeamHotPO getVariance(String season, int isAfter, String shortname,
			int rate);

	/*
	 * 11根据赛季。季前季后常规还有哪一项返回所有球队这一项的平均数
	 */
	public TeamHotPO getAverage(String season, int isAfter, String shortname,
			int rate);

	/*
	 * 12根据赛季，季前。。。还有哪一项返回这一项所有球队的方差
	 */
	public TeamHotPO getVariance(String season, int isAfter, int rate);

	/*
	 * 13根据赛季，季前。。。还有哪一项返回这一项所有球队的中位数
	 */
	public TeamHotPO getMedian(String season, int isAfter, int rate);

	/*
	 * 赛季、季前季后常规、平均还是总赛季、排序依据返回球队的降序排列
	 */
	// "得分/篮板/助攻","两双","参赛场数","先发场数","在场时间","投篮命中率","三分命中率","罚球命中率","助攻数","篮板数","进攻数","防守数","抢断数","盖帽数","失误数","犯规数","得分","效率","GmSc","真实命中率","投篮效率","篮板率","进攻篮板率","防守篮板率","助攻率","抢断率","盖帽率","失误率","使用率"
	public ArrayList<TeamNumberPO> getTeamByConditions(String season,
			int isAfter, boolean isAverage, int rate);

}
