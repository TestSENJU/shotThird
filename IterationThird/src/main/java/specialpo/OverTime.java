package specialpo;

public class OverTime {
	
	private String serial;
	private String homeScore;
	private String awayScore;
	
	public OverTime() {
		this.serial = "";
		this.homeScore = "";
		this.awayScore = "";
	}

	public String getSerial() {
		return serial;
	}

	public void setSerial(String serial) {
		this.serial = serial;
	}

	public String getHomeScore() {
		return homeScore;
	}

	public void setHomeScore(String homeScore) {
		this.homeScore = homeScore;
	}

	public String getAwayScore() {
		return awayScore;
	}

	public void setAwayScore(String awayScore) {
		this.awayScore = awayScore;
	}

	@Override
	public String toString() {
		return "OverTime [serial=" + serial + ", homeScore=" + homeScore
				+ ", awayScore=" + awayScore + "]";
	}
	
}
