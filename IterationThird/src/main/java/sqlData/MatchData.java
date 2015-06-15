package sqlData;

import po.MatchPO;
import po.MatchShortPO;
import po.PlayerHotPO;

public class MatchData implements MatchDataService {

	@Override
	public MatchShortPO getMatchRecent(int num) {
		// TODO Auto-generated method stub
		return new MatchShortPO("");
	}

	@Override
	public MatchPO getMatchDetail(String id) {
		// TODO Auto-generated method stub
		return new MatchPO("");
	}

	@Override
	public PlayerHotPO getMatchHotPlayer(String id) {
		// TODO Auto-generated method stub
		return new PlayerHotPO("");
	}

}
