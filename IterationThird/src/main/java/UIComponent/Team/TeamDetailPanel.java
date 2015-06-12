package UIComponent.Team;

import java.awt.Font;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;

import javax.swing.ImageIcon;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.border.LineBorder;
import javax.swing.border.MatteBorder;

import UIComponent.MyColor;
import UIComponent.MyScrollPane;
import UIComponent.MyTable;

public class TeamDetailPanel extends JPanel{
/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
private String team;
JLabel teamIcon;
JLabel name;
JLabel shortName,chineseName,league,gym,date;
JLabel player,number,rate;
MyScrollPane playerjsp;
MyTable playertable;
public TeamDetailPanel(String teamName){
	this.team=teamName;
	initComponent();
	initPanel();

	addComponent();
	setListener();
}
public void initComponent(){
	
	teamIcon=new JLabel(new ImageIcon("team/CHA.png"));
	teamIcon.setBounds(20, 50, 100, 100);
	teamIcon.setBorder(new LineBorder(MyColor.GREY.getColor()));
	
	name=new JLabel("名字: Los Angeles Clippers");
	name.setForeground(MyColor.BLACK.getColor());
	name.setFont(new Font("微软雅黑",Font.PLAIN,14));
	name.setBounds(140, 60, 200, 20);
	
	shortName=new JLabel("缩写名: LAC");
	shortName.setForeground(MyColor.BLACK.getColor());
	shortName.setFont(new Font("微软雅黑",Font.PLAIN,14));
	shortName.setBounds(360, 60, 100, 20);
	
	chineseName=new JLabel("中文名: 俄克拉荷马雷霆队");
	chineseName.setForeground(MyColor.BLACK.getColor());
	chineseName.setFont(new Font("微软雅黑",Font.PLAIN,14));
	chineseName.setBounds(140, 90, 200, 20);
	
	league=new JLabel("联盟: 中部联盟");
	league.setForeground(MyColor.BLACK.getColor());
	league.setFont(new Font("微软雅黑",Font.PLAIN,14));
	league.setBounds(360, 90, 100, 20);
	
	gym=new JLabel("主场: Bankers Life Fieldhouse");
	gym.setForeground(MyColor.BLACK.getColor());
	gym.setFont(new Font("微软雅黑",Font.PLAIN,14));
	gym.setBounds(140, 120, 200, 20);
	
	date=new JLabel("创建年份: 1999");
	date.setForeground(MyColor.BLACK.getColor());
	date.setFont(new Font("微软雅黑",Font.PLAIN,14));
	date.setBounds(360, 120, 100, 20);
	
}
public void initPanel(){
	this.setBackground(MyColor.WHITE.getColor());
	this.setBorder(new MatteBorder(0,0,1,1,MyColor.GREY.getColor()));
	this.setLayout(null);
}
public void addComponent(){
	this.add(name);
	this.add(teamIcon);
	this.add(shortName);
	this.add(chineseName);
	this.add(league);
	this.add(gym);
	this.add(date);
}
public void setListener(){

}
public String getTeam(){
	return this.team;
}
}
