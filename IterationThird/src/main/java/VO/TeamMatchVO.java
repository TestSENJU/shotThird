package VO;

public class TeamMatchVO {
String teamname;
String matchid;
String season;
String time;
String opponent;
double [] data=new double[15];

public TeamMatchVO(String name,String id){
	this.teamname=name;
	this.matchid=id;
	String strs[]=id.split("_");
	this.season=strs[0];
	this.time=strs[1];
	if(strs[3].equals(name))	this.opponent=strs[4];
	else if(strs[4].equals(name)) this.opponent=strs[3];

	for(int i=0;i<data.length;i++){
		this.data[i]=0.0;
	}
}

public double[] getData() {
	return data;
}

public void setData(double[] data) {
	this.data = data;
}

public String getTeamname() {
	return teamname;
}

public String getMatchid() {
	return matchid;
}

public String getSeason() {
	return season;
}

public String getTime() {
	return time;
}

public String getOpponent() {
	return opponent;
}

}
