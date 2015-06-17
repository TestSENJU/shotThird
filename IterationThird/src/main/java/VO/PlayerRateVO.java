package VO;

import java.io.Serializable;

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
public class PlayerRateVO implements Serializable {
/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
String playername;
String season;
int isAfter;
double rate[]=new double[15];
public PlayerRateVO(String id){
	this.playername=id;
	this.season=" ";
	for(int i=0;i<rate.length;i++){
		this.rate[i]=0.0;
	}
	this.isAfter=-1;
	
}

public PlayerRateVO(String playername, String season, int isAfter, double[] rate) {
	super();
	this.playername = playername;
	this.season = season;
	this.isAfter = isAfter;
	this.rate = rate;
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

}
