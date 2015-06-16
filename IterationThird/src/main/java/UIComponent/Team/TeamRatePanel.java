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
import VO.TeamRateVO;

public class TeamRatePanel extends JPanel{
	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	private String team;
	private TeamBL bl=TeamBL_Impl.getInstance();
	MyComboBox season;
	MyComboBox after;
	JLabel choose;
	private TeamRateVO num;
	JLabel [] jls=new JLabel[10];
	private String[] jltexts=new String[]{"投篮命中率","三分命中率","罚球命中率","胜率","进攻回合","进攻效率","防守效率"
			,"篮板效率","抢断效率","助攻率"};

	
	public TeamRatePanel(String teamname){
		this.team=teamname;
		
		this.num=bl.getTeamRate(teamname, "2014-2015", 1);

		after=new MyComboBox(new String[]{"季后赛","常规赛","季前赛"});
		after.setBounds(120,10,80,20);
		this.add(after);
		season=new MyComboBox(new String[]{"2014-2015","2013-2014","2012-2013"});
		season.setBounds(30,10,80,20);
		choose=new JLabel("筛选");
		choose.setForeground(MyColor.BLACK.getColor());
		choose.setFont(new Font("黑体",Font.PLAIN,14));
		choose.setBounds(240, 10,40,20);
		choose.setHorizontalAlignment(SwingConstants.CENTER);
		choose.setBorder(new MatteBorder(1,1,1,1,MyColor.GREY.getColor()));
		choose.addMouseListener(new MouseAdapter(){
			public void mouseClicked(MouseEvent e){
			   TeamRateVO newNumber=bl.getTeamRate(team, (String)season.getSelectedItem(),after.getSelectedIndex());
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

		this.add(season);
		this.setLayout(null);
		this.setBorder(new MatteBorder(1,0,1,1,MyColor.GREY.getColor()));
		this.setBackground(MyColor.WHITE.getColor());
		for(int i=0;i<jls.length;i++){
			this.add(jls[i]);
		}
	}
	private void initContents(TeamRateVO vo){
		for(int i=0;i<jls.length;i++){
			jls[i]=new JLabel(jltexts[i]+": "+vo.getRate()[i]);
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
