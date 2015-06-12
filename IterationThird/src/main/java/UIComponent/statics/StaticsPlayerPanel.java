package UIComponent.statics;

import java.awt.Font;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;

import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.SwingConstants;
import javax.swing.table.DefaultTableModel;
import javax.swing.table.TableColumnModel;

import UIComponent.MyColor;
import UIComponent.MyComboBox;
import UIComponent.MyScrollPane;
import UIComponent.MyTable;

public class StaticsPlayerPanel extends JPanel{

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	JPanel rateOption;
	JLabel[] option=new JLabel[29];
	JLabel choose;
	JLabel season;
	JLabel aver;
	JLabel all;
	JLabel current;
	JLabel after;
	JLabel isOn;
	JLabel isNotOn;
	MyComboBox seasonbox;
	JLabel num,rate;
	DefaultTableModel nummodel;
	MyScrollPane numjsp;
	MyTable numTable;
	MyTable rateTable;
	DefaultTableModel ratemodel;
	MyScrollPane ratejsp;
	JLabel location,league;
	MyComboBox loca,leag;
	
	private boolean average=true;
	private boolean now=true;
	private boolean on=true;
	
	private String[] optionName=new String[]{"得分/篮板/助攻","两双","参赛场数","先发场数","在场时间","投篮命中率"
			,"三分命中率","罚球命中率","助攻数","篮板数","进攻数","防守数","抢断数","盖帽数","失误数","犯规数"
			,"得分","效率","GmSc","真实命中率","投篮效率","篮板率","进攻篮板率","防守篮板率","助攻率","抢断率","盖帽率","失误率","使用率"}; 
	private String[] numTableHeader=new String[]{"名字","所属球队","参赛场数","先发场数","篮板","助攻","在场时间"
			,"进攻数","防守数","抢断数","盖帽数","失误数","犯规数","得分"};
	private String rateTableHeader[]=new String[]{"名字","效率","投篮","GmSc ","真实命中","投篮命中","三分命中","罚球命中"
			,"进攻篮板","防守篮板","篮板","助攻","抢断","盖帽","失误","使用"};
	public StaticsPlayerPanel(){
		initComponent();
		initPanel();
		addComponent();
		setListener();
		
	}
public void initComponent(){
	
	location=new JLabel("位置");
	location.setForeground(MyColor.BLUE.getColor());
	location.setFont(new Font("黑体",Font.PLAIN,14));
	location.setBounds(0, 0, 60, 40);
	location.setHorizontalAlignment(SwingConstants.CENTER);
	
	league=new JLabel("联盟");
	league.setForeground(MyColor.BLUE.getColor());
	league.setFont(new Font("黑体",Font.PLAIN,14));
	league.setBounds(130, 0, 60, 40);
	league.setHorizontalAlignment(SwingConstants.CENTER);

	loca=new MyComboBox(new String[]{" ","前锋","中锋","后卫"});
	loca.setBounds(60, 8, 60, 25);
	
	leag=new MyComboBox(new String[]{" ","大西洋分区","中央分区","东南分区","西北分区","太平洋分区","西南分区"});
	leag.setBounds(190,8,60,25);
	nummodel=new DefaultTableModel(null, numTableHeader){
		/**
		 * 
		 */
		private static final long serialVersionUID = 1L;

		public boolean isCellEditable(int row,int column){
			return false;
		}
	};
	numTable=new MyTable(nummodel,0,1);
	numjsp=new MyScrollPane(numTable);
	for(int i=0;i<30;i++){
		nummodel.addRow(new String[]{"1","1","1","1","1","1","1","1","1","1","1","1","1","1","1","1"});
	}
	numjsp.setBounds(0, 175, 900, 445);
	 TableColumnModel tcm1 = numTable.getColumnModel();
     tcm1.getColumn(0).setPreferredWidth(120);
	ratemodel=new DefaultTableModel(null,rateTableHeader){
		/**
		 * 
		 */
		private static final long serialVersionUID = 1L;

		public boolean isCellEditable(int row,int column){
			return false;
		}
	};
	rateTable=new MyTable(ratemodel,0,-1);
	ratejsp=new MyScrollPane(rateTable);
	ratejsp.setBounds(0, 175, 900, 445);
	 TableColumnModel tcm2 = rateTable.getColumnModel();
     tcm2.getColumn(0).setPreferredWidth(120);
     tcm2.getColumn(1).setPreferredWidth(40);
     tcm2.getColumn(2).setPreferredWidth(40);
  for(int i=3;i<10;i++){
	     tcm2.getColumn(i).setPreferredWidth(50);
  }
  for(int i=10;i<16;i++){
	     tcm2.getColumn(i).setPreferredWidth(40);
  }
	for(int i=0;i<30;i++){
		ratemodel.addRow(new String[]{"1","1","1","1","1","1","1","1","1","1"});
	}
	
	num=new JLabel("数字");
	num.setForeground(MyColor.BLUE.getColor());
	num.setOpaque(true);
	num.setBackground(MyColor.WHITE.getColor());
	num.setHorizontalAlignment(SwingConstants.CENTER);
	num.setFont(new Font("黑体",Font.PLAIN,14));
	num.setBounds(10, 130, 40, 40);
	
	rate=new JLabel("%");
	rate.setForeground(MyColor.BLUE.getColor());
	rate.setOpaque(true);
	rate.setBackground(MyColor.LIGHTBLUE.getColor());
	rate.setHorizontalAlignment(SwingConstants.CENTER);
	rate.setFont(new Font("黑体",Font.PLAIN,14));
	rate.setBounds(60, 130, 40, 40);

	season=new JLabel("赛季");
	season.setForeground(MyColor.BLUE.getColor());
	season.setFont(new Font("黑体",Font.PLAIN,14));
	season.setBounds(260, 0, 60, 40);
	season.setHorizontalAlignment(SwingConstants.CENTER);
	
	String year[]=new String[3];
	for(int i=0;i<year.length;i++){
		year[i]=i+2012+"-"+(i+2013);
	}
	seasonbox=new MyComboBox(year);
	seasonbox.setBounds(330, 8, 100, 25);
	
	aver=new JLabel("平均");
	aver.setForeground(MyColor.BLUE.getColor());
	aver.setFont(new Font("黑体",Font.PLAIN,14));
	aver.setOpaque(true);
	aver.setBackground(MyColor.LIGHTBLUE.getColor());
	aver.setHorizontalAlignment(SwingConstants.CENTER);
	aver.setBounds(460, 5, 60, 30);
	
	all=new JLabel("总赛季");
	all.setForeground(MyColor.BLUE.getColor());
	all.setFont(new Font("黑体",Font.PLAIN,14));
	all.setHorizontalAlignment(SwingConstants.CENTER);
	all.setBounds(525, 5, 60, 30);
	all.setOpaque(true);
	all.setBackground(MyColor.WHITE.getColor());
	
	current=new JLabel("常规赛");
	current.setForeground(MyColor.BLUE.getColor());
	current.setFont(new Font("黑体",Font.PLAIN,14));
	current.setOpaque(true);
	current.setBackground(MyColor.LIGHTBLUE.getColor());
	current.setHorizontalAlignment(SwingConstants.CENTER);
	current.setBounds(625, 5, 60, 30);
	current.setOpaque(true);
	
	after=new JLabel("季后赛");
	after.setForeground(MyColor.BLUE.getColor());
	after.setHorizontalAlignment(SwingConstants.CENTER);
	after.setFont(new Font("黑体",Font.PLAIN,14));
	after.setBounds(690, 5, 60, 30);
	after.setOpaque(true);
	after.setBackground(MyColor.WHITE.getColor());
	
	 isOn=new JLabel("现役");
	 isOn.setForeground(MyColor.BLUE.getColor());
	 isOn.setHorizontalAlignment(SwingConstants.CENTER);
	 isOn.setFont(new Font("黑体",Font.PLAIN,14));
	 isOn.setBounds(775, 5, 60, 30);
	 isOn.setOpaque(true);
	 isOn.setBackground(MyColor.LIGHTBLUE.getColor());
		
	isNotOn=new JLabel("退役");
	isNotOn.setForeground(MyColor.BLUE.getColor());
	isNotOn.setHorizontalAlignment(SwingConstants.CENTER);
	isNotOn.setFont(new Font("黑体",Font.PLAIN,14));
	isNotOn.setBounds(840, 5, 58, 30);
	isNotOn.setOpaque(true);
	isNotOn.setBackground(MyColor.WHITE.getColor());
			
	choose=new JLabel("排序依据");
	choose.setForeground(MyColor.BLUE.getColor());
	choose.setFont(new Font("黑体",Font.PLAIN,14));
	choose.setBounds(0, 0, 60, 40);
	
	option[0]=new JLabel(optionName[0]);
	option[0].setForeground(MyColor.BLACK.getColor());
	option[0].setFont(new Font("微软雅黑",Font.PLAIN,12));
	option[0].setOpaque(true);
	option[0].setBackground(MyColor.WHITE.getColor());
	option[0].setBounds(60, 0, 100, 40);
	option[0].setHorizontalAlignment(SwingConstants.CENTER);
	
	for(int i=1;i<8;i++){
		option[i]=new JLabel(optionName[i]);
		option[i].setForeground(MyColor.BLACK.getColor());
		option[i].setFont(new Font("微软雅黑",Font.PLAIN,12));
		option[i].setOpaque(true);
		option[i].setBackground(MyColor.WHITE.getColor());
		option[i].setBounds(160+(i-1)*70, 0, 70, 40);
		option[i].setHorizontalAlignment(SwingConstants.CENTER);
	}
	for(int i=8;i<14;i++){
		option[i]=new JLabel(optionName[i]);
		option[i].setForeground(MyColor.BLACK.getColor());
		option[i].setFont(new Font("微软雅黑",Font.PLAIN,12));
		option[i].setOpaque(true);
		option[i].setBackground(MyColor.WHITE.getColor());
		option[i].setBounds(650+(i-8)*50, 0, 50, 40);
		option[i].setHorizontalAlignment(SwingConstants.CENTER);	
	}
	
	for(int i=14;i<29;i++){
		option[i]=new JLabel(optionName[i]);
		option[i].setForeground(MyColor.BLACK.getColor());
		option[i].setFont(new Font("微软雅黑",Font.PLAIN,12));
		option[i].setOpaque(true);
		option[i].setBackground(MyColor.WHITE.getColor());
		option[i].setBounds(60+(i-14)*70, 40, 70, 40);
		option[i].setHorizontalAlignment(SwingConstants.CENTER);
	}
	
}
public void initPanel(){

	rateOption=new JPanel();
	rateOption.setBackground(MyColor.WHITE.getColor());
	rateOption.setBounds(0, 40, 900, 80);
	rateOption.setLayout(null);
	
	this.setLayout(null);
	this.setBackground(MyColor.WHITE.getColor());
}

public void addComponent(){
	rateOption.add(choose);
	for(int i=0;i<option.length;i++){
		rateOption.add(option[i]);
	}
	this.add(leag);
	this.add(league);
	this.add(loca);
	this.add(location);
	this.add(ratejsp);
	this.add(rate);
	this.add(num);
	this.add(aver);
	this.add(all);
	this.add(current);
	this.add(after);
	this.add(isOn);
	this.add(isNotOn);
	this.add(season);
	this.add(seasonbox);
	this.add(rateOption);
}
public void setListener(){
	isOn.addMouseListener(new MouseAdapter(){
		 public void mouseClicked(MouseEvent e){
			 isOn.setBackground(MyColor.LIGHTBLUE.getColor());
			 isNotOn.setBackground(MyColor.WHITE.getColor());
			 on=true;
			}
	});
	isNotOn.addMouseListener(new MouseAdapter(){
		 public void mouseClicked(MouseEvent e){
			 isNotOn.setBackground(MyColor.LIGHTBLUE.getColor());
			 isOn.setBackground(MyColor.WHITE.getColor());
			 on=false;
			}
	});
	seasonbox.addActionListener(new ActionListener(){
		public void actionPerformed(ActionEvent e){
			
		}
	});
	num.addMouseListener(new MouseAdapter(){
        public void mouseClicked(MouseEvent e){
        	num.setBackground(MyColor.LIGHTBLUE.getColor());
        	rate.setBackground(MyColor.WHITE.getColor());
        	if(getComponentAt(180,300).equals(numjsp)){
        		
        	}else{
            	remove(getComponentAt(180,300));
            	add(numjsp);
            	repaint();
        	}
		}
	});
	rate.addMouseListener(new MouseAdapter(){
        public void mouseClicked(MouseEvent e){
        	rate.setBackground(MyColor.LIGHTBLUE.getColor());
        	num.setBackground(MyColor.WHITE.getColor());
            if(getComponentAt(180,300).equals(ratejsp)){
        		
        	}else{
            	remove(getComponentAt(180,300));
            	add(ratejsp);
            	repaint();
        	}
		}
	});
	aver.addMouseListener(new MouseAdapter(){
        public void mouseClicked(MouseEvent e){
        	aver.setBackground(MyColor.LIGHTBLUE.getColor());
        	all.setBackground(MyColor.WHITE.getColor());
        	average=true;
		}
	});
	all.addMouseListener(new MouseAdapter(){
		  public void mouseClicked(MouseEvent e){
			   aver.setBackground(MyColor.WHITE.getColor());
	        	all.setBackground(MyColor.LIGHTBLUE.getColor());
	        	average=false;
	        	
			}
	});
	current.addMouseListener(new MouseAdapter(){
		  public void mouseClicked(MouseEvent e){
			  current.setBackground(MyColor.LIGHTBLUE.getColor());
			  after.setBackground(MyColor.WHITE.getColor());
			  now=true;
			}
	});
	after.addMouseListener(new MouseAdapter(){
		  public void mouseClicked(MouseEvent e){
			  current.setBackground(MyColor.WHITE.getColor());
			  after.setBackground(MyColor.LIGHTBLUE.getColor());
			  now=false;
			}
	});
	for(int i=0;i<option.length;i++){
		option[i].addMouseListener(new MouseAdapter(){
			
			public void mouseClicked(MouseEvent e){
				   JLabel tmp=(JLabel)e.getSource();
				   for(int i=0;i<optionName.length;i++){
					   option[i].setBackground(MyColor.WHITE.getColor());
				   }
			       tmp.setBackground(MyColor.LIGHTBLUE.getColor());
			}
		});
	}
}
}