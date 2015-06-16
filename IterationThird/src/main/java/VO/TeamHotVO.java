package VO;

import java.io.Serializable;

public class TeamHotVO  implements Serializable{

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	String teamname;
	double data;
	
	public TeamHotVO(String name){
		this.teamname=name;
		this.data=0.0;
	}

	public double getData() {
		return data;
	}

	public void setData(double data) {
		this.data = data;
	}

	public String getTeamname() {
		return teamname;
	}
	
}
