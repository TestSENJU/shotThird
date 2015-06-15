package sqlData;

import po.MatchPO;
import po.MatchShortPO;
import po.PlayerHotPO;

public interface MatchDataService {
	/*
	 * 1需要最近比赛的简略信息
	 */
	public MatchShortPO getMatchRecent(int num);

	/*
	 * 2根据比赛的id获取比赛的详细信息
	 */
	public MatchPO getMatchDetail(String id);

	/*
	 * 3根据得分、篮板、助攻中任意一项还有比赛id返回这场比赛的数据王
	 */
	public PlayerHotPO getMatchHotPlayer(String id);
}