package UIComponent.Home;

import java.awt.Font;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;

import javax.swing.ImageIcon;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.SwingConstants;
import javax.swing.border.MatteBorder;

import UIComponent.MyColor;
import UIComponent.MyTable;

public class HomeMatchPanel extends JPanel{

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;

	JPanel panels[]=new JPanel[5];
	JLabel winnericons[]=new JLabel[5];
	JLabel losericons[]=new JLabel[5];
	JLabel winnernames[]=new JLabel[5];
	JLabel losernames[]=new JLabel[5];
	JLabel matchtime[]=new JLabel[5];
	MyTable scoretables[]=new MyTable[5];
	
	
	public HomeMatchPanel(){
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
			
			winnernames[i]=new JLabel("<HTML><U>"+"胜方：nop"+"<U><HTML>");
			winnernames[i].setForeground(MyColor.RED.getColor());
			winnernames[i].setFont(new Font("微软雅黑",Font.PLAIN,16));
			winnernames[i].setHorizontalAlignment(SwingConstants.CENTER);
			
			losernames[i]=new JLabel("<HTML><U>"+"负方：nop"+"<U><HTML>");
			losernames[i].setForeground(MyColor.BLACK.getColor());
			losernames[i].setFont(new Font("微软雅黑",Font.PLAIN,16));
			losernames[i].setHorizontalAlignment(SwingConstants.CENTER);
			
			matchtime[i]=new JLabel("时间:12-14");
			matchtime[i].setForeground(MyColor.BLACK.getColor());
			matchtime[i].setFont(new Font("微软雅黑",Font.PLAIN,16));
			matchtime[i].setHorizontalAlignment(SwingConstants.CENTER);
			
			scoretables[i]=new MyTable(new String[][]{{"85-112","27-25","29-31","13-25","16-31"}},new String[]{"总比分","第一场","第二场","第三场","第四场"},-1,-1){
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
			winnernames[i].addMouseListener(new MouseAdapter(){
				public void mouseClicked(MouseEvent e){
					JLabel tmp=(JLabel)e.getSource();
					
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
