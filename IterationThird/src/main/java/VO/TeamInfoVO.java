package VO;

import java.io.Serializable;

public class TeamInfoVO implements Serializable {
	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
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
