package UIComponent.Player;

import java.awt.Font;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;
import java.util.ArrayList;

import javax.swing.ImageIcon;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.SwingConstants;
import javax.swing.table.DefaultTableModel;

import org.jfree.chart.ChartPanel;

import UIComponent.MyColor;
import UIComponent.MyComboBox;
import UIComponent.MyScrollPane;
import UIComponent.MyTable;

public class PlayerAnalysisPanel extends JPanel{

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	JLabel match,compare,data,change;
	private String playerid;
	JLabel photo;
	ImageIcon icon1,icon2;
	JLabel change1,change2;
	JPanel playershortpanel;
	JPanel select;
	JPanel draw;
	DefaultTableModel model;
	MyTable table;
	MyScrollPane jsp;
	MyComboBox seasonbox;
	MyComboBox isafterbox;
	JLabel confirm;
	JPanel seasonpanel;
	JPanel optionpanel;
	ChartPanel chartcompare;
	JLabel season;
	JLabel choose;
	
	JLabel after;
	private String[] rowKeys={"赛季","球队","个人"};
	private String[] columnKeys={"","",""};
	private String[] optionName=new String[]{"投篮命中数","三分命中数","三分出手数","罚球命中数","罚球出手数","进攻篮板数","防守篮板数","总篮板数","助攻数"
			,"抢断数","盖帽数","失误数","犯规数","得分"}; 
//	String data1[]=new String[]{F,48:00,ATL,HOU,2014-2015_01-05_ATL-HOU_1,23:45,7,19,2,6,8,10,0,6,6,5,1,0,4,3,24}
//	new double[]{C,48:00,GSW,HOU,2014-2015_02-27_GSW-HOU_1,32:02,11,13,0,0,4,6,2,9,11,2,0,2,3,4,26}
//	new double[]{G,48:00,MIA,SAS,2014-2015_11-29_MIA-SAS_1,19:00,5,11,2,6,3,4,0,3,3,4,1,0,1,5,15}
//	new double[]{F,48:00,LAC,DAL,2014-2015_04-04_LAC-DAL_1,7:38,2,4,0,0,1,2,1,2,3,0,0,0,1,2,5}
//	new double[]{F,48:00,CLE,GSW,2014-2015_02-09_CLE-GSW_1,39:00,13,29,3,9,6,6,3,9,12,8,1,2,3,4,35}
//	new double[]{G,48:00,GSW,LAL,2014-2015_01-31_GSW-LAL_1,35:00,10,16,7,10,4,4,0,5,5,9,1,0,2,5,31}
//	new double[]{C,48:00,DET,TOR,2014-2015_02-09_DET-TOR_1,26:32,7,13,1,3,3,5,3,9,12,1,0,1,0,4,18}
//	new double[]{G,48:00,SAS,HOU,2014-2015_03-01_SAS-HOU_1,20:09,4,11,1,4,2,2,0,3,3,2,1,0,1,3,11}
//	new double[]{F,48:00,UTA,PHX,2014-2015_03-02_UTA-PHX_1,19:09,5,12,0,3,3,3,1,5,6,2,0,1,2,4,13}
//	new double[]{C,48:00,BOS,CHI,2014-2015_11-03_BOS-CHI_1,27:00,8,17,0,0,6,8,2,10,12,0,0,3,1,2,22}
JLabel option[]=new JLabel[14];
	
	public PlayerAnalysisPanel(String id){
		this.playerid=id;
		initComponent();
		initPanel();
		setListener();
	}

