package VO;

public class PlayerHotVO {
	String playerid;
	String playername;
	String team;
	String location;
	boolean isAfter;
	double data;
	public PlayerHotVO(String s){
		this.playerid=s;
		this.playername=" ";
		this.team=" ";
		this.location=" ";
	}
	public String getPlayername() {
		return playername;
	}
	public void setPlayername(String playername) {
		this.playername = playername;
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
	public boolean isAfter() {
		return isAfter;
	}
	public void setAfter(boolean isAfter) {
		this.isAfter = isAfter;
	}
	public double getData() {
		return data;
	}
	public void setData(double data) {
		this.data = data;
	}
	public String getPlayerid() {
		return playerid;
	}
	
}
