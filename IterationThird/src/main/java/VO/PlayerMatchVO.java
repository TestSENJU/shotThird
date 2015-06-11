package VO;

/**
 * 
 * @author wyt
 * 球员名;位置;在场时间;投篮命中数;投篮出手数;三分命中数;三分出手数;罚球命中数;罚
球出手数;进攻（前场）篮板数;防守（后场）篮板数;总篮板数;助攻数;抢断数;盖帽数;失误
数;犯规数;个人得分; 
 *
 */
public class PlayerMatchVO {
String name;
String id;
String location;
String team;
String opponnet;
String time;
String season;
double[] data=new double[15];

public PlayerMatchVO(String str){
	this.id=str;
}

public String getName() {
	return name;
}

public void setName(String name) {
	this.name = name;
}

public String getId() {
	return id;
}

public void setId(String id) {
	this.id = id;
}

public String getLocation() {
	return location;
}

public void setLocation(String location) {
	this.location = location;
}

public String getTeam() {
	return team;
}

public void setTeam(String team) {
	this.team = team;
}

public String getOpponnet() {
	return opponnet;
}

public void setOpponnet(String opponnet) {
	this.opponnet = opponnet;
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

public double[] getData() {
	return data;
}

public void setData(double[] data) {
	this.data = data;
}

}
