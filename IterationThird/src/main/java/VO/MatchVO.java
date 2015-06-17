package VO;

import java.io.Serializable;
import java.util.ArrayList;

public class MatchVO  implements Serializable{
/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
String season;
String time;
String matchid;
String loser;
String winner;
String score;
int isAfter;
ArrayList<PlayerMatchVO> winnerlist=new ArrayList<PlayerMatchVO>();
ArrayList<PlayerMatchVO> loserlist=new ArrayList<PlayerMatchVO>();

public MatchVO(String id){
	this.matchid=id;
	String strs[]=id.split("_");
	this.season=strs[0];
	this.time=strs[1];
	this.loser="";
	this.isAfter=Integer.parseInt(strs[4]);
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

public String getTime() {
	return time;
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
