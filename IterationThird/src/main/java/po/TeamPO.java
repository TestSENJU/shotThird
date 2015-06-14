package po;
/**
 * 
 * @author wyt
 * *  *season赛季，如2014-2015
 *isAfter 0季前赛，1常规赛，2季后赛
 *data就是迭代一二数据里面那些球员一行一行的加起来算个总数
 */
public class TeamPO {
String teamname;
String season;
int isAfter;
double []data=new double[14];
public TeamPO(String name){
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
