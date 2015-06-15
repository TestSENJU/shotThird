package UIComponent.Match;

import javax.swing.JLabel;
import javax.swing.JPanel;

import logic.MatchBL;
import logic.MatchBL_Impl;

public class MatchKingPanel extends JPanel{

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;

	JLabel score,lanban,zhugong;
	private MatchBL matchbl=MatchBL_Impl.getInstance();
	private String matchid;
	
	public MatchKingPanel(String id){
		this.matchid=id;
		addComponent();
		setListener();
		
	}
	public void addComponent(){
		score=new JLabel("");
		lanban=new JLabel("");
		zhugong=new JLabel("");
		
	}
	public void setListener(){
		
	}
}
