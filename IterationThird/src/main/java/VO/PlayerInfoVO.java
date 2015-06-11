package VO;

public class PlayerInfoVO {
String name;
String id;
String school;
String team;
String height;
String weight;
String birth;
String exp;
String location;
public PlayerInfoVO(String str){
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
public String getSchool() {
	return school;
}
public void setSchool(String school) {
	this.school = school;
}
public String getTeam() {
	return team;
}
public void setTeam(String team) {
	this.team = team;
}
public String getHeight() {
	return height;
}
public void setHeight(String height) {
	this.height = height;
}
public String getWeight() {
	return weight;
}
public void setWeight(String weight) {
	this.weight = weight;
}
public String getBirth() {
	return birth;
}
public void setBirth(String birth) {
	this.birth = birth;
}
public String getExp() {
	return exp;
}
public void setExp(String exp) {
	this.exp = exp;
}
public String getLocation() {
	return location;
}
public void setLocation(String location) {
	this.location = location;
}

}
