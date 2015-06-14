package crawler;
import java.util.ArrayList;

import org.jsoup.Jsoup;
import org.jsoup.nodes.Document;
import org.jsoup.nodes.Element;
import org.jsoup.select.Elements;

import specialpo.PlayerBaseInfoPO;

import com.gargoylesoftware.htmlunit.WebClient;
import com.gargoylesoftware.htmlunit.html.HtmlPage;

public class HistoryPlayerBaseInfo {

	public static void main(String[] args) throws Exception {
		test();
	}

	public static void test() throws Exception {
		/*
		 * 用到了HtmlUnit和Jsoup两个jar包
		 * HtmlUnit是一个无界面浏览器，可以模拟浏览器行为
		 * Jsoup是用来分析获得的Xml文件
		 */
		
		//打开主页
		System.out.println("打开NBA主页");
		String url = "http://china.nba.com/playerindex/";
		
		System.out.println("获取球员信息");
		Document document = Jsoup.connect(url).get();
		Elements links = document.select("a[href]");
		Elements media = document.select("[src]");
		Elements imports = document.select("link[href]");
		
		for (Element src : media) {
			if (src.tagName().equals("img")) {
				 System.out.println(src.attr("abs:src")+src.attr("width")+src.attr("height")
	                        );
			}
		}
	}
}
