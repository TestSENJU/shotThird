package VO;
/**
 *  *0投篮命中数
 *1三分命中数
 *2三分出手数
 *3罚球命中数
 *4罚球出手数
 *5进攻篮板数
 *6防守篮板数
 *7总篮板数
 *8助攻数
 *9抢断数
 *10盖帽数
 *11失误数
 *12犯规数
 *13得分
 * @author Administrator
 *
 */
public class PlayerVO {
	String playerid;
	String playername;
	String season;
	int isAfter;
	String time;
	double[] data=new double[14];
	String team;
	public PlayerVO(String id){
		this.playerid=id;
		this.playername="";
		this.season="";
		this.team="";
		this.isAfter=-1;
		for(int i=0;i<data.length;i++){
			this.data[i]=0.0;
		}
		this.time="0:0";
	}
	
	public String getTime() {
		return time;
	}

	public void setTime(String time) {
		this.time = time;
	}

	public int getIsAfter() {
		return isAfter;
	}

	public void setIsAfter(int isAfter) {
		this.isAfter = isAfter;
	}

	public String getPlayername() {
		return playername;
	}
	public void setPlayername(String playername) {
		this.playername = playername;
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
	public String getTeam() {
		return team;
	}
	public void setTeam(String team) {
		this.team = team;
	}
	public String getPlayerid() {
		return playerid;
	}
}
