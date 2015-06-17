package logic;

import java.util.ArrayList;

import VO.PlayerNumberVO;
import VO.PlayerRateVO;
import VO.TeamNumberVO;
import VO.TeamRateVO;


public class BLimp {
 
public  ArrayList<PlayerNumberVO> getPlayerNumberVos(){
	
	ArrayList<PlayerNumberVO> playerNumberVOs2=new ArrayList<PlayerNumberVO>();
/**String playername;
	String time;//,"上场时间",
	int number;//"参赛场数"
	int firstnum;//"先发场数"
	String team;
	String season;

	 0"篮板数"
	 * 1"助攻数",
		2"进攻篮板数"
		3"防守篮板数"
		4"抢断数"
		5"盖帽数"
		6"失误数"
		7"犯规数"1.3 	0.2 	3.7 	1.9 	22.3
		8"得分"
*/
	
PlayerNumberVO  playerNumberVO=new PlayerNumberVO("Quincy-Acy","18.9",68,22,"尼克斯","2014-15",new double[]{4.4,1.0,1.2,3.3,0.4,0.9,2.2,5.9});

PlayerNumberVO  playerNumberVO1=new PlayerNumberVO("Kobe Bryant","34.5",35,35,"LAL","2014-15",new double[]{5.7,5.6,0.7,4.9,1.3 ,	0.2 ,	3.7 	,1.9 ,	22.3});

PlayerNumberVO  playerNumberVO2=new PlayerNumberVO("Kevin Love","33.7",75,75,"骑士","2014-15",new double[]{9.7 ,	1.9 ,	7.9 	,2.2, 	0.7 ,	0.5 ,	1.6 	,1.9 	,16.4});

PlayerNumberVO  playerNumberVO3=new PlayerNumberVO("Kyle Lowry","34.6",70,70,"猛龙","2014-15",new double[]{4.7, 	0.8 ,	3.9 	,6.8 ,	1.6 ,	0.2 	,2.5, 	3.0 	,17.8});

PlayerNumberVO  playerNumberVO4=new PlayerNumberVO("Metta World Peace","12.9",30,1,"尼克斯","2013-14",new double[]{2.0 ,	0.6 ,	1.4 ,	0.6 	,0.8 	,0.3 ,	0.6 ,	1.5 ,	4.6});

PlayerNumberVO  playerNumberVO5=new PlayerNumberVO("Ben Wallace","15.8",62,11,"活塞","2011-12",new double[]{4.3 	,1.3 	,3.0 ,	0.7 	,0.8 ,0.8 ,	0.5 	,1.0 	,1.4});

PlayerNumberVO  playerNumberVO6=new PlayerNumberVO("Cory Joseph","18.3",79,14,"马刺","2014-15",new double[]{2.4 	,0.6, 	1.9 	,2.4 ,	0.6 	,0.2 	,0.8 ,	1.3 ,	6.8});

PlayerNumberVO  playerNumberVO7=new PlayerNumberVO("Caron Butler","20.8",78,21,"活塞","2014-15",new double[]{2.5 ,	0.3 	,2.2 	,1.0 ,	0.6 ,	0.1 ,	0.6 ,	1.5 ,	5.9});


PlayerNumberVO  playerNumberVO8=new PlayerNumberVO("Kyle Korver","32.2",75,75,"老鹰","2014-15",new double[]{4.1, 	0.2 ,	3.9 ,	2.6 ,	0.7 ,	0.6 	,1.4 	,1.9 ,	12.1 	});

PlayerNumberVO  playerNumberVO9=new PlayerNumberVO("Danny Granger","20.3",30,6,"热火","2014-15",new double[]{2.7, 	0.7 ,	2.0 ,	0.6 ,	0.4 ,	0.2 ,	0.8 ,	2.2 ,	6.3});

PlayerNumberVO  playerNumberVO10=new PlayerNumberVO("James Harden","36.8",81,81,"火箭","2014-15",new double[]{5.7 ,	0.9 	,4.7 	,7.0 	,1.9 	,0.7 ,	4.0 ,	2.6 ,	27.4});
playerNumberVOs2.add(playerNumberVO);
playerNumberVOs2.add(playerNumberVO1);
playerNumberVOs2.add(playerNumberVO2);
playerNumberVOs2.add(playerNumberVO3);
playerNumberVOs2.add(playerNumberVO4);
playerNumberVOs2.add(playerNumberVO5);
playerNumberVOs2.add(playerNumberVO6);
playerNumberVOs2.add(playerNumberVO7);
playerNumberVOs2.add(playerNumberVO8);
playerNumberVOs2.add(playerNumberVO9);
playerNumberVOs2.add(playerNumberVO10);

return playerNumberVOs2;
	
}
public ArrayList<PlayerRateVO> getPlayerRateVOs(){
	ArrayList<PlayerRateVO> playerRateVOs =new ArrayList<PlayerRateVO>();
	PlayerRateVO playerRateVO=new PlayerRateVO("Caron Butler", "2014-15", 1, new double[]{4.7, 	0.8 ,	3.9 	,	0.2 	,2.5, 	3.0 	,17.8,6.6	,1.4	,12.2 ,	7.3,	1.4,	0.2,	10.4 ,	12.9});
	
	PlayerRateVO playerRateVO1=new PlayerRateVO("Kobe Bryant", "2014-15", 1, new double[]{2.5 ,	0.3 	,2.2 	,1.0 ,	0.6 ,	0.1 ,	0.6,	9.1,	2.3,	16.4,	29.7,	2.0,	0.5,	13.5,	34.7});
	
	PlayerRateVO playerRateVO2=new PlayerRateVO("James Harden", "2014-15", 1, new double[]{5.7 ,	0.9 	,4.7 	,7.0 	,1.9 	,0.7 ,	4.0 ,		8.5,	2.8,	14.2,	34.6,	2.6, 	1.6,	14.9, 	31.3});
	
	PlayerRateVO playerRateVO3=new PlayerRateVO("Danny Granger", "2014-15", 1, new double[]{2.7, 	0.7 ,	2.0 ,	0.6 ,	0.4 ,	0.2 ,	0.8 ,		7.8,	4.0,	11.5,	4.4,	1.1, 	0.8, 	11.9,	15.5});
	
	PlayerRateVO playerRateVO4=new PlayerRateVO("Kyle Korver", "2014-15", 1, new double[]{4.1, 	0.2 ,	3.9 ,	2.6 ,	0.7 ,	0.6 	,1.4 ,	0.2,	7.2,	0.7,	13.3,12.1,	1.1,	1.5,	14.1, 	14.4});
	
	PlayerRateVO playerRateVO5=new PlayerRateVO("Quincy-Acy", "2014-15", 1, new double[]{4.4,1.0,1.2,3.3,0.4,0.9,0.2,	13.,	6.9,	20.5,	8.7, 	1.1,	1.4, 	13.8, 	15.5});
	
	PlayerRateVO playerRateVO6=new PlayerRateVO("Kevin Love", "2014-15", 1, new double[]{9.7 ,	1.9 ,	7.9 	,2.2, 	0.7 ,	0.5 ,	1.6 	,	16.6,	6.5,	26.3,	10.7, 	1.0,	1.2,	10.0, 	21.7});
	
	PlayerRateVO playerRateVO7=new PlayerRateVO("Kyle Lowry", "2014-15", 1, new double[]{4.7, 	0.8 ,	3.9 	,6.8 ,	1.6 ,	0.2 	,2.5,	7.8,	2.6,	13.1, 	32.4,2.3,	0.4, 	12.8, 	25.4});
	
	PlayerRateVO playerRateVO8=new PlayerRateVO("Ben Wallace", "2011-12", 1, new double[]{4.3 	,1.3 	,3.0 ,	0.7 	,0.8 ,0.8 ,	0.5 	,	16.4,	4.2, 	29.4, 	3.5,	2.3,	4.4,	6.2,	25.4});
	
	PlayerRateVO playerRateVO9=new PlayerRateVO("Metta World Peace", "2013-14", 1, new double[]{2.0 ,	0.6 ,	1.4 ,	0.6 	,0.8 	,0.3 ,	0.6 ,	8.9, 	5.3,	12.8,	7.1,	3.3,	1.8,	11.4 ,	20.0});
	
	PlayerRateVO playerRateVO10=new PlayerRateVO("Cory Joseph", "2014-15", 1, new double[]{2.4 	,0.6, 	1.9 	,2.4 ,	0.6 	,0.2 	,0.8 ,	7.5, 	3.5, 	11.4, 	19.7, 	1.6, 	0.9, 	12.4 ,	17.0});
	playerRateVOs.add(playerRateVO);
	playerRateVOs.add(playerRateVO1);
	playerRateVOs.add(playerRateVO2);
	playerRateVOs.add(playerRateVO3);
	playerRateVOs.add(playerRateVO4);
	playerRateVOs.add(playerRateVO6);
	playerRateVOs.add(playerRateVO5);
	playerRateVOs.add(playerRateVO7);
	playerRateVOs.add(playerRateVO8);
	playerRateVOs.add(playerRateVO9);
	playerRateVOs.add(playerRateVO10);
	return playerRateVOs;
}
public ArrayList<TeamNumberVO>getTeamNumberVOs (){
	ArrayList<TeamNumberVO>teamNumberVOs=new ArrayList<TeamNumberVO>();
	TeamNumberVO teamNumberVO=new TeamNumberVO("MIA", 82, "2014-15", 1, new double[]{8.2 	,17.5 	,	0.5 	,1.6 	,	4.6 	,6.0, 	3.5 	,0.9 	,2.6 ,	4.8 	,1.2 	,0.3 	,3.4, 	1.7 	,21.5});
	TeamNumberVO teamNumberVO1=new TeamNumberVO("CHI", 82, "2014-15", 1, new double[]{6.5 	,14.0 ,	1.1 ,	3.0 	,	5.9 ,	7.1 	,5.8 	,1.8 ,	4.1 ,	3.3 ,	1.8 ,	0.6 ,	1.4 ,	1.7 	,20.0});
	TeamNumberVO teamNumberVO2=new TeamNumberVO("SAS", 82, "2014-15", 1, new double[]{6.2 	,12.8 ,	1.0 ,	3.0 	,3.2 ,	3.9 	,7.2 ,	1.3 ,	5.9 	,2.5 ,	2.3 ,	0.8 ,	1.5 ,	2.0 	,16.5});
	TeamNumberVO teamNumberVO3=new TeamNumberVO("HOU", 82, "2014-15", 1, new double[]{8.0, 	18.1 	,	2.6 ,	6.9 	,	8.8 	,10.2 ,	5.7 	,0.9 	,4.7 	,7.0 ,	1.9 	,0.7 ,	4.0 ,	2.6 	,27.4});
	TeamNumberVO teamNumberVO4=new TeamNumberVO("IND", 82, "2014-15", 1, new double[]{5.9 	,12.4 	,	1.6 ,	4.5 	,	2.6 	,3.3 	,4.2 	,0.6 	,3.6 ,	5.1 ,	1.0 	,0.3 	,1.6 ,	2.6 	,16.1});
	TeamNumberVO teamNumberVO5=new TeamNumberVO("PHI", 82, "2014-15", 1, new double[]{5.8 ,	14.5 , 	1.2 ,	4.7 	, 	4.0 	,6.0 	,2.9 ,	0.7 	,2.1 ,	5.2 ,	1.6 ,	0.3 	,3.8, 	2.4 	,16.9});
	TeamNumberVO teamNumberVO6=new TeamNumberVO("NYK", 82, "2014-15", 1, new double[]{9.0 ,	20.2 	,	1.5 	,4.5 	,	4.7 	,5.9 	,6.6 	,1.8, 	4.8 ,	3.1 	,1.0 ,	0.4 	,2.2 	,2.2 ,	24.2});
	TeamNumberVO teamNumberVO8=new TeamNumberVO("CLE", 82, "2014-15", 1, new double[]{9.0 ,	18.5 	,	1.7 	,4.9 ,	5.4 ,	7.7 ,	6.0 	,0.8 	,5.3 ,	7.4 	,1.6 ,	0.7, 	3.9 ,	2.0 	,25.3});
	TeamNumberVO teamNumberVO7=new TeamNumberVO("UTA", 82, "2014-15", 1, new double[]{6.3 ,	14.1 	,1.6 	,4.3 	,	4.9 ,	6.0 ,	4.8 	,0.7 ,	4.2 ,	4.1 	,1.4 	,0.4 ,	2.7 ,	1.7 	,19.0});
	TeamNumberVO teamNumberVO9=new TeamNumberVO("TOR", 82, "2014-15", 1, new double[]{6.8 ,	16.5 	,	0.4 	,1.5 	,	6.0 ,	7.2 ,	4.6 ,	0.7 	,3.9 	,3.5, 	1.2, 	0.2 ,	2.3 ,	2.0 ,	20.1});
	TeamNumberVO teamNumberVO10=new TeamNumberVO("GSW", 82, "2014-15", 1, new double[]{41.6 	,87.0 ,10.8 	,27.0 	,16.0 ,	20.8 	,44.7 ,	10.4 	,34.3, 	27.4 ,	9.3, 	6.0 ,	14.1 ,	19.9 	,110.0});
	teamNumberVOs.add(teamNumberVO);
	teamNumberVOs.add(teamNumberVO1);
	teamNumberVOs.add(teamNumberVO2);
	teamNumberVOs.add(teamNumberVO3);
	teamNumberVOs.add(teamNumberVO4);
	teamNumberVOs.add(teamNumberVO5);
	teamNumberVOs.add(teamNumberVO6);
	teamNumberVOs.add(teamNumberVO7);
	teamNumberVOs.add(teamNumberVO8);
	teamNumberVOs.add(teamNumberVO9);
	teamNumberVOs.add(teamNumberVO10);
	return teamNumberVOs;
	
}
public ArrayList<TeamRateVO> gETeamRateVOs(){
	ArrayList<TeamRateVO> teamRateVOs=new ArrayList<TeamRateVO>();
	TeamRateVO teamRateVO=new TeamRateVO("MIA", "2014-15", 1, new double[]{6.0, 	3.5 	,0.9 	,2.6 ,	4.8 	,1.2 	,0.3 	,3.4, 	1.7 	,21.5});
	TeamRateVO teamNumberVO1=new TeamRateVO("CHI",  "2014-15", 1, new double[]{7.1 	,5.8 	,1.8 ,	4.1 ,	3.3 ,	1.8 ,	0.6 ,	1.4 ,	1.7 	,20.0});
	TeamRateVO teamNumberVO2=new TeamRateVO("SAS",  "2014-15", 1, new double[]{	3.9 	,7.2 ,	1.3 ,	5.9 	,2.5 ,	2.3 ,	0.8 ,	1.5 ,	2.0 	,16.5});
	TeamRateVO teamNumberVO3=new TeamRateVO("HOU",  "2014-15", 1, new double[]{10.2 ,	5.7 	,0.9 	,4.7 	,7.0 ,	1.9 	,0.7 ,	4.0 ,	2.6 	,27.4});
	TeamRateVO teamNumberVO4=new TeamRateVO("IND",  "2014-15", 1, new double[]{3.3 	,4.2 	,0.6 	,3.6 ,	5.1 ,	1.0 	,0.3 	,1.6 ,	2.6 	,16.1});
	TeamRateVO teamNumberVO5=new TeamRateVO("PHI",  "2014-15", 1, new double[]{6.0 	,2.9 ,	0.7 	,2.1 ,	5.2 ,	1.6 ,	0.3 	,3.8, 	2.4 	,16.9});
	TeamRateVO teamNumberVO6=new TeamRateVO("NYK", "2014-15", 1, new double[]{5.9 	,6.6 	,1.8, 	4.8 ,	3.1 	,1.0 ,	0.4 	,2.2 	,2.2 ,	24.2});
	TeamRateVO teamNumberVO8=new TeamRateVO("CLE",  "2014-15", 1, new double[]{7.7 ,	6.0 	,0.8 	,5.3 ,	7.4 	,1.6 ,	0.7, 	3.9 ,	2.0 	,25.3});
	TeamRateVO teamNumberVO7=new TeamRateVO("UTA",  "2014-15", 1, new double[]{	6.0 ,	4.8 	,0.7 ,	4.2 ,	4.1 	,1.4 	,0.4 ,	2.7 ,	1.7 	,19.0});
	TeamRateVO teamNumberVO9=new TeamRateVO("TOR",  "2014-15", 1, new double[]{	7.2 ,	4.6 ,	0.7 	,3.9 	,3.5, 	1.2, 	0.2 ,	2.3 ,	2.0 ,	20.1});
	
 teamRateVOs.add(teamRateVO);
 teamRateVOs.add(teamNumberVO1);
 teamRateVOs.add(teamNumberVO2);
 teamRateVOs.add(teamNumberVO3);
 teamRateVOs.add(teamNumberVO4);
 teamRateVOs.add(teamNumberVO5);
 teamRateVOs.add(teamNumberVO6);
 teamRateVOs.add(teamNumberVO7);
 teamRateVOs.add(teamNumberVO8);
 teamRateVOs.add(teamNumberVO9);
 return  teamRateVOs;
}
}
