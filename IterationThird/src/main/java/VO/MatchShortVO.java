package VO;

import java.io.Serializable;


public class MatchShortVO  implements Serializable{
/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
String matchid;
String winner;
String loser;
String score;
String time;
String season;
int isAfter;
public MatchShortVO(String id){
	this.matchid=id;
	String strs[]=id.split("_");

	this.season=strs[0];
	this.time=strs[1];
	this.loser="";
	this.isAfter=Integer.parseInt(strs[4]);
	this.winner="";
	this.score="";
}
public String getWinner() {
	return winner;
}
public void setWinner(String winner) {
	this.winner = winner;
}
public String getLoser() {
	return loser;
}
public void setLoser(String loser) {
	this.loser = loser;
}
public String getScore() {
	return score;
}
public void setScore(String score) {
	this.score = score;
}
public String getTime() {
	return time;
}
public String getSeason() {
	return season;
}
public int getIsAfter() {
	return isAfter;
}
public String getMatchid() {
	return matchid;
}

}
