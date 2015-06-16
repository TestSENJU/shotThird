package logic;

import java.util.ArrayList;

import VO.MatchShortVO;
import VO.PlayerShortVO;
import VO.TeamHotVO;
import VO.TeamInfoVO;
import VO.TeamNumberVO;
import VO.TeamRateVO;

public interface TeamBL {
	
	public TeamInfoVO getTeamInfo(String teamname);
	
	public ArrayList<PlayerShortVO> getTeamPlayers(String teamname);
	
	public TeamRateVO getTeamRate(String teamname,String season,int isAfter);
	
	public TeamNumberVO getTeamAverageNumber(String teamname,String season,int isAfter);
	
	public TeamNumberVO getTeamAllNumber(String teamname,String season,int isAfter);
	//场均得分，场均篮板，场均助攻，场均盖帽，场均抢断，三分命中率，投篮命中率，罚球命中率
	public ArrayList<TeamHotVO> getSeasonHotTeam(int option);
	
	public ArrayList<TeamNumberVO> getTeamAverageNumber(String season,int after,int rate);
	
	public ArrayList<TeamNumberVO> getTeamAllNumber(String season,int after,int rate);
	
	public ArrayList<TeamRateVO> getTeamRate(String season,int after,int rate);
	
	public TeamHotVO getSeasonTeamAverage(String teamname,String season,int after,int option);
	
	public TeamHotVO getSeasonAverage(String season,int after,int option);
	
	public TeamHotVO getSeasonTeamMedian(String teamname,String season,int after,int option);
	
	public TeamHotVO getSeasonMedian(String season,int after,int option);
	
	public TeamHotVO getSeasonTeamVariance(String teamname,String season,int after,int option);
	
	public TeamHotVO getSeasonVariance(String season,int after,int option);
	
	public ArrayList<MatchShortVO> getMatchesByTeam(String teamname,String season,int after);
	//均值，每次比赛球员的均值
	public ArrayList<TeamHotVO> getSeasonTeamA(String team,String season,int after);
	//方差，每次比赛球员的方差
	public ArrayList<TeamHotVO> getSeasonTeamV(String team,String season,int after);
	
	public ArrayList<TeamHotVO> getSeasonTeamM(String team,String season,int after);

}
