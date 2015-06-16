package UIComponent.Team;

import java.awt.Font;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;
import java.util.ArrayList;

import javax.swing.ImageIcon;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.SwingConstants;
import javax.swing.border.LineBorder;
import javax.swing.border.MatteBorder;
import javax.swing.table.TableColumnModel;

import logic.TeamBL;
import logic.TeamBL_Impl;
import UIComponent.JumpFrame;
import UIComponent.MyColor;
import UIComponent.MyScrollPane;
import UIComponent.MyTable;
import UIComponent.TeamNameSwitcher;
import UIComponent.Player.PlayerDetailPanel;
import VO.PlayerShortVO;
import VO.TeamInfoVO;

public class TeamDetailPanel extends JPanel{
/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	private TeamBL bl=TeamBL_Impl.getInstance();
	
private String team;
JLabel teamIcon;
JLabel name;
JLabel shortName,chineseName,league,gym,date;
JLabel player,avernumber,rate,allnumber;
MyScrollPane playerjsp;
MyTable playertable;
TeamNumberAllPanel numberall;
TeamNumberAveragePanel numberaver;
TeamRatePanel ratepanel;
private 	ArrayList<PlayerShortVO> playerlist;
public TeamDetailPanel(String teamName){
	this.team=teamName;
	initComponent();
	initPanel();

	addComponent();
	setListener();
}
public String[][] getTeamPlayers(String teamname){
    playerlist=bl.getTeamPlayers(this.team);
	String[][] data=new String[3][playerlist.size()];
	for(int i=0;i<playerlist.size();i++){
		data[0][i]="playerHead/"+playerlist.get(i).getPlayername()+".png";
		data[1][i]=playerlist.get(i).getPlayername();
		data[2][i]=playerlist.get(i).getLocation();
	}
	return data;
}
public void initComponent(){
	numberall=new TeamNumberAllPanel(this.team);
	numberall.setBounds(0,190,500,390);
	numberaver=new TeamNumberAveragePanel(this.team);
	numberaver.setBounds(0,190,500,390);
	ratepanel=new TeamRatePanel(this.team);
	ratepanel.setBounds(0,190,500,390);
	
	String[][] data=getTeamPlayers(this.team);
	playertable=new MyTable(data,new String[]{"头像","姓名","位置"},-1,1){  

		private static final long serialVersionUID = 1L;

		@SuppressWarnings({ "unchecked", "rawtypes" })
		public Class getColumnClass(int column) {
			
			return getValueAt(0, column).getClass();  
			} 
		public boolean isCellEditable(int row,int column){
			return false;
		}
		};
	
	      TableColumnModel tcm = playertable.getColumnModel();
	        tcm.getColumn(0).setPreferredWidth(100);
	        tcm.getColumn(1).setPreferredWidth(150);
	        tcm.getColumn(2).setPreferredWidth(75);
	        playertable.setRowHeight(50);
	playerjsp=new MyScrollPane(playertable);
	playerjsp.setBounds(0,190,500,390);
	
	player=new JLabel("球员");
	player.setForeground(MyColor.BLUE.getColor());
	player.setOpaque(true);
	player.setBackground(MyColor.WHITE.getColor());
	player.setHorizontalAlignment(SwingConstants.CENTER);
	player.setFont(new Font("黑体",Font.PLAIN,16));
	player.setBounds(145,160,40,30);
	
	allnumber=new JLabel("赛季");
	allnumber.setForeground(MyColor.BLUE.getColor());
	allnumber.setOpaque(true);
	allnumber.setBackground(MyColor.WHITE.getColor());
	allnumber.setHorizontalAlignment(SwingConstants.CENTER);
	allnumber.setFont(new Font("黑体",Font.PLAIN,16));
	allnumber.setBounds(55,160,40,30);
	
	rate=new JLabel("%");
	rate.setForeground(MyColor.BLUE.getColor());
	rate.setOpaque(true);
	rate.setBackground(MyColor.WHITE.getColor());
	rate.setHorizontalAlignment(SwingConstants.CENTER);
	rate.setFont(new Font("黑体",Font.PLAIN,16));
	rate.setBounds(100,160,40,30);
	
	avernumber=new JLabel("场均");
	avernumber.setForeground(MyColor.BLUE.getColor());
	avernumber.setOpaque(true);
	avernumber.setBackground(MyColor.LIGHTBLUE.getColor());
	avernumber.setHorizontalAlignment(SwingConstants.CENTER);
	avernumber.setFont(new Font("黑体",Font.PLAIN,16));
	avernumber.setBounds(10,160,40,30);
	
	teamIcon=new JLabel(new ImageIcon("team/"+this.team+".png"));
	teamIcon.setBounds(20, 30, 100, 100);
	teamIcon.setBorder(new LineBorder(MyColor.GREY.getColor()));
	
	TeamInfoVO info=bl.getTeamInfo(this.team);
	
	name=new JLabel("名字: "+info.getName());
	name.setForeground(MyColor.BLACK.getColor());
	name.setFont(new Font("微软雅黑",Font.PLAIN,14));
	name.setBounds(140, 30, 200, 20);
	
	shortName=new JLabel("缩写名: "+this.team);
	shortName.setForeground(MyColor.BLACK.getColor());
	shortName.setFont(new Font("微软雅黑",Font.PLAIN,14));
	shortName.setBounds(360, 30, 100, 20);
	
	chineseName=new JLabel("中文名: "+new TeamNameSwitcher().getTeamName(this.team));
	chineseName.setForeground(MyColor.BLACK.getColor());
	chineseName.setFont(new Font("微软雅黑",Font.PLAIN,14));
	chineseName.setBounds(140, 60, 200, 20);
	
	league=new JLabel("联盟: "+info.getLeague());
	league.setForeground(MyColor.BLACK.getColor());
	league.setFont(new Font("微软雅黑",Font.PLAIN,14));
	league.setBounds(360, 60, 100, 20);
	
	gym=new JLabel("主场: "+info.getGym());
	gym.setForeground(MyColor.BLACK.getColor());
	gym.setFont(new Font("微软雅黑",Font.PLAIN,14));
	gym.setBounds(140, 90, 200, 20);
	
	date=new JLabel("创建年份: "+info.getYear());
	date.setForeground(MyColor.BLACK.getColor());
	date.setFont(new Font("微软雅黑",Font.PLAIN,14));
	date.setBounds(360, 90, 100, 20);
	
}
public void initPanel(){
	this.setBackground(MyColor.WHITE.getColor());
	this.setBorder(new MatteBorder(0,0,1,1,MyColor.GREY.getColor()));
	this.setLayout(null);
}
public void addComponent(){
	this.add(numberaver);
	this.add(allnumber);
	this.add(avernumber);
	this.add(rate);
	this.add(player);
	this.add(name);
	this.add(teamIcon);
	this.add(shortName);
	this.add(chineseName);
	this.add(league);
	this.add(gym);
	this.add(date);
}
public void setListener(){
	allnumber.addMouseListener(new MouseAdapter(){
		public void mouseClicked(MouseEvent e){
			allnumber.setBackground(MyColor.WHITE.getColor());
			avernumber.setBackground(MyColor.WHITE.getColor());
			rate.setBackground(MyColor.WHITE.getColor());
			player.setBackground(MyColor.WHITE.getColor());
			
			allnumber.setBackground(MyColor.LIGHTBLUE.getColor());
			remove(getComponentAt(0,290));
			add(numberall);
			repaint();
		}
	});
	avernumber.addMouseListener(new MouseAdapter(){
		public void mouseClicked(MouseEvent e){
			allnumber.setBackground(MyColor.WHITE.getColor());
			avernumber.setBackground(MyColor.WHITE.getColor());
			rate.setBackground(MyColor.WHITE.getColor());
			player.setBackground(MyColor.WHITE.getColor());
			
			avernumber.setBackground(MyColor.LIGHTBLUE.getColor());
			remove(getComponentAt(0,290));
			add(numberaver);
			repaint();
		}
	});
	rate.addMouseListener(new MouseAdapter(){
		public void mouseClicked(MouseEvent e){
			allnumber.setBackground(MyColor.WHITE.getColor());
			avernumber.setBackground(MyColor.WHITE.getColor());
			rate.setBackground(MyColor.WHITE.getColor());
			player.setBackground(MyColor.WHITE.getColor());
			
			rate.setBackground(MyColor.LIGHTBLUE.getColor());
			remove(getComponentAt(0,290));
			add(ratepanel);
			repaint();
		}
	});
	player.addMouseListener(new MouseAdapter(){
		public void mouseClicked(MouseEvent e){
			allnumber.setBackground(MyColor.WHITE.getColor());
			avernumber.setBackground(MyColor.WHITE.getColor());
			rate.setBackground(MyColor.WHITE.getColor());
			player.setBackground(MyColor.WHITE.getColor());
			
			player.setBackground(MyColor.LIGHTBLUE.getColor());
			remove(getComponentAt(0,290));
			add(playerjsp);
			repaint();
		}
	});
	playertable.addMouseListener(new MouseAdapter(){
		public void mouseClicked(MouseEvent e){
			int row=playertable.getSelectedRowCount();
			int column=playertable.getSelectedColumnCount();
			if(row==1){
				PlayerDetailPanel panel=new PlayerDetailPanel(playerlist.get(column));
				JumpFrame frame=new JumpFrame(panel);
				frame.open();
				
			}
		}
	});
}
public String getTeam(){
	return this.team;
}
}
