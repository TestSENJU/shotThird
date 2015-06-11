package UIComponent.Search;

import java.awt.Font;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;

import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JTextField;
import javax.swing.table.DefaultTableModel;

import UIComponent.MyColor;
import UIComponent.MyComboBox;
import UIComponent.MyScrollPane;
import UIComponent.MyTable;

public class SearchMatchPanel extends JPanel{

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;

	JLabel season,team,player,month,day,isAfter,noAfter,search;
	MyComboBox teamBox,seasonBox,monthBox,dayBox1,dayBox2,dayBox3;
	JTextField playerInput;
	MyTable playerTable;
	DefaultTableModel model;
	MyScrollPane jsp;
	public SearchMatchPanel(){
		initComponent();
		initPanel();
		addComponent();
		setListener();
	}
	private void initComponent() {
		model=new DefaultTableModel(null,new String[]{"赛季","时间","胜方球队","负方球队","是否常规赛"}){
			/**
			 * 
			 */
			private static final long serialVersionUID = 1L;

			public boolean isCellEditable(int row,int column){
				return false;
			}
		};
		playerTable=new MyTable(model,2,3) {  

			private static final long serialVersionUID = 1L;

			@SuppressWarnings({ "unchecked", "rawtypes" })
			public Class getColumnClass(int column) {
				
				return getValueAt(0, column).getClass();  
				} 
			};
			playerTable.setRowHeight(60);
		jsp=new MyScrollPane(playerTable);
		jsp.setBounds(20,90,860,490);
		
		
		season=new JLabel("赛季");
		season.setForeground(MyColor.BLUE.getColor());
		season.setFont(new Font("黑体",Font.PLAIN,14));
		season.setBounds(10, 0, 60, 40);
		
		seasonBox=new MyComboBox(new String[]{" ","12-13","13-14","14-15"});
		seasonBox.setBounds(70, 5, 60, 25);
		
		month=new JLabel("月");
		month.setForeground(MyColor.BLUE.getColor());
		month.setFont(new Font("黑体",Font.PLAIN,14));
		month.setBounds(170, 0, 30, 40);
		
		monthBox=new MyComboBox(new String[]{" ","1","2","3","4","5","6","7","8","9","10","11","12"});
		monthBox.setBounds(200, 5, 40, 25);
		
		day=new JLabel("日");
		day.setForeground(MyColor.BLUE.getColor());
		day.setFont(new Font("黑体",Font.PLAIN,14));
		day.setBounds(280, 0, 30, 40);
		
		String[] day1=new String[32];
		day1[0]=" ";
		for(int i=1;i<day1.length;i++){
			day1[i]=i+"";
		}
		dayBox1=new MyComboBox(day1);
		dayBox1.setBounds(310, 5, 40, 25);
		
		String[] day2=new String[31];
		day2[0]=" ";
		for(int i=1;i<day2.length;i++){
			day2[i]=i+"";
		}
		dayBox2=new MyComboBox(day2);
		dayBox2.setBounds(310, 5, 40, 25);
		
		String[] day3=new String[29];
		day3[0]=" ";
		for(int i=1;i<day3.length;i++){
			day3[i]=i+"";
		}
		dayBox3=new MyComboBox(day3);
		dayBox3.setBounds(310, 5, 40, 25);
		
		isAfter=new JLabel("季后赛");
		isAfter.setForeground(MyColor.BLUE.getColor());
		isAfter.setOpaque(true);
		isAfter.setBackground(MyColor.WHITE.getColor());
		isAfter.setFont(new Font("黑体",Font.PLAIN,14));
		isAfter.setBounds(390,8, 50, 25);
		
		noAfter=new JLabel("常规赛");
		noAfter.setForeground(MyColor.BLUE.getColor());
		noAfter.setOpaque(true);
		noAfter.setBackground(MyColor.LIGHTBLUE.getColor());
		noAfter.setFont(new Font("黑体",Font.PLAIN,14));
		noAfter.setBounds(440, 8, 50, 25);
		
	    team=new JLabel("球队");
		team.setForeground(MyColor.BLUE.getColor());
		team.setFont(new Font("黑体",Font.PLAIN,14));
		team.setBounds(10, 40, 60, 40);
		
		teamBox=new MyComboBox(new String[]{" ","圣安东尼奥马刺队","孟菲斯灰熊队","达拉斯小牛队","休斯敦火箭队","新奥尔良鹈鹕队"
				,"明尼苏达森林狼队","丹佛掘金队","犹他爵士队","波特兰开拓者队","俄克拉荷马雷霆队"
				,"萨克拉门托国王队","菲尼克斯太阳队","洛杉矶湖人队","洛杉矶快船队 ","金州勇士队"
				,"迈阿密热火队","奥兰多魔术队","亚特兰大老鹰队","华盛顿奇才队","夏洛特黄蜂队"
				,"底特律活塞队","印第安纳步行者队","克里夫兰骑士队","芝加哥公牛队","密尔沃基雄鹿队"
				,"波士顿凯尔特人队","费城76人队","纽约尼克斯队","布鲁克林篮网队","多伦多猛龙队"});
		teamBox.setBounds(70, 45, 120, 25);	
		
		player=new JLabel("参赛球员");
		player.setForeground(MyColor.BLUE.getColor());
		player.setFont(new Font("黑体",Font.PLAIN,14));
		player.setBounds(230, 40, 60, 40);
		
		playerInput=new JTextField(5);
		
		playerInput.setBounds(300,45,60,25);
		
		search=new JLabel("搜索");
		search.setForeground(MyColor.BLUE.getColor());
		search.setFont(new Font("黑体",Font.PLAIN,14));
		search.setBounds(450, 40, 60, 40);
		
	
	}
   
