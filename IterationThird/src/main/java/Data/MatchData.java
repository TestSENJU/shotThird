package Data;

import java.util.ArrayList;

import VO.MatchShortVO;
import VO.MatchVO;

public interface MatchData {

	public MatchVO getMatchByID(String matchid);
	
	public ArrayList<MatchShortVO> getAllMatches(int num);
	
	public ArrayList<MatchShortVO> getMatchByPlayer(String playername);
	
	public ArrayList<MatchShortVO> getMatchByConditions(String teamname,String time,String season,int after);

}
