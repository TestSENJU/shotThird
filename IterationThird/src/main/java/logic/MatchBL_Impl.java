package logic;

import java.util.ArrayList;

import VO.MatchShortVO;
import VO.MatchVO;
/**
 * at the moment this class is still a stub
 * @author Administrator
 *
 */
public class MatchBL_Impl implements MatchBL{

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
	    

	    
//	public ArrayList<MatchShortVO> getMatch() {
//		// TODO Auto-generated method stub
//		ArrayList<MatchShortVO> list=new ArrayList<MatchShortVO>();
//		list.add(new MatchShortVO("20131212"));
//		list.add(new MatchShortVO("20131112"));
//		return list;
//	}
//
//	public MatchVO getMatchByMatchId(String matchid) {
//		// TODO Auto-generated method stub
//		
//		return new MatchVO("20121012");
//	}
//
//	public ArrayList<MatchShortVO> getMatchByConditions(String playername,
//			String teamname, boolean isAfter, String time, String season) {
//		// TODO Auto-generated method stub
//		ArrayList<MatchShortVO> list=new ArrayList<MatchShortVO>();
//		list.add(new MatchShortVO("20131212"));
//		list.add(new MatchShortVO("20131112"));
//		return list;
//	}
//
//	public ArrayList<MatchShortVO> getRecentMatch(int num) {
//		// TODO Auto-generated method stub
//		ArrayList<MatchShortVO> list=new ArrayList<MatchShortVO>();
//		list.add(new MatchShortVO("20131212"));
//		list.add(new MatchShortVO("20131112"));
//		return list;
//	}

}
