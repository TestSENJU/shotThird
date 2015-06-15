package po;

public class TeamHotPO {
	String teamid;
	String teamname;
	int isAfter;
	double data;

	public TeamHotPO(String s) {
		this.teamid = s;
		this.teamname = "";
		this.isAfter = -1;
		this.data = 0.0;
	}

	public String getPlayername() {
		return teamname;
	}

	public void setPlayername(String teamname) {
		this.teamname = teamname;
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
		return teamid;
	}

}
