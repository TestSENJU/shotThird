package Data;

import java.util.ArrayList;
import java.util.Hashtable;

import VO.PlayerHotVO;
import VO.PlayerInfoVO;
import VO.PlayerMatchVO;
import VO.PlayerNumberVO;
import VO.PlayerRateVO;
import VO.PlayerShortVO;
import VO.TeamHotVO;

public interface PlayerData {
	//playername
	public Hashtable<String,PlayerShortVO> getPlayerShort();
	//playername
	public Hashtable<String,PlayerInfoVO> getPlayerinfo();
//	playername+"_"+season+"_"+(after+"");
	public Hashtable<String,PlayerNumberVO> getPlayerAllnumber();
//	playername+"_"+season+"_"+(after+"");
	public Hashtable<String,PlayerNumberVO> getPlayerAverNumber();
//	playername+"_"+season+"_"+(after+"");
	public Hashtable<String,PlayerRateVO> getPlayerRate();
//	player_season_isafter_option
	public Hashtable<String,Double> getPlayerAver();
//	season_isafter_option
	public Hashtable<String,PlayerHotVO> getPlayerAverSeason();
//	team_season_isafter_option
	public Hashtable<String,TeamHotVO> getPlayerAverTeam();
//	player_season_isafter_option
	public Hashtable<String,Double> getPlayerMedian();
//	team_season_isafter_option
	public Hashtable<String,TeamHotVO> getPlayerMedianTeam();
//	season_isafter_option
	public  Hashtable<String,PlayerHotVO> getPlayerMedianSeason();
//	team_season_isafter_option	
	public Hashtable<String,TeamHotVO> getPlayerVariTeam();
//	season_isafter_option
	public  Hashtable<String,PlayerHotVO> getPlayerVariSeason();
	//playername
	public Hashtable<String,ArrayList<PlayerMatchVO>> getPlayerMatch();
	
	
}
