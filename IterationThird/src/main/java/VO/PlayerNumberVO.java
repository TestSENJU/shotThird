package VO;
/**
 * 
 * @author wyt
 * 只用于统计的那个地方
 *
 */
public class PlayerNumberVO {
String playername;
String playerid;
String time;
String number;
String firstnum;
String team;
String season;
double data[]=new double[9];
public PlayerNumberVO(String id){
	this.playerid=id;
}
}
