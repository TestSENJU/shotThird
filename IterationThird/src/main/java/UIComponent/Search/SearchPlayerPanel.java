package UIComponent.Search;

import java.awt.Font;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;
import java.io.File;
import java.util.ArrayList;

import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.SwingConstants;
import javax.swing.table.DefaultTableModel;

import logic.PlayerBL;
import logic.PlayerBL_Impl;
import UIComponent.MyColor;
import UIComponent.MyComboBox;
import UIComponent.MyScrollPane;
import UIComponent.MyTable;
import VO.PlayerShortVO;

public class SearchPlayerPanel extends JPanel{

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;

	JLabel location,team,beginner,isAtWork;
	MyComboBox locationBox,teamBox,isAtWorkBox;
	JLabel alphabeta[]=new JLabel[27];
	private String begin="无";
	MyTable playerTable;
	DefaultTableModel model;
	MyScrollPane jsp;
	JLabel confirm;
	private PlayerBL playerbl=PlayerBL_Impl.getInstance();
	public SearchPlayerPanel(){
		initComponent();
		initPanel();
		addComponent();
		setListener();
	}
	private void initComponent() {
		model=new DefaultTableModel(null,new String[]{"头像","姓名","球队","位置","是否现役"}){
			/**
			 * 
			 */
			private static final long serialVersionUID = 1L;

			public boolean isCellEditable(int row,int column){
				return false;
			}
		};
		playerTable=new MyTable(model,1,2) {  

			private static final long serialVersionUID = 1L;

			@SuppressWarnings({ "unchecked", "rawtypes" })
			public Class getColumnClass(int column) {
				
				return getValueAt(0, column).getClass();  
				} 
			};
			playerTable.setRowHeight(60);
		jsp=new MyScrollPane(playerTable);
		jsp.setBounds(20,90,860,490);
		
		beginner=new JLabel("首字母");
		beginner.setForeground(MyColor.BLUE.getColor());
		beginner.setFont(new Font("黑体",Font.PLAIN,14));
		beginner.setBounds(0, 40, 60, 40);
		
		location=new JLabel("位置");
		location.setForeground(MyColor.BLUE.getColor());
		location.setFont(new Font("黑体",Font.PLAIN,14));
		location.setBounds(10, 0, 60, 40);
		
		confirm=new JLabel("筛选");
		confirm.setForeground(MyColor.BLUE.getColor());
		confirm.setFont(new Font("黑体",Font.PLAIN,14));
		confirm.setBounds(530, 0, 60, 40);
		
		locationBox=new MyComboBox(new String[]{" ","前锋","中锋","后卫"});
		locationBox.setBounds(70, 5, 60, 25);
		
		team=new JLabel("球队");
		team.setForeground(MyColor.BLUE.getColor());
		team.setFont(new Font("黑体",Font.PLAIN,14));
		team.setBounds(150, 0, 60, 40);
		
		teamBox=new MyComboBox(new String[]{" ","圣安东尼奥马刺队","孟菲斯灰熊队","达拉斯小牛队","休斯敦火箭队","新奥尔良鹈鹕队"
				,"明尼苏达森林狼队","丹佛掘金队","犹他爵士队","波特兰开拓者队","俄克拉荷马雷霆队"
				,"萨克拉门托国王队","菲尼克斯太阳队","洛杉矶湖人队","洛杉矶快船队 ","金州勇士队"
				,"迈阿密热火队","奥兰多魔术队","亚特兰大老鹰队","华盛顿奇才队","夏洛特黄蜂队"
				,"底特律活塞队","印第安纳步行者队","克里夫兰骑士队","芝加哥公牛队","密尔沃基雄鹿队"
				,"波士顿凯尔特人队","费城76人队","纽约尼克斯队","布鲁克林篮网队","多伦多猛龙队"});
		teamBox.setBounds(210, 5, 120, 25);
		
		isAtWork=new JLabel("是否现役");
		isAtWork.setForeground(MyColor.BLUE.getColor());
		isAtWork.setFont(new Font("黑体",Font.PLAIN,14));
		isAtWork.setBounds(350, 0, 60, 40);
		
		isAtWorkBox=new MyComboBox(new String[]{" ","现役","退役"});
		isAtWorkBox.setBounds(410, 5, 60, 25);
		
		
		for(int i=0;i<alphabeta.length;i++){
			if(i==0){
				alphabeta[i]=new JLabel("无");
			}else{
				alphabeta[i]=new JLabel((char) ('A' + (i -1)% 26) +"");	
			}
			alphabeta[i].setForeground(MyColor.BLACK.getColor());
			alphabeta[i].setFont(new Font("微软雅黑",Font.PLAIN,12));
			alphabeta[i].setOpaque(true);
			alphabeta[i].setBackground(MyColor.WHITE.getColor());
			alphabeta[i].setBounds(60+i*30, 40, 30, 40);
			alphabeta[i].setHorizontalAlignment(SwingConstants.CENTER);
		}
	}
   
