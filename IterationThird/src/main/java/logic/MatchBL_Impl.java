package logic;

import java.util.ArrayList;
import java.util.Hashtable;
import java.util.Set;

import Data.MatchData;
import Data.MatchData_Impl;
import VO.MatchShortVO;
import VO.MatchVO;
import VO.PlayerShortVO;

/**
 * at the moment this class is still a stub
 * 
 * @author Administrator
 *
 */
public class MatchBL_Impl implements MatchBL {

	MatchData md = MatchData_Impl.getInstance();
	Hashtable<String, MatchVO> mhb = new Hashtable<String, MatchVO>();
	Hashtable<String, MatchShortVO> mshb = new Hashtable<String, MatchShortVO>();
	private static MatchBL_Impl instance;

	private MatchBL_Impl() {
		mhb = md.getMatchvotable();
		mshb = md.getMatchShorttable();
	}

	public static synchronized MatchBL_Impl getInstance() {
		if (instance == null) {
			instance = new MatchBL_Impl();
		}
		return instance;
	}

	@Override
	public MatchVO getMatchByID(String matchid) {
		return mhb.get(matchid);
	}

	@Override
	public ArrayList<MatchShortVO> getAllMatches(int num) {
		ArrayList<MatchShortVO> l = new ArrayList<MatchShortVO>();
		Set<String> keys = mshb.keySet();
		for (String key : keys) {
			l.add(mshb.get(key));
		}
		return l;
	}

	@Override
	public ArrayList<MatchShortVO> getRecentMatches(int num) {
		// TODO
		ArrayList<MatchShortVO> l = new ArrayList<MatchShortVO>();
		Set<String> keys = mshb.keySet();
		for (String key : keys) {
			l.add(mshb.get(key));
		}
		return l;
	}

	@Override
	public ArrayList<String> getScoreListByShortVO(MatchShortVO match) {
		// TODO Auto-generated method stub
		// ArrayList<String>list=data.getMatchDetail(match.getMatchid()).getScorelist();
		return null;
	}

	// @Override
	// public ArrayList<PlayerShortVO> getMatchKing(String matchid, int option)
	// {
	// // TODO Auto-generated method stub
	// return null;
	// }

	@Override
	public ArrayList<MatchShortVO> getMatchesByConditions(String teamname,
			String playername, String time, String season, int after) {
		// TODO Auto-generated method stub
		return null;
	}

}
