package specialpo;

import java.util.ArrayList;

public class MatchBasicInfo {

	private String id;
	private String season;
	private String homeTeam;
	private String awayTeam;
	private String date;
	private String homeScore;
	private String homeScore1;
	private String homeScore2;
	private String homeScore3;
	private String homeScore4;
	private String awayScore;
	private String awayScore1;
	private String awayScore2;
	private String awayScore3;
	private String awayScore4;
	private boolean isOverTime;
	private ArrayList<OverTime> overTimeList;
	
	public MatchBasicInfo() {
		this.id = "";
		this.season = "";
		this.homeTeam = "";
		this.awayTeam = "";
		this.date = "";
		this.homeScore = "";
		this.homeScore1 = "";
		this.homeScore2 = "";
		this.homeScore3 = "";
		this.homeScore4 = "";
		this.awayScore = "";
		this.awayScore1 = "";
		this.awayScore2 = "";
		this.awayScore3 = "";
		this.awayScore4 = "";
		this.isOverTime = false;
		this.overTimeList = new ArrayList<OverTime>();
	}

	public String getId() {
		return id;
	}

	public void setId(String id) {
		this.id = id;
	}

	public String getSeason() {
		return season;
	}

	public void setSeason(String season) {
		this.season = season;
	}

	public String getHomeTeam() {
		return homeTeam;
	}

	public void setHomeTeam(String homeTeam) {
		this.homeTeam = homeTeam;
	}

	public String getAwayTeam() {
		return awayTeam;
	}

	public void setAwayTeam(String awayTeam) {
		this.awayTeam = awayTeam;
	}

	public String getDate() {
		return date;
	}

	public void setDate(String date) {
		this.date = date;
	}

	public String getHomeScore() {
		return homeScore;
	}

	public void setHomeScore(String homeScore) {
		this.homeScore = homeScore;
	}

	public String getHomeScore1() {
		return homeScore1;
	}

	public void setHomeScore1(String homeScore1) {
		this.homeScore1 = homeScore1;
	}

	public String getHomeScore2() {
		return homeScore2;
	}

	public void setHomeScore2(String homeScore2) {
		this.homeScore2 = homeScore2;
	}

	public String getHomeScore3() {
		return homeScore3;
	}

	public void setHomeScore3(String homeScore3) {
		this.homeScore3 = homeScore3;
	}

	public String getHomeScore4() {
		return homeScore4;
	}

	public void setHomeScore4(String homeScore4) {
		this.homeScore4 = homeScore4;
	}

	public String getAwayScore() {
		return awayScore;
	}

	public void setAwayScore(String awayScore) {
		this.awayScore = awayScore;
	}

	public String getAwayScore1() {
		return awayScore1;
	}

	public void setAwayScore1(String awayScore1) {
		this.awayScore1 = awayScore1;
	}

	public String getAwayScore2() {
		return awayScore2;
	}

	public void setAwayScore2(String awayScore2) {
		this.awayScore2 = awayScore2;
	}

	public String getAwayScore3() {
		return awayScore3;
	}

	public void setAwayScore3(String awayScore3) {
		this.awayScore3 = awayScore3;
	}

	public String getAwayScore4() {
		return awayScore4;
	}

	public void setAwayScore4(String awayScore4) {
		this.awayScore4 = awayScore4;
	}

	public boolean isOverTime() {
		return isOverTime;
	}

	public void setOverTime(boolean isOverTime) {
		this.isOverTime = isOverTime;
	}

	public ArrayList<OverTime> getOverTimeList() {
		return overTimeList;
	}

	public void setOverTimeList(ArrayList<OverTime> overTimeList) {
		this.overTimeList = overTimeList;
	}

	@Override
	public String toString() {
		return "MatchBasicInfo [id=" + id + ", season=" + season
				+ ", homeTeam=" + homeTeam + ", awayTeam=" + awayTeam
				+ ", date=" + date + ", homeScore=" + homeScore
				+ ", homeScore1=" + homeScore1 + ", homeScore2=" + homeScore2
				+ ", homeScore3=" + homeScore3 + ", homeScore4=" + homeScore4
				+ ", awayScore=" + awayScore + ", awayScore1=" + awayScore1
				+ ", awayScore2=" + awayScore2 + ", awayScore3=" + awayScore3
				+ ", awayScore4=" + awayScore4 + ", isOverTime=" + isOverTime
				+ ", overTimeList=" + overTimeList + "]";
	}

}
