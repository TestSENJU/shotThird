package UIComponent.Player;

import java.awt.Font;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;

import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.SwingConstants;
import javax.swing.border.MatteBorder;

import logic.PlayerBL;
import logic.PlayerBL_Impl;
import UIComponent.MyColor;
import UIComponent.MyComboBox;
import VO.PlayerRateVO;

public class PlayerRatePanel extends JPanel{

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	private PlayerRateVO num;
	private PlayerBL bl=PlayerBL_Impl.getInstance();
	MyComboBox season;
	MyComboBox after;
	JLabel choose;
	
	JLabel [] jls=new JLabel[12];
	private String[] jltexts=new String[]{"投篮命中率","三分命中率","罚球命中率","效率","GmSc","真实命中率","投篮效率"
			,"篮板率","进攻篮板率","防守篮板率","助攻率","抢断率","盖帽率","失误率","使用率"};

	
	public PlayerRatePanel(PlayerRateVO number){
	
		this.num=number;
		after=new MyComboBox(new String[]{"常规赛","季前赛","季后赛"});
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
				int i=after.getSelectedIndex();
				PlayerRateVO newNumber=bl.getPlayerRate(num.getPlayerid(), (String)season.getSelectedItem(), i);
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
	private void initContents(PlayerRateVO vo){
		for(int i=0;i<jls.length;i++){
			jls[i]=new JLabel(jltexts[i]+": "+vo.getRate()[i]);
			jls[i].setForeground(MyColor.BLACK.getColor());
			jls[i].setFont(new Font("微软雅黑",Font.PLAIN,14));
			if(i%2==0){
				jls[i].setBounds(10, 50+i/2*30, 200, 30);
			}else{
				jls[i].setBounds(250, 50+i/2*30, 200, 30);
			}
		}
	}
}
