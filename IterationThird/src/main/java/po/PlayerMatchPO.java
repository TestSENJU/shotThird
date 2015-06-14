package po;
/**
 * 
 * @author wyt
 * location位置
 *time比赛时间
 *team球队
 *opponent对手
 *season赛季
 *matchid比赛id
 *playingtime上场时间
 *data
 *0投篮命中数
 *1投篮出手数
 *2三分命中数
 *3三分出手数
 *4罚球命中数
 *5罚球出手数
 *6进攻（前场）篮板数
 *7防守（后场）篮板数
 *8总篮板数
 *9助攻数
 *10抢断数
 *11盖帽数
 *12失误数
 *13犯规数
 *14个人得分
 */
public class PlayerMatchPO {
	String playerid;
	String playername;
	String location;
	String playingtime;
	String team;
	String opponent;
	String season;
	String matchid;
	double[] data=new double[15];

	public PlayerMatchPO(String id,String matchid){
		this.matchid=matchid;
		this.playerid=id;
		this.playername="";
		this.location=" ";
		this.team="";
		this.playingtime="";
		this.opponent="";
		this.season="";
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

	public String getLocation() {
		return location;
	}

	public void setLocation(String location) {
		this.location = location;
	}

	public String getTime() {
		return playingtime;
	}

	public void setTime(String time) {
		this.playingtime = time;
	}

	public String getTeam() {
		return team;
	}

	public void setTeam(String team) {
		this.team = team;
	}

	public String getOpponent() {
		return opponent;
	}

	public void setOpponent(String opponent) {
		this.opponent = opponent;
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

	public String getMatchid() {
		return matchid;
	}
	
}
