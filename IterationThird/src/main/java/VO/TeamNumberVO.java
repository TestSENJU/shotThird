package VO;

import java.io.Serializable;

/**
 * 
 * @author wyt
 * 0投篮命中数
 * 1投篮出手次数
 * 2三分命中数
 * 3三分出手数
 * 4罚球命中数
 * 5罚球出手数
 * 6进攻篮板数
 * 7防守篮板数
 * 8篮板数
 * 9助攻数
 * 10抢断数
 * 11盖帽数
 * 12失误数
 * 13犯规数
 * 14得分
 *
 */
public class TeamNumberVO implements Serializable {
	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	String teamname;
	int number;
	String season;
	int isAfter;
	double data[]=new double[15];
	public TeamNumberVO(String name){
		this.teamname=name;
		this.number=0;
		this.season="";
		this.isAfter=-1;
		for(int i=0;i<data.length;i++){
			this.data[i]=0.0;
		}
	}
	
	public TeamNumberVO(String teamname, int number, String season,
			int isAfter, double[] data) {

		this.teamname = teamname;
		this.number = number;
		this.season = season;
		this.isAfter = isAfter;
		this.data = data;
	}
	public int getNumber() {
		return number;
	}
	public void setNumber(int number) {
		this.number = number;
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
	public double[] getData() {
		return data;
	}
	public void setData(double[] data) {
		this.data = data;
	}
	public String getTeamname() {
		return teamname;
	}

}
