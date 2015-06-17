package Data;

import java.util.ArrayList;
import java.util.Hashtable;

import VO.TeamHotVO;
import VO.TeamInfoVO;
import VO.TeamMatchVO;
import VO.TeamNumberVO;
import VO.TeamRateVO;

public interface TeamData {
	//teamname arraylist里还有match的id。matchid的格式是season+"_"+time+"_"+team1+"_"+team2+"_"+(after+"")
	public Hashtable<String,ArrayList<TeamMatchVO>> getTeamMatch();
	//team_season_isafter_option
	public Hashtable<String,TeamHotVO> getTeamSeasonVari();
	//team_season_isafter_option
	public Hashtable<String,TeamHotVO> getTeamSeasonMedian();
	//team_season_isafter_option
	public Hashtable<String,TeamHotVO> getTeamSeasonAver();
	//season_isafter_option
	public Hashtable<String,Double> getTeamVari();
	//season_isafter_option
	public Hashtable<String,Double> getTeamMedian();
	//season_isafter_option
	public Hashtable<String,Double> getTeamAver();
	//teamshortname
	public Hashtable<String ,TeamInfoVO> getTeamInfo();
	//team_season_isafter
	public Hashtable<String,TeamNumberVO> getTeamAllNumber();
	//team_season_isafter
	public Hashtable<String,TeamNumberVO> getTeamAverNumber();
	//team_season_isafter
	public Hashtable<String,TeamRateVO> getTeamRate();
}
