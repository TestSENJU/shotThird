package UIComponent.Home;

import java.awt.Font;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;

import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.SwingConstants;
import javax.swing.border.MatteBorder;

import UIComponent.MyColor;
import UIComponent.statics.StaticsTeamPanel;

public class HomePanel extends JPanel{
/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
JLabel dayplayer,seasonplayer,match,dayteam,seasonteam,improveplayer;
HomeDayPlayerPanel dayplayerpanel;
HomeSeasonPlayerPanel seasonplayerpanel;
HomeDayTeamPanel dayteampanel;
HomeSeasonTeamPanel seasonteampanel;
HomeMatchPanel matchpanel;
HomeMostImprovedPanel improvedpanel;

public HomePanel(){
	initComponent();
	addComponent();
	initPanel();
	setListener();
	
}
public void initComponent(){

	match=new JLabel("最近比赛");
	match.setForeground(MyColor.BLUE.getColor());
	match.setFont(new Font("黑体",Font.PLAIN,16));
	match.setBounds(10,0,100,30);
	match.setOpaque(true);
	match.setBackground(MyColor.LIGHTBLUE.getColor());
	match.setHorizontalAlignment(SwingConstants.CENTER);
	
	dayplayer=new JLabel("当天热点球员");
	dayplayer.setForeground(MyColor.BLUE.getColor());
	dayplayer.setFont(new Font("黑体",Font.PLAIN,16));
	dayplayer.setBounds(115,0,100,30);
	dayplayer.setOpaque(true);
	dayplayer.setBackground(MyColor.WHITE.getColor());
	dayplayer.setHorizontalAlignment(SwingConstants.CENTER);
	
	seasonplayer=new JLabel("赛季热点球员");
	seasonplayer.setForeground(MyColor.BLUE.getColor());
	seasonplayer.setFont(new Font("黑体",Font.PLAIN,16));
	seasonplayer.setBounds(220,0,100,30);
	seasonplayer.setOpaque(true);
	seasonplayer.setBackground(MyColor.WHITE.getColor());
	seasonplayer.setHorizontalAlignment(SwingConstants.CENTER);
	
	dayteam=new JLabel("当天热点球队");
	dayteam.setForeground(MyColor.BLUE.getColor());
	dayteam.setFont(new Font("黑体",Font.PLAIN,16));
	dayteam.setBounds(325,0,100,30);
	dayteam.setOpaque(true);
	dayteam.setBackground(MyColor.WHITE.getColor());
	dayteam.setHorizontalAlignment(SwingConstants.CENTER);
	
	seasonteam=new JLabel("赛季热点球队");
	seasonteam.setForeground(MyColor.BLUE.getColor());
	seasonteam.setFont(new Font("黑体",Font.PLAIN,16));
	seasonteam.setBounds(430,0,100,30);
	seasonteam.setOpaque(true);
	seasonteam.setBackground(MyColor.WHITE.getColor());
	seasonteam.setHorizontalAlignment(SwingConstants.CENTER);
	
	improveplayer=new JLabel("进步最快球员");
	improveplayer.setForeground(MyColor.BLUE.getColor());
	improveplayer.setFont(new Font("黑体",Font.PLAIN,16));
	improveplayer.setBounds(535,0,100,30);
	improveplayer.setOpaque(true);
	improveplayer.setBackground(MyColor.WHITE.getColor());
	improveplayer.setHorizontalAlignment(SwingConstants.CENTER);
	
	
	dayplayerpanel=new HomeDayPlayerPanel();
	dayplayerpanel.setBorder(new MatteBorder(1,0,1,1,MyColor.GREY.getColor()));
	dayplayerpanel.setBounds(0,30 , 900, 550);
	
	seasonplayerpanel=new HomeSeasonPlayerPanel();
	seasonplayerpanel.setBorder(new MatteBorder(1,0,1,1,MyColor.GREY.getColor()));
	seasonplayerpanel.setBounds(0, 30, 900, 550);
	
	dayteampanel=new HomeDayTeamPanel();
	dayteampanel.setBounds(0, 30, 900,550);
	dayteampanel.setBorder(new MatteBorder(1,0,1,1,MyColor.GREY.getColor()));

	seasonteampanel=new HomeSeasonTeamPanel();
	seasonteampanel.setBounds(0, 30, 900,550);
	seasonteampanel.setBorder(new MatteBorder(1,0,1,1,MyColor.GREY.getColor()));
	
	matchpanel=new HomeMatchPanel();
	matchpanel.setBounds(0, 30, 900,550);
	matchpanel.setBorder(new MatteBorder(1,0,1,1,MyColor.GREY.getColor()));
	
	improvedpanel=new HomeMostImprovedPanel();
	improvedpanel.setBounds(0,30,900,550);
	improvedpanel.setBorder(new MatteBorder(1,0,1,1,MyColor.GREY.getColor()));
	
}
public void addComponent(){
	this.add(matchpanel);
	this.add(dayplayer);
	this.add(seasonplayer);
	this.add(match);
	this.add(dayteam);
	this.add(seasonteam);
	this.add(improveplayer);
}
public void initPanel(){
	this.setBounds(0, 20, 900, 580);
	this.setBackground(MyColor.WHITE.getColor());
	this.setLayout(null);
}
public void setListener(){
	improveplayer.addMouseListener(new MouseAdapter(){
		public void mouseEntered(MouseEvent e){
			improveplayer.setForeground(MyColor.BLACK.getColor());
		}
		public void mouseExited(MouseEvent e){
			improveplayer.setForeground(MyColor.BLUE.getColor());
		}
		public void mouseClicked(MouseEvent e){
			dayplayer.setBackground(MyColor.WHITE.getColor());
			dayteam.setBackground(MyColor.WHITE.getColor());
			seasonteam.setBackground(MyColor.WHITE.getColor());
			seasonplayer.setBackground(MyColor.WHITE.getColor());
			match.setBackground(MyColor.WHITE.getColor());
			
			improveplayer.setBackground(MyColor.LIGHTBLUE.getColor());
			
			if(getComponentAt(100, 30)instanceof HomeMostImprovedPanel){
				
			}else{
				remove(getComponentAt(100, 30));
				add(improvedpanel);
				repaint();
			}
		}
	});
	dayplayer.addMouseListener(new MouseAdapter(){
		public void mouseEntered(MouseEvent e){
			dayplayer.setForeground(MyColor.BLACK.getColor());
		}
		public void mouseExited(MouseEvent e){
			dayplayer.setForeground(MyColor.BLUE.getColor());
		}
		public void mouseClicked(MouseEvent e){
			dayplayer.setBackground(MyColor.WHITE.getColor());
			dayteam.setBackground(MyColor.WHITE.getColor());
			seasonteam.setBackground(MyColor.WHITE.getColor());
			seasonplayer.setBackground(MyColor.WHITE.getColor());
			match.setBackground(MyColor.WHITE.getColor());
			
			dayplayer.setBackground(MyColor.LIGHTBLUE.getColor());
			
			if(getComponentAt(100, 30)instanceof HomeDayPlayerPanel){
				
			}else{
				remove(getComponentAt(100, 30));
				add(dayplayerpanel);
				repaint();
			}
		}
	});
	dayteam.addMouseListener(new MouseAdapter(){
		public void mouseEntered(MouseEvent e){
			dayteam.setForeground(MyColor.BLACK.getColor());
		}
		public void mouseExited(MouseEvent e){
			dayteam.setForeground(MyColor.BLUE.getColor());
		}
		public void mouseClicked(MouseEvent e){
			dayplayer.setBackground(MyColor.WHITE.getColor());
			dayteam.setBackground(MyColor.WHITE.getColor());
			seasonteam.setBackground(MyColor.WHITE.getColor());
			seasonplayer.setBackground(MyColor.WHITE.getColor());
			match.setBackground(MyColor.WHITE.getColor());
			
			dayteam.setBackground(MyColor.LIGHTBLUE.getColor());
		if(getComponentAt(100, 30)instanceof HomeDayTeamPanel){
				
			}else{
				remove(getComponentAt(100, 30));
				add(dayteampanel);
				repaint();
			}
		}
	});
	seasonplayer.addMouseListener(new MouseAdapter(){
		public void mouseEntered(MouseEvent e){
			seasonplayer.setForeground(MyColor.BLACK.getColor());
		}
		public void mouseExited(MouseEvent e){
			seasonplayer.setForeground(MyColor.BLUE.getColor());
		}
		public void mouseClicked(MouseEvent e){
			dayplayer.setBackground(MyColor.WHITE.getColor());
			dayteam.setBackground(MyColor.WHITE.getColor());
			seasonteam.setBackground(MyColor.WHITE.getColor());
			seasonplayer.setBackground(MyColor.WHITE.getColor());
			match.setBackground(MyColor.WHITE.getColor());
			
			seasonplayer.setBackground(MyColor.LIGHTBLUE.getColor());
			
	if(getComponentAt(100, 30)instanceof HomeSeasonPlayerPanel){
				
			}else{
				remove(getComponentAt(100, 30));
				add(seasonplayerpanel);
				repaint();
			}
		}
	});
	seasonteam.addMouseListener(new MouseAdapter(){
		public void mouseEntered(MouseEvent e){
			seasonteam.setForeground(MyColor.BLACK.getColor());
		}
		public void mouseExited(MouseEvent e){
			seasonteam.setForeground(MyColor.BLUE.getColor());
		}
		public void mouseClicked(MouseEvent e){
			dayplayer.setBackground(MyColor.WHITE.getColor());
			dayteam.setBackground(MyColor.WHITE.getColor());
			seasonteam.setBackground(MyColor.WHITE.getColor());
			seasonplayer.setBackground(MyColor.WHITE.getColor());
			match.setBackground(MyColor.WHITE.getColor());
			
			seasonteam.setBackground(MyColor.LIGHTBLUE.getColor());
			
	if(getComponentAt(100, 30)instanceof HomeSeasonTeamPanel){
				
			}else{
				remove(getComponentAt(100, 30));
				add(seasonteampanel);
				repaint();
			}
		}
	});
	match.addMouseListener(new MouseAdapter(){
		public void mouseEntered(MouseEvent e){
			match.setForeground(MyColor.BLACK.getColor());
		}
		public void mouseExited(MouseEvent e){
			match.setForeground(MyColor.BLUE.getColor());
		}
		public void mouseClicked(MouseEvent e){
			dayplayer.setBackground(MyColor.WHITE.getColor());
			dayteam.setBackground(MyColor.WHITE.getColor());
			seasonteam.setBackground(MyColor.WHITE.getColor());
			seasonplayer.setBackground(MyColor.WHITE.getColor());
			match.setBackground(MyColor.WHITE.getColor());
			
			match.setBackground(MyColor.LIGHTBLUE.getColor());
			
	if(getComponentAt(100, 30)instanceof HomeMatchPanel){
				
			}else{
				remove(getComponentAt(100, 30));
				add(matchpanel);
				repaint();
			}
		}
	});
}
}
