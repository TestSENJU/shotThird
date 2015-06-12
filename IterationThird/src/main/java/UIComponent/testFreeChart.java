package UIComponent;

import java.awt.Color;

import java.awt.Font;

import org.jfree.chart.ChartFactory;

import org.jfree.chart.ChartFrame;

import org.jfree.chart.JFreeChart;

import org.jfree.chart.axis.AxisSpace;

import org.jfree.chart.labels.ItemLabelAnchor;

import org.jfree.chart.labels.ItemLabelPosition;

import org.jfree.chart.labels.StandardXYItemLabelGenerator;

import org.jfree.chart.plot.XYPlot;

import org.jfree.chart.renderer.xy.XYItemRenderer;

import org.jfree.chart.renderer.xy.XYLineAndShapeRenderer;

import org.jfree.chart.title.TextTitle;

import org.jfree.data.time.Month;

import org.jfree.data.time.TimeSeries;

import org.jfree.data.time.TimeSeriesCollection;

import org.jfree.ui.RectangleInsets;

import org.jfree.ui.TextAnchor;

public class testFreeChart {

public static void main(String[] args){

//首先构造数据

TimeSeries timeSeries = new TimeSeries("BMI", Month.class);

// 时间曲线数据集合

TimeSeriesCollection lineDataset = new TimeSeriesCollection();

// 构造数据集合

timeSeries.add(new Month(1, 2009), 45);

timeSeries.add(new Month(2, 2009), 46);

timeSeries.add(new Month(3, 2009), 1);

timeSeries.add(new Month(4, 2009), 500);

timeSeries.add(new Month(5, 2009), 43);

timeSeries.add(new Month(6, 2009), 324);

timeSeries.add(new Month(7, 2009), 632);

timeSeries.add(new Month(8, 2009), 34);

timeSeries.add(new Month(9, 2009), 12);

timeSeries.add(new Month(10, 2009), 543);

timeSeries.add(new Month(11, 2009), 32);

timeSeries.add(new Month(12, 2009), 225);

lineDataset.addSeries(timeSeries);

JFreeChart chart = ChartFactory.createTimeSeriesChart("", "date", "bmi", lineDataset, true, true, true);

//增加标题

chart.setTitle(new TextTitle("XXXBMI指数", new Font("隶书", Font.ITALIC, 15)));

chart.setAntiAlias(true);

XYPlot plot = (XYPlot) chart.getPlot();

plot.setAxisOffset(new RectangleInsets(10,10,10,10));//图片区与坐标轴的距离

plot.setOutlinePaint(Color.PINK);

plot.setInsets(new RectangleInsets(15,15,15,15));//坐标轴与最外延的距离

// plot.setOrientation(PlotOrientation.HORIZONTAL);//图形的方向，包括坐标轴。

AxisSpace as = new AxisSpace();

as.setLeft(25);

as.setRight(25);

plot.setFixedRangeAxisSpace(as);

chart.setPadding(new RectangleInsets(5,5,5,5));

chart.setNotify(true);

// 设置曲线是否显示数据点

XYLineAndShapeRenderer xylineandshaperenderer = (XYLineAndShapeRenderer)plot.getRenderer();

xylineandshaperenderer.setBaseShapesVisible(true);

// 设置曲线显示各数据点的值

XYItemRenderer xyitem = plot.getRenderer();

xyitem.setBaseItemLabelsVisible(true);

xyitem.setBasePositiveItemLabelPosition(new ItemLabelPosition(ItemLabelAnchor.INSIDE10, TextAnchor.BASELINE_LEFT));

xyitem.setBaseItemLabelGenerator(new StandardXYItemLabelGenerator());

xyitem.setBaseItemLabelFont(new Font("Dialog", 1, 14));

plot.setRenderer(xyitem);

//显示

ChartFrame frame = new ChartFrame("try1", chart);

frame.pack();

frame.setVisible(true);

}

}
