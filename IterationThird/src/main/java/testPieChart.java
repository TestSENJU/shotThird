import java.awt.Dimension;
import java.awt.Font;

import javax.swing.JPanel;

import org.jfree.chart.ChartFactory;
import org.jfree.chart.ChartPanel;
import org.jfree.chart.JFreeChart;
import org.jfree.chart.plot.PiePlot;
import org.jfree.data.general.DefaultPieDataset;

import UIComponent.JumpFrame;
import UIComponent.MyColor;


public class testPieChart extends JPanel{
/**
	 * 
	 */
	private static final long serialVersionUID = 1L;

public testPieChart(){
	DefaultPieDataset defaultpiedataset = new DefaultPieDataset(); //注意是DefaultPieDataset！！
	defaultpiedataset.setValue("ONE", new Double(43.200000000000003D));
	 defaultpiedataset.setValue("TWO", new Double(10D));
	 defaultpiedataset.setValue("THREE", new Double(27.5D));
	 defaultpiedataset.setValue("FOUR", new Double(17.5D));
	 JFreeChart jfreechart = ChartFactory.createPieChart("FREE", //图形标题名称
			 defaultpiedataset, // dataset
			  true, // legend?
			  true, // tooltips?
			  false); //URLs?
			  PiePlot pieplot = (PiePlot)jfreechart.getPlot(); //通过JFreeChart 对象获得 plot：PiePlot！！
			  pieplot.setBackgroundPaint(MyColor.WHITE.getColor());
			  
			 pieplot.setNoDataMessage("NOTHING"); // 
			 pieplot.setLabelFont(new Font("黑体",Font.PLAIN,14));
			 pieplot.setLabelBackgroundPaint(MyColor.WHITE.getColor());

			 
			 ChartPanel panel=new ChartPanel(jfreechart);
			 panel.setPreferredSize(new Dimension(100,100));
	 this.add(panel);
this.setBackground(MyColor.WHITE.getColor());
//this.setPreferredSize(new Dimension(100,100));
this.setBounds(0, 20, 500, 580);
}
public  static void main(String args[]){
	JumpFrame frame=new JumpFrame(new testPieChart());
	frame.open();
}
}
