package specialpo;

public class MatchDataPO {
	String gameID;
	String mTime;
	String firstTeamID;
	String firstTeamName;
	String lastTeamID;
	String lastTeamName;
	int firstScore;//球队1的得分
	int first1;//第一段比分
	int first2;
	int first3;
	int first4;
	int secondScore;
	int second1;
	int second2;
	int second3;
	int second4;

	public MatchDataPO(String gameID, String mTime, String firstTeamID,
			String firstTeamName, String lastTeamID, String lastTeamName,
			int firstScore, int first1, int first2, int first3, int first4,
			int secondScore, int second1, int second2, int second3, int second4) {
		this.gameID = gameID;
		this.mTime = mTime;
		this.firstTeamID = firstTeamID;
		this.firstTeamName = firstTeamName;
		this.lastTeamID = lastTeamID;
		this.lastTeamName = lastTeamName;
		this.firstScore = firstScore;
		this.first1 = first1;
		this.first2 = first2;
		this.first3 = first3;
		this.first4 = first4;
		this.secondScore = secondScore;
		this.second1 = second1;
		this.second2 = second2;
		this.second3 = second3;
		this.second4 = second4;
	}

	public MatchDataPO() {
	}
	
	public String getGameID(){
		return gameID;
	}

	public String getmTime() {
		return mTime;
	}

	public void setmTime(String mTime) {
		this.mTime = mTime;
	}

	public String getFirstTeamID() {
		return firstTeamID;
	}

	public void setFirstTeamID(String firstTeamID) {
		this.firstTeamID = firstTeamID;
	}

	public String getFirstTeamName() {
		return firstTeamName;
	}

	public void setFirstTeamName(String firstTeamName) {
		this.firstTeamName = firstTeamName;
	}

	public String getLastTeamID() {
		return lastTeamID;
	}

	public void setLastTeamID(String lastTeamID) {
		this.lastTeamID = lastTeamID;
	}

	public String getLastTeamName() {
		return lastTeamName;
	}

	public void setLastTeamName(String lastTeamName) {
		this.lastTeamName = lastTeamName;
	}

	public int getFirstScore() {
		return firstScore;
	}

	public void setFirstScore(int firstScore) {
		this.firstScore = firstScore;
	}

	public int getFirst1() {
		return first1;
	}

	public void setFirst1(int first1) {
		this.first1 = first1;
	}

	public int getFirst2() {
		return first2;
	}

	public void setFirst2(int first2) {
		this.first2 = first2;
	}

	public int getFirst3() {
		return first3;
	}

	public void setFirst3(int first3) {
		this.first3 = first3;
	}

	public int getFirst4() {
		return first4;
	}

	public void setFirst4(int first4) {
		this.first4 = first4;
	}

	public int getSecondScore() {
		return secondScore;
	}

	public void setSecondScore(int secondScore) {
		this.secondScore = secondScore;
	}

	public int getSecond1() {
		return second1;
	}

	public void setSecond1(int second1) {
		this.second1 = second1;
	}

	public int getSecond2() {
		return second2;
	}

	public void setSecond2(int second2) {
		this.second2 = second2;
	}

	public int getSecond3() {
		return second3;
	}

	public void setSecond3(int second3) {
		this.second3 = second3;
	}

	public int getSecond4() {
		return second4;
	}

	public void setSecond4(int second4) {
		this.second4 = second4;
	}

	public void setGameID(String gameID) {
		this.gameID = gameID;
	}
	
}
