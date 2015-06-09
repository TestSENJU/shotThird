package UIComponent.Search;

import java.awt.Font;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;

import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.SwingConstants;
import javax.swing.border.MatteBorder;

import UIComponent.MyColor;

public class SearchPanel extends JPanel{

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
JLabel player,team,match;
SearchPlayerPanel playerPanel;
SearchTeamPanel teamPanel;
SearchMatchPanel matchPanel;

public SearchPanel(){
	initComponent();
	addComponent();
	setListener();
}

public void initComponent(){
	team=new JLabel("球队");
	team.setForeground(MyColor.BLUE.getColor());
	team.setOpaque(true);
	team.setBackground(MyColor.LIGHTBLUE.getColor());
	team.setHorizontalAlignment(SwingConstants.CENTER);
	team.setFont(new Font("黑体",Font.PLAIN,16));
	team.setBounds(10,0,40,30);
	
	player=new JLabel("球员");
	player.setForeground(MyColor.BLUE.getColor());
	player.setFont(new Font("黑体",Font.PLAIN,16));
	player.setBounds(55,0,40,30);
	player.setOpaque(true);
	player.setBackground(MyColor.WHITE.getColor());
	player.setHorizontalAlignment(SwingConstants.CENTER);
	
	match=new JLabel("比赛");
	match.setForeground(MyColor.BLUE.getColor());
	match.setOpaque(true);
	match.setBackground(MyColor.WHITE.getColor());
	match.setHorizontalAlignment(SwingConstants.CENTER);
	match.setFont(new Font("黑体",Font.PLAIN,16));
	match.setBounds(100,0,40,30);
	
	teamPanel=new SearchTeamPanel();
	teamPanel.setBounds(0,30 , 900, 550);
	teamPanel.setBorder(new MatteBorder(1,0,1,1,MyColor.GREY.getColor()));
	
	playerPanel=new SearchPlayerPanel();
	playerPanel.setBounds(0,30 , 900, 550);
	playerPanel.setBorder(new MatteBorder(1,0,1,1,MyColor.GREY.getColor()));
	
	matchPanel=new SearchMatchPanel();
	matchPanel.setBounds(0,30 , 900, 550);
	matchPanel.setBorder(new MatteBorder(1,0,1,1,MyColor.GREY.getColor()));
	
	this.setBounds(0, 20, 900, 580);
	this.setBackground(MyColor.WHITE.getColor());
	this.setBorder(new MatteBorder(0,0,1,1,MyColor.GREY.getColor()));
	this.setLayout(null);
}
public void addComponent(){
	this.add(team);
	this.add(player);
	this.add(match);
	this.add(teamPanel);
}
public void setListener(){
	team.addMouseListener(new MouseAdapter(){
		public void mouseClicked(MouseEvent e){
			player.setBackground(MyColor.WHITE.getColor());
			match.setBackground(MyColor.WHITE.getColor());
			team.setBackground(MyColor.LIGHTBLUE.getColor());
			if(getComponentAt(100, 30)instanceof SearchTeamPanel){
				
			}else{
				remove(getComponentAt(100, 30));
				add(teamPanel);
				repaint();
			}			
		}
		public void mouseEntered(MouseEvent e){
			team.setForeground(MyColor.BLACK.getColor());
		}
		public void mouseExited(MouseEvent e){
			team.setForeground(MyColor.BLUE.getColor());
		}		
	});
	player.addMouseListener(new MouseAdapter(){
		public void mouseClicked(MouseEvent e){
			player.setBackground(MyColor.LIGHTBLUE.getColor());
			team.setBackground(MyColor.WHITE.getColor());
			match.setBackground(MyColor.WHITE.getColor());
if(getComponentAt(100, 30)instanceof SearchPlayerPanel){
				
			}else{
				remove(getComponentAt(100, 30));
				add(playerPanel);
				repaint();
			}
		}
		public void mouseEntered(MouseEvent e){
			player.setForeground(MyColor.BLACK.getColor());
		}
		public void mouseExited(MouseEvent e){
			player.setForeground(MyColor.BLUE.getColor());
		}			
	});
	match.addMouseListener(new MouseAdapter(){
		public void mouseClicked(MouseEvent e){
			player.setBackground(MyColor.WHITE.getColor());
			team.setBackground(MyColor.WHITE.getColor());
			match.setBackground(MyColor.LIGHTBLUE.getColor());
			if(getComponentAt(100, 30)instanceof SearchMatchPanel){
				
			}else{
				remove(getComponentAt(100, 30));
				add(matchPanel);
				repaint();
			}			
		}
		public void mouseEntered(MouseEvent e){
			match.setForeground(MyColor.BLACK.getColor());
		}
		public void mouseExited(MouseEvent e){
			match.setForeground(MyColor.BLUE.getColor());
		}		
	});
}
}
