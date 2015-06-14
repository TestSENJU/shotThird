package VO;

public class PlayerVO {
String playerid;
String playername;
String season;
double[] data=new double[14];
String team;

public PlayerVO(String id){
	this.playerid=id;
	this.playername=" ";
	this.season=" ";
	this.team=" ";
	for(int i=0;i<data.length;i++){
		this.data[i]=0.0;
	}
}

public String getPlayername() {
	return playername;
}

public void setPlayername(String playername) {
	this.playername = playername;
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

public String getTeam() {
	return team;
}

public void setTeam(String team) {
	this.team = team;
}

public String getPlayerid() {
	return playerid;
}

}
