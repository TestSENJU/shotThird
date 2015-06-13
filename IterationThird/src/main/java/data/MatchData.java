package data;

import java.util.ArrayList;

import po.MatchPO;
import po.MatchShortPO;

public class MatchData implements MatchDataService {

	public ArrayList<MatchShortPO> getRecentShortMatch(int num) {
		// TODO Auto-generated method stub
		return null;
	}

	public ArrayList<MatchShortPO> getShortMatchByTeamSeason(String team,
			String season) {
		// TODO Auto-generated method stub
		return null;
	}

	public ArrayList<MatchShortPO> getShortMatchByPlayerSeason(String playerid,
			String season) {
		// TODO Auto-generated method stub
		return null;
	}

	public ArrayList<MatchShortPO> getShortMatchByConditions(String playername,
			String teamname, String season, boolean isAfter) {
		// TODO Auto-generated method stub
		return null;
	}

	public MatchPO getMatchById(String matchid) {
		// TODO Auto-generated method stub
		return null;
	}

}
