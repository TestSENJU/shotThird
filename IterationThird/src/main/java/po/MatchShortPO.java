package po;
/**
 * 
 * @author wyt
 * winner胜方球队
 *loser负方
 *score比分，如84-112
 *time比赛时间，如12-11，分别是月和日
 *season赛季，如2014-2015
 *isAfter 0季前赛，1常规赛，2季后赛
 */
public class MatchShortPO {
	String matchid;
	String winner;
	String loser;
	String score;
	String time;
	String season;
	int  isAfter;
	public MatchShortPO(String id){
		this.matchid=id;
		this.winner="";
		this.loser="";
		this.score="";
		this.time="";
		this.season="";
		this.isAfter=-1;
	}
	public String getWinner() {
		return winner;
	}
	public void setWinner(String winner) {
		this.winner = winner;
	}
	public String getLoser() {
		return loser;
	}
	public void setLoser(String loser) {
		this.loser = loser;
	}
	public String getScore() {
		return score;
	}
	public void setScore(String score) {
		this.score = score;
	}
	public String getTime() {
		return time;
	}
	public void setTime(String time) {
		this.time = time;
	}
	public String getSeason() {
		return season;
	}
	public void setSeason(String season) {
		this.season = season;
	}
	public int getIsAfter() {
		return isAfter;
	}
	public void setIsAfter(int isAfter) {
		this.isAfter = isAfter;
	}
	public String getMatchid() {
		return matchid;
	}
	
}