	public void initComponent(){
		season=new JLabel("赛季");
		season.setForeground(MyColor.BLUE.getColor());
		season.setFont(new Font("黑体",Font.PLAIN,14));
		season.setBounds(0, 0, 40, 40);
		season.setHorizontalAlignment(SwingConstants.CENTER);
		
		after=new JLabel("常规赛");
		after.setForeground(MyColor.BLUE.getColor());
		after.setFont(new Font("黑体",Font.PLAIN,14));
		after.setBounds(160, 0, 70, 40);
		after.setHorizontalAlignment(SwingConstants.CENTER);
		isafterbox=new MyComboBox(new String[]{"季前赛","常规赛","季后赛"});
		isafterbox.setBounds(230,8,100,25);
		
		seasonbox=new MyComboBox(new String[]{"2014-2015","2013-2014","2012-2013"});
		seasonbox.setBounds(40, 8, 100, 25);
		
		
		choose=new JLabel("排序依据");
		choose.setForeground(MyColor.BLUE.getColor());
		choose.setFont(new Font("黑体",Font.PLAIN,14));
		choose.setBounds(0, 0, 60, 40);
		
//		chartcompare=new ChartPanel();
		
		
		for(int i=0;i<7;i++){
			option[i]=new JLabel(optionName[i]);
			option[i].setForeground(MyColor.BLACK.getColor());
			option[i].setFont(new Font("微软雅黑",Font.PLAIN,12));
			option[i].setOpaque(true);
			option[i].setBackground(MyColor.WHITE.getColor());
			option[i].setBounds(160+(i-1)*90, 0, 90, 40);
			option[i].setHorizontalAlignment(SwingConstants.CENTER);
		}
		for(int i=7;i<14;i++){
			option[i]=new JLabel(optionName[i]);
			option[i].setForeground(MyColor.BLACK.getColor());
			option[i].setFont(new Font("微软雅黑",Font.PLAIN,12));
			option[i].setOpaque(true);
			option[i].setBackground(MyColor.WHITE.getColor());
			option[i].setBounds(160+(i-8)*90, 40, 90, 40);
			option[i].setHorizontalAlignment(SwingConstants.CENTER);	
		}
	
		confirm=new JLabel("<HTML><U>"+"筛选"+"<HTML><U>");
		confirm.setBounds(520,0,40,40);
		confirm.setForeground(MyColor.BLUE.getColor());
		confirm.setFont(new Font("黑体",Font.PLAIN,14));
		confirm.setHorizontalAlignment(SwingConstants.CENTER);

		
		optionpanel=new JPanel();
		optionpanel.setBackground(MyColor.WHITE.getColor());
		optionpanel.setBounds(0,70 , 900, 80);
		optionpanel.setLayout(null);
		for(int i=0;i<option.length;i++){
			optionpanel.add(option[i]);
		}
		optionpanel.add(choose);
		
		seasonpanel=new JPanel();
		seasonpanel.setBackground(MyColor.WHITE.getColor());
		seasonpanel.setBounds(0,30 , 900, 40);
		seasonpanel.setLayout(null);
		seasonpanel.add(seasonbox);
		seasonpanel.add(isafterbox);
		seasonpanel.add(confirm);
		seasonpanel.add(season);
		seasonpanel.add(after);

		model=new DefaultTableModel(null,new String[]{"姓名","位置","时间","投篮命中数","三分命中数","三分出手数","罚球命中数","罚球出手数","进攻篮板数"
				,"防守篮板数","总篮板数","助攻数","抢断数","盖帽数","失误数","犯规数","得分"}){
			/**
					 * 
					 */
					private static final long serialVersionUID = 1L;

			public boolean isCellEditable(int row,int column){
				return false;
			}
		};
		table=new MyTable(model, 0, -1);
		jsp=new MyScrollPane(table);
		jsp.setBounds(0,150,900,550);
		
		
		match=new JLabel("比赛");
		match.setForeground(MyColor.BLUE.getColor());
		match.setOpaque(true);
		match.setBackground(MyColor.LIGHTBLUE.getColor());
		match.setHorizontalAlignment(SwingConstants.CENTER);
		match.setFont(new Font("黑体",Font.PLAIN,16));
		match.setBounds(10,0,40,30);
		
		compare=new JLabel("对比");
		compare.setForeground(MyColor.BLUE.getColor());
		compare.setOpaque(true);
		compare.setBackground(MyColor.WHITE.getColor());
		compare.setHorizontalAlignment(SwingConstants.CENTER);
		compare.setFont(new Font("黑体",Font.PLAIN,16));
		compare.setBounds(55,0,40,30);
		
		data=new JLabel("数据");
		data.setForeground(MyColor.BLUE.getColor());
		data.setOpaque(true);
		data.setBackground(MyColor.WHITE.getColor());
		data.setHorizontalAlignment(SwingConstants.CENTER);
		data.setFont(new Font("黑体",Font.PLAIN,16));
		data.setBounds(100,0,40,30);
		
		change=new JLabel("变化");
		change.setForeground(MyColor.BLUE.getColor());
		change.setOpaque(true);
		change.setBackground(MyColor.WHITE.getColor());
		change.setHorizontalAlignment(SwingConstants.CENTER);
		change.setFont(new Font("黑体",Font.PLAIN,16));
		change.setBounds(145,0,40,30);
		
		this.add(match);
		this.add(change);
		this.add(compare);
		this.add(data);
		this.add(jsp);
		this.add(seasonpanel);
		this.add(optionpanel);
	}
	public void initPanel(){
		this.setLayout(null);
		this.setBackground(MyColor.WHITE.getColor());
		this.setBounds(0, 20, 900, 580);
	}
	public void setListener(){
		match.addMouseListener(new MouseAdapter(){
			public void mouseClicked(MouseEvent e){
				match.setBackground(MyColor.WHITE.getColor());
				change.setBackground(MyColor.WHITE.getColor());
				compare.setBackground(MyColor.WHITE.getColor());
				data.setBackground(MyColor.WHITE.getColor());
				
				match.setBackground(MyColor.LIGHTBLUE.getColor());
				remove(getComponentAt(0,290));
				add(jsp);
				repaint();
			}
		});
		change.addMouseListener(new MouseAdapter(){
			public void mouseClicked(MouseEvent e){
				match.setBackground(MyColor.WHITE.getColor());
				change.setBackground(MyColor.WHITE.getColor());
				compare.setBackground(MyColor.WHITE.getColor());
				data.setBackground(MyColor.WHITE.getColor());
				
				change.setBackground(MyColor.LIGHTBLUE.getColor());
				remove(getComponentAt(0,290));
				add(jsp);
				repaint();
			}
		});
		compare.addMouseListener(new MouseAdapter(){
			public void mouseClicked(MouseEvent e){
				match.setBackground(MyColor.WHITE.getColor());
				change.setBackground(MyColor.WHITE.getColor());
				compare.setBackground(MyColor.WHITE.getColor());
				data.setBackground(MyColor.WHITE.getColor());
				
				compare.setBackground(MyColor.LIGHTBLUE.getColor());
				remove(getComponentAt(0,290));
				add(jsp);
				repaint();
			}
		});
		data.addMouseListener(new MouseAdapter(){
			public void mouseClicked(MouseEvent e){
				match.setBackground(MyColor.WHITE.getColor());
				change.setBackground(MyColor.WHITE.getColor());
				compare.setBackground(MyColor.WHITE.getColor());
				data.setBackground(MyColor.WHITE.getColor());
				
				data.setBackground(MyColor.LIGHTBLUE.getColor());
				remove(getComponentAt(0,290));
				add(jsp);
				repaint();
			}
		});
		
	}
}
