package UIComponent.Search;

import java.awt.Font;
import java.awt.Image;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;

import javax.swing.ImageIcon;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.SwingConstants;

import UIComponent.MyColor;

public class SearchTeamPanel extends JPanel{

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	JLabel west,east;
	JLabel eastsouthlabel,centerlabel,westoceanlabel,westsouthlabel,westnorthlabel,oceanlabel;
	//东南分区区 中央分区 大西洋分区 　 西南分区 西北分区 太平洋分区 
	JLabel eastsouthicons[];
	JLabel centericons[];
	JLabel westoceanicons[];
	JLabel westsouthicons[];
	JLabel westnorthicons[];
	JLabel oceanicons[];

	JLabel eastsouthtexts[];
	JLabel centertexts[];
	JLabel westoceantexts[];
	JLabel westsouthtexts[];
	JLabel westnorthtexts[];
	JLabel oceantexts[];
	private int jlabelweight=60,jlabelheight=60;
	private String[] eastsouthpath=new String[]{"team/SAS.png","team/MEM.png","team/DAL.png","team/HOU.png","team/NOP.png"};
	private String[]eastsouth=new String[]{"圣安东尼奥马刺队","孟菲斯灰熊队","达拉斯小牛队","休斯敦火箭队","新奥尔良鹈鹕队"};

	private String[] centerpath=new String[]{"team/MIN.png","team/DEN.png","team/UTA.png","team/POR.png","team/OKC.png"};
	private String[] center=new String[]{"明尼苏达森林狼队","丹佛掘金队","犹他爵士队","波特兰开拓者队","俄克拉荷马雷霆队"};

	private String[] westoceanpath=new String[]{"team/SAC.png","team/PHX.png","team/LAL.png","team/LAC.png","team/GSW.png"};
	private String[] westocean=new String[]{"萨克拉门托国王队","菲尼克斯太阳队","洛杉矶湖人队","洛杉矶快船队 ","金州勇士队"};

	private String[] westsouthpath=new String[]{"team/MIA.png","team/ORL.png","team/ATL.png","team/WAS.png","team/CHA.png"};
	private String[] westsouth=new String[]{"迈阿密热火队","奥兰多魔术队","亚特兰大老鹰队","华盛顿奇才队","夏洛特黄蜂队"};

	private String[] westnorthpath=new String[]{"team/DET.png","team/IND.png","team/CLE.png","team/CHI.png","team/MIL.png"};
	private String[] westnorth=new String[]{"底特律活塞队","印第安纳步行者队","克里夫兰骑士队","芝加哥公牛队","密尔沃基雄鹿队"};

	private String[] oceanpath=new String[]{"team/BOS.png","team/PHI.png","team/NYK.png","team/BKN.png","team/TOR.png"};
	private String ocean[]=new String[]{"波士顿凯尔特人队","费城76人队","纽约尼克斯队","布鲁克林篮网队","多伦多猛龙队"};
	
