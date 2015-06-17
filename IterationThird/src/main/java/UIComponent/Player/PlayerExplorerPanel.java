package UIComponent.Player;

import java.awt.Font;
import java.awt.Image;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;
import java.util.ArrayList;

import javax.swing.ImageIcon;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JScrollPane;
import javax.swing.JTextField;
import javax.swing.border.MatteBorder;
import javax.swing.table.DefaultTableModel;
import javax.swing.table.TableColumnModel;

import logic.PlayerBL;
import logic.PlayerBL_Impl;
import UIComponent.MyColor;
import UIComponent.MyScrollPane;
import UIComponent.MyTable;
import VO.PlayerShortVO;

public class PlayerExplorerPanel extends JPanel{
	private static final long serialVersionUID = 1L;
	private ArrayList<PlayerShortVO>list;
	private PlayerBL playerdata=PlayerBL_Impl.getInstance();
	JLabel title;
	JScrollPane jsp;
	MyTable table;
	DefaultTableModel model;
	JTextField text;
	JLabel search,showall;
	JPanel left;
	JLabel tip;
	private String titlename[]=new String[]{"头像","姓名","球队","位置"};
	private ArrayList<String>idlist=new ArrayList<String>();
	public PlayerExplorerPanel(){
		initComponent();
		addComponent();
		setListener();
	}
	public void initComponent(){
		title=new JLabel("球员列表");
		title.setFont(new Font("黑体",Font.PLAIN,20));
		title.setForeground(MyColor.BLUE.getColor());
		title.setBounds(15,0,120,50);
		
		text=new JTextField(5);
		text.setBounds(200, 15, 110, 25);
		
		search=new JLabel("搜索");
		search.setForeground(MyColor.BLUE.getColor());
		search.setFont(new Font("黑体",Font.PLAIN,12));
		search.setBounds(320, 15,30,25);
		showall=new JLabel("显示所有");
		showall.setForeground(MyColor.BLUE.getColor());
		showall.setFont(new Font("黑体",Font.PLAIN,12));
		showall.setBounds(350, 15,50,25);
		
		tip=new JLabel("选择左侧列表中的球员来显示详细信息");
		tip.setForeground(MyColor.BLUE.getColor());
		tip.setFont(new Font("黑体",Font.PLAIN,16));
		tip.setBounds(550, 275,300,25);

		model=new DefaultTableModel(null, titlename){
			/**
			 * 
			 */
			private static final long serialVersionUID = 1L;

			public boolean isCellEditable(int row,int column){
				return false;
			}
		};
	initTable();
		table=new MyTable(model,-1,-1) {  

			private static final long serialVersionUID = 1L;

			@SuppressWarnings({ "unchecked", "rawtypes" })
			public Class getColumnClass(int column) {
				
				return getValueAt(0, column).getClass();  
				} 
			};
		
		      TableColumnModel tcm = table.getColumnModel();
		        tcm.getColumn(0).setPreferredWidth(100);
		        tcm.getColumn(1).setPreferredWidth(150);
		        tcm.getColumn(2).setPreferredWidth(75);
		        tcm.getColumn(3).setPreferredWidth(75);
		        table.setRowHeight(50);

		jsp=new MyScrollPane(table);
		jsp.setBounds(0, 50, 400,510);	
		
		left=new JPanel();
		left.setBounds(0, 0, 400, 580);
		left.setLayout(null);
		left.setBackground(MyColor.WHITE.getColor());
		left.setBorder(new MatteBorder(0,1,1,1,MyColor.GREY.getColor()));
		
		this.setBackground(MyColor.WHITE.getColor());
		this.setLayout(null);
	}
	public void addComponent(){
		left.add(title);
		left.add(text);
		left.add(search);
		left.add(showall);
		left.add(jsp);
		this.add(left);
		this.add(tip);
	}
	public void initTable(){
		list=playerdata.getPlayerList();
		for(int i=0;i<list.size();i++){
			Object[] ob=new Object[4];
			ob[0]=new ImageIcon("playerHead/"+list.get(i).getPlayername()+".png")
			.getImage().getScaledInstance(100, 50, Image.SCALE_DEFAULT);
			ob[1]=list.get(i).getPlayername();
			ob[2]=list.get(i).getTeam();
			ob[3]=list.get(i).getLocation();
			model.addRow(ob);
			idlist.add(list.get(i).getPlayername());
		}
	}
	public void setListener(){
		table.addMouseListener(new MouseAdapter(){
			public void mouseClicked(MouseEvent e){
				int row=table.getSelectedRow();
				String playerName=(String)table.getValueAt(row, 1);
				if(getComponentAt(550,275)instanceof JLabel){
					PlayerDetailPanel panel=new PlayerDetailPanel(list.get(row),playerName);
					panel.setBounds(400,0,500, 580);
					remove(tip);
					add(panel);
					repaint();
				}else if(getComponentAt(550,275)instanceof PlayerDetailPanel){
					PlayerDetailPanel player=(PlayerDetailPanel)getComponentAt(550,275);
					if(!playerName.equals(player.getName())){
						PlayerDetailPanel panel=new PlayerDetailPanel(list.get(row),playerName);
						panel.setBounds(400,0,500, 580);
						remove(getComponentAt(550,275));
						add(panel);
						repaint();
					}
				}
				
				//TODO
			}
		});
		showall.addMouseListener(new MouseAdapter(){
			public void mouseEntered(MouseEvent e){
				showall.setForeground(MyColor.BLACK.getColor());
			}
			public void mouseExited(MouseEvent e){
				showall.setForeground(MyColor.BLUE.getColor());
			}
			public void mouseClicked(MouseEvent e){
				idlist=new ArrayList<String>();
				for(int i=model.getRowCount()-1;i>=0;i--){
						model.removeRow(i);
				}
			initTable();
			}
		});
		search.addMouseListener(new MouseAdapter(){
			public void mouseEntered(MouseEvent e){
				search.setForeground(MyColor.BLACK.getColor());
			}
			public void mouseExited(MouseEvent e){
				search.setForeground(MyColor.BLUE.getColor());
			}
			public void mouseClicked(MouseEvent e){
				//TODO
				String playerName=text.getText();
				if(playerName!=null){
					if(idlist.contains(playerName)){
						for(int i=model.getRowCount()-1;i>=0;i--){
							if(!model.getValueAt(i, 1).equals(playerName)){
								model.removeRow(i);
							}
						}
						
					}else{
						ArrayList<String>players=new ArrayList<String>();
						for(String key:idlist){
							if(key.contains(playerName)){
								players.add(key);
							}
						}
						if(players.size()==0){
							
						}else{
							for(int i=model.getRowCount()-1;i>=0;i--){
								if(!players.contains(model.getValueAt(i, 1))){
									model.removeRow(i);
								}
						}
						}
					}
				}
		
			}
		});
	}
}
