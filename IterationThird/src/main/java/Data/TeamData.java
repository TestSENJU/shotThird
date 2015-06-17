package Data;

import java.util.ArrayList;
import java.util.Hashtable;

import VO.TeamHotVO;
import VO.TeamInfoVO;
import VO.TeamMatchVO;
import VO.TeamNumberVO;
import VO.TeamRateVO;

public interface TeamData {
	
	public Hashtable<String,ArrayList<TeamMatchVO>> getTeamMatch();
	
	public Hashtable<String,TeamHotVO> getTeamSeasonVari();
	
	public Hashtable<String,TeamHotVO> getTeamSeasonMedian();
	
	public Hashtable<String,TeamHotVO> getTeamSeasonAver();
	
	public Hashtable<String,Double> getTeamVari();
	
	public Hashtable<String,Double> getTeamMedian();
	
	public Hashtable<String,Double> getTeamAver();
	
	public Hashtable<String ,TeamInfoVO> getTeamInfo();
	
	public Hashtable<String,TeamNumberVO> getTeamAllNumber();
	
	public Hashtable<String,TeamNumberVO> getTeamAverNumber();
	
	public Hashtable<String,TeamRateVO> getTeamRate();
}
