package UIComponent.Player;

import java.awt.Font;

import javax.swing.ImageIcon;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.SwingConstants;

import UIComponent.MyColor;

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
	
	public PlayerAnalysisPanel(String id){
		this.playerid=id;
		initComponent();
		initPanel();
		setListener();
	}

	public void initComponent(){
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
		compare.setBackground(MyColor.LIGHTBLUE.getColor());
		compare.setHorizontalAlignment(SwingConstants.CENTER);
		compare.setFont(new Font("黑体",Font.PLAIN,16));
		compare.setBounds(55,0,40,30);
		
		data=new JLabel("数据");
		data.setForeground(MyColor.BLUE.getColor());
		data.setOpaque(true);
		data.setBackground(MyColor.LIGHTBLUE.getColor());
		data.setHorizontalAlignment(SwingConstants.CENTER);
		data.setFont(new Font("黑体",Font.PLAIN,16));
		data.setBounds(100,0,40,30);
		
		change=new JLabel("变化");
		change.setForeground(MyColor.BLUE.getColor());
		change.setOpaque(true);
		change.setBackground(MyColor.LIGHTBLUE.getColor());
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
		
	}
}
