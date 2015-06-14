package logic;

import java.util.ArrayList;

import VO.MatchShortVO;
import VO.MatchVO;

public interface MatchBL {

	//-----------在比赛的总面板里获取所有比赛的简短信息，不过我有点疑问要显示多少条，多了要加载的时间很长------------//
	public ArrayList<MatchShortVO> getMatch();
	
	//----------------------根据比赛的id获取该比赛的详细信息，主要使用在根据比赛的简短信息获取详细信息时----------------------//
	public MatchVO getMatchByMatchId(String matchid);
	
	//---------------------查找比赛的界面里面用于根据输入的多个条件获取比赛的简短信息，其中任意一个条件可以为空-----------------------//
	public ArrayList<MatchShortVO> getMatchByConditions(String playername,String teamname,boolean isAfter,String time,String season);

	//---------------------获取最近的比赛，用于显示在首页和搜索界面-----------------------//
	public ArrayList<MatchShortVO> getRecentMatch(int num);
}
