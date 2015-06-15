package UIComponent.Home;

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
import UIComponent.MyTable;
import UIComponent.Match.MatchDetailPanel;
import UIComponent.Team.TeamDetailPanel;
import VO.MatchShortVO;

public class HomeMatchPanel extends JPanel{

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	private MatchBL matchbl=MatchBL_Impl.getInstance();
	
	JPanel panels[]=new JPanel[5];
	JLabel winnericons[]=new JLabel[5];
	JLabel losericons[]=new JLabel[5];
	JLabel winnernames[]=new JLabel[5];
	JLabel losernames[]=new JLabel[5];
	JLabel matchtime[]=new JLabel[5];
	MyTable scoretables[]=new MyTable[5];
	private 		ArrayList<MatchShortVO> list;
	
	public HomeMatchPanel(){

		list=matchbl.getRecentMatches(5);
		initComponent();
		addComponent();
		initPanel();
		setListener();

	}
	public void initComponent(){
		for(int i=0;i<5;i++){
			panels[i]=new JPanel();
			panels[i].setLayout(null);
			panels[i].setBackground(MyColor.WHITE.getColor());
			panels[i].setBorder(new MatteBorder(1,1,1,1,MyColor.GREY.getColor()));
			
			winnericons[i]=new JLabel(new ImageIcon("team/NOP.png"));
			losericons[i]=new JLabel(new ImageIcon("team/NOP.png"));
			
			winnernames[i]=new JLabel("<HTML><U>"+"胜方:"+list.get(i).getWinner()+"<U><HTML>");
			winnernames[i].setForeground(MyColor.RED.getColor());
			winnernames[i].setFont(new Font("微软雅黑",Font.PLAIN,16));
			winnernames[i].setHorizontalAlignment(SwingConstants.CENTER);
			
			losernames[i]=new JLabel("<HTML><U>"+"负方:"+list.get(i).getLoser()+"<U><HTML>");
			losernames[i].setForeground(MyColor.BLACK.getColor());
			losernames[i].setFont(new Font("微软雅黑",Font.PLAIN,16));
			losernames[i].setHorizontalAlignment(SwingConstants.CENTER);
			
			matchtime[i]=new JLabel("时间:"+list.get(i).getTime());
			matchtime[i].setForeground(MyColor.BLACK.getColor());
			matchtime[i].setFont(new Font("微软雅黑",Font.PLAIN,16));
			matchtime[i].setHorizontalAlignment(SwingConstants.CENTER);
			
			ArrayList<String>score=matchbl.getScoreListByShortVO(list.get(i));
			String data[][]=new String[score.size()+1][1];
			data[0][0]=list.get(i).getScore();
			for(int j=1;j<score.size();j++){
				data[i][0]=score.get(j);
			}
			if(score.size()==4){
				scoretables[i]=new MyTable(data,new String[]{"总比分","第一节","第二节","第三节","第四节"},-1,-1){
					/**
					 * 
					 */
					private static final long serialVersionUID = 1L;

					public boolean isCellEditable(int row,int column){
						return false;
					}
				};	
			}else if(score.size()==5){
				scoretables[i]=new MyTable(data,new String[]{"总比分","第一节","第二节","第三节","第四节","加时赛"},-1,-1){
					/**
					 * 
					 */
					private static final long serialVersionUID = 1L;

					public boolean isCellEditable(int row,int column){
						return false;
					}
				};	
			}
	
		}
	}
	public void addComponent(){
		
		for(int i=0;i<5;i++){
			panels[i].setBounds(70,30+100*(i),760,90 );
			matchtime[i].setBounds(5,5,80,20);
			winnericons[i].setBounds(170,5,80,80);
			winnernames[i].setBounds(90,40,80,20);
			losernames[i].setBounds(265,40,80,20);
			losericons[i].setBounds(350,5,80,80);
			scoretables[i].getTableHeader().setBounds(440,20,400,20);
			scoretables[i].setBounds(440,40,400,50);
		}
		
		for(int i=0;i<5;i++){
			panels[i].add(matchtime[i]);
			panels[i].add(winnericons[i]);
			panels[i].add(losericons[i]);
			panels[i].add(winnernames[i]);
			panels[i].add(losernames[i]);
			panels[i].add(scoretables[i].getTableHeader());
			panels[i].add(scoretables[i]);
			this.add(panels[i]);
		}
	}
	public void initPanel(){
		this.setBackground(MyColor.WHITE.getColor());
		this.setLayout(null);
	}
	public void setListener(){
		for(int i=0;i<5;i++){
			panels[i].addMouseListener(new MouseAdapter(){
				public void mouseClicked(MouseEvent e){
					if(e.getClickCount()==2){
						JPanel tmp=(JPanel) e.getSource();
						for(int j=0;j<5;j++){
							if(tmp.equals(panels[j])){
								MatchDetailPanel matchpanel=new MatchDetailPanel(list.get(j).getMatchid());
								JumpFrame frame=new JumpFrame(matchpanel);
								frame.open();
							}
						}
					}
				}
			});
		}
		for(int i=0;i<5;i++){
			winnernames[i].addMouseListener(new MouseAdapter(){
				public void mouseClicked(MouseEvent e){
					JLabel tmp=(JLabel)e.getSource();
					String str=tmp.getText();
					String teamname=str.split(":")[1].split("<")[0];
					TeamDetailPanel  teampanel=new TeamDetailPanel(teamname);
					JumpFrame frame=new JumpFrame(teampanel);
					frame.open();
				}
				public void mouseEntered(MouseEvent e){
					JLabel tmp=(JLabel)e.getSource();
					tmp.setForeground(MyColor.BLUE.getColor());
				}
				public void mouseExited(MouseEvent e){
					JLabel tmp=(JLabel)e.getSource();
					tmp.setForeground(MyColor.BLACK.getColor());
				}
			});
			
		}
		for(int i=0;i<5;i++){
			losernames[i].addMouseListener(new MouseAdapter(){
				public void mouseClicked(MouseEvent e){
					JLabel tmp=(JLabel)e.getSource();
					String str=tmp.getText();
					String teamname=str.split(":")[1].split("<")[0];
					TeamDetailPanel  teampanel=new TeamDetailPanel(teamname);
					JumpFrame frame=new JumpFrame(teampanel);
					frame.open();
				}
				public void mouseEntered(MouseEvent e){
					JLabel tmp=(JLabel)e.getSource();
					tmp.setForeground(MyColor.BLUE.getColor());
				}
				public void mouseExited(MouseEvent e){
					JLabel tmp=(JLabel)e.getSource();
					tmp.setForeground(MyColor.BLACK.getColor());
				}
			});
	}
	}
}
