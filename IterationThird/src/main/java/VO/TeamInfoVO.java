package VO;

import po.TeamInfoPO;

public class TeamInfoVO {
	String shortname;
	String name;
	String league;
	String gym;
	String year;
public TeamInfoVO(String str){
	this.shortname=str;
	this.name="";
	this.league="";
	this.gym="";
	this.year="";
}
public TeamInfoVO(TeamInfoPO po){
	this.shortname=po.getShortname();
	this.name=po.getName();
	this.league=po.getLeague();
	this.gym=po.getGym();
	this.year=po.getYear();
}
public String getName() {
	return name;
}
public void setName(String name) {
	this.name = name;
}
public String getLeague() {
	return league;
}
public void setLeague(String league) {
	this.league = league;
}
public String getGym() {
	return gym;
}
public void setGym(String gym) {
	this.gym = gym;
}
public String getYear() {
	return year;
}
public void setYear(String year) {
	this.year = year;
}
public String getShortname() {
	return shortname;
}

}
