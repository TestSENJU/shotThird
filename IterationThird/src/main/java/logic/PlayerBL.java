package logic;

import java.util.ArrayList;

import VO.PlayerHotVO;
import VO.PlayerInfoVO;
import VO.PlayerMatchVO;
import VO.PlayerNumberVO;
import VO.PlayerRateVO;
import VO.PlayerShortVO;

public interface PlayerBL {
	
	public PlayerShortVO getPlayerShortByID(String id);
	
	public ArrayList<PlayerShortVO> getPlayerList();
	
	public PlayerInfoVO getPlayerInfoVO(String playerid);
	
	public PlayerNumberVO getPlayerAverageNumber(String playerid,String season,int isAfter);
	
	public PlayerNumberVO getPlayerAllNumber(String playerid,String season,int isAfter);
	
	public PlayerRateVO getPlayerRate(String playerid,String season,int isAfter);
	// 得分篮板助攻盖帽抢断
	public ArrayList<PlayerHotVO> getDayHotPlayer(int option);
	//场均得分，场均篮板，场均助攻，场均盖帽，场均抢断，三分命中率，投篮命中率，罚球命中率
	public ArrayList<PlayerHotVO> getSeasonHotPlayer(int option);
	// 得分篮板助攻
	public ArrayList<PlayerHotVO> getImprovedPlayer(int option);
	
	public ArrayList<PlayerNumberVO> getPlayerAverageNumberByConditions(String location,String league,String season,int rate);

	public ArrayList<PlayerNumberVO> getPlayerAllNumberByConditions(String location,String league,String season,int rate);
	
	public ArrayList<PlayerRateVO> getPlayerRateByConditions(String location,String league,String season,int rate);
	
	public ArrayList<PlayerShortVO> getPlayersSearch(String location,String teamname,String begin,boolean ison);
	
	public PlayerHotVO getSeasonTeamAverage(String season,String teamname,int after,int option);
	
	public PlayerHotVO getPlayerSeasonTeamAverage(String season,String teamname,int after,String playerid,int option);
	//平均数
	public PlayerHotVO getSeasonAverage(String season,int after,int option);
	
	public PlayerHotVO getPlayerSeasonTeamMedian(String season,String teamname,int after,String playerid,int option);
	
	public PlayerHotVO getSeasonTeamMedian(String season,String teamname,int after,int option);
	//中位数
	public PlayerHotVO getSeasonMedian(String season,int after,int option);
	
	public PlayerHotVO getPlayerSeasonTeamVariance(String season,String teamname,int after,String playerid,int option);
	
	public PlayerHotVO getSeasonTeamVariance(String season,String teamname,int after,int option);
	//方差
	public PlayerHotVO getSeasonVariance(String season,int after,int option);
	
	public ArrayList<PlayerHotVO> getPlayerSeasonAll(String season,String playerid,int option);
	//占球队的比例
	public ArrayList<PlayerHotVO> getPlayerPerTeamSeason(String season,String playerid,int option);
	
	public ArrayList<PlayerMatchVO> getPlayerMatches(String season,int after,String playerid);
	
	
	
}
