package VO;

public class TeamVO {
String teamname;
String season;
int isAfter;
double []data=new double[14];
public TeamVO(String name){
	this.teamname=name;
	this.season="";
	this.isAfter=-1;
	for(int i=0;i<data.length;i++){
		this.data[i]=0.0;
	}
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
public double[] getData() {
	return data;
}
public void setData(double[] data) {
	this.data = data;
}
public String getTeamname() {
	return teamname;
}

}
