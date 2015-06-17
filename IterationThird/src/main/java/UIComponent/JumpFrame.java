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

public class JumpFrame extends JFrame{

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	
	JPanel title;
	CloseButton closeButton;
	MiniButton miniButton;
	private int xx, yy;
	private boolean isDraging = false;
	
	public JumpFrame(JPanel jp){
		addComponent(jp);
		setListener();
	}
	public void open(){
		this.setVisible(true);
	}
	public void addComponent(JPanel jp){
		miniButton=new MiniButton();
		closeButton=new CloseButton();
		
		title=new JPanel();
		title.setBackground(Color.white);
		title.setBounds(0, 0, 500, 20);
		title.setLayout(new FlowLayout(FlowLayout.RIGHT,0,0));  
		title.setBorder(new MatteBorder(1,1,0,1,MyColor.GREY.getColor()));

		title.add(miniButton);
		title.add(closeButton);
		
		this.add(title);
		this.add(jp);
		
		this.setSize(500, 600);	
		this.setLayout(null);
		this.setLocationRelativeTo(null);
		this.setUndecorated(true);
		this.setVisible(false);
		
	}
	public static void main(String args[]){
		JumpFrame frame=new JumpFrame(new PlayerAnalysisPanel("a"));
		frame.open();
	}
	public void setListener(){
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
			 int top = getLocation().y;
			 setLocation(left + e.getX() - xx, top + e.getY() - yy);
			} 
			 }
			 });
	}
}
