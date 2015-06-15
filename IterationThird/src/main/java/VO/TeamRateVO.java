package VO;

import po.TeamRatePO;

/**
 * 
 * @author wyt
 *season赛季，如2014-2015
 *isAfter 0季前赛，1常规赛，2季后赛
 * rate
 * 0投篮命中率
 * 1三分命中率
 * 2罚球命中率
 * 3胜率
 * 4进攻回合
 * 5进攻效率
 * 6防守效率
 * 7篮板效率
 * 8抢断效率
 * 9助攻率
 *
 */
public class TeamRateVO {
String teamname;
String season;
int isAfter;

double rate[]=new double[10];
public TeamRateVO(String name){
	this.teamname=name;
	this.season="";
	this.isAfter=-1;
	for(int i=0;i<rate.length;i++){
		this.rate[i]=0.0;
	}
}
public TeamRateVO(TeamRatePO po){
	this.teamname=po.getTeamname();
	this.season=po.getSeason();
	this.isAfter=po.getIsAfter();
	this.rate=po.getRate();
}
public String getTeamname() {
	return teamname;
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
public double[] getRate() {
	return rate;
}
public void setRate(double[] rate) {
	this.rate = rate;
}

}
