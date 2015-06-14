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

	public ArrayList<MatchShortVO> getMatch() {
		// TODO Auto-generated method stub
		ArrayList<MatchShortVO> list=new ArrayList<MatchShortVO>();
		list.add(new MatchShortVO("20131212"));
		list.add(new MatchShortVO("20131112"));
		return list;
	}

	public MatchVO getMatchByMatchId(String matchid) {
		// TODO Auto-generated method stub
		
		return new MatchVO("20121012");
	}

	public ArrayList<MatchShortVO> getMatchByConditions(String playername,
			String teamname, boolean isAfter, String time, String season) {
		// TODO Auto-generated method stub
		ArrayList<MatchShortVO> list=new ArrayList<MatchShortVO>();
		list.add(new MatchShortVO("20131212"));
		list.add(new MatchShortVO("20131112"));
		return list;
	}

	public ArrayList<MatchShortVO> getRecentMatch(int num) {
		// TODO Auto-generated method stub
		ArrayList<MatchShortVO> list=new ArrayList<MatchShortVO>();
		list.add(new MatchShortVO("20131212"));
		list.add(new MatchShortVO("20131112"));
		return list;
	}

}
