package Data;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
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
import VO.TeamMatchVO;
import VO.TeamNumberVO;
import VO.TeamRateVO;

public class Serialization {
//	String matchid=season+"_"+time+"_"+team1+"_"+team2+"_"+(after+"");
static Hashtable<String,MatchVO>matchvotable=new Hashtable<String ,MatchVO>();
private static String matchshortpath="Serialization/matchfolder/match";
public void writematchvo(){
	FileReadAndWriteBuffer.write_to_file(matchshortpath, matchvotable);
}
//	String matchid=season+"_"+time+"_"+team1+"_"+team2+"_"+(after+"");
static Hashtable<String,MatchShortVO> matchshorttable=new Hashtable<String,MatchShortVO>();
private static String matchpath="Serialization/matchfolder/matchshort";
public void writematchshort(){
	FileReadAndWriteBuffer.write_to_file(matchpath, matchshorttable);
}
//teamshortname
static Hashtable<String,TeamInfoVO> teaminfotable=new Hashtable<String,TeamInfoVO>();
private static String teaminfopath="Serialization/matchfolder/teaminfo";
public void writeteaminfo(){
	FileReadAndWriteBuffer.write_to_file(teaminfopath, teaminfotable);
}
//playername
static  Hashtable<String,PlayerShortVO> playershorttable=new Hashtable<String,PlayerShortVO>();
private static String playershortpath="Serialization/matchfolder/playershort";
public void writeplayershort(){
	FileReadAndWriteBuffer.write_to_file(playershortpath, playershorttable);
}
//playername
static  Hashtable<String,PlayerInfoVO> playerinfotable=new Hashtable<String,PlayerInfoVO>();
private static String playerinfopath="Serialization/matchfolder/playerinfo";
public void writeplayerinfo(){
	FileReadAndWriteBuffer.write_to_file(playerinfopath, playerinfotable);
}

static  Hashtable<String,TeamNumberVO> teamavernumbertable=new Hashtable<String,TeamNumberVO>();
private static String teamavernumberpath="Serialization/matchfolder/teamavernumber";
public void writeteamavernumber(){
	FileReadAndWriteBuffer.write_to_file(teamavernumberpath, teamavernumbertable);
}

static  Hashtable<String,TeamNumberVO> teamallnumbertable=new Hashtable<String,TeamNumberVO>();
private static String teamallnumberpath="Serialization/matchfolder/teamallnumber";
public void writeteamallnumber(){
	FileReadAndWriteBuffer.write_to_file(teamallnumberpath, teamallnumbertable);
}

static  Hashtable<String,TeamRateVO> teamratetable=new Hashtable<String,TeamRateVO>();
private static String teamratepath="Serialization/matchfolder/teamrate";
public void writeteamrate(){
	FileReadAndWriteBuffer.write_to_file(teamratepath, teamratetable);
}

static  Hashtable<String,TeamHotVO> teamseasontable=new Hashtable<String,TeamHotVO>();
private static String teamseasonpath="Serialization/matchfolder/teamseason";
public void writeteamseason(){
	FileReadAndWriteBuffer.write_to_file(teamseasonpath, teamseasontable);}

static  Hashtable<String,TeamHotVO> teamaverseasontable=new Hashtable<String,TeamHotVO>();
private static String teamaverseasonpath="Serialization/matchfolder/teamaverseason";
public void writeteamaverseason(){
	FileReadAndWriteBuffer.write_to_file(teamaverseasonpath, teamaverseasontable);
}

static  Hashtable<String,TeamHotVO> teamseasonmediantable=new Hashtable<String,TeamHotVO>();
private static String teamseasonmedianpath="Serialization/matchfolder/teamseasonmedian";
public void writeteamseasonmedian(){
	FileReadAndWriteBuffer.write_to_file(teamseasonmedianpath, teamseasonmediantable);
}

static  Hashtable<String,TeamHotVO> teammediantable=new Hashtable<String,TeamHotVO>();
private static String teammedianpath="Serialization/matchfolder/teammedian";
public void writeteammedian(){
	FileReadAndWriteBuffer.write_to_file(teammedianpath, teammediantable);
}

static  Hashtable<String,TeamHotVO> teamvariancetable=new Hashtable<String,TeamHotVO>();
private static String teamvariancepath="Serialization/matchfolder/teamvariance";
public void writeteamvariance(){
	FileReadAndWriteBuffer.write_to_file(teamvariancepath, teamvariancetable);}

static  Hashtable<String,TeamHotVO> teamseasonvaritable=new Hashtable<String,TeamHotVO>();
private static String teamseasonvaripath="Serialization/matchfolder/teamseasonvari";
public void writeteamseasonvari(){
	FileReadAndWriteBuffer.write_to_file(teamseasonvaripath, teamseasonvaritable);
}
//String playerallnumberkey=playerdata[3]+"_"+season+"_"+(after+"");
static  Hashtable<String,PlayerNumberVO> playerallnumbertable=new Hashtable<String,PlayerNumberVO>();
private static String playerallnumberpath="Serialization/matchfolder/playerallnumber";
public void writeplayerallnumber(){
	FileReadAndWriteBuffer.write_to_file(playerallnumberpath, playerallnumbertable);
}
//String playerallnumberkey=playerdata[3]+"_"+season+"_"+(after+"");
static  Hashtable<String,PlayerNumberVO> playeravernumbertable=new Hashtable<String,PlayerNumberVO>();
private static String playeravernumberpath="Serialization/matchfolder/playeravernumber";
public void writeplayeravernumber(){
	FileReadAndWriteBuffer.write_to_file(playeravernumberpath, playeravernumbertable);}

static  Hashtable<String,PlayerRateVO> playerratetable=new Hashtable<String,PlayerRateVO>();
private static String  playerratepath="Serialization/matchfolder/playerrate";
public void writeplayerrate(){
	FileReadAndWriteBuffer.write_to_file(playerratepath, playerratetable);}
//该赛季所有球员的平均值 key season_iasfter_option
static  Hashtable<String,Double> playeravertable=new Hashtable<String,Double>();
private static String playeraverpath="Serialization/matchfolder/playeraver";
public void writeplayeraver(){
	FileReadAndWriteBuffer.write_to_file(playeraverpath, playeravertable);
}
//球员的平均值 key player_season_iasfter_option
static  Hashtable<String,PlayerHotVO> playeraverseasontable=new Hashtable<String,PlayerHotVO>();
private static String playeraverseasonpath="Serialization/matchfolder/playeraverseason";
public void writeplayeraverseason(){
	FileReadAndWriteBuffer.write_to_file(playeraverseasonpath, playeraverseasontable);
}
//该球队球员的平均值 key team_season_isafter_option 如CHA_12-13_1_12
static  Hashtable<String,TeamHotVO> playeraverteamtable=new Hashtable<String,TeamHotVO>();
private static String playeraverteampath="Serialization/matchfolder/playeraverteam";
public void writeplayeraverteam(){
	FileReadAndWriteBuffer.write_to_file(playeraverteampath, playeraverteamtable);
}

static  Hashtable<String,Double> playermediantable=new Hashtable<String,Double>();
private static String  playermedianpath="Serialization/matchfolder/ playermedian";
public void writeplayermedian(){
	FileReadAndWriteBuffer.write_to_file(playermedianpath, playermediantable);
}

static  Hashtable<String,TeamHotVO> playermedianteamtable=new Hashtable<String,TeamHotVO>();
private static String playermedianteampath="Serialization/matchfolder/playermedianteam";
public void writeplayermedianteam(){
	FileReadAndWriteBuffer.write_to_file(playermedianteampath, playermedianteamtable);}

static  Hashtable<String,PlayerHotVO> playermedianseasontable=new Hashtable<String,PlayerHotVO>();
private static String playermedianseasonpath="Serialization/matchfolder/playermedianseason";
public void writeplayermedianseason(){
	FileReadAndWriteBuffer.write_to_file(playermedianseasonpath, playermedianseasontable);
}

static  Hashtable<String,PlayerHotVO> playervariseasontable=new Hashtable<String,PlayerHotVO>();
private static String playervariseasonpath="Serialization/matchfolder/playervariseason";
public void writeplayervariseason(){
	FileReadAndWriteBuffer.write_to_file(playervariseasonpath, playervariseasontable);
}

static  Hashtable<String,TeamHotVO> playervariteamtable=new Hashtable<String,TeamHotVO>();
private static String playervariteampath="Serialization/matchfolder/playervariteam";
public void writeplayervariteam(){
	FileReadAndWriteBuffer.write_to_file(playervariteampath, playervariteamtable);
}
//playername
static  Hashtable<String,ArrayList<PlayerMatchVO>> playermatchtable=new Hashtable<String,ArrayList<PlayerMatchVO>>();
private static String playermatchpath="Serialization/matchfolder/playermatch";
public void writeplayermatch(){
	FileReadAndWriteBuffer.write_to_file(playermatchpath, playermatchtable);
}

//teamname
static  Hashtable<String,ArrayList<TeamMatchVO>> teammatchtable=new Hashtable<String,ArrayList<TeamMatchVO>>();
private static String teammatchpath="Serialization/matchfolder/teammatch";
public void writeteammatch(){
	FileReadAndWriteBuffer.write_to_file(teammatchpath, teammatchtable);
}

public Serialization(){
	ReadMatch();
	ReadPlayer();
	ReadTeam();
	
	writeplayermedianseason();
	writeplayervariseason();
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
	writeplayershort();
	writeteammatch();
}

private void ReadMatch(){
	try {
		@SuppressWarnings("resource")
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
			String ss[]=new String[21];

			int j=0;
			for(int i=1;i<strs.length;i++){
			     Matcher mat=pat.matcher(strs[i]); 
			     String repickStr = mat.replaceAll("");
			     if(i==5){
			    	 Matcher mat1=pat.matcher(strs[i+1]); 
				     String repickStr1 = mat1.replaceAll("");
			    	   ss[j]=repickStr+":"+repickStr1; 
			    	   i++;
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
	String matchid=season+"_"+time+"_"+team1+"_"+team2+"_"+(after+"");
	double [] score1=new double[15];
	double[] score2=new double[15];

	ArrayList<PlayerMatchVO>playerlist1=new ArrayList<PlayerMatchVO>();
	ArrayList<PlayerMatchVO>playerlist2=new ArrayList<PlayerMatchVO>();

	for(int i=0;i<teamlist1.size();i++){
		String[] playerdata=teamlist1.get(i);
		PlayerMatchVO playermatch=new PlayerMatchVO(playerdata[3],matchid);
		playermatch.setLocation(playerdata[5]);
		playermatch.setPlayingtime(playerdata[4]);
		double []data=new double[14];
		for(int j=0;j<data.length;j++){
			
			data[j]=Double.parseDouble(playerdata[j+6]);
		}
		playermatch.setData(data);
		for(int j=0;j<data.length;j++){
			score1[j]+=data[j];
		}
		
		String playerallnumberkey=playerdata[3]+"_"+season+"_"+(after+"");
		double numberdata[]=new double[9];
		numberdata[0]=Double.parseDouble(playerdata[14]);numberdata[1]=Double.parseDouble(playerdata[15]);
		numberdata[2]=Double.parseDouble(playerdata[12]);numberdata[3]=Double.parseDouble(playerdata[13]);
		numberdata[4]=Double.parseDouble(playerdata[16]);numberdata[5]=Double.parseDouble(playerdata[17]);
		numberdata[6]=Double.parseDouble(playerdata[18]);numberdata[7]=Double.parseDouble(playerdata[19]);
		if(playerdata[20]==null){numberdata[8]=0;}
		else numberdata[8]=Double.parseDouble(playerdata[20]);
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
		playerlist1.add(playermatch);
	}
	
	
	for(int i=0;i<teamlist2.size();i++){
		String[] playerdata=teamlist2.get(i);
		PlayerMatchVO playermatch=new PlayerMatchVO(playerdata[3],matchid);
		playermatch.setLocation(playerdata[5]);
		playermatch.setPlayingtime(playerdata[4]);
		double []data=new double[14];
		for(int j=0;j<data.length;j++){
			data[j]=Double.parseDouble(playerdata[j+6]);
		}
		playermatch.setData(data);
		for(int j=0;j<data.length;j++){
			score2[j]+=data[j];
		}
		
		String playerallnumberkey=playerdata[3]+"_"+season+"_"+(after+"");
		double numberdata[]=new double[9];
		numberdata[0]=Double.parseDouble(playerdata[14]);numberdata[1]=Double.parseDouble(playerdata[15]);
		numberdata[2]=Double.parseDouble(playerdata[12]);numberdata[3]=Double.parseDouble(playerdata[13]);
		numberdata[4]=Double.parseDouble(playerdata[16]);numberdata[5]=Double.parseDouble(playerdata[17]);
		numberdata[6]=Double.parseDouble(playerdata[18]);numberdata[7]=Double.parseDouble(playerdata[19]);
		if(playerdata[20]==null){numberdata[8]=0;}
		else numberdata[8]=Double.parseDouble(playerdata[20]);
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
				number.setTeam(team2);
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
				number.setTeam(team2);
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
		playerlist2.add(playermatch);
	}

	
	MatchShortVO matchshort=new MatchShortVO(matchid);
	MatchVO match=new MatchVO(matchid);

	if(score1[14]>score2[14]){
		matchshort.setWinner(team1);
		matchshort.setLoser(team2);
		matchshort.setScore(score1[14]+"-"+score2[14]);
		
		match.setLoserlist(playerlist2);
		match.setWinnerlist(playerlist1);
		match.setWinner(team1);
		match.setLoser(team2);
		match.setScore(score1[14]+"-"+score2[14]);
		
	}else{
		matchshort.setWinner(team2);
		matchshort.setLoser(team1);
		matchshort.setScore(score2[14]+"-"+score1[14]);
		
		match.setLoserlist(playerlist1);
		match.setWinnerlist(playerlist2);
		match.setWinner(team2);
		match.setLoser(team1);
		match.setScore(score2[14]+"-"+score1[14]);
	}
	TeamMatchVO teammatch1=new TeamMatchVO(team1,matchid);
	teammatch1.setData(score1);
	if(teammatchtable.containsKey(team1)){
		teammatchtable.get(team1).add(teammatch1);
	}else{
		ArrayList<TeamMatchVO>list1=new ArrayList<TeamMatchVO>();
		list1.add(teammatch1);
		teammatchtable.put(team1, list1);
	}
	TeamMatchVO teammatch2=new TeamMatchVO(team2,matchid);
	teammatch2.setData(score2);
	if(teammatchtable.containsKey(team2)){
		teammatchtable.get(team2).add(teammatch2);
	}else{
		ArrayList<TeamMatchVO>list2=new ArrayList<TeamMatchVO>();
		list2.add(teammatch2);
		teammatchtable.put(team2, list2);
	}
	matchshorttable.put(matchid, matchshort);
	matchvotable.put(matchid, match);
	
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
			playershorttable.put(str.split(":")[1].trim(), shortvo);
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
