import java.awt.Font;
import java.time.Month;

import javax.swing.JPanel;

import org.jfree.chart.ChartFactory;
import org.jfree.chart.ChartPanel;
import org.jfree.chart.JFreeChart;
import org.jfree.chart.plot.PlotOrientation;
import org.jfree.chart.title.TextTitle;
import org.jfree.data.category.CategoryDataset;
import org.jfree.data.general.DatasetUtilities;
import org.jfree.data.time.TimeSeries;
import org.jfree.data.time.TimeSeriesCollection;

import UIComponent.JumpFrame;
import UIComponent.MyColor;


public class testLineChart extends JPanel{
	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	@SuppressWarnings("deprecation")
	public testLineChart(){
		//访问量统计时间线 
		TimeSeries timeSeries2006 = new TimeSeries("2006年度", Month.class); 
		TimeSeries timeSeries2007 = new TimeSeries("2007年度", Month.class);  
		//时间曲线数据集合 
		TimeSeriesCollection lineDataset = new TimeSeriesCollection(); //构造数据集合 
//		timeSeries2006.add(new Month(1, 2007), 7200);
//		timeSeries2006.add(new Month(2, 2007), 7000); 
//		timeSeries2006.add(new Month(3, 2007), 4200);
//		timeSeries2006.add(new Month(4, 2007), 8200); 
//		timeSeries2006.add(new Month(5, 2007), 7300); 
//		timeSeries2006.add(new Month(6, 2007), 8200);
//		timeSeries2006.add(new Month(7, 2007), 9200); 
//		timeSeries2006.add(new Month(8, 2007), 7300);
//		timeSeries2006.add(new Month(9, 2007), 9400); 
//		timeSeries2006.add(new Month(10, 2007), 7500); 
//		timeSeries2006.add(new Month(11, 2007), 6600); 
//		timeSeries2006.add(new Month(12, 2007), 3500); 
//		timeSeries2007.add(new Month(1, 2007), 10200); 
//		timeSeries2007.add(new Month(2, 2007), 9000); 
//		timeSeries2007.add(new Month(3, 2007), 6200); 
//		timeSeries2007.add(new Month(4, 2007), 8200); 
//		timeSeries2007.add(new Month(5, 2007), 8200); 
//		 
//		timeSeries2007.add(new Month(6, 2007), 11200); timeSeries2007.add(new Month(7, 2007), 13200); timeSeries2007.add(new Month(8, 2007), 8300); timeSeries2007.add(new Month(9, 2007), 10400); timeSeries2007.add(new Month(10, 2007), 12500); timeSeries2007.add(new Month(11, 2007), 10600); timeSeries2007.add(new Month(12, 2007), 10500); lineDataset.addSeries(timeSeries2006); lineDataset.addSeries(timeSeries2007);  
		JFreeChart chart = ChartFactory.createTimeSeriesChart("访问量统计时间线", "月份", "访问量", lineDataset, true, true, true); //设置子标题 
		TextTitle subtitle = new TextTitle("2006/2007年度访问量对比", new Font("黑体", Font.BOLD, 12)); 
		chart.addSubtitle(subtitle); //设置主标题 
		chart.setTitle(new TextTitle("阿蜜果blog访问量统计", new Font("隶书", Font.ITALIC, 15))); 
		chart.setAntiAlias(true); 
chart.addSubtitle(subtitle); 
chart.setTitle(new TextTitle("阿蜜果blog访问量统计", new Font("隶书", Font.ITALIC, 15)));  
chart.setAntiAlias(true
); 

			 ChartPanel panel=new ChartPanel(chart);
//			 panel.setPreferredSize(new Dimension(100,100));
	 this.add(panel);
this.setBackground(MyColor.WHITE.getColor());
//this.setPreferredSize(new Dimension(100,100));
this.setBounds(0, 20, 500, 580);
}
public  static void main(String args[]){
	JumpFrame frame=new JumpFrame(new testCatogery());
	frame.open();
}
}
