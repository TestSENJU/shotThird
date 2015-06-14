package po;
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
public class PlayerInfoPO {
	String playerid;
	String playername;
	String data[]=new String[8];
	public PlayerInfoPO(String id){
		this.playerid=id;
		this.playername="";
		for(int i=0;i<data.length;i++){
			this.data[i]="";
		}
	}
	public String getPlayername() {
		return playername;
	}
	public void setPlayername(String playername) {
		this.playername = playername;
	}
	public String[] getData() {
		return data;
	}
	public void setData(String[] data) {
		this.data = data;
	}
	public String getPlayerid() {
		return playerid;
	}
	
}
