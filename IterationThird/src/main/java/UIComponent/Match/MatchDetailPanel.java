package UIComponent.Match;

import java.awt.Font;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;
import java.util.ArrayList;

import javax.swing.ImageIcon;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.SwingConstants;
import javax.swing.border.MatteBorder;

import logic.MatchBL;
import logic.MatchBL_Impl;
import UIComponent.JumpFrame;
import UIComponent.MyColor;
import UIComponent.MyScrollPane;
import UIComponent.MyTable;
import UIComponent.Team.TeamDetailPanel;
import VO.MatchVO;
import VO.PlayerMatchVO;

public class MatchDetailPanel extends JPanel{
/**
	 * 
	 */
	private static final long serialVersionUID = 1L;

private String id;
JLabel winnerIcon,loserIcon;
JLabel winnerName,loserName;
MyTable scoreTable;
MyTable playerTable;
JLabel winner,loser,king;
MyScrollPane winnerjsp;
MyScrollPane loserjsp;
MyTable winnertable;
MyTable losertable;
MatchKingPanel kingpanel;
private MatchVO match;
private MatchBL bl=MatchBL_Impl.getInstance();

public MatchDetailPanel(String matchid){
	this.id=matchid;
	this.match=bl.getMatchByID(this.id);

	initComponent();
	initPanel();
	addComponent();
	setListener();
}
public String[][] getStringArrays(ArrayList<PlayerMatchVO>list){
	String[][] data=new String[18][list.size()];

	for(int i=0;i<list.size();i++){
		data[0][i]=list.get(i).getPlayername();
		data[1][i]=list.get(i).getLocation();
		data[2][i]=list.get(i).getPlayingtime();
		for(int j=3;j<18;j++){
			data[j][i]=list.get(i).getData()[j-3]+"";
		}
	}
	return data;
}
public void initComponent(){
	
	kingpanel=new MatchKingPanel(this.id);
	kingpanel.setBounds(0,290,500,290);
	
	winnertable=new MyTable(getStringArrays(this.match.getWinnerlist()),new String[]{"姓名","位置","时间","投篮命中数","三分命中数","三分出手数","罚球命中数","罚球出手数","进攻篮板数"
		,"防守篮板数","总篮板数","助攻数","抢断数","盖帽数","失误数","犯规数","得分"},-1,0);
	winnerjsp=new MyScrollPane(winnertable);
	winnerjsp.setBounds(0,290,500,290);
	
	losertable=new MyTable(getStringArrays(this.match.getLoserlist()),new String[]{"姓名","位置","时间","投篮命中数","三分命中数","三分出手数","罚球命中数","罚球出手数","进攻篮板数"
		,"防守篮板数","总篮板数","助攻数","抢断数","盖帽数","失误数","犯规数","得分"},-1,0);
	loserjsp=new MyScrollPane(losertable);
	loserjsp.setBounds(0,290,500,290);
		
	winner=new JLabel("胜方");
	winner.setForeground(MyColor.BLUE.getColor());
	winner.setOpaque(true);
	winner.setBackground(MyColor.LIGHTBLUE.getColor());
	winner.setHorizontalAlignment(SwingConstants.CENTER);
	winner.setFont(new Font("黑体",Font.PLAIN,16));
	winner.setBounds(10,240,50,30);
	
	loser=new JLabel("负方");
	loser.setForeground(MyColor.BLUE.getColor());
	loser.setOpaque(true);
	loser.setBackground(MyColor.WHITE.getColor());
	loser.setHorizontalAlignment(SwingConstants.CENTER);
	loser.setFont(new Font("黑体",Font.PLAIN,16));
	loser.setBounds(65,240,50,30);
	
	king=new JLabel("数据王");
	king.setForeground(MyColor.BLUE.getColor());
	king.setOpaque(true);
	king.setBackground(MyColor.WHITE.getColor());
	king.setHorizontalAlignment(SwingConstants.CENTER);
	king.setFont(new Font("黑体",Font.PLAIN,16));
	king.setBounds(120,240,50,30);
	
	winnerIcon=new JLabel(new ImageIcon("team/ATL.png"));
	winnerIcon.setBounds(80,20,100,100);
	loserIcon=new JLabel(new ImageIcon("team/HOU.png"));
	loserIcon.setBounds(320, 20,100,100);
	
	winnerName=new JLabel("<HTML><U>" +"胜方: ATL"+"<HTML><U>");
	winnerName.setForeground(MyColor.RED.getColor());
	winnerName.setFont(new Font("黑体",Font.PLAIN,16));
	winnerName.setBounds(80,130,100,30);
	winnerName.setHorizontalAlignment(SwingConstants.CENTER);
	
	loserName=new JLabel("<HTML><U>"+" 负方: HOU"+"<HTML><U>");
	loserName.setForeground(MyColor.BLACK.getColor());
	loserName.setFont(new Font("黑体",Font.PLAIN,16));
	loserName.setBounds(320,130,100,30);
	loserName.setHorizontalAlignment(SwingConstants.CENTER);
	
	scoreTable=new MyTable(new String[][]{{"85-112","27-25","29-31","13-25","16-31"}},new String[]{"总比分","第一节","第二节","第三节","第四节"},-1,-1){
		/**
		 * 
		 */
		private static final long serialVersionUID = 1L;

		public boolean isCellEditable(int row,int column){
			return false;
		}
	};
	scoreTable.getTableHeader().setBounds(70, 180, 375, 20);
	scoreTable.setBounds(70, 200, 400, 50);
	
	playerTable=new MyTable(new String[][]{},new String[]{"","",""},0,0);
}
public void initPanel(){
	this.setBackground(MyColor.WHITE.getColor());
	this.setLayout(null);
	this.setBorder(new MatteBorder(0,0,1,1,MyColor.GREY.getColor()));
}
public void addComponent(){
	this.add(winner);
	this.add(loser);
	this.add(king);
	this.add(winnerIcon);
	this.add(loserIcon);
	this.add(winnerName);
	this.add(loserName);
	this.add(scoreTable.getTableHeader());
	this.add(scoreTable);
}
public void setListener(){

	winner.addMouseListener(new MouseAdapter(){
		public void mouseClicked(MouseEvent e){
			winner.setBackground(MyColor.WHITE.getColor());
			loser.setBackground(MyColor.WHITE.getColor());
			king.setBackground(MyColor.WHITE.getColor());
			
			winner.setBackground(MyColor.LIGHTBLUE.getColor());
			remove(getComponentAt(0,290));
			add(winnerjsp);
			repaint();
		}
	});
	
	loser.addMouseListener(new MouseAdapter(){
		public void mouseClicked(MouseEvent e){
			winner.setBackground(MyColor.WHITE.getColor());
			loser.setBackground(MyColor.WHITE.getColor());
			king.setBackground(MyColor.WHITE.getColor());
			
			loser.setBackground(MyColor.LIGHTBLUE.getColor());
			remove(getComponentAt(0,290));
			add(loserjsp);
			repaint();
		}
	});
	king.addMouseListener(new MouseAdapter(){
		public void mouseClicked(MouseEvent e){
			winner.setBackground(MyColor.WHITE.getColor());
			loser.setBackground(MyColor.WHITE.getColor());
			king.setBackground(MyColor.WHITE.getColor());
			
			king.setBackground(MyColor.LIGHTBLUE.getColor());
			remove(getComponentAt(0,290));
			add(kingpanel);
			repaint();
		}
	});
	winnerName.addMouseListener(new MouseAdapter(){
		public void mouseClicked(MouseEvent e){
			TeamDetailPanel jp=new TeamDetailPanel(match.getWinner());
			JumpFrame frame=new JumpFrame(jp);
			frame.open();
		}
		public void mouseEntered(MouseEvent e){
			winnerName.setForeground(MyColor.BLUE.getColor());
		}
		public void mouseExited(MouseEvent e){
			winnerName.setForeground(MyColor.RED.getColor());
		}
	});
	loserName.addMouseListener(new MouseAdapter(){
	public void mouseClicked(MouseEvent e){
			
		}
		public void mouseEntered(MouseEvent e){
			loserName.setForeground(MyColor.BLUE.getColor());
		}
		public void mouseExited(MouseEvent e){
			loserName.setForeground(MyColor.BLACK.getColor());
		}
	});
}
public String getID(){
	return this.id;
}
}
