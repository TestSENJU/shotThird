package Data;

import java.util.ArrayList;

import VO.MatchShortVO;
import VO.PlayerShortVO;
import VO.TeamHotVO;
import VO.TeamInfoVO;
import VO.TeamNumberVO;
import VO.TeamRateVO;

public interface TeamData {

	public TeamInfoVO getTeamInfo(String teamname);
	
	public ArrayList<PlayerShortVO> getTeamPlayers(String teamname);
	
	public TeamRateVO getTeamRate(String teamname,String season,int isAfter);
	
	public TeamNumberVO getTeamAverageNumber(String teamname,String season,int isAfter);
	
	public TeamNumberVO getTeamAllNumber(String teamname,String season,int isAfter);
	//场均得分，场均篮板，场均助攻，场均盖帽，场均抢断，三分命中率，投篮命中率，罚球命中率
	public ArrayList<TeamHotVO> getTeamHotVO(int option);
	//1投篮命中数 2投篮出手数:3 三分命中数:4三分出手数 5 罚球命中数6 罚球出手数:
//	7 进攻篮板数:8 防守篮板数:9篮板数:10 助攻数:11 抢断数:12 盖帽数:13 失误数:14 犯规数:15 得分: 
	public ArrayList<TeamHotVO> getTeamAllSingleData(int option,String season,int after);
	
	public ArrayList<TeamHotVO> getTeamAverSingleData(int option,String season,int after);
	
	public ArrayList<MatchShortVO> getMatchesByTeam(String teamname,String season,int after);
	
	//均值，每次比赛球员的均值
	public ArrayList<TeamHotVO> getSeasonTeamA(String team,String season,int after);
	//方差，每次比赛球员的方差
	public ArrayList<TeamHotVO> getSeasonTeamV(String team,String season,int after);
	
	public ArrayList<TeamHotVO> getSeasonTeamM(String team,String season,int after);

	
	
}
