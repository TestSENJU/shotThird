package crawler;
import java.util.ArrayList;

import org.jsoup.Jsoup;
import org.jsoup.nodes.Document;
import org.jsoup.select.Elements;

import specialpo.TeamAverageRegularDataPO;

import com.gargoylesoftware.htmlunit.WebClient;
import com.gargoylesoftware.htmlunit.html.HtmlPage;

public class TeamAverageRegularData {

	public static void main(String[] args) throws Exception {
		test();
	}

	public static void test() throws Exception {
		/*
		 * 用到了HtmlUnit和Jsoup两个jar包
		 * HtmlUnit是一个无界面浏览器，可以模拟浏览器行为
		 * Jsoup是用来分析获得的Xml文件
		 */
		
		//用HtmlUnit获得网页
		//新建一个客户端
		WebClient webClient = new WebClient();
		//因为HtmlUnit对Css和JS的支持不好，所以把这两个功能关掉，不然会有很多警告
		webClient.getOptions().setCssEnabled(false);
		webClient.getOptions().setJavaScriptEnabled(false);
		
		//打开主页
		System.out.println("打开NBA主页");
		String url = "http://www.stat-nba.com/query_team.php?crtcol=season&order=1&QueryType=ss&SsType=season&PageNum=200#label_show_result";
		HtmlPage indexPage = (HtmlPage) webClient.getPage(url);
		
		System.out.println("球队数据-常规赛-赛季场均-12-15");
		Document document = Jsoup.parse(indexPage.asXml(), "UTF-8");
		Elements elements = document.select("tr");
		ArrayList<TeamAverageRegularDataPO> teamARD = new ArrayList<TeamAverageRegularDataPO>();
		for (int i=1;i < 91;i++) {
			//Elements tds = elements.get(i).select("td");
			System.out.println(elements.get(i).text());
			String[] data = elements.get(i).text().toString().split("\\s+");
			teamARD.add(new TeamAverageRegularDataPO(data[1],data[2],data[3],data[4], data[5],data[6],data[7],data[8],data[9],data[10],data[11],data[12],data[13],data[14],data[15],data[16],data[17],data[18],data[19],data[20],data[21],data[22],data[23]));
		}
		for (int k=0;k < teamARD.size();k++) {
			//System.out.println(teamARD.get(k).getMuff());
		}
		//关闭客户端
		webClient.close();
	}
}
