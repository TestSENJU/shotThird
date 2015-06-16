package Data;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.UnsupportedEncodingException;
import java.util.ArrayList;
import java.util.Hashtable;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

import VO.MatchShortVO;
import VO.MatchVO;
import VO.PlayerHotVO;
import VO.PlayerInfoVO;
import VO.PlayerMatchVO;
import VO.PlayerNumberVO;
import VO.PlayerRateVO;
import VO.PlayerShortVO;
import VO.TeamHotVO;
import VO.TeamInfoVO;
import VO.TeamNumberVO;
import VO.TeamRateVO;

public class Serialization {
static Hashtable<String,MatchVO>matchvotable=new Hashtable<String ,MatchVO>();
private static String matchshortpath="Serialization/matchfolder/matchvoser";
public void writematchvo(){
	FileReadAndWriteBuffer.write_to_file(matchshortpath, matchvotable);
}

static Hashtable<String,MatchShortVO> matchshorttable=new Hashtable<String,MatchShortVO>();
private static String matchpath="Serialization/matchfolder/matchshortvoser";
public void writematchshort(){
	FileReadAndWriteBuffer.write_to_file(matchpath, matchshorttable);
}

static Hashtable<String,TeamInfoVO> teaminfotable=new Hashtable<String,TeamInfoVO>();
private static String teaminfopath="Serialization/matchfolder/matchshortvoser";
public void writeteaminfo(){
	FileReadAndWriteBuffer.write_to_file(teaminfopath, teaminfotable);
}

static  Hashtable<String,PlayerShortVO> playerallnumbertable=new Hashtable<String,PlayerShortVO>();
private static String playerallnumberpath="Serialization/matchfolder/matchshortvoser";
public void writeplayerallnumber(){
	FileReadAndWriteBuffer.write_to_file(playerallnumberpath, playerallnumbertable);
}

static  Hashtable<String,PlayerInfoVO> playerinfotable=new Hashtable<String,PlayerInfoVO>();
private static String playerinfopath="Serialization/matchfolder/matchshortvoser";
public void writeplayerinfo(){
	FileReadAndWriteBuffer.write_to_file(playerinfopath, playerinfotable);
}

static  Hashtable<String,TeamNumberVO> teamavernumbertable=new Hashtable<String,TeamNumberVO>();
private static String teamavernumberpath="Serialization/matchfolder/matchshortvoser";
public void writeteamavernumber(){
	FileReadAndWriteBuffer.write_to_file(teamavernumberpath, teamavernumbertable);
}

static  Hashtable<String,TeamNumberVO> teamallnumbertable=new Hashtable<String,TeamNumberVO>();
private static String teamallnumberpath="Serialization/matchfolder/matchshortvoser";
public void writeteamallnumber(){
	FileReadAndWriteBuffer.write_to_file(teamallnumberpath, teamallnumbertable);
}

static  Hashtable<String,TeamRateVO> teamratetable=new Hashtable<String,TeamRateVO>();
private static String teamratepath="Serialization/matchfolder/matchshortvoser";
public void writeteamrate(){
	FileReadAndWriteBuffer.write_to_file(teamratepath, teamratetable);
}

static  Hashtable<String,TeamHotVO> teamseasontable=new Hashtable<String,TeamHotVO>();
private static String teamseasonpath="Serialization/matchfolder/matchshortvoser";
public void writeteamseason(){
	FileReadAndWriteBuffer.write_to_file(teamseasonpath, teamseasontable);}

static  Hashtable<String,TeamHotVO> teamaverseasontable=new Hashtable<String,TeamHotVO>();
private static String teamaverseasonpath="Serialization/matchfolder/matchshortvoser";
public void writeteamaverseason(){
	FileReadAndWriteBuffer.write_to_file(teamaverseasonpath, teamaverseasontable);
}

static  Hashtable<String,TeamHotVO> teamseasonmediantable=new Hashtable<String,TeamHotVO>();
private static String teamseasonmedianpath="Serialization/matchfolder/matchshortvoser";
public void writeteamseasonmedian(){
	FileReadAndWriteBuffer.write_to_file(teamseasonmedianpath, teamseasonmediantable);
}

static  Hashtable<String,TeamHotVO> teammediantable=new Hashtable<String,TeamHotVO>();
private static String teammedianpath="Serialization/matchfolder/matchshortvoser";
public void writeteammedian(){
	FileReadAndWriteBuffer.write_to_file(teammedianpath, teammediantable);
}

static  Hashtable<String,TeamHotVO> teamvariancetable=new Hashtable<String,TeamHotVO>();
private static String teamvariancepath="Serialization/matchfolder/matchshortvoser";
public void writeteamvariance(){
	FileReadAndWriteBuffer.write_to_file(teamvariancepath, teamvariancetable);}

static  Hashtable<String,TeamHotVO> teamseasonvaritable=new Hashtable<String,TeamHotVO>();
private static String teamseasonvaripath="Serialization/matchfolder/matchshortvoser";
public void writeteamseasonvari(){
	FileReadAndWriteBuffer.write_to_file(teamseasonvaripath, teamseasonvaritable);
}

static  Hashtable<String,PlayerNumberVO> playerallnumbertable=new Hashtable<String,PlayerNumberVO>();
private static String playerallnumberpath="Serialization/matchfolder/matchshortvoser";
public void writeplayerallnumber(){
	FileReadAndWriteBuffer.write_to_file(playerallnumberpath, playerallnumbertable);
}

static  Hashtable<String,PlayerNumberVO> playeravernumbertable=new Hashtable<String,PlayerNumberVO>();
private static String playeravernumberpath="Serialization/matchfolder/matchshortvoser";
public void writeplayeravernumber(){
	FileReadAndWriteBuffer.write_to_file(playeravernumberpath, playeravernumbertable);}

static  Hashtable<String,PlayerRateVO> playerratetable=new Hashtable<String,PlayerRateVO>();
private static String  playerratepath="Serialization/matchfolder/matchshortvoser";
public void writeplayerrate(){
	FileReadAndWriteBuffer.write_to_file(playerratepath, playerratetable);}

static  Hashtable<String,PlayerHotVO> playeravertable=new Hashtable<String,PlayerHotVO>();
private static String playeraverpath="Serialization/matchfolder/matchshortvoser";
public void writeplayeraver(){
	FileReadAndWriteBuffer.write_to_file(playeraverpath, playeravertable);
}

static  Hashtable<String,PlayerHotVO> playeraverseasontable=new Hashtable<String,PlayerHotVO>();
private static String playeraverseasonpath="Serialization/matchfolder/matchshortvoser";
public void writeplayeraverseason(){
	FileReadAndWriteBuffer.write_to_file(playeraverseasonpath, playeraverseasontable);
}

static  Hashtable<String,PlayerHotVO> playeraverteamtable=new Hashtable<String,PlayerHotVO>();
private static String playeraverteampath="Serialization/matchfolder/matchshortvoser";
public void writeplayeraverteam(){
	FileReadAndWriteBuffer.write_to_file(playeraverteampath, playeraverteamtable);
}

static  Hashtable<String,PlayerHotVO> playermediantable=new Hashtable<String,PlayerHotVO>();
private static String  playermedianpath="Serialization/matchfolder/matchshortvoser";
public void writeplayermedian(){
	FileReadAndWriteBuffer.write_to_file(playermedianpath, playermediantable);
}

static  Hashtable<String,PlayerHotVO> playermedianteamtable=new Hashtable<String,PlayerHotVO>();
private static String playermedianteampath="Serialization/matchfolder/matchshortvoser";
public void writeplayermedianteam(){
	FileReadAndWriteBuffer.write_to_file(playermedianteampath, playermedianteamtable);}

static  Hashtable<String,PlayerHotVO> playermedianseasontable=new Hashtable<String,PlayerHotVO>();
private static String playermedianseasonpath="Serialization/matchfolder/matchshortvoser";
public void writeplayermedianseason(){
	FileReadAndWriteBuffer.write_to_file(playermedianseasonpath, playermedianseasontable);
}

static  Hashtable<String,PlayerHotVO> playervariseasontable=new Hashtable<String,PlayerHotVO>();
private static String playervariseasonpath="Serialization/matchfolder/matchshortvoser";
public void writeplayervariseason(){
	FileReadAndWriteBuffer.write_to_file(playervariseasonpath, playervariseasontable);
}

static  Hashtable<String,PlayerHotVO> playervaritable=new Hashtable<String,PlayerHotVO>();
private static String playervaripath="Serialization/matchfolder/matchshortvoser";
public void writeplayervari(){
	FileReadAndWriteBuffer.write_to_file(playervaripath, playervaritable);
}

static  Hashtable<String,PlayerHotVO> playervariteamtable=new Hashtable<String,PlayerHotVO>();
private static String playervariteampath="Serialization/matchfolder/matchshortvoser";
public void writeplayervariteam(){
	FileReadAndWriteBuffer.write_to_file(playervariteampath, playervariteamtable);
}

static  Hashtable<String,ArrayList<PlayerMatchVO>> playermatchtable=new Hashtable<String,ArrayList<PlayerMatchVO>>();
private static String playermatchpath="Serialization/matchfolder/matchshortvoser";
public void writeplayermatch(){
	FileReadAndWriteBuffer.write_to_file(playermatchpath, playermatchtable);
}


public Serialization(){
	ReadMatch();
	ReadPlayer();
	ReadTeam();
	
	writeplayermedianseason();
	writeplayervariseason();
	writeplayervari();
	writeplayervariteam();
	writeplayermatch();
	writeplayermedianteam();
	writeplayermedian();
	writeplayeraverteam();
	writeplayeraverseason();
	writeplayeraver();
	writeplayerrate();
	writeplayeravernumber();
	writeplayerallnumber();
	writeteamseasonvari();
	writeteamvariance();
	writeteammedian();
	writeteamseasonmedian();
	writeteamaverseason();
	writeteamseason();
	writeteamrate();
	writeteamallnumber();
	writeteamavernumber();
	writeplayerinfo();
	writeteaminfo();
	writematchshort();
	writematchvo();
}

private void ReadMatch(){
	try {
		BufferedReader br=new BufferedReader(
				new InputStreamReader(new FileInputStream("matchrecord.txt"),"UTF-8"));
		String reg = "[\u4e00-\u9fa5]";

	    Pattern pat = Pattern.compile(reg);  
	    ArrayList<String[]>team1list=new ArrayList<String[]>();
	    ArrayList<String[]>team2list=new ArrayList<String[]>();
	    String team1="";
	    String team2="";
	    while(br.readLine()!=null){
	    	
			String str=br.readLine();
			String strs[]=str.split(":");
			String ss[]=new String[22];

			int j=0;
			for(int i=0;i<strs.length;i++){
			     Matcher mat=pat.matcher(strs[i]); 
			     String repickStr = mat.replaceAll("");
			     if(i==3){
			    	 Matcher mat1=pat.matcher(strs[i+1]); 
				     String repickStr1 = mat1.replaceAll("");
			    	   ss[j]=repickStr+":"+repickStr1; 
			     }else{
			    	   ss[j]=repickStr;
			     }
			     j++;
			}
			if(team1==""){team1=ss[2];team1list.add(ss);}
			if(team1!=""&&team2==""&&!ss[2].equals(team1)){
				team2=ss[2];
				team2list.add(ss);
			}else if(team1!=""&&ss[2].equals(team1)){
				team1list.add(ss);
			}else if(team1!=""&&team2!=""&&!ss[2].equals(team2)){
				getMatchData(team1list,team2list,team1,team2,ss[0],ss[1]);
				team1list.clear();team2list.clear();
				team1=ss[2];
				team2="";		
			}else if(team1!=""&&team2!=""&&!ss[2].equals(team2)){
				team2list.add(ss);
			}
			
		}
	} catch (UnsupportedEncodingException | FileNotFoundException e) {
		// TODO Auto-generated catch block
		e.printStackTrace();
	} catch (IOException e) {
		// TODO Auto-generated catch block
		e.printStackTrace();
	}
	
}
private void getMatchData(ArrayList<String[]> teamlist1,ArrayList<String[]>teamlist2,String team1,String team2,String season,String time){
	int after=isAfter(season,time);
	String matchid=season+"_"+time+"_"+team1+"-"+team2+"_"+(after+"");
	
	for(int i=0;i<teamlist1.size();i++){
		String[] playerdata=teamlist1.get(i);
		PlayerMatchVO playermatch=new PlayerMatchVO(playerdata[3],matchid);
		playermatch.setLocation(playerdata[5]);
		playermatch.setPlayingtime(playerdata[4]);
		double []data=new double[20];
		for(int j=6;j<playerdata.length;j++){
			data[j-6]=Double.parseDouble(playerdata[j]);
		}
		playermatch.setData(data);
		String playerallnumberkey=playerdata[3]+"_"+season+"_"+(after+"");
		double numberdata[]=new double[9];
		numberdata[0]=Double.parseDouble(playerdata[15]);numberdata[1]=Double.parseDouble(playerdata[16]);
		numberdata[2]=Double.parseDouble(playerdata[13]);numberdata[3]=Double.parseDouble(playerdata[14]);
		numberdata[4]=Double.parseDouble(playerdata[17]);numberdata[5]=Double.parseDouble(playerdata[18]);
		numberdata[6]=Double.parseDouble(playerdata[19]);numberdata[7]=Double.parseDouble(playerdata[20]);
		numberdata[8]=Double.parseDouble(playerdata[21]);
		if(playeravernumbertable.containsKey(playerallnumberkey)){
			playeravernumbertable.get(playerallnumberkey).addAverTime(playerdata[4]);
			playeravernumbertable.get(playerallnumberkey).addnumber(1);
			playeravernumbertable.get(playerallnumberkey).addAverData(numberdata);
			if(!(playerdata[5].equals("F"))||playerdata[5].equals("G")||playerdata[5].equals("C")){
				playeravernumbertable.get(playerallnumberkey).addfirstnum(1);
			}
		}		
			else{
				PlayerNumberVO number=new PlayerNumberVO(playerallnumberkey);
				number.setTeam(team1);
				number.addAverTime(playerdata[4]);
				number.addAverData(numberdata);
				playeravernumbertable.put(playerallnumberkey, number);
			}
		if(playerallnumbertable.containsKey(playerallnumberkey)){
			playerallnumbertable.get(playerallnumberkey).addTime(playerdata[4]);
			playerallnumbertable.get(playerallnumberkey).addnumber(1);
			playerallnumbertable.get(playerallnumberkey).adddata(numberdata);
			if(!(playerdata[5].equals("F"))||playerdata[5].equals("G")||playerdata[5].equals("C")){
				playerallnumbertable.get(playerallnumberkey).addfirstnum(1);
			}
		}		
			else{
				PlayerNumberVO number=new PlayerNumberVO(playerallnumberkey);
				number.setTeam(team1);
				number.addTime(playerdata[4]);
				number.adddata(numberdata);
				playerallnumbertable.put(playerallnumberkey, number);
			}
		if(playermatchtable.containsKey(playerdata[3]))
		playermatchtable.get(playerdata[3]).add(playermatch);
		else{
			ArrayList<PlayerMatchVO>list=new ArrayList<PlayerMatchVO>();
			list.add(playermatch);
			playermatchtable.put(playerdata[3], list);
		}
	}
	for(int i=0;i<teamlist2.size();i++){
		String[] playerdata=teamlist2.get(i);
		PlayerMatchVO playermatch=new PlayerMatchVO(playerdata[3],matchid);
		playermatch.setLocation(playerdata[5]);
		playermatch.setPlayingtime(playerdata[4]);
		double []data=new double[20];
		for(int j=6;j<playerdata.length;j++){
			data[j-6]=Double.parseDouble(playerdata[j]);
		}
		playermatch.setData(data);
		if(playermatchtable.containsKey(playerdata[3]))
			playermatchtable.get(playerdata[3]).add(playermatch);
			else{
				ArrayList<PlayerMatchVO>list=new ArrayList<PlayerMatchVO>();
				list.add(playermatch);
				playermatchtable.put(playerdata[3], list);
			}
	}
}
private int isAfter(String season,String time){
	if(season.equals("12-13")){
		String strs[]=time.split("-");
		int month=Integer.parseInt(strs[0]);
		int day=Integer.parseInt(strs[1]);
		if(Integer.parseInt(strs[0])==10&&Integer.parseInt(strs[1])<=27&&Integer.parseInt(strs[1])>=7){
			return 0;
		}else if((month==10&&day==31)||month>10||(month<=4)||(month==4&&day<=18)){
			return 1;
		}else{
			return 2;
		}
		
	}else if(season.equals("13-14")){
		String strs[]=time.split("-");
		int month=Integer.parseInt(strs[0]);
		int day=Integer.parseInt(strs[1]);
		if(Integer.parseInt(strs[0])==10&&Integer.parseInt(strs[1])<=26&&Integer.parseInt(strs[1])>=6){
			return 0;
		}else if((month==10&&day>=30)||month>10||(month<=4)||(month==4&&day<=17)){
			return 1;
		}else{
			return 2;
		}
	}else if(season.equals("14-15")){
		String strs[]=time.split("-");
		int month=Integer.parseInt(strs[0]);
		int day=Integer.parseInt(strs[1]);
		if(Integer.parseInt(strs[0])==10&&Integer.parseInt(strs[1])<=25&&Integer.parseInt(strs[1])>=5){
			return 0;
		}else if((month==10&&day>=29)||month>10||(month<=4)||(month==4&&day<=16)){
			return 1;
		}else{
			return 2;
		}
	}
	return 0;
}
private void ReadPlayer(){
	String filenames[]=new File("active/").list();
	
	try {
		for(int i=0;i<filenames.length;i++){
			@SuppressWarnings("resource")
			BufferedReader br=new BufferedReader(
					new InputStreamReader(new FileInputStream("active/Aaron Brooks.txt"),"UTF-8"));
			String str=br.readLine();
			
			PlayerInfoVO info=new PlayerInfoVO(str.split(":")[1].trim());
			String data[]=new String[8];
			for(int j=0;j<8;j++){
				data[j]=br.readLine().split(":")[1].trim();
			}
			info.setData(data);
			String team=br.readLine().split(":")[1].trim();
			info.setTeam(team);
			playerinfotable.put(info.getPlayername(), info);
			
			PlayerShortVO shortvo=new PlayerShortVO(str.split(":")[1].trim());
			shortvo.setIsOn(true);
			shortvo.setTeam(team);
			shortvo.setLocation(data[1]);
			playershortvotable.
		}
	
	} catch (UnsupportedEncodingException | FileNotFoundException e) {
		// TODO Auto-generated catch block
		e.printStackTrace();
	} catch (IOException e) {
		// TODO Auto-generated catch block
		e.printStackTrace();
	}
}
private void ReadTeam(){
	try {
		@SuppressWarnings("resource")
		BufferedReader br=new BufferedReader(
				new InputStreamReader(new FileInputStream("teams"),"UTF-8"));
		br.readLine();
		for(int i=0;i<30;i++){
			String str=br.readLine();
			String mass[]=str.split("║");
			String strs[]=mass[1].split("│");
		
		   TeamInfoVO info=new TeamInfoVO(strs[1].trim());
		   info.setName(strs[2].trim()+" "+strs[0]);
		   info.setLeague(strs[3].trim()+"-"+strs[4].trim());
		   info.setGym(strs[5].trim());
		   info.setYear(strs[6].trim());
		   teaminfotable.put(info.getShortname(), info);
		}
	} catch (UnsupportedEncodingException | FileNotFoundException e) {
		// TODO Auto-generated catch block
		e.printStackTrace();
	} catch (IOException e) {
		// TODO Auto-generated catch block
		e.printStackTrace();
	}
		

}
}
