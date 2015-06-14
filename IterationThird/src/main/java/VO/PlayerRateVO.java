package VO;
/**
 * 
 * @author wyt
 * 0投篮命中
 * 1三分命中
 * 2罚球命中
 * 3效率
 * 4GmSc
 * 5真实命中
 * 6投篮效率
 * 7篮板率
 * 8进攻篮板率
 * 9防守篮板率
 * 10助攻率
 * 11抢断率
 * 12盖帽率
 * 13失误率
 * 14使用率
 *   只用于统计的那个面板
 */
public class PlayerRateVO {
String playerid;
String playername;
String season;
double rate[]=new double[15];
public PlayerRateVO(String id){
	this.playerid=id;
	this.playername=" ";
	this.season=" ";
	for(int i=0;i<rate.length;i++){
		this.rate[i]=0.0;
	}
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
public double[] getRate() {
	return rate;
}
public void setRate(double[] rate) {
	this.rate = rate;
}
public String getPlayerid() {
	return playerid;
}

}
