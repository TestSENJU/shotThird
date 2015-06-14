package crawler;
import org.jsoup.Jsoup;
import org.jsoup.nodes.Document;
import org.jsoup.nodes.Element;
import org.jsoup.select.Elements;

import com.gargoylesoftware.htmlunit.WebClient;
import com.gargoylesoftware.htmlunit.html.HtmlPage;

public class PlayerAverageData {

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
		String url = "http://china.nba.com/statistics/";
		HtmlPage indexPage = (HtmlPage) webClient.getPage(url);
		
		System.out.println("获取球员信息");
		Document document = Jsoup.parse(indexPage.asXml(), "UTF-8");
		Elements links = document.getElementsByTag("a");
		//ArrayList<PlayerBaseInfoPO> playerBI = new ArrayList<PlayerBaseInfoPO>();
		for (int i=1;i < links.size()-1;i++) {
			Element link = links.get(i);
			//indexPage.addAnchor(link.attr("href"), link.text());
			
			//http://china.nba.com/media/img/players/head/132x132/203919.png
		}
		//关闭客户端
		webClient.close();
	}
}
