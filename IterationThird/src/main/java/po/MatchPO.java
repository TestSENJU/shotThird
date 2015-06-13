package po;

import java.util.ArrayList;

import VO.PlayerMatchVO;

public class MatchPO {
	String season;
	String time;
	String matchid;
	String loser;
	String winner;
	boolean isAfter;
	ArrayList<String> scorelist=new ArrayList<String>();
	ArrayList<PlayerMatchVO> winnerlist=new ArrayList<PlayerMatchVO>();
	ArrayList<PlayerMatchVO> loserlist=new ArrayList<PlayerMatchVO>();

	public MatchPO(String id){
		this.matchid=id;
	}
}
