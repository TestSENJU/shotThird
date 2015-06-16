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
	this.winner="";
	this.loser="";
	this.score="";
	this.time="";
	this.season="";
	this.isAfter=-1;
}
//public MatchShortVO(MatchShortPO po){
//	this.matchid=po.getMatchid();
//	this.winner=po.getWinner();
//	this.loser=po.getLoser();
//	this.score=po.getScore();
//	this.time=po.getTime();
//	this.season=po.getSeason();
//	this.score=po.getScore();
//}
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
public void setTime(String time) {
	this.time = time;
}
public String getSeason() {
	return season;
}
public void setSeason(String season) {
	this.season = season;
}
public int getIsAfter() {
	return isAfter;
}
public void setIsAfter(int isAfter) {
	this.isAfter = isAfter;
}
public String getMatchid() {
	return matchid;
}

}
