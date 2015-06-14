package UIComponent;

public class TeamNameSwitcher {

	public String getTeamName(String shortname){
		switch(shortname){
		case "ATL":return "亚特兰大老鹰队";
		case "BKN":return "布鲁克林篮网队";
		case "BOS":return "波士顿凯尔特人";
		case "CHA":return "夏洛特黄蜂队";
		case "CHI":return "芝加哥公牛队";
		case "CLE":return "克里夫兰骑士队";
		case "DAL":return "达拉斯小牛队";
		case "DEN":return "丹佛掘金队";
		case "DET":return "底特律活塞";
		case "GSW":return "金州勇士队";
		case "HOU":return "休斯敦火箭队";
		case "IND":return "印第安纳步行者";
		case "LAC":return "洛杉矶快船队";
		case "LAL":return "洛杉矶湖人队";
		case "MEM":return "孟菲斯灰熊队";
		case "MIA":return "迈阿密热火队";
		case "MIL":return "密尔沃基雄鹿队";
		case "MIN":return "明尼苏达森林狼队";
		case "NOP":return "新奥尔良鹈鹕队";
		case "NYK":return "纽约尼克斯队";
		case "OKC":return "奥克拉荷马城雷霆队";
		case "ORL":return "奥兰多魔术队";
		case "PHI":return "费城76人";
		case "PHX":return "菲尼克斯太阳队";
		case "POR":return "波特兰开拓者队";
		case "SAC":return "萨克拉门托国王队";
		case "SAS":return "圣安东尼安马刺队";
		case "TOR":return "多伦多猛龙队";
		case "UTA":return "犹他爵士队";
		case "WAS":return "华盛顿奇才队";
		}
		return null;
	}
}
