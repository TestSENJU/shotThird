package specialpo;

import java.text.DecimalFormat;

public class TeamSeasonInfo {

	private String name;
	private String season;
	private String numOfMatch;
	private String shootings;
	private String shots;
	private String threePointShootings;
	private String threePointShots;
	private String freeThrowShootings;
	private String freeThrowShots;
	private String offensiveRebounds;
	private String defensiveRebounds;
	private String rebounds;
	private String assists;
	private String steals;
	private String blockShots;
	private String turnOvers;
	private String fouls;
	private String score;
	private String shootingPersentage;
	private String threePointShootingPersentage;
	private String freeThrowShootingPersentage;	
	private String opponentScore;
	private String opponentOffensiveRebounds;
	private String opponentDefensiveRebounds;
	
	public TeamSeasonInfo() {
		this.name = "";
		this.season = "";
		this.numOfMatch = "";
		this.shootings = "";
		this.shots = "";
		this.threePointShootings = "";
		this.threePointShots = "";
		this.freeThrowShootings = "";
		this.freeThrowShots = "";
		this.offensiveRebounds = "";
		this.defensiveRebounds = "";
		this.rebounds = "";
		this.assists = "";
		this.steals = "";
		this.blockShots = "";
		this.turnOvers = "";
		this.fouls = "";
		this.score = "";
		this.shootingPersentage = "";
		this.threePointShootingPersentage = "";
		this.freeThrowShootingPersentage = "";
		this.opponentScore = "";
		this.opponentOffensiveRebounds = "";
		this.opponentDefensiveRebounds = "";
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getSeason() {
		return season;
	}

	public void setSeason(String season) {
		this.season = season;
	}

	public String getNumOfMatch() {
		return numOfMatch;
	}

	public void setNumOfMatch(String numOfMatch) {
		this.numOfMatch = numOfMatch;
	}

	public String getShootings() {
		return shootings;
	}

	public void setShootings(String shootings) {
		this.shootings = shootings;
	}

	public String getShots() {
		return shots;
	}

	public void setShots(String shots) {
		this.shots = shots;
	}

	public String getThreePointShootings() {
		return threePointShootings;
	}

	public void setThreePointShootings(String threePointShootings) {
		this.threePointShootings = threePointShootings;
	}

	public String getThreePointShots() {
		return threePointShots;
	}

	public void setThreePointShots(String threePointShots) {
		this.threePointShots = threePointShots;
	}

	public String getFreeThrowShootings() {
		return freeThrowShootings;
	}

	public void setFreeThrowShootings(String freeThrowShootings) {
		this.freeThrowShootings = freeThrowShootings;
	}

	public String getFreeThrowShots() {
		return freeThrowShots;
	}

	public void setFreeThrowShots(String freeThrowShots) {
		this.freeThrowShots = freeThrowShots;
	}

	public String getOffensiveRebounds() {
		return offensiveRebounds;
	}

	public void setOffensiveRebounds(String offensiveRebounds) {
		this.offensiveRebounds = offensiveRebounds;
	}

	public String getDefensiveRebounds() {
		return defensiveRebounds;
	}

	public void setDefensiveRebounds(String defensiveRebounds) {
		this.defensiveRebounds = defensiveRebounds;
	}

	public String getRebounds() {
		return rebounds;
	}

	public void setRebounds(String rebounds) {
		this.rebounds = rebounds;
	}

	public String getAssists() {
		return assists;
	}

	public void setAssists(String assists) {
		this.assists = assists;
	}

	public String getSteals() {
		return steals;
	}

	public void setSteals(String steals) {
		this.steals = steals;
	}

	public String getBlockShots() {
		return blockShots;
	}

	public void setBlockShots(String blockShots) {
		this.blockShots = blockShots;
	}

	public String getTurnOvers() {
		return turnOvers;
	}

	public void setTurnOvers(String turnOvers) {
		this.turnOvers = turnOvers;
	}

	public String getFouls() {
		return fouls;
	}

	public void setFouls(String fouls) {
		this.fouls = fouls;
	}

	public String getScore() {
		return score;
	}

	public void setScore(String score) {
		this.score = score;
	}

	public String getShootingPersentage() {
		return shootingPersentage;
	}

	public void setShootingPersentage(String shootingPersentage) {
		this.shootingPersentage = shootingPersentage;
	}

	public String getThreePointShootingPersentage() {
		return threePointShootingPersentage;
	}

	public void setThreePointShootingPersentage(String threePointShootingPersentage) {
		this.threePointShootingPersentage = threePointShootingPersentage;
	}

	public String getFreeThrowShootingPersentage() {
		return freeThrowShootingPersentage;
	}

	public void setFreeThrowShootingPersentage(String freeThrowShootingPersentage) {
		this.freeThrowShootingPersentage = freeThrowShootingPersentage;
	}

	public String getOpponentScore() {
		return opponentScore;
	}

	public void setOpponentScore(String opponentScore) {
		this.opponentScore = opponentScore;
	}

	public String getOpponentOffensiveRebounds() {
		return opponentOffensiveRebounds;
	}

	public void setOpponentOffensiveRebounds(String opponentOffensiveRebounds) {
		this.opponentOffensiveRebounds = opponentOffensiveRebounds;
	}

	public String getOpponentDefensiveRebounds() {
		return opponentDefensiveRebounds;
	}

	public void setOpponentDefensiveRebounds(String opponentDefensiveRebounds) {
		this.opponentDefensiveRebounds = opponentDefensiveRebounds;
	}

	public  String  getWinRate() {
		return "0";
	}
	
	public String getAttackRound() {
		DecimalFormat df = new DecimalFormat("#.00");
		return df.format(Integer.parseInt(shots)+0.4*Integer.parseInt(freeThrowShots)-1.07
				*(Double.parseDouble(offensiveRebounds)/(Integer.parseInt(offensiveRebounds)+
						Integer.parseInt(opponentDefensiveRebounds))*(Integer.parseInt(shots)-Integer.parseInt(shootings)))
						+1.07*Integer.parseInt(turnOvers));
	}
	
	public String getDefendRound() {
		DecimalFormat df = new DecimalFormat("#.00");
		return df.format(Integer.parseInt(shots)+0.4*Integer.parseInt(freeThrowShots)-1.07
				*(Double.parseDouble(defensiveRebounds)/(Integer.parseInt(defensiveRebounds)+
						Integer.parseInt(opponentOffensiveRebounds))*(Integer.parseInt(shots)-Integer.parseInt(shootings)))
						+1.07*Integer.parseInt(turnOvers));
	}
	
	public String getOffensiveEfficiency() {
		DecimalFormat df = new DecimalFormat("#.00");
		return df.format(100*Integer.parseInt(score)/Double.parseDouble(getAttackRound()));
	}
	
	public String getDefensiveEfficiency() {
		DecimalFormat df = new DecimalFormat("#.00");
		return  df.format(100*Integer.parseInt(opponentScore)/Double.parseDouble(getDefendRound()));
	}
	
	public String getOffensiveReboundEfficiency() {
		DecimalFormat df = new DecimalFormat("#.00");
		return df.format(Double.parseDouble(offensiveRebounds)/((Double.parseDouble(offensiveRebounds)+
				Double.parseDouble(opponentDefensiveRebounds))));
	}
	
	public String getDefensiveReboundEfficiency() {
		DecimalFormat df = new DecimalFormat("#.00");
		return df.format(Double.parseDouble(defensiveRebounds)/((Double.parseDouble(defensiveRebounds)+
				Double.parseDouble(opponentOffensiveRebounds))));
	}
	
	public String getStealEfficiency() {
		DecimalFormat df = new DecimalFormat("#.00");
		return df.format(100*Double.parseDouble(steals)/Double.parseDouble(getDefendRound()));
	}
	
	public String getAssistEfficiency() {
		DecimalFormat df = new DecimalFormat("#.00");
		return df.format(100*Double.parseDouble(assists)/Double.parseDouble(getAttackRound()));
	}
	
	@Override
	public String toString() {
		return "TeamSeasonInfo [name=" + name + ", season=" + season
				+ ", numOfMatch=" + numOfMatch + ", shootings=" + shootings
				+ ", shots=" + shots + ", threePointShootings="
				+ threePointShootings + ", threePointShots=" + threePointShots
				+ ", freeThrowShootings=" + freeThrowShootings
				+ ", freeThrowShots=" + freeThrowShots + ", offensiveRebounds="
				+ offensiveRebounds + ", defensiveRebounds="
				+ defensiveRebounds + ", rebounds=" + rebounds + ", assists="
				+ assists + ", steals=" + steals + ", blockShots=" + blockShots
				+ ", turnOvers=" + turnOvers + ", fouls=" + fouls + ", score="
				+ score + ", shootingPersentage=" + shootingPersentage
				+ ", threePointShootingPersentage="
				+ threePointShootingPersentage
				+ ", freeThrowShootingPersentage="
				+ freeThrowShootingPersentage + ", opponentScore="
				+ opponentScore + ", opponentOffensiveRebounds="
				+ opponentOffensiveRebounds + ", opponentDefensiveRebounds="
				+ opponentDefensiveRebounds + "]";
	}
	
}
