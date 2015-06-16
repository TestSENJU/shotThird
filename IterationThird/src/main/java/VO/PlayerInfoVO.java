package VO;

import java.io.Serializable;

/**
 * 
 * @author wyt
 *0球衣号码
 *1位置
 *2身高
 *3体重
 *4生日
 *5年龄
 *6球龄
 *7毕业学校
 */
public class PlayerInfoVO  implements Serializable{
/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
String playername;
String team;
String data[]=new String[8];

public PlayerInfoVO(String id){
	this.playername=id;
	this.team="";
	for(int i=0;i<data.length;i++){
		this.data[i]=" ";
	}
}

public String getPlayername() {
	return playername;
}
public String[] getData() {
	return data;
}

public String getTeam() {
	return team;
}

public void setTeam(String team) {
	this.team = team;
}

public void setData(String[] data) {
	this.data = data;
}

}
