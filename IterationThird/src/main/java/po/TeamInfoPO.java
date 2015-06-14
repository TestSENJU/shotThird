package po;
/**
 * 
 * @author wyt
 *shortname 缩写名
 *name全名
 *league联盟
 *gym体育馆
 *year建立年份
 */
public class TeamInfoPO {
String shortname;
String name;
String league;
String gym;
String year;
public TeamInfoPO(String str){
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
