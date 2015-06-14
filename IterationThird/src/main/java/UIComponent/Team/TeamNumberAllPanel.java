package UIComponent.Team;

import java.awt.Font;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;

import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.SwingConstants;
import javax.swing.border.MatteBorder;

import logic.TeamBL;
import logic.TeamBL_Impl;
import UIComponent.MyColor;
import UIComponent.MyComboBox;
import VO.TeamNumberVO;

public class TeamNumberAllPanel extends JPanel{

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	TeamBL bl=TeamBL_Impl.getInstance();
	MyComboBox season;
	MyComboBox after;
	JLabel choose;
	JLabel [] jls=new JLabel[16];
	private String[] jltexts=new String[]{"参赛场数","投篮命中数","投篮出手次数","三分命中数","三分出手数",
			"罚球命中数","罚球出手数","进攻篮板数","防守篮板数","篮板数","助攻数","抢断数","盖帽数","失误数","犯规数","得分"};

	private String name;
	private TeamNumberVO num;
	
	public TeamNumberAllPanel(String teamname){
		this.name=teamname;
		num=bl.getTeamAllNumber(this.name, "2014-2015", 1);
		
		after=new MyComboBox(new String[]{"季前赛","常规赛","季后赛"});
		after.setBounds(120,10,80,20);
		this.add(after);
		season=new MyComboBox(new String[]{"2012-2013","2013-2014","2014-2015"});
		season.setBounds(30,10,80,20);
		choose=new JLabel("筛选");
		choose.setForeground(MyColor.BLACK.getColor());
		choose.setFont(new Font("黑体",Font.PLAIN,14));
		choose.setBounds(240, 10,40,20);
		choose.setHorizontalAlignment(SwingConstants.CENTER);
		choose.setBorder(new MatteBorder(1,1,1,1,MyColor.GREY.getColor()));
		choose.addMouseListener(new MouseAdapter(){
			public void mouseClicked(MouseEvent e){
				TeamNumberVO newNumber=bl.getTeamAllNumber(name, (String)season.getSelectedItem(), after.getSelectedIndex());
				initContents(newNumber);
				repaint();
			}
			public void mouseEntered(MouseEvent e){
				choose.setForeground(MyColor.BLUE.getColor());
			}
			public void mouseExited(MouseEvent e){
				choose.setForeground(MyColor.BLACK.getColor());
			}
		});
		this.add(choose);
		initContents(num);
		this.setLayout(null);
		this.setBorder(new MatteBorder(1,0,1,1,MyColor.GREY.getColor()));
		this.setBackground(MyColor.WHITE.getColor());
		for(int i=0;i<jls.length;i++){
			this.add(jls[i]);
		}
		this.add(season);
	}
	private void initContents(TeamNumberVO vo){
		jls[0]=new JLabel(jltexts[0]+": "+vo.getNumber());
		
		for(int i=1;i<jls.length;i++){
			jls[i]=new JLabel(jltexts[i]+": "+num.getData()[i-1]);
		}
		for(int i=0;i<jls.length;i++){
			
			jls[i].setForeground(MyColor.BLACK.getColor());
			jls[i].setFont(new Font("微软雅黑",Font.PLAIN,14));
			if(i%2==0){
				jls[i].setBounds(30, 50+i/2*40, 200, 40);
			}else{
				jls[i].setBounds(270, 50+i/2*40, 200, 40);
			}
		}
}
}
