package logic;

import java.util.ArrayList;

import VO.PlayerHotVO;
import VO.PlayerInfoVO;
import VO.PlayerMatchVO;
import VO.PlayerNumberVO;
import VO.PlayerRateVO;
import VO.PlayerShortVO;

public class PlayerBL_Impl implements PlayerBL{
	  private static PlayerBL_Impl instance ;
	    private PlayerBL_Impl() {

	    }
	    public static synchronized PlayerBL_Impl getInstance() {  
	    	if (instance == null) {  
	    		 instance = new PlayerBL_Impl();  
	    	 }  
	    	 return instance;  
	    	 }
		@Override
		public ArrayList<PlayerShortVO> getPlayerList() {
			// TODO Auto-generated method stub
			return null;
		}
		@Override
		public PlayerInfoVO getPlayerInfoVO(String playerid) {
			// TODO Auto-generated method stub
			return null;
		}
		@Override
		public PlayerNumberVO getPlayerAverageNumber(String playerid,
				String season, int isAfter) {
			// TODO Auto-generated method stub
			return null;
		}
		@Override
		public PlayerNumberVO getPlayerAllNumber(String playerid,
				String season, int isAfter) {
			// TODO Auto-generated method stub
			return null;
		}
		@Override
		public PlayerRateVO getPlayerRate(String playerid, String season,
				int isAfter) {
			// TODO Auto-generated method stub
			return null;
		}
		@Override
		public ArrayList<PlayerHotVO> getDayHotPlayer(int option) {
			// TODO Auto-generated method stub
			return null;
		}
		@Override
		public ArrayList<PlayerHotVO> getSeasonHotPlayer(int option) {
			// TODO Auto-generated method stub
			return null;
		}
		@Override
		public ArrayList<PlayerHotVO> getImprovedPlayer(int option) {
			// TODO Auto-generated method stub
			return null;
		}
		@Override
		public ArrayList<PlayerNumberVO> getPlayerAverageNumberByConditions(
				String location, String league, String season, int rate) {
			// TODO Auto-generated method stub
			return null;
		}
		@Override
		public ArrayList<PlayerNumberVO> getPlayerAllNumberByConditions(
				String location, String league, String season, int rate) {
			// TODO Auto-generated method stub
			return null;
		}
		@Override
		public ArrayList<PlayerRateVO> getPlayerRateByConditions(
				String location, String league, String season, int rate) {
			// TODO Auto-generated method stub
			return null;
		}
		@Override
		public ArrayList<PlayerShortVO> getPlayersSearch(String location,
				String teamname, String begin, boolean ison) {
			// TODO Auto-generated method stub
			return null;
		}
		@Override
		public PlayerHotVO getSeasonTeamAverage(String season, String teamname,
				int after, int option) {
			// TODO Auto-generated method stub
			return null;
		}
		@Override
		public PlayerHotVO getPlayerSeasonTeamAverage(String season,
				String teamname, int after, String playerid, int option) {
			// TODO Auto-generated method stub
			return null;
		}
		@Override
		public PlayerHotVO getSeasonAverage(String season, int after, int option) {
			// TODO Auto-generated method stub
			return null;
		}
		@Override
		public PlayerHotVO getPlayerSeasonTeamMedian(String season,
				String teamname, int after, String playerid, int option) {
			// TODO Auto-generated method stub
			return null;
		}
		@Override
		public PlayerHotVO getSeasonTeamMedian(String season, String teamname,
				int after, int option) {
			// TODO Auto-generated method stub
			return null;
		}
		@Override
		public PlayerHotVO getSeasonMedian(String season, int after, int option) {
			// TODO Auto-generated method stub
			return null;
		}
		@Override
		public PlayerHotVO getPlayerSeasonTeamVariance(String season,
				String teamname, int after, String playerid, int option) {
			// TODO Auto-generated method stub
			return null;
		}
		@Override
		public PlayerHotVO getSeasonTeamVariance(String season,
				String teamname, int after, int option) {
			// TODO Auto-generated method stub
			return null;
		}
		@Override
		public PlayerHotVO getSeasonVariance(String season, int after,
				int option) {
			// TODO Auto-generated method stub
			return null;
		}
		@Override
		public ArrayList<PlayerHotVO> getPlayerSeasonAll(String season,
				String playerid, int option) {
			// TODO Auto-generated method stub
			return null;
		}
		@Override
		public ArrayList<PlayerHotVO> getPlayerPerTeamSeason(String season,
				String playerid, int option) {
			// TODO Auto-generated method stub
			return null;
		}
		@Override
		public ArrayList<PlayerMatchVO> getPlayerMatches(String season,
				int after, String playerid) {
			// TODO Auto-generated method stub
			return null;
		}  
	    
}
