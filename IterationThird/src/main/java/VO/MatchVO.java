package VO;

import java.util.ArrayList;

public class MatchVO {
String season;
String time;
String matchid;
String loser;
String winner;
boolean isAfter;
ArrayList<String> scorelist=new ArrayList<String>();
ArrayList<PlayerMatchVO> winnerlist=new ArrayList<PlayerMatchVO>();
ArrayList<PlayerMatchVO> loserlist=new ArrayList<PlayerMatchVO>();

public MatchVO(String id){
	this.matchid=id;
}
}
