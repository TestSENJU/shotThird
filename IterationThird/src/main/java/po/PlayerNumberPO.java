package po;
/**
 * 
 * @author wyt
 * playername球员姓名
 * playerid球员id
 * time上场时间
 *number参赛场数
 *firstnum先发场数
 *team球员所在球队
 *season赛季
 *data
 * 0"篮板数"
 * 1"助攻数",
	2"进攻篮板数"
	3"防守篮板数"
	4"抢断数"
	5"盖帽数"
	6"失误数"
	7"犯规数"
	8"得分
 */
public class PlayerNumberPO {
	String playername;
	String playerid;
	String time;
	String number;
	String firstnum;
	String team;
	String season;
	double data[]=new double[9];
	public PlayerNumberPO(String id){
		this.playerid=id;
		this.playername="";
		this.team="";
		this.time="";
		this.season="";
		this.number="";
		this.firstnum="";
		for(int i=0;i<data.length;i++){
			this.data[i]=0.0;
		}
	}
	public String getPlayername() {
		return playername;
	}
	public void setPlayername(String playername) {
		this.playername = playername;
	}
	public String getTime() {
		return time;
	}
	public void setTime(String time) {
		this.time = time;
	}
	public String getNumber() {
		return number;
	}
	public void setNumber(String number) {
		this.number = number;
	}
	public String getFirstnum() {
		return firstnum;
	}
	public void setFirstnum(String firstnum) {
		this.firstnum = firstnum;
	}
	public String getTeam() {
		return team;
	}
	public void setTeam(String team) {
		this.team = team;
	}
	public String getSeason() {
		return season;
	}
	public void setSeason(String season) {
		this.season = season;
	}
	public double[] getData() {
		return data;
	}
	public void setData(double[] data) {
		this.data = data;
	}
	public String getPlayerid() {
		return playerid;
	}
	
}
