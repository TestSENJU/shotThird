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
import logic.PlayerBL;
import logic.PlayerBL_Impl;
import UIComponent.JumpFrame;
import UIComponent.MyColor;
import UIComponent.MyScrollPane;
import UIComponent.MyTable;
import UIComponent.TeamNameSwitcher;
import UIComponent.Player.PlayerDetailPanel;
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
JLabel winner,loser;
//JLabel king;
MyScrollPane winnerjsp;
MyScrollPane loserjsp;
MyTable winnertable;
MyTable losertable;
JLabel name1,name2;
private MatchVO match;
private MatchBL bl=MatchBL_Impl.getInstance();
private PlayerBL playerbl=PlayerBL_Impl.getInstance();

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
	
	winnertable=new MyTable(getStringArrays(this.match.getWinnerlist()),new String[]{"姓名","位置","时间","投篮命中数","三分命中数","三分出手数","罚球命中数","罚球出手数","进攻篮板数"
		,"防守篮板数","总篮板数","助攻数","抢断数","盖帽数","失误数","犯规数","得分"},-1,0);
	winnerjsp=new MyScrollPane(winnertable);
	winnerjsp.setBounds(0,290,500,290);
	
	losertable=new MyTable(getStringArrays(this.match.getLoserlist()),new String[]{"姓名","位置","时间","投篮命中数","三分命中数","三分出手数","罚球命中数","罚球出手数","进攻篮板数"
		,"防守篮板数","总篮板数","助攻数","抢断数","盖帽数","失误数","犯规数","得分"},-1,0);
	loserjsp=new MyScrollPane(losertable);
	loserjsp.setBounds(0,290,500,290);
		
	winner=new JLabel("胜方队员");
	winner.setForeground(MyColor.BLUE.getColor());
	winner.setOpaque(true);
	winner.setBackground(MyColor.LIGHTBLUE.getColor());
	winner.setHorizontalAlignment(SwingConstants.CENTER);
	winner.setFont(new Font("黑体",Font.PLAIN,16));
	winner.setBounds(10,240,50,30);
	
	loser=new JLabel("负方队员");
	loser.setForeground(MyColor.BLUE.getColor());
	loser.setOpaque(true);
	loser.setBackground(MyColor.WHITE.getColor());
	loser.setHorizontalAlignment(SwingConstants.CENTER);
	loser.setFont(new Font("黑体",Font.PLAIN,16));
	loser.setBounds(65,240,50,30);
	
	winnerIcon=new JLabel(new ImageIcon("team/"+this.match.getWinner()+".png"));
	winnerIcon.setBounds(80,20,100,100);
	loserIcon=new JLabel(new ImageIcon("team/"+this.match.getLoser()+".png"));
	loserIcon.setBounds(320, 20,100,100);
	
	winnerName=new JLabel("胜方: ");
	winnerName.setForeground(MyColor.RED.getColor());
	winnerName.setFont(new Font("黑体",Font.PLAIN,16));
	winnerName.setBounds(40,130,40,30);
	winnerName.setHorizontalAlignment(SwingConstants.CENTER);
	
	loserName=new JLabel(" 负方: ");
	loserName.setForeground(MyColor.BLACK.getColor());
	loserName.setFont(new Font("黑体",Font.PLAIN,16));
	loserName.setBounds(280,130,40,30);
	loserName.setHorizontalAlignment(SwingConstants.CENTER);
	
	TeamNameSwitcher switcher=new TeamNameSwitcher();
	name1=new JLabel("<HTML><U>" +switcher.getTeamName(this.match.getWinner())+"<HTML><U>");
	name1.setForeground(MyColor.BLACK.getColor());
	name1.setFont(new Font("黑体",Font.PLAIN,16));
	name1.setBounds(80,130,120,30);
	name1.setHorizontalAlignment(SwingConstants.CENTER);
	
	name2=new JLabel("<HTML><U>"+switcher.getTeamName(this.match.getLoser())+"<HTML><U>");
	name2.setForeground(MyColor.BLACK.getColor());
	name2.setFont(new Font("黑体",Font.PLAIN,16));
	name2.setBounds(320,130,120,30);
	name2.setHorizontalAlignment(SwingConstants.CENTER);
	
}
public void initPanel(){
	this.setBackground(MyColor.WHITE.getColor());
	this.setLayout(null);
	this.setBorder(new MatteBorder(0,0,1,1,MyColor.GREY.getColor()));
}
public void addComponent(){
	this.add(winner);
	this.add(loser);
	this.add(winnerIcon);
	this.add(loserIcon);
	this.add(winnerName);
	this.add(loserName);
}
public void setListener(){
	losertable.addMouseListener(new MouseAdapter(){
		public void mouseClicked(MouseEvent e){
			int row=winnertable.getSelectedRowCount();
			int column=winnertable.getSelectedColumnCount();
			if(column==0){
				PlayerDetailPanel panel=new PlayerDetailPanel(playerbl.getPlayerShortByID(match.getLoserlist().get(row).getPlayername()));
				JumpFrame frame=new JumpFrame(panel);
				frame.open();
			}
		}
	});
	winnertable.addMouseListener(new MouseAdapter(){
		public void mouseClicked(MouseEvent e){
			int row=winnertable.getSelectedRowCount();
			int column=winnertable.getSelectedColumnCount();
			if(column==0){
				PlayerDetailPanel panel=new PlayerDetailPanel(playerbl.getPlayerShortByID(match.getWinnerlist().get(row).getPlayername()));
				JumpFrame frame=new JumpFrame(panel);
				frame.open();
			}
		}
	});

	winner.addMouseListener(new MouseAdapter(){
		public void mouseClicked(MouseEvent e){
			winner.setBackground(MyColor.WHITE.getColor());
			loser.setBackground(MyColor.WHITE.getColor());
//			king.setBackground(MyColor.WHITE.getColor());
			
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
//			king.setBackground(MyColor.WHITE.getColor());
			
			loser.setBackground(MyColor.LIGHTBLUE.getColor());
			remove(getComponentAt(0,290));
			add(loserjsp);
			repaint();
		}
	});
	name1.addMouseListener(new MouseAdapter(){
		public void mouseClicked(MouseEvent e){
			TeamDetailPanel jp=new TeamDetailPanel(match.getWinner());
			JumpFrame frame=new JumpFrame(jp);
			frame.open();
		}
		public void mouseEntered(MouseEvent e){
			name1.setForeground(MyColor.BLUE.getColor());
		}
		public void mouseExited(MouseEvent e){
			name1.setForeground(MyColor.RED.getColor());
		}
	});
	name2.addMouseListener(new MouseAdapter(){
	public void mouseClicked(MouseEvent e){
		TeamDetailPanel jp=new TeamDetailPanel(match.getLoser());
		JumpFrame frame=new JumpFrame(jp);
		frame.open();
		}
		public void mouseEntered(MouseEvent e){
			name2.setForeground(MyColor.BLUE.getColor());
		}
		public void mouseExited(MouseEvent e){
			name2.setForeground(MyColor.BLACK.getColor());
		}
	});
}
public String getID(){
	return this.id;
}
}
