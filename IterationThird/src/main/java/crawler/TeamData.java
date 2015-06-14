package crawler;
import java.io.File;
import java.io.PrintStream;
import java.net.URL;
import java.net.URLConnection;
import java.util.ArrayList;
import java.util.List;

import org.jsoup.Jsoup;
import org.jsoup.nodes.Document;
import org.jsoup.nodes.Element;
import org.jsoup.select.Elements;

import com.gargoylesoftware.htmlunit.WebClient;
import com.gargoylesoftware.htmlunit.html.HtmlPage;

public class TeamData {

	public static void main(String[] args) throws Exception {
		test(new PrintStream(new File("./nba.html"), "UTF-8"));
	}

	public static void test(PrintStream out) throws Exception {
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
		//String url = "http://www.stat-nba.com/query.php?QueryType=all&AllType=season&AT=avg&order=1&crtcol=pts&PageNum=2000";
		String url = "http://china.nba.com/stats/players/index.html";
		HtmlPage indexPage = (HtmlPage) webClient.getPage(url);
		//http://www.stat-nba.com/query.php?page=1&QueryType=all&AllType=season&AT=avg&order=1&crtcol=pts&PageNum=2000000#label_show_result
		//http://www.stat-nba.com/query.php?QueryType=all&AllType=season&AT=avg&order=1&crtcol=pts&PageNum=2000000
		//选择查看球员信息的那个按钮
/*		System.out.println("选择球员");
		//根据名字“球员”找到了那个按钮
		HtmlAnchor playerBtn = indexPage.getAnchorByText("球员");
		HtmlPage playerPage = playerBtn.click();
		//这里是把得到的Page转换成了Xml格式
		out.println(playerPage.asXml());
		
		//用Jsoup分析Xml
		Document documentP = Jsoup.parse(playerPage.asXml(), "UTF-8");
		List<String> listP = new ArrayList<String>();
		//这里看着可能会比较奇怪，这个要根据得到的Xml文件，进行一定的分析
		Elements elementsP = documentP.select("tr").select("td").select("a");
		for (Element element : elementsP) {
			listP.add(element.text());
			System.out.println(element.text());
		}*/
		
		/*System.out.println("选择球队");
		HtmlAnchor teamBtn = indexPage.getAnchorByText("球队数据");
		HtmlPage teamPage = teamBtn.click();
		out.println(teamPage.asXml());*/
		//out.println(indexPage.asXml());
		
		Document documentT = Jsoup.parse(indexPage.asXml(), "UTF-8");
		List<String> listT = new ArrayList<String>();
		//doc.select("div#page>div#content>div#main>div.left>div#recommend>ul>li>a"); 
		//Elements elementsT = documentT.select("div#app-container>div.contianer>div.row container-row>div.col-xl-8 col-lg-12 content-container>div.content>div.ng-scope>div.row>div.col-sm-12>div.sib-table-container sib-table-player-index>div.ng-scope>table");
		Elements elementsT = documentT.select("tr").select("td").select("a");
		for (Element elementT : elementsT) {
			//String href = elementT.attr("href");  
	        //String title = elementT.text();  
	        //System.out.println(title + ":" + href);
			//String[] ele = elementT.text().split(" ");
			
			System.out.println(elementT.select("a[href]").select("img"));
			//System.out.println(elementT.select("img"));
			//http://china.nba.com/media/img/players/head/132x132/203919.png
		}
		
		//关闭客户端
		webClient.close();
	}
}
