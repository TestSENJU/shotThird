package VO;

import java.io.Serializable;

public class PlayerHotVO  implements Serializable{
	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	String playername;
	String team;
	String location;
	int isAfter;
	double data;
	public PlayerHotVO(String s){
		this.playername=s;
		this.team=" ";
		this.location=" ";
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
	public int isAfter() {
		return isAfter;
	}
	public void setAfter(int isAfter) {
		this.isAfter = isAfter;
	}
	public double getData() {
		return data;
	}
	public void setData(double data) {
		this.data = data;
	}
	
}
