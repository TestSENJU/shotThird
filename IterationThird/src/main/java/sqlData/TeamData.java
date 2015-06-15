package sqlData;

import java.util.ArrayList;

import po.MatchPO;
import po.PlayerShortPO;
import po.TeamHotPO;
import po.TeamInfoPO;
import po.TeamNumberPO;
import po.TeamRatePO;

public class TeamData implements TeamDataService {

	@Override
	public ArrayList<PlayerShortPO> getAllPlayer(String shortname) {
		// TODO Auto-generated method stub
		return new ArrayList<PlayerShortPO>();
	}

	@Override
	public TeamInfoPO getTeamBase(String shortname) {
		// TODO Auto-generated method stub
		return new TeamInfoPO("");
	}

	@Override
	public TeamNumberPO getTeamTotal(String shortname) {
		// TODO Auto-generated method stub
		return new TeamNumberPO("");
	}

	@Override
	public TeamRatePO getTeamRate(String shortname) {
		// TODO Auto-generated method stub
		return new TeamRatePO("");
	}

	@Override
	public TeamNumberPO getTeamAverage(String shortname) {
		// TODO Auto-generated method stub
		return new TeamNumberPO("");
	}

	@Override
	public ArrayList<MatchPO> getTeamMatch(String shortname) {
		// TODO Auto-generated method stub
		ArrayList<MatchPO> a = new ArrayList<MatchPO>();
		a.add(new MatchPO(""));
		return a;
	}

	@Override
	public TeamHotPO getTeamHotAverage(String season, int isAfter,
			String shortname, int rate) {
		// TODO Auto-generated method stub
		return new TeamHotPO("");
	}

	@Override
	public ArrayList<TeamHotPO> getTeamHotAll(String season, int isAfter,
			String shortname, int rate) {
		// TODO Auto-generated method stub
		ArrayList<TeamHotPO> a = new ArrayList<TeamHotPO>();
		a.add(new TeamHotPO(""));
		return a;
	}

	@Override
	public TeamHotPO getMedian(String season, int isAfter, String shortname,
			int rate) {
		// TODO Auto-generated method stub
		return new TeamHotPO("");
	}

	@Override
	public TeamHotPO getVariance(String season, int isAfter, String shortname,
			int rate) {
		// TODO Auto-generated method stub
		return new TeamHotPO("");
	}

	@Override
	public TeamHotPO getAverage(String season, int isAfter, String shortname,
			int rate) {
		// TODO Auto-generated method stub
		return new TeamHotPO("");
	}

	@Override
	public TeamHotPO getVariance(String season, int isAfter, int rate) {
		// TODO Auto-generated method stub
		return new TeamHotPO("");
	}

	@Override
	public TeamHotPO getMedian(String season, int isAfter, int rate) {
		// TODO Auto-generated method stub
		return new TeamHotPO("");
	}

	@Override
	public ArrayList<TeamNumberPO> getTeamByConditions(String season,
			int isAfter, boolean isAverage, int rate) {
		// TODO Auto-generated method stub
		ArrayList<TeamNumberPO> a = new ArrayList<TeamNumberPO>();
		a.add(new TeamNumberPO(""));
		return a;
	}
}