package Data;

import java.util.Hashtable;

import VO.MatchShortVO;
import VO.MatchVO;

public interface MatchData {

	public Hashtable<String,MatchVO> getMatchvotable();
	
	public Hashtable<String,MatchShortVO> getMatchShorttable();
	
	

}
