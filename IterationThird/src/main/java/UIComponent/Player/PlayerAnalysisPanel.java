package UIComponent.Player;

import java.awt.Font;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;

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
	private String[] rowKeys={"赛季","球队","个人"};
	private String[] columnKeys={"","",""};
	private String[] optionName=new String[]{"姓名","位置","时间","投篮命中数","三分命中数","三分出手数","罚球命中数","罚球出手数","进攻篮板数"
			,"防守篮板数","总篮板数","助攻数","抢断数","盖帽数","失误数","犯规数","得分"}; 
JLabel jls[]=new JLabel[15];
	
	public PlayerAnalysisPanel(String id){
		this.playerid=id;
		initComponent();
		initPanel();
		setListener();
	}

	public void initComponent(){
		
		chartcompare=new ChartPanel();
		
		for(int i=0;i<jls.length;i++){
			jls[i]=new JLabel(optionName[i]);
		}
	
		seasonbox=new MyComboBox(new String[]{"2014-2015","2013-2014","2012-2013"});
		isafterbox=new MyComboBox(new String[]{"常规赛","季前赛","季后赛"});

		confirm=new JLabel("筛选");
		confirm.setForeground(MyColor.BLUE.getColor());
		confirm.setFont(new Font("黑体",Font.PLAIN,14));
		confirm.setBounds(arg0, arg1, 60, 40);
		
		optionpanel=new JPanel();
		optionpanel.setBackground(MyColor.WHITE.getColor());
		optionpanel.setBounds(0,30 , 900, 40);
		optionpanel.setLayout(null);

		for(int )
		
		seasonpanel=new JPanel();
		seasonpanel.setBackground(MyColor.WHITE.getColor());
		seasonpanel.setBounds(0,30 , 900, 40);
		seasonpanel.setLayout(null);
		seasonpanel.add(seasonbox);
		seasonpanel.add(isafterbox);
		seasonpanel.add(confirm);
		
		
		
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
		jsp.setBounds(0,30,900,550);
		
		
		match=new JLabel("比赛信息");
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
	}
	public void initPanel(){
		this.add(match);
		this.add(change);
		this.add(compare);
		this.add(data);
		this.setBackground(MyColor.WHITE.getColor());
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
				add(winnerjsp);
				repaint();
			}
		});
		change.addMouseListener(new MouseAdapter(){
			public void mouseClicked(MouseEvent e){
				winner.setBackground(MyColor.WHITE.getColor());
				loser.setBackground(MyColor.WHITE.getColor());
//				king.setBackground(MyColor.WHITE.getColor());
				
				winner.setBackground(MyColor.LIGHTBLUE.getColor());
				remove(getComponentAt(0,290));
				add(winnerjsp);
				repaint();
			}
		});
		compare.addMouseListener(new MouseAdapter(){
			public void mouseClicked(MouseEvent e){
				winner.setBackground(MyColor.WHITE.getColor());
				loser.setBackground(MyColor.WHITE.getColor());
//				king.setBackground(MyColor.WHITE.getColor());
				
				winner.setBackground(MyColor.LIGHTBLUE.getColor());
				remove(getComponentAt(0,290));
				add(winnerjsp);
				repaint();
			}
		});
		data.addMouseListener(new MouseAdapter(){
			public void mouseClicked(MouseEvent e){
				winner.setBackground(MyColor.WHITE.getColor());
				loser.setBackground(MyColor.WHITE.getColor());
//				king.setBackground(MyColor.WHITE.getColor());
				
				winner.setBackground(MyColor.LIGHTBLUE.getColor());
				remove(getComponentAt(0,290));
				add(winnerjsp);
				repaint();
			}
		});
		
	}
}
