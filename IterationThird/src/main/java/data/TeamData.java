package data;

import java.util.ArrayList;

import po.MatchPO;
import po.PlayerHotPO;
import po.PlayerShortPO;
import po.TeamInfoPO;
import po.TeamNumberPO;
import po.TeamPO;
import po.TeamRatePO;

public class TeamData implements TeamDataService {

	public TeamInfoPO getTeamInfo(String shortname) {
		// TODO Auto-generated method stub
		return null;
	}

	public TeamPO getTeamSeasonAverage(String shortname, String season) {
		// TODO Auto-generated method stub
		return null;
	}

	public ArrayList<TeamPO> getTeamAverage(String shortname) {
		// TODO Auto-generated method stub
		return null;
	}

	public ArrayList<MatchPO> getTeamMatches(String shortname) {
		// TODO Auto-generated method stub
		return null;
	}

	public TeamPO getAllTeamSeason(String season) {
		// TODO Auto-generated method stub
		return null;
	}

	public TeamPO getTeamSeason(String shortname, String season) {
		// TODO Auto-generated method stub
		return null;
	}

	public ArrayList<TeamPO> getTeamPO(String shortname) {
		// TODO Auto-generated method stub
		return null;
	}

	public PlayerHotPO getPlayerHot(String shortname, String season, int num) {
		// TODO Auto-generated method stub
		return null;
	}

	public TeamNumberPO getTeamNumberAllPO(String shortname, String season) {
		// TODO Auto-generated method stub
		return null;
	}

	public TeamNumberPO getTeamNumberAveragePO(String shortname, String season) {
		// TODO Auto-generated method stub
		return null;
	}

	public ArrayList<TeamNumberPO> getAllTeamNumberAverage(String season) {
		// TODO Auto-generated method stub
		return null;
	}

	public TeamRatePO getTeamRatePO(String shortname, String season) {
		// TODO Auto-generated method stub
		return null;
	}

	public ArrayList<TeamRatePO> getAllTeamRatePO(String season) {
		// TODO Auto-generated method stub
		return null;
	}

	public ArrayList<TeamNumberPO> getAllTeamNumberAll(String season) {
		// TODO Auto-generated method stub
		return null;
	}

	public ArrayList<PlayerShortPO> getPlayerShortByTeam(String teamname) {
		// TODO Auto-generated method stub
		return null;
	}

}
