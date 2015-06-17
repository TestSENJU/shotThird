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

	public Hashtable<String,PlayerShortVO> getPlayerShort();
	
	public Hashtable<String,PlayerInfoVO> getPlayerinfo();
	
	public Hashtable<String,PlayerNumberVO> getPlayerAllnumber();
	
	public Hashtable<String,PlayerNumberVO> getPlayerAverNumber();
	
	public Hashtable<String,PlayerRateVO> getPlayerRate();
	
	public Hashtable<String,Double> getPlayerAver();
	
	public Hashtable<String,PlayerHotVO> getPlayerAverSeason();
	
	public Hashtable<String,TeamHotVO> getPlayerAverTeam();
	
	public Hashtable<String,Double> getPlayerMedian();
	
	public Hashtable<String,TeamHotVO> getPlayerMedianTeam();
	
	public  Hashtable<String,PlayerHotVO> getPlayerMedianSeason();
	
	public Hashtable<String,TeamHotVO> getPlayerVariTeam();
	
	public  Hashtable<String,PlayerHotVO> getPlayerVariSeason();
	
	public Hashtable<String,ArrayList<PlayerMatchVO>> getPlayerMatch();
	
	
}
