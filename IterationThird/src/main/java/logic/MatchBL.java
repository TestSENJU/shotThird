package logic;

import java.util.ArrayList;

import VO.MatchShortVO;
import VO.MatchVO;
import VO.PlayerShortVO;

public interface MatchBL {
    public MatchVO getMatchByID(String matchid);
    
    public ArrayList<MatchShortVO> getAllMatches(int num);
    
    public ArrayList<MatchShortVO> getRecentMatches(int num);
    
    public ArrayList<String> getScoreListByShortVO(MatchShortVO match);
    
    /**
     * option
     * 0得分
     * 1篮板
     * 2助攻
     * @param matchid
     * @param option
     * @return
     */
    public ArrayList<PlayerShortVO> getMatchKing(String matchid,int option);
    
    public ArrayList<MatchShortVO> getMatchesByConditions(String teamname,String playername,String time,String season,int after);
}
