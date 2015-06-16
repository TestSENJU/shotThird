package VO;

import java.io.Serializable;

public class PlayerMatchVO  implements Serializable{
/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
String playerid;
String playername;
String location;
String time;
String team;
String opponent;
String playingtime;
String season;
String matchid;
double[] data=new double[15];

public PlayerMatchVO(String id,String matchid){
	this.matchid=matchid;
	this.playerid=id;
	this.playername="";
	this.location=" ";
	this.team="";
	this.playingtime="";
	this.opponent="";
	this.season="";
	for(int i=0;i<data.length;i++){
		this.data[i]=0.0;
	}
}

public String getPlayingtime() {
	return playingtime;
}

public void setPlayingtime(String playingtime) {
	this.playingtime = playingtime;
}

public String getPlayername() {
	return playername;
}

public void setPlayername(String playername) {
	this.playername = playername;
}

public String getLocation() {
	return location;
}

public void setLocation(String location) {
	this.location = location;
}

public String getTime() {
	return time;
}

public void setTime(String time) {
	this.time = time;
}

public String getTeam() {
	return team;
}

public void setTeam(String team) {
	this.team = team;
}

public String getOpponent() {
	return opponent;
}

public void setOpponent(String opponent) {
	this.opponent = opponent;
}

public String getSeason() {
	return season;
}

public void setSeason(String season) {
	this.season = season;
}

public double[] getData() {
	return data;
}

public void setData(double[] data) {
	this.data = data;
}

public String getPlayerid() {
	return playerid;
}

public String getMatchid() {
	return matchid;
}

}
