import java.awt.Dimension;
import java.awt.Font;

import javax.swing.JPanel;

import org.jfree.chart.ChartFactory;
import org.jfree.chart.ChartPanel;
import org.jfree.chart.JFreeChart;
import org.jfree.chart.plot.PiePlot;
import org.jfree.chart.plot.PlotOrientation;
import org.jfree.data.category.CategoryDataset;
import org.jfree.data.general.DatasetUtilities;
import org.jfree.data.general.DefaultPieDataset;

import UIComponent.JumpFrame;
import UIComponent.MyColor;


public class testCatogery extends JPanel{
	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	public testCatogery(){

		double		[][] data = new double[][] {{1310, 1220, 1110, 1000}, 

		        {720, 700, 680, 640}, 

		        {1130, 1020, 980, 800}, 

		        {440, 400, 360, 300}};


String[] rowKeys = {"广州", "深圳", "东莞", "佛山"}; 


String[] columnKeys = {"猪肉", "牛肉","鸡肉", "鱼肉"}; 


		CategoryDataset dataset = DatasetUtilities.createCategoryDataset(rowKeys, columnKeys, data); 
		JFreeChart chart = ChartFactory.createBarChart3D("广州肉类销量统计图", "肉类", "销量", dataset, 
				PlotOrientation.VERTICAL, true, false, false);
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