	public SearchTeamPanel(){
		initComponent();
		addComponent();
		setListener();
	}
	public void initComponent(){
		west=new JLabel("西部分区");
		west.setForeground(MyColor.BLUE.getColor());
		west.setFont(new Font("黑体",Font.PLAIN,16));
		west.setBounds(0, 275, 80, 40);
		west.setVerticalAlignment(SwingConstants.CENTER);
		
		east=new JLabel("东部分区");
		east.setForeground(MyColor.BLUE.getColor());
		east.setFont(new Font("黑体",Font.PLAIN,16));
		east.setBounds(0,0,80,40);
		east.setVerticalAlignment(SwingConstants.CENTER);
		
		eastsouthlabel=new JLabel("东南分区");
		eastsouthlabel.setForeground(MyColor.PURPLE.getColor());
		eastsouthlabel.setFont(new Font("黑体",Font.PLAIN,13));
		eastsouthlabel.setBounds(90, 40, 80, 20);
	
		eastsouthicons=new JLabel[5];
		for(int i=0;i<5;i++){
			ImageIcon icon=(new ImageIcon(eastsouthpath[i]));
			icon=new ImageIcon(icon.getImage().getScaledInstance(jlabelweight, jlabelheight, Image.SCALE_DEFAULT));
			eastsouthicons[i]=new JLabel(icon);
			eastsouthicons[i].setBounds(200+130*i, 10, jlabelweight, jlabelheight);
			eastsouthicons[i].setHorizontalAlignment(SwingConstants.CENTER);
		}
		eastsouthtexts=new JLabel[5];
		for(int i=0;i<5;i++){
			eastsouthtexts[i]=new JLabel("<HTML><U>"+eastsouth[i]+"</U></HTML>");
			eastsouthtexts[i].setForeground(MyColor.BLACK.getColor());
			eastsouthtexts[i].setFont(new Font("黑体",Font.PLAIN,12));
			eastsouthtexts[i].setBounds(170+130*i, jlabelheight+10, jlabelweight+60, 20);
			eastsouthtexts[i].setHorizontalAlignment(SwingConstants.CENTER);
		}
		
	centerlabel=new JLabel("中央分区");
	centerlabel.setForeground(MyColor.PURPLE.getColor());
	centerlabel.setFont(new Font("黑体",Font.PLAIN,13));
	centerlabel.setBounds(90, 130, 80, 20);
	
		centericons=new JLabel[5];
		for(int i=0;i<5;i++){
			ImageIcon icon=(new ImageIcon(centerpath[i]));
			icon=new ImageIcon(icon.getImage().getScaledInstance(jlabelweight, jlabelheight, Image.SCALE_DEFAULT));
			centericons[i]=new JLabel(icon);
			centericons[i].setBounds(200+130*i, 100, jlabelweight, jlabelheight);
		}
		centertexts=new JLabel[5];
		for(int i=0;i<5;i++){
			centertexts[i]=new JLabel("<HTML><U>"+center[i]+"</U></HTML>");
			centertexts[i].setForeground(MyColor.BLACK.getColor());
			centertexts[i].setFont(new Font("黑体",Font.PLAIN,12));
			centertexts[i].setBounds(170+130*i, jlabelheight+100, jlabelweight+60, 20);
			centertexts[i].setHorizontalAlignment(SwingConstants.CENTER);
		}
		
		westoceanlabel=new JLabel("大西洋分区");
		westoceanlabel.setForeground(MyColor.PURPLE.getColor());
		westoceanlabel.setFont(new Font("黑体",Font.PLAIN,13));
		westoceanlabel.setBounds(90, 220, 80, 20);
		
		westoceanicons=new JLabel[5];
		for(int i=0;i<5;i++){
			ImageIcon icon=(new ImageIcon(westoceanpath[i]));
			icon=new ImageIcon(icon.getImage().getScaledInstance(jlabelweight, jlabelheight, Image.SCALE_DEFAULT));
			westoceanicons[i]=new JLabel(icon);
			westoceanicons[i].setBounds(200+130*i, 190, jlabelweight, jlabelheight);
		}
		westoceantexts=new JLabel[5];
		for(int i=0;i<5;i++){
			westoceantexts[i]=new JLabel("<HTML><U>"+westocean[i]+"</U></HTML>");
			westoceantexts[i].setForeground(MyColor.BLACK.getColor());
			westoceantexts[i].setFont(new Font("黑体",Font.PLAIN,12));
			westoceantexts[i].setBounds(170+130*i, jlabelheight+190, jlabelweight+60, 20);
			westoceantexts[i].setHorizontalAlignment(SwingConstants.CENTER);
		}
		
		westsouthlabel=new JLabel("西南分区");
		westsouthlabel.setForeground(MyColor.PURPLE.getColor());
		westsouthlabel.setFont(new Font("黑体",Font.PLAIN,13));
		westsouthlabel.setBounds(90, 310, 80, 20);
		
		westsouthicons=new JLabel[5];
		for(int i=0;i<5;i++){
			ImageIcon icon=(new ImageIcon(westsouthpath[i]));
			icon=new ImageIcon(icon.getImage().getScaledInstance(jlabelweight, jlabelheight, Image.SCALE_DEFAULT));
			westsouthicons[i]=new JLabel(icon);
			westsouthicons[i].setBounds(200+130*i, 280, jlabelweight, jlabelheight);
		}
		westsouthtexts=new JLabel[5];
		for(int i=0;i<5;i++){
			westsouthtexts[i]=new JLabel("<HTML><U>"+westsouth[i]+"</U></HTML>");
			westsouthtexts[i].setForeground(MyColor.BLACK.getColor());
			westsouthtexts[i].setFont(new Font("黑体",Font.PLAIN,12));
			westsouthtexts[i].setBounds(170+130*i, jlabelheight+280, jlabelweight+60, 20);
			westsouthtexts[i].setHorizontalAlignment(SwingConstants.CENTER);
		}

		westnorthlabel=new JLabel("西北分区");
		westnorthlabel.setForeground(MyColor.PURPLE.getColor());
		westnorthlabel.setFont(new Font("黑体",Font.PLAIN,13));
		westnorthlabel.setBounds(90, 400, 80, 20);
	
		westnorthicons=new JLabel[5];
		for(int i=0;i<5;i++){
			ImageIcon icon=(new ImageIcon(westnorthpath[i]));
			icon=new ImageIcon(icon.getImage().getScaledInstance(jlabelweight, jlabelheight, Image.SCALE_DEFAULT));
			westnorthicons[i]=new JLabel(icon);
			westnorthicons[i].setIcon(icon);
			westnorthicons[i].setBounds(200+130*i, 370, jlabelweight, jlabelheight);
		}
		westnorthtexts=new JLabel[5];
		for(int i=0;i<5;i++){
			westnorthtexts[i]=new JLabel("<HTML><U>"+westnorth[i]+"</U></HTML>");
			westnorthtexts[i].setForeground(MyColor.BLACK.getColor());
			westnorthtexts[i].setFont(new Font("黑体",Font.PLAIN,12));
			westnorthtexts[i].setBounds(170+130*i, jlabelheight+370, jlabelweight+60, 20);
			westnorthtexts[i].setHorizontalAlignment(SwingConstants.CENTER);
		}
		
		oceanlabel=new JLabel("太平洋分区");
		oceanlabel.setForeground(MyColor.PURPLE.getColor());
		oceanlabel.setFont(new Font("黑体",Font.PLAIN,13));
		oceanlabel.setBounds(90, 480, 80, 20);
		
		oceanicons=new JLabel[5];
		for(int i=0;i<5;i++){
			ImageIcon icon=(new ImageIcon(oceanpath[i]));
			icon=new ImageIcon(icon.getImage().getScaledInstance(jlabelweight, jlabelheight, Image.SCALE_DEFAULT));
			oceanicons[i]=new JLabel(icon);
			oceanicons[i].setBounds(200+130*i, 460, jlabelweight, jlabelheight);
		}

		oceantexts=new JLabel[5];
		for(int i=0;i<5;i++){
			oceantexts[i]=new JLabel("<HTML><U>"+ocean[i]+"</U></HTML>");
			oceantexts[i].setForeground(MyColor.BLACK.getColor());
			oceantexts[i].setFont(new Font("黑体",Font.PLAIN,14));
			oceantexts[i].setBounds(170+130*i, jlabelheight+460, jlabelweight+60, 20);
			oceantexts[i].setHorizontalAlignment(SwingConstants.CENTER);
		}

	}
	public void addComponent(){
	    this.add(east);
				this.add(eastsouthlabel);
				this.add(centerlabel);
				this.add(westoceanlabel);
				for(int i=0;i<5;i++){
					this.add(eastsouthicons[i]);
				}
				for(int i=0;i<5;i++){
					this.add(centericons[i]);
				}
				for(int i=0;i<5;i++){
					this.add(westoceanicons[i]);
				}
				for(int i=0;i<5;i++){
					this.add(westsouthicons[i]);
				}
				for(int i=0;i<5;i++){
					this.add(westnorthicons[i]);
				}
				for(int i=0;i<5;i++){
					this.add(oceanicons[i]);
				}
				
				for(int i=0;i<5;i++){
					this.add(eastsouthtexts[i]);
				}
				for(int i=0;i<5;i++){
					this.add(centertexts[i]);
				}
				for(int i=0;i<5;i++){
					this.add(westoceantexts[i]);
				}
				for(int i=0;i<5;i++){
					this.add(westsouthtexts[i]);
				}
				for(int i=0;i<5;i++){
					this.add(westnorthtexts[i]);
				}
				for(int i=0;i<5;i++){
					this.add(oceantexts[i]);
				}
				this.add(west);
				this.add(westsouthlabel);
				this.add(westnorthlabel);
				this.add(oceanlabel);
				this.add(centerlabel);
				
				this.setLayout(null);
				this.setBackground(MyColor.WHITE.getColor());
	}
	public void setListener(){
		for(int i=0;i<5;i++){
			eastsouthtexts[i].addMouseListener(new MouseAdapter(){
				public void mouseEntered(MouseEvent e){
			         JLabel tmp=(JLabel)e.getSource();
			         tmp.setForeground(MyColor.BLUE.getColor());
				}
				public void mouseExited(MouseEvent e){
			         JLabel tmp=(JLabel)e.getSource();
			         tmp.setForeground(MyColor.BLACK.getColor());
				}
	            public void mouseClicked(MouseEvent e){
					//TODO
	                JLabel tmp=(JLabel)e.getSource();
			         tmp.setForeground(MyColor.RED.getColor());
	               
				}
			});
		}
		for(int j=0;j<5;j++){
			centertexts[j].addMouseListener(new MouseAdapter(){
				public void mouseEntered(MouseEvent e){
			         JLabel tmp=(JLabel)e.getSource();
			         tmp.setForeground(MyColor.BLUE.getColor());
				}
				public void mouseExited(MouseEvent e){
			         JLabel tmp=(JLabel)e.getSource();
			         tmp.setForeground(MyColor.BLACK.getColor());
				}
	           public void mouseClicked(MouseEvent e){
					//TODO
	        	   JLabel tmp=(JLabel)e.getSource();
			         tmp.setForeground(MyColor.RED.getColor());
	     
				}
			});
		}
		for(int i=0;i<5;i++){
			westoceantexts[i].addMouseListener(new MouseAdapter(){
				public void mouseEntered(MouseEvent e){
			         JLabel tmp=(JLabel)e.getSource();
			         tmp.setForeground(MyColor.BLUE.getColor());
				}
				public void mouseExited(MouseEvent e){
			         JLabel tmp=(JLabel)e.getSource();
			         tmp.setForeground(MyColor.BLACK.getColor());
				}
	           public void mouseClicked(MouseEvent e){
					//TODO
	        	   JLabel tmp=(JLabel)e.getSource();
			         tmp.setForeground(MyColor.RED.getColor());
	         
				}
			});
		}
		for(int i=0;i<5;i++){
			westsouthtexts[i].addMouseListener(new MouseAdapter(){
				public void mouseEntered(MouseEvent e){
			         JLabel tmp=(JLabel)e.getSource();
			         tmp.setForeground(MyColor.BLUE.getColor());
				}
				public void mouseExited(MouseEvent e){
			         JLabel tmp=(JLabel)e.getSource();
			         tmp.setForeground(MyColor.BLACK.getColor());
				}
	           public void mouseClicked(MouseEvent e){
					//TODO
	        	   JLabel tmp=(JLabel)e.getSource();
			         tmp.setForeground(MyColor.RED.getColor());
	             
				}
			});
		}
		for(int i=0;i<5;i++){
			westnorthtexts[i].addMouseListener(new MouseAdapter(){
				public void mouseEntered(MouseEvent e){
			         JLabel tmp=(JLabel)e.getSource();
			         tmp.setForeground(MyColor.BLUE.getColor());
				}
				public void mouseExited(MouseEvent e){
			         JLabel tmp=(JLabel)e.getSource();
			         tmp.setForeground(MyColor.BLACK.getColor());
				}
	           public void mouseClicked(MouseEvent e){
					//TODO
	        	   JLabel tmp=(JLabel)e.getSource();
			         tmp.setForeground(MyColor.RED.getColor());
	         
				}
			});
		}
		for(int i=0;i<5;i++){
			oceantexts[i].addMouseListener(new MouseAdapter(){
				public void mouseEntered(MouseEvent e){
			         JLabel tmp=(JLabel)e.getSource();
			         tmp.setForeground(MyColor.BLUE.getColor());
				}
				public void mouseExited(MouseEvent e){
			         JLabel tmp=(JLabel)e.getSource();
			         tmp.setForeground(MyColor.BLACK.getColor());
				}
	           public void mouseClicked(MouseEvent e){
					//TODO
	        	  JLabel tmp=(JLabel)e.getSource();
			      tmp.setForeground(MyColor.RED.getColor());
	           }
			});
		}	
	}
}
