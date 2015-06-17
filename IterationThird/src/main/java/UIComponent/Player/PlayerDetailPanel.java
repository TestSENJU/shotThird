package UIComponent.Player;

import java.awt.Font;
import java.awt.Image;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;

import javax.swing.ImageIcon;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.SwingConstants;
import javax.swing.border.MatteBorder;

import logic.PlayerBL;
import logic.PlayerBL_Impl;
import UIComponent.AnalysisFrame;
import UIComponent.JumpFrame;
import UIComponent.MyColor;
import UIComponent.TeamNameSwitcher;
import UIComponent.Team.TeamDetailPanel;
import VO.PlayerInfoVO;
import VO.PlayerNumberVO;
import VO.PlayerRateVO;
import VO.PlayerShortVO;

public class PlayerDetailPanel extends JPanel{
/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
private PlayerBL playerbl=PlayerBL_Impl.getInstance();	
private PlayerShortVO player;
private String playername;
JLabel name;
JLabel number;
JLabel position,height,weight,birth,age,exp,school,team,teamname;
JLabel photo;
JPanel photoPanel;
ImageIcon icon1,icon2;
JLabel change1,change2;
JLabel showmore;
JLabel avernumber,allnumber,rate;
PlayerAllNumberPanel playerallPanel;
PlayerAverageNumberPanel playeraverPanel;
PlayerRatePanel playerratepanel;
//TODO
public PlayerDetailPanel(PlayerShortVO theplayer,String str){
	this.player=theplayer;
	this.playername=str;

	initJLabel();
	initJPanel();

	addComponent();
	setListener();
}
public void initJLabel(){
	playerallPanel=new PlayerAllNumberPanel(playerbl.getPlayerAllNumber(this.player.getPlayername(), "2014-2015", 1));
	playerallPanel.setBounds(0,290,500,290);
	playeraverPanel=new PlayerAverageNumberPanel(null);
	playeraverPanel.setBounds(0,290,500,290);
	playerratepanel=new PlayerRatePanel(null);
	playerratepanel.setBounds(0,290,500,290);
		
	avernumber=new JLabel("场均");
	avernumber.setForeground(MyColor.BLUE.getColor());
	avernumber.setOpaque(true);
	avernumber.setBackground(MyColor.LIGHTBLUE.getColor());
	avernumber.setHorizontalAlignment(SwingConstants.CENTER);
	avernumber.setFont(new Font("黑体",Font.PLAIN,16));
	avernumber.setBounds(10,260,40,30);
	
	allnumber=new JLabel("赛季");
	allnumber.setForeground(MyColor.BLUE.getColor());
	allnumber.setOpaque(true);
	allnumber.setBackground(MyColor.WHITE.getColor());
	allnumber.setHorizontalAlignment(SwingConstants.CENTER);
	allnumber.setFont(new Font("黑体",Font.PLAIN,16));
	allnumber.setBounds(55,260,40,30);
	
	rate=new JLabel("%");
	rate.setForeground(MyColor.BLUE.getColor());
	rate.setOpaque(true);
	rate.setBackground(MyColor.WHITE.getColor());
	rate.setHorizontalAlignment(SwingConstants.CENTER);
	rate.setFont(new Font("黑体",Font.PLAIN,16));
	rate.setBounds(100,260,40,30);
	
	showmore=new JLabel("<HTML><U>"+"显示更多"+"<HTML><U>");
	showmore.setForeground(MyColor.BLACK.getColor());
	showmore.setFont(new Font("微软雅黑",Font.PLAIN,14));
	showmore.setBounds(420, 260, 80, 20);
	
	photoPanel=new JPanel();

	photoPanel.setLayout(null);
	photoPanel.setBackground(MyColor.WHITE.getColor());
	photoPanel.setBorder(new MatteBorder(1,1,1,1,MyColor.GREY.getColor()));
	photoPanel.setBounds(40, 50, 150, 200);
	
	photo=new JLabel();
	
	photo.setBounds(0,0,150,180);
	icon1=new ImageIcon("playerHead/"+this.player+".png");
	 icon1=new ImageIcon(icon1.getImage().getScaledInstance(photo.getWidth(), photo.getHeight()-60, Image.SCALE_DEFAULT));    
	 icon2=new ImageIcon("playerBody/"+this.player+".png");
	 icon2=new ImageIcon(icon2.getImage().getScaledInstance(photo.getWidth()-40, photo.getHeight()-25, Image.SCALE_DEFAULT));    
	 photo.setIcon(icon1);  
	 photo.setHorizontalAlignment(SwingConstants.CENTER);  
	 photo.setVerticalAlignment(SwingConstants.CENTER);
	change1=new JLabel(new ImageIcon("img/picturechange.png"));
	change2=new JLabel(new ImageIcon("img/picturechange.png"));
	change1.setBounds(63, 190, 10, 10);
	change2.setBounds(77, 190,10,10);
	
	String ss="名字: "+this.playername;
	PlayerInfoVO info=playerbl.getPlayerInfoVO(this.player.getPlayername());

	if(ss.length()<=16){
		name=new JLabel(ss);
		name.setBounds(200, 60, 150, 20);
	}else{
		name=new JLabel("<HTML>"+ss.substring(0,16)+"<br>"+"   "+ss.substring(16)+"<HTML>");
		name.setBounds(200, 60, 150, 40);
	}
	name.setForeground(MyColor.BLACK.getColor());
	name.setFont(new Font("微软雅黑",Font.PLAIN,14));
	
	number=new JLabel("号码: "+info.getData()[0]);
	number.setForeground(MyColor.BLACK.getColor());
	number.setFont(new Font("微软雅黑",Font.PLAIN,14));
	number.setBounds(350, 60, 150, 20);
	
	position=new JLabel("位置: "+info.getData()[1]);
	position.setForeground(MyColor.BLACK.getColor());
	position.setFont(new Font("微软雅黑",Font.PLAIN,14));
	position.setBounds(200, 100, 150, 20);
	
	height=new JLabel("体重: "+info.getData()[3]);
	height.setForeground(MyColor.BLACK.getColor());
	height.setFont(new Font("微软雅黑",Font.PLAIN,14));
	height.setBounds(350,100,150,20);
	
	weight=new JLabel("身高: "+info.getData()[2]);
	weight.setForeground(MyColor.BLACK.getColor());
	weight.setFont(new Font("微软雅黑",Font.PLAIN,14));
	weight.setBounds(200,140,150,20);
	
	birth=new JLabel("出生日期: "+info.getData()[4]);
	birth.setForeground(MyColor.BLACK.getColor());
	birth.setFont(new Font("微软雅黑",Font.PLAIN,14));
	birth.setBounds(350,140,150,20);
	
	age=new JLabel("年龄: "+info.getData()[5]);
	age.setForeground(MyColor.BLACK.getColor());
	age.setFont(new Font("微软雅黑",Font.PLAIN,14));
	age.setBounds(200, 180, 150, 20);
	
	exp=new JLabel("球龄: "+info.getData()[6]);
	exp.setForeground(MyColor.BLACK.getColor());
	exp.setFont(new Font("微软雅黑",Font.PLAIN,14));
	exp.setBounds(200, 220, 150, 20);
	
	String s="学校: "+info.getData()[7];
	if(s.length()<=15){
		school=new JLabel(s);	
				school.setBounds(350, 180, 150, 20);
	}else{
		school=new JLabel("<HTML>"+s.substring(0,15)+"<br>"+"   "+s.substring(15)+"<HTML>");			
		school.setBounds(350, 180, 150, 40);
	}
	school.setForeground(MyColor.BLACK.getColor());
	school.setFont(new Font("微软雅黑",Font.PLAIN,14));
	
	TeamNameSwitcher switcher=new TeamNameSwitcher();
	
	team=new JLabel("所属球队: ");
	team.setForeground(MyColor.BLACK.getColor());
	team.setFont(new Font("微软雅黑",Font.PLAIN,14));
	team.setBounds(350, 220, 50, 20);
	teamname=new JLabel("<HTML><U>"+switcher.getTeamName(this.player.getPlayername())+"<HTML><U>");
	teamname.setForeground(MyColor.BLACK.getColor());
	teamname.setFont(new Font("微软雅黑",Font.PLAIN,14));
	teamname.setBounds(350, 220, 100, 20);
}
public void initJPanel(){

	this.setBackground(MyColor.WHITE.getColor());
	this.setBorder(new MatteBorder(0,0,1,1,MyColor.GREY.getColor()));
	this.setLayout(null);
}
public void addComponent(){
	this.add(playeraverPanel);
	this.add(name);
	this.add(number);
	this.add(position);
	this.add(height);
	this.add(weight);
	this.add(birth);
	this.add(age);
	this.add(exp);
	this.add(school);
	this.add(team);
	this.add(showmore);
	this.add(allnumber);
	this.add(avernumber);
	this.add(rate);
	photoPanel.add(photo);
	photoPanel.add(change1);
	photoPanel.add(change2);
	this.add(photoPanel);
}
public void setListener(){
	showmore.addMouseListener(new MouseAdapter(){
		public void mouseClicked(MouseEvent e){
			AnalysisFrame frame=new AnalysisFrame(0,player.getPlayername());
			frame.open();
		}
		public void mouseEntered(MouseEvent e){
			showmore.setForeground(MyColor.BLUE.getColor());
		}
		public void mouseExited(MouseEvent e){
			showmore.setForeground(MyColor.BLACK.getColor());
		}
	});
	allnumber.addMouseListener(new MouseAdapter(){
		public void mouseClicked(MouseEvent e){
			allnumber.setBackground(MyColor.WHITE.getColor());
			avernumber.setBackground(MyColor.WHITE.getColor());
			rate.setBackground(MyColor.WHITE.getColor());
			
			allnumber.setBackground(MyColor.LIGHTBLUE.getColor());
			remove(getComponentAt(0,290));
			add(playerallPanel);
			repaint();
		}
	});
	avernumber.addMouseListener(new MouseAdapter(){
		public void mouseClicked(MouseEvent e){
			allnumber.setBackground(MyColor.WHITE.getColor());
			avernumber.setBackground(MyColor.WHITE.getColor());
			rate.setBackground(MyColor.WHITE.getColor());
			
			avernumber.setBackground(MyColor.LIGHTBLUE.getColor());
			remove(getComponentAt(0,290));
			add(playeraverPanel);
			repaint();
		}
	});
	rate.addMouseListener(new MouseAdapter(){
		public void mouseClicked(MouseEvent e){
			allnumber.setBackground(MyColor.WHITE.getColor());
			avernumber.setBackground(MyColor.WHITE.getColor());
			rate.setBackground(MyColor.WHITE.getColor());
			
			rate.setBackground(MyColor.LIGHTBLUE.getColor());
			remove(getComponentAt(0,290));
			add(playerratepanel);
			repaint();
		}
	});
    change1.addMouseListener(new MouseAdapter(){
    	public void mouseClicked(MouseEvent e){
    		photoPanel.remove(photo);
    		photo.setIcon(icon1);
    		photoPanel.add(photo);
    		photoPanel.repaint();
    	}
    });
    
    change2.addMouseListener(new MouseAdapter(){
    	public void mouseClicked(MouseEvent e){
    		photoPanel.remove(photo);
    		photo.setIcon(icon2);
    		photoPanel.add(photo);
    		photoPanel.repaint();
    	}
    });
	teamname.addMouseListener(new MouseAdapter(){
		public void mouseClicked(MouseEvent e){
			TeamDetailPanel panel=new TeamDetailPanel(teamname.getText().split(">")[2].split("<")[0]);
			JumpFrame frame=new JumpFrame(panel);
			frame.open();
		}
		public void mouseEntered(MouseEvent e){
			teamname.setForeground(MyColor.BLUE.getColor());

		}
		public void mouseExited(MouseEvent e){
			teamname.setForeground(MyColor.BLACK.getColor());
		}
	});
}
public String getName(){
	return this.player.getPlayername();
}
}
