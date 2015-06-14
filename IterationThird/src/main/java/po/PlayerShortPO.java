package po;
/**
 * 
 * @author wyt
 *team球队
 *isOn是否现役
 *location位置
 */
public class PlayerShortPO {
	String playerid;
	String playername;
	String team;
	String location;
	boolean isOn;
	public PlayerShortPO(String s){
		this.playerid=s;
		this.playername="";
		this.team="";
		this.location="";
		this.isOn=true;
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
	public boolean isOn() {
		return isOn;
	}
	public void setOn(boolean isOn) {
		this.isOn = isOn;
	}
	public String getPlayerid() {
		return playerid;
	}
	
}
