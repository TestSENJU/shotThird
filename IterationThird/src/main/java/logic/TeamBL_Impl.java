package logic;

import java.util.ArrayList;

import VO.PlayerShortVO;
import VO.TeamNumberVO;
import VO.TeamRateVO;

public class TeamBL_Impl implements TeamBL{
	  private static TeamBL_Impl instance ;
	    private TeamBL_Impl() {

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
		public TeamRateVO getTeamRate(String teamname, String season,
				int isAfter) {
			// TODO Auto-generated method stub
			return new TeamRateVO("NOP") ;
		}
		@Override
		public TeamNumberVO getTeamAverageNumber(String teamname,
				String season, int isAfter) {
			// TODO Auto-generated method stub
			return new TeamNumberVO("NOP") ;
		}
		@Override
		public TeamNumberVO getTeamAllNumber(String teamname, String season,
				int isAfter) {
			// TODO Auto-generated method stub
			return new TeamNumberVO("NOP") ;
		}
}
