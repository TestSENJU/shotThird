package VO;

import java.io.Serializable;

public class PlayerShortVO  implements Serializable{
	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	String playername;
	String team;
	String location;
	boolean isOn;
public PlayerShortVO(String s){
	this.playername=s;
	this.team=" ";
	this.location=" ";
	this.isOn=false;
}
public String getPlayername() {
	return playername;
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
public boolean getIsOn() {
	return isOn;
}
public void setIsOn(boolean isAfter) {
	this.isOn = isAfter;
}

}
