package specialpo;

public class TeamAverageRegularDataPO {
	// 赛季场均-常规赛-12-15
	String teamName;
	String season;// 赛季
	String shootRate; // 投篮%
	String shootHit;// 投篮命中
	String shot;// 投篮出手
	String threePointRate;// 三分%
	String threePointHit;// 三分命中
	String threePointShot;// 三分出手
	String freeThrowRate;// 罚球%
	String freeThrowHit;// 罚球命中
	String freeThrowShot;// 罚球出手
	String rebound;// 篮板
	String offensiveRebound;// 前场篮板
	String defendRebound;// 后场篮板
	String assist;// 助攻
	String steal;// 抢断
	String bockShot;// 盖帽
	String muff;// 失误
	String foul;// 犯规
	String score;// 得分
	String losePoint;// 失分
	String winNum;// 胜利场数
	String loseNum;// 失败场数

	public TeamAverageRegularDataPO(String teamName, String season,
			String shootRate, String shootHit, String shot,
			String threePointRate, String threePointHit, String threePointShot,
			String freeThrowRate, String freeThrowHit, String freeThrowShot,
			String rebound, String offensiveRebound, String defendRebound,
			String assist, String steal, String bockShot, String muff,
			String foul, String score, String losePoint, String winNum,
			String loseNum) {
		this.teamName = teamName;
		this.season = season;
		this.shootRate = shootRate;
		this.shootHit = shootHit;
		this.shot = shot;
		this.threePointRate = threePointRate;
		this.threePointHit = threePointHit;
		this.threePointShot = threePointShot;
		this.freeThrowRate = freeThrowRate;
		this.freeThrowHit = freeThrowHit;
		this.freeThrowShot = freeThrowShot;
		this.rebound = rebound;
		this.offensiveRebound = offensiveRebound;
		this.defendRebound = defendRebound;
		this.assist = assist;
		this.steal = steal;
		this.bockShot = bockShot;
		this.muff = muff;
		this.foul = foul;
		this.score = score;
		this.losePoint = losePoint;
		this.winNum = winNum;
		this.loseNum = loseNum;
	}

	public TeamAverageRegularDataPO() {
	}
	
	public String getTeamName(){
		return teamName;
	}

	public String getSeason() {
		return season;
	}

	public void setSeason(String season) {
		this.season = season;
	}

	public String getShootRate() {
		return shootRate;
	}

	public void setShootRate(String shootRate) {
		this.shootRate = shootRate;
	}

	public String getShootHit() {
		return shootHit;
	}

	public void setShootHit(String shootHit) {
		this.shootHit = shootHit;
	}

	public String getShot() {
		return shot;
	}

	public void setShot(String shot) {
		this.shot = shot;
	}

	public String getThreePointRate() {
		return threePointRate;
	}

	public void setThreePointRate(String threePointRate) {
		this.threePointRate = threePointRate;
	}

	public String getThreePointHit() {
		return threePointHit;
	}

	public void setThreePointHit(String threePointHit) {
		this.threePointHit = threePointHit;
	}

	public String getThreePointShot() {
		return threePointShot;
	}

	public void setThreePointShot(String threePointShot) {
		this.threePointShot = threePointShot;
	}

	public String getFreeThrowRate() {
		return freeThrowRate;
	}

	public void setFreeThrowRate(String freeThrowRate) {
		this.freeThrowRate = freeThrowRate;
	}

	public String getFreeThrowHit() {
		return freeThrowHit;
	}

	public void setFreeThrowHit(String freeThrowHit) {
		this.freeThrowHit = freeThrowHit;
	}

	public String getFreeThrowShot() {
		return freeThrowShot;
	}

	public void setFreeThrowShot(String freeThrowShot) {
		this.freeThrowShot = freeThrowShot;
	}

	public String getRebound() {
		return rebound;
	}

	public void setRebound(String rebound) {
		this.rebound = rebound;
	}

	public String getOffensiveRebound() {
		return offensiveRebound;
	}

	public void setOffensiveRebound(String offensiveRebound) {
		this.offensiveRebound = offensiveRebound;
	}

	public String getDefendRebound() {
		return defendRebound;
	}

	public void setDefendRebound(String defendRebound) {
		this.defendRebound = defendRebound;
	}

	public String getAssist() {
		return assist;
	}

	public void setAssist(String assist) {
		this.assist = assist;
	}

	public String getSteal() {
		return steal;
	}

	public void setSteal(String steal) {
		this.steal = steal;
	}

	public String getBockShot() {
		return bockShot;
	}

	public void setBockShot(String bockShot) {
		this.bockShot = bockShot;
	}

	public String getMuff() {
		return muff;
	}

	public void setMuff(String muff) {
		this.muff = muff;
	}

	public String getFoul() {
		return foul;
	}

	public void setFoul(String foul) {
		this.foul = foul;
	}

	public String getScore() {
		return score;
	}

	public void setScore(String score) {
		this.score = score;
	}

	public String getLosePoint() {
		return losePoint;
	}

	public void setLosePoint(String losePoint) {
		this.losePoint = losePoint;
	}

	public String getWinNum() {
		return winNum;
	}

	public void setWinNum(String winNum) {
		this.winNum = winNum;
	}

	public String getLoseNum() {
		return loseNum;
	}

	public void setLoseNum(String loseNum) {
		this.loseNum = loseNum;
	}

	public void setTeamName(String teamName) {
		this.teamName = teamName;
	}
	
}
