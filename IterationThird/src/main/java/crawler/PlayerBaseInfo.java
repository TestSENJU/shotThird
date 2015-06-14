package crawler;
import java.util.ArrayList;

import org.jsoup.Jsoup;
import org.jsoup.nodes.Document;
import org.jsoup.select.Elements;

import specialpo.PlayerBaseInfoPO;

import com.gargoylesoftware.htmlunit.WebClient;
import com.gargoylesoftware.htmlunit.html.HtmlPage;

public class PlayerBaseInfo {

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
		String url = "http://china.nba.com/stats/players/index.html";
		HtmlPage indexPage = (HtmlPage) webClient.getPage(url);
		
		System.out.println("获取球员信息");
		Document document = Jsoup.parse(indexPage.asXml(), "UTF-8");
		Elements elements = document.select("tbody").select("tr");
		ArrayList<PlayerBaseInfoPO> playerBI = new ArrayList<PlayerBaseInfoPO>();
		for (int i=1;i < elements.size()-1;i++) {
			Elements tds = elements.get(i).select("td");
			String name = tds.get(0).text().toString().trim().replaceAll(" ", "");
			int length = name.length();
			int flag = -1;
			for (int j=0;j <length;j++) {
				char c = name.charAt(j);
				if ((c >= 0x4e00)&&(c <= 0x9fbb)) {
					flag = j;
					break;
				}
			}
			String EName = "ename";
			String CName = "cname";
			if (flag != -1) {
				EName = name.substring(0, flag).trim();
				CName = name.substring(flag).trim();
			}
			playerBI.add(new PlayerBaseInfoPO(EName,CName,tds.get(1).text(),tds.get(2).text(),tds.get(3).text(),tds.get(4).text(),tds.get(5).text()));
			//http://china.nba.com/media/img/players/head/132x132/203919.png
		}
		for (int h=0;h < playerBI.size();h++) {
			System.out.println(playerBI.get(h).getName());
		}
		//关闭客户端
		webClient.close();
	}
}
