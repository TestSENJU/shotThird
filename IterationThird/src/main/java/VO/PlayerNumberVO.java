package VO;

import java.io.Serializable;

/**
 * 
 * @author wyt
 *String time;//,"上场时间",
int number;//"参赛场数"
int firstnum;//"先发场数"
 * 0"篮板数"
 * 1"助攻数",
	2"进攻篮板数"
	3"防守篮板数"
	4"抢断数"
	5"盖帽数"
	6"失误数"
	7"犯规数"
	8"得分"
	1赛季:12-13
	2 日期:01-01
	3 球队:ATL 
	4球员名:Anthony Tolliver 
	5上场时间:3:37 
	6位置:
	7 投篮命中数:0.0
	8 投篮出手数:0.0 
	9三分命中数:0.0 
	10三分出手数:0.0 
	11罚球命中数:0.0 
	12罚球出手数:0.0
	13 进攻篮板数:0.0
	14 防守篮板数:1.0 
	15篮板数:1.0 
	16助攻数:0.0
	17 抢断数:0.0 
	18盖帽数:0.0 
	19失误数:0.0 
	20犯规数:0.0 
	21得分:0.0 
 */
public class PlayerNumberVO  implements Serializable{
/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
String playername;
String time;//,"上场时间",
int number;//"参赛场数"
int firstnum;//"先发场数"
String team;
String season;

double data[]=new double[9];
public PlayerNumberVO(String id){
	this.playername=id;
	this.firstnum=0;
	this.number=0;
	this.time="0:0";
	this.team=" ";
	this.season=id.split("_")[1];
	for(int i=0;i<data.length;i++){
		this.data[i]=0.0;
	}
}
public PlayerNumberVO(String playername, String time, int number, int firstnum,
		String team, String season, double[] data) {
	super();
	this.playername = playername;
	this.time = time;
	this.number = number;
	this.firstnum = firstnum;
	this.team = team;
	this.season = season;
	this.data = data;
}
public String[] getFakeData(){
	String data[]=new String[13];
	data[0]=this.playername;
	data[1]=this.team;
	data[2]=this.number+"";
	data[3]=this.firstnum+"";
	for(int i=0;i<this.data.length;i++){
		data[i+4]=this.data[i]+"";
	}
	return data;
}
public void addTime(String t){
	String ss[]=new String[2];
	String s[]=new String[2];
		if(t.charAt(0)<='9'&&t.charAt(0)>='0'){
			ss=t.split(":");		
			 s=this.time.split(":");		
				int seconds=0;
				if(ss[1].equals(" "))return;
				seconds=Integer.parseInt(ss[1].trim())+Integer.parseInt(s[1].trim());
				if(seconds<60){
					this.time=(Integer.parseInt(ss[0].trim())+Integer.parseInt(s[0].trim())+"")
							+":"	+(seconds+"");	
				}else{
					this.time=(Integer.parseInt(ss[0].trim())+Integer.parseInt(s[0].trim())+1+"")
							+":"	+(seconds-60+"");	
				}
		}
	 
}
public void addAverTime(String t){
	String ss[]=new String[2];
String s[]=new String[2];
if(t.charAt(0)<='9'&&t.charAt(0)>='0'){
	ss=t.split(":");	
	s=this.time.split(":");		
	int seconds=0;

	if(ss[1].equals(" "))return;
	seconds=(Integer.parseInt(ss[1].trim())*this.number+Integer.parseInt(s[1].trim()))/(this.number+1);
	if(seconds<60){
		this.time=((Integer.parseInt(ss[1].trim())*this.number+Integer.parseInt(s[1].trim()))/(this.number+1)+"")
				+":"	+(seconds+"");	
	}else{
		this.time=((Integer.parseInt(ss[1].trim())*this.number+Integer.parseInt(s[1].trim()))/(this.number+1)+1+"")
				+":"	+(seconds-60+"");	
	}
}
}
public void addAverData(double[]d){
	for(int i=0;i<this.data.length;i++){
		this.data[i]=(this.data[i]*this.number+d[i])/(this.number+1);
	}
}
public void addfirstnum(int num){
	this.firstnum+=num;
}
public void addnumber(int num){
	this.number+=num;
}
public void adddata(double[]d){
	for(int i=0;i<this.data.length;i++){
		this.data[i]+=d[i];
	}
}
public String getPlayername() {
	return playername;
}
public String getTime() {
	return time;
}
public int getNumber() {
	return this.number;
}
public int getFirstnum() {
	return firstnum;
}
public String getTeam() {
	return team;
}
public void setTeam(String team) {
	this.team = team;
}
public String getSeason() {
	return season;
}
public double[] getData() {
	return data;
}
public void setData(double[] data) {
	this.data = data;
}

}
