package po;

import java.util.ArrayList;

import VO.PlayerMatchVO;
/**
 * 
 * @author wyt
 * season赛季，如2014-2015
 *time比赛时间，如12-11，分别是月和日
 *matchid
 *loser负方
 *winner胜方球队
 *isAfter 0季前赛，1常规赛，2季后赛
 *scorelist每一场的比分，格式参照总比分
 *winnerlist胜方球队球员的数据，参见迭代二的那一行一行的数据
 *loserlist负方球队球员的数据，参见迭代二的那一行一行的数据
 *score比分，如84-112
 */
public class MatchPO {
	String season;
	String time;
	String matchid;
	String loser;
	String winner;
	int isAfter;
	String score;
	ArrayList<String> scorelist=new ArrayList<String>();
	ArrayList<PlayerMatchVO> winnerlist=new ArrayList<PlayerMatchVO>();
	ArrayList<PlayerMatchVO> loserlist=new ArrayList<PlayerMatchVO>();

	public MatchPO(String id){
		this.matchid=id;
		this.season="";
		this.time="";
		this.loser="";
		this.isAfter=-1;
		this.winner="";
		this.score="";
	}

	public String getScore() {
		return score;
	}

	public void setScore(String score) {
		this.score = score;
	}

	public String getSeason() {
		return season;
	}

	public void setSeason(String season) {
		this.season = season;
	}

	public String getTime() {
		return time;
	}

	public void setTime(String time) {
		this.time = time;
	}

	public String getLoser() {
		return loser;
	}

	public void setLoser(String loser) {
		this.loser = loser;
	}

	public String getWinner() {
		return winner;
	}

	public void setWinner(String winner) {
		this.winner = winner;
	}

	public int getIsAfter() {
		return isAfter;
	}

	public void setIsAfter(int isAfter) {
		this.isAfter = isAfter;
	}

	public ArrayList<String> getScorelist() {
		return scorelist;
	}

	public void setScorelist(ArrayList<String> scorelist) {
		this.scorelist = scorelist;
	}

	public ArrayList<PlayerMatchVO> getWinnerlist() {
		return winnerlist;
	}

	public void setWinnerlist(ArrayList<PlayerMatchVO> winnerlist) {
		this.winnerlist = winnerlist;
	}

	public ArrayList<PlayerMatchVO> getLoserlist() {
		return loserlist;
	}

	public void setLoserlist(ArrayList<PlayerMatchVO> loserlist) {
		this.loserlist = loserlist;
	}

	public String getMatchid() {
		return matchid;
	}
	
}
