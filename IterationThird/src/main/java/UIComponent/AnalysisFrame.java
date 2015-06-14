package UIComponent;

import java.awt.Color;
import java.awt.FlowLayout;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;
import java.awt.event.MouseMotionAdapter;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.MatteBorder;

import UIComponent.Player.PlayerAnalysisPanel;
import UIComponent.Team.TeamAnalysisPanel;

public class AnalysisFrame extends JFrame{

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
/**
 * 
 * @param type
 * 0球员
 * 1球队
 * @param id
 * 球员id
 * 球队缩写名
 */
	JPanel title;
	CloseButton closeButton;
	MiniButton miniButton;
	PlayerAnalysisPanel playerpanel;
	TeamAnalysisPanel teampanel;
	private int xx, yy;
	private boolean isDraging = false;
	
	public AnalysisFrame(int type,String id){
		playerpanel=new PlayerAnalysisPanel(id);
		teampanel=new TeamAnalysisPanel(id);
		
		miniButton=new MiniButton();
		closeButton=new CloseButton();
		closeButton.addMouseListener(new MouseAdapter(){
			public void mouseClicked(MouseEvent e){
				dispose();	
			}
		});
		miniButton.addMouseListener(new MouseAdapter(){
			public void mouseClicked(MouseEvent e){
				setExtendedState(JFrame.ICONIFIED);
			}
		});
		
		title=new JPanel();
		title.setBackground(Color.white);
		title.setBounds(0, 0, 900, 20);
		title.setLayout(new FlowLayout(FlowLayout.RIGHT,0,0));  
		title.setBorder(new MatteBorder(1,1,0,1,MyColor.GREY.getColor()));
		
		title.add(miniButton);
		title.add(closeButton);
		
		this.add(title);
		if(type==0){
			this.add(playerpanel);
		}else if(type==1){
			this.add(teampanel);
		}
		
		this.setSize(900, 600);	
		this.setLayout(null);
		this.setLocationRelativeTo(null);
		this.setUndecorated(true);
		this.setVisible(true);
		
		this.addMouseListener(new MouseAdapter() {
				 public void mousePressed(MouseEvent e) {

				isDraging = true;
				xx = e.getX();
				yy = e.getY();
				 }

				 public void mouseReleased(MouseEvent e) {
				isDraging = false;
				 }
				 });
		this.addMouseMotionListener(new MouseMotionAdapter() {
				 public void mouseDragged(MouseEvent e) {

				if (isDraging) {
				 int left = getLocation().x;
				 int top =getLocation().y;
				setLocation(left + e.getX() - xx, top + e.getY() - yy);
				} 
				 }
				 });
	}
}
