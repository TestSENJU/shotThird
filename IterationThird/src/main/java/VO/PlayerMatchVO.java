package VO;

public class PlayerMatchVO {
String playerid;
String playername;
String location;
String time;
String team;
String opponent;
String season;
String matchid;
double[] data=new double[15];

public PlayerMatchVO(String id,String s){
	this.matchid=s;
	this.playerid=id;
}
}
