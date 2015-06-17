package logic;

import java.util.ArrayList;
import java.util.Hashtable;

import Data.TeamData;
import Data.TeamData_Impl;
import VO.MatchShortVO;
import VO.MatchVO;
import VO.PlayerShortVO;
import VO.TeamHotVO;
import VO.TeamInfoVO;
import VO.TeamNumberVO;
import VO.TeamRateVO;

public class TeamBL_Impl implements TeamBL {
	TeamData td = TeamData_Impl.getInstance();
	Hashtable<String, TeamInfoVO> ifhb = new Hashtable<String, TeamInfoVO>();
	private static TeamBL_Impl instance;

	private TeamBL_Impl() {
		ifhb = td.getTeamInfo();
	}

	public static synchronized TeamBL_Impl getInstance() {
		if (instance == null) {
			instance = new TeamBL_Impl();
		}
		return instance;
	}

	@Override
	public ArrayList<PlayerShortVO> getTeamPlayers(String teamname) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public TeamRateVO getTeamRate(String teamname, String season, int isAfter) {
		// TODO Auto-generated method stub
		return new TeamRateVO("NOP");
	}

	@Override
	public TeamNumberVO getTeamAverageNumber(String teamname, String season,
			int isAfter) {
		// TODO Auto-generated method stub
		return new TeamNumberVO("NOP");
	}

	@Override
	public TeamNumberVO getTeamAllNumber(String teamname, String season,
			int isAfter) {
		// TODO Auto-generated method stub
		return new TeamNumberVO("NOP");
	}

	@Override
	public ArrayList<TeamHotVO> getSeasonHotTeam(int option) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public ArrayList<TeamNumberVO> getTeamAverageNumber(String season,
			int after, int rate) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public ArrayList<TeamNumberVO> getTeamAllNumber(String season, int after,
			int rate) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public ArrayList<TeamRateVO> getTeamRate(String season, int after, int rate) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public TeamHotVO getSeasonTeamAverage(String teamname, String season,
			int after, int option) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public TeamHotVO getSeasonAverage(String season, int after, int option) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public TeamHotVO getSeasonTeamMedian(String teamname, String season,
			int after, int option) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public TeamHotVO getSeasonMedian(String season, int after, int option) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public TeamHotVO getSeasonTeamVariance(String teamname, String season,
			int after, int option) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public TeamHotVO getSeasonVariance(String season, int after, int option) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public ArrayList<MatchShortVO> getMatchesByTeam(String teamname,
			String season, int after) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public ArrayList<TeamHotVO> getSeasonTeamA(String team, String season,
			int after) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public ArrayList<TeamHotVO> getSeasonTeamV(String team, String season,
			int after) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public ArrayList<TeamHotVO> getSeasonTeamM(String team, String season,
			int after) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public TeamInfoVO getTeamInfo(String teamname) {
		// TODO Auto-generated method stub
		return null;
	}
}
