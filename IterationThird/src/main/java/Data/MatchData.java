package Data;

import java.util.Hashtable;

import VO.MatchShortVO;
import VO.MatchVO;

public interface MatchData {
//返回所有的matchvo
//	String matchid=season+"_"+time+"_"+team1+"_"+team2+"_"+(after+"");
	public Hashtable<String,MatchVO> getMatchvotable();
//	String matchid=season+"_"+time+"_"+team1+"_"+team2+"_"+(after+"");
	public Hashtable<String,MatchShortVO> getMatchShorttable();

}
