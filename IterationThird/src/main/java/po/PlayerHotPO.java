package po;
/**
 * 
 * @author wyt
 * 
 * @param playerid球员id
 *  * @param playername球员姓名
 *   * @param team球员所在球队
 *    * @param location球员的位置
 *     * @param isAfter 0季前赛，1常规赛，2季后赛
 *     @param data获得该热点的数据
 *
 */
public class PlayerHotPO {
	String playerid;
	String playername;
	String team;
	String location;
	int isAfter;
	double data;
	public PlayerHotPO(String s){
		this.playerid=s;
		this.playername="";
		this.team="";
		this.location="";
		this.isAfter=-1;
		this.data=0.0;
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
	public int getIsAfter() {
		return isAfter;
	}
	public void setIsAfter(int isAfter) {
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