	private void initPanel() {
		
		this.setLayout(null);
		this.setBackground(MyColor.WHITE.getColor());

	}
	private ArrayList<String[]> getStrs(ArrayList<PlayerShortVO>list){
		ArrayList<String[]> strs=new ArrayList<String[]>();
		
		for(int i=0;i<list.size();i++){
			File f=new File("img/"+list.get(i).getPlayername()+".png");
			Object[] ob=new Object[4];
			if(f.exists()){
//				String ss[]=list.get(i).getPlayername();
				
			}else{
				//TODO
			}
	
		}
		return strs;
	}
	 private void addComponent() {
		ArrayList<PlayerShortVO>playerlist=playerbl.getPlayersSearch("", null, "", true);
			
		 this.add(beginner);
		 this.add(location);
		 this.add(locationBox);
		 this.add(isAtWork);
		 this.add(isAtWorkBox);
		 this.add(team);
		 this.add(confirm);
		 this.add(teamBox);
		 this.add(jsp);
		 for(int i=0;i<alphabeta.length;i++){
				this.add(alphabeta[i]);
			}
		}
    private void setListener() {
    	confirm.addMouseListener(new MouseAdapter(){
    		public void mouseClicked(MouseEvent e){
    			
    		}
    		public void mouseEntered(MouseEvent e){
    			confirm.setForeground(MyColor.BLUE.getColor());
    		}
    		public void mouseExited(MouseEvent e){
    			confirm.setForeground(MyColor.BLACK.getColor());
    		}
    	});
    	playerTable.addMouseListener(new MouseAdapter(){
    		public void mouseClicked(MouseEvent e){
    			
    		}
    		public void mouseEntered(MouseEvent e){
    			
    		}
    	});
    	locationBox.addActionListener(new ActionListener(){
    		public void actionPerformed(ActionEvent e){
    			String loca=(String) locationBox.getSelectedItem();
    			String team=(String)teamBox.getSelectedItem();
    			String isAtWork=(String)isAtWorkBox.getSelectedItem();
    		}
    	});
    	isAtWorkBox.addActionListener(new ActionListener(){
    		public void actionPerformed(ActionEvent e){
    			String loca=(String) locationBox.getSelectedItem();
    			String team=(String)teamBox.getSelectedItem();
    			String isAtWork=(String)isAtWorkBox.getSelectedItem();
    		}
    	});
    	teamBox.addActionListener(new ActionListener(){
    		public void actionPerformed(ActionEvent e){
    			String loca=(String) locationBox.getSelectedItem();
    			String team=(String)teamBox.getSelectedItem();
    			String isAtWork=(String)isAtWorkBox.getSelectedItem();
    		}
    	});
    	
    	for(int i=0;i<alphabeta.length;i++){
    		alphabeta[i].addMouseListener(new MouseAdapter(){
    			
    			public void mouseClicked(MouseEvent e){
    				   JLabel tmp=(JLabel)e.getSource();
    				   begin="无";
    				   for(int i=0;i<alphabeta.length;i++){
    					   alphabeta[i].setBackground(MyColor.WHITE.getColor());
    				   }
    			       tmp.setBackground(MyColor.LIGHTBLUE.getColor());
    			   	String loca=(String) locationBox.getSelectedItem();
        			String team=(String)teamBox.getSelectedItem();
        			String isAtWork=(String)isAtWorkBox.getSelectedItem();
        			begin=tmp.getText();
    			}
    		});
    	}
    }
}
