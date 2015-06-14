package VO;
/**
 * 
 * @author wyt
 *
 * 0"篮板数"
 * 1"助攻数",
	2"进攻篮板数"
	3"防守篮板数"
	4"抢断数"
	5"盖帽数"
	6"失误数"
	7"犯规数"
	8"得分"
 */
public class PlayerNumberVO {
String playername;
String playerid;
String time;//,"上场时间",
int number;//"参赛场数"
int firstnum;//"先发场数"
String team;
String season;

double data[]=new double[9];
public PlayerNumberVO(String id){
	this.playerid=id;
	this.playername=" ";
	this.firstnum=0;
	this.number=0;
	this.time="0:0";
	this.team=" ";
	this.season="2014-2015";
}

public String getPlayerid() {
	return playerid;
}

public String getPlayername() {
	return playername;
}
public void setPlayername(String playername) {
	this.playername = playername;
}
public String getTime() {
	return time;
}
public void setTime(String time) {
	this.time = time;
}
public int getNumber() {
	return number;
}
public void setNumber(int number) {
	this.number = number;
}
public int getFirstnum() {
	return firstnum;
}
public void setFirstnum(int firstnum) {
	this.firstnum = firstnum;
}
public String getTeam() {
	return team;
}
public void setTeam(String team) {
	this.team = team;
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

}