	private void initPanel() {
		
		this.setLayout(null);
		this.setBackground(MyColor.WHITE.getColor());

	}
	 private void addComponent() {
		 Object[] ob=new Object[5];
			for(int i=0;i<20;i++){
				ob=new Object[5];
				ob[0]="afvbghj";
				ob[1]="<HTML><U>Lebron James<U><HTML>";
				ob[2]="<HTML><U>NOP<U><HTML>";
				ob[3]="A";
				ob[4]="a";
				model.addRow(ob);
			}
			
		 this.add(season);
		 this.add(seasonBox);
		 this.add(day);
		 this.add(dayBox1);
		 this.add(isAfter);
		 this.add(month);
		 this.add(monthBox);
		 this.add(noAfter);
		 this.add(player);
		 this.add(playerInput);
		 this.add(search);
		 this.add(season);
		 this.add(seasonBox);
		 this.add(team);
		 this.add(teamBox);
		 this.add(jsp);
		}
       private void setListener() {
    	playerTable.addMouseListener(new MouseAdapter(){
    		public void mouseClicked(MouseEvent e){
    			
    		}
    		public void mouseEntered(MouseEvent e){
    			
    		}
    	});
    	isAfter.addMouseListener(new MouseAdapter(){
    		public void mouseClicked(MouseEvent e){
    			noAfter.setBackground(MyColor.WHITE.getColor());
    			isAfter.setBackground(MyColor.LIGHTBLUE.getColor());
    		}
    	});
    	noAfter.addMouseListener(new MouseAdapter(){
    		public void mouseClicked(MouseEvent e){
    			isAfter.setBackground(MyColor.WHITE.getColor());
    			noAfter.setBackground(MyColor.LIGHTBLUE.getColor());
    		}
    	});
    	search.addMouseListener(new MouseAdapter(){
    		public void mouseClicked(MouseEvent e){
    			
    		}
    		public void mouseExited(MouseEvent e){
    			search.setForeground(MyColor.BLACK.getColor());
    		}
    		public void mouseEntered(MouseEvent e){
    			search.setForeground(MyColor.BLUE.getColor());
    		}
    	});
    	monthBox.addActionListener(new ActionListener(){
			public void actionPerformed(ActionEvent arg0) {
				// TODO Auto-generated method stub
				String month=(String) monthBox.getSelectedItem();
				if((month.equals("1"))||(month.equals("3"))||(month.equals("5"))||(month.equals("7"))||
						(month.equals("8"))||(month.equals("10"))||(month.equals("12"))){
					remove(getComponentAt(310,5));
					add(dayBox1);
				}else if((month.equals("4"))||(month.equals("6"))||(month.equals("9"))||(month.equals("11"))){
					remove(getComponentAt(310,5));
					add(dayBox2);
				}else{
					remove(getComponentAt(310,5));
					add(dayBox3);
				}
			}});
    }
}
