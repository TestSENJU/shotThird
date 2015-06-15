package logic;

import java.util.ArrayList;

import sqlData.MatchData;
import sqlData.MatchDataService;
import VO.MatchShortVO;
import VO.MatchVO;
import VO.PlayerShortVO;
/**
 * at the moment this class is still a stub
 * @author Administrator
 *
 */
public class MatchBL_Impl implements MatchBL{
	MatchDataService data=new MatchData();

	  private static MatchBL_Impl instance ;
	    private MatchBL_Impl() {

	    }
	    public static synchronized MatchBL_Impl getInstance() {  
	    	if (instance == null) {  
	    		 instance = new MatchBL_Impl();  
	    	 }  
	    	 return instance;  
	    	 }
		@Override
		public MatchVO getMatchByID(String matchid) {
			// TODO Auto-generated method stub
			return null;
		}
		@Override
		public ArrayList<MatchShortVO> getAllMatches(int num) {
			// TODO Auto-generated method stub
			return null;
		}
		@Override
		public ArrayList<MatchShortVO> getRecentMatches(int num) {
			// TODO Auto-generated method stub
			return null;
		}
		@Override
		public ArrayList<String> getScoreListByShortVO(MatchShortVO match) {
			// TODO Auto-generated method stub
			ArrayList<String>list=data.getMatchDetail(match.getMatchid()).getScorelist();
			return list;
		}
		@Override
		public ArrayList<PlayerShortVO> getMatchKing(String matchid, int option) {
			// TODO Auto-generated method stub
			return null;
		}
		@Override
		public ArrayList<MatchShortVO> getMatchesByConditions(String teamname,
				String playername, String time, String season, int after) {
			// TODO Auto-generated method stub
			return null;
		}

}
