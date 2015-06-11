package VO;

public class PlayerShortVO {
private String name;
private String team;
private String location;
private String id;
public PlayerShortVO(String str){
	this.id=str;
}
public String getName() {
	return name;
}
public String getTeam() {
	return team;
}
public void setTeam(String team) {
	this.team = team;
}
public String getLocation() {
	return location;
}
public void setLocation(String location) {
	this.location = location;
}
public String getId() {
	return id;
}
public void setName(String name) {
	this.name = name;
}
public void setId(String id) {
	this.id = id;
}


}
