package Data;

import java.io.EOFException;
import java.util.ArrayList;
import java.util.Hashtable;
import VO.TeamHotVO;
import VO.TeamInfoVO;
import VO.TeamMatchVO;
import VO.TeamNumberVO;
import VO.TeamRateVO;

public class TeamData_Impl implements TeamData{
	private static String teaminfopath="Serialization/matchfolder/teaminfo";
	private static String teammatchpath="Serialization/matchfolder/teammatch";
	private static String teamavernumberpath="Serialization/matchfolder/teamavernumber";
	private static String teamallnumberpath="Serialization/matchfolder/teamallnumber";
	private static String teamratepath="Serialization/matchfolder/teamrate";
	private static String teamseasonpath="Serialization/matchfolder/teamseason";
	private static String teamaverseasonpath="Serialization/matchfolder/teamaverseason";
	private static String teamseasonmedianpath="Serialization/matchfolder/teamseasonmedian";
	private static String teammedianpath="Serialization/matchfolder/teammedian";
	private static String teamvariancepath="Serialization/matchfolder/teamvariance";
	private static String teamseasonvaripath="Serialization/matchfolder/teamseasonvari";
	
	public static TeamData_Impl pdi;
	public static synchronized TeamData_Impl getInstance() {
		if (pdi == null)
			pdi = new TeamData_Impl();
		return pdi;
	}
	public TeamData_Impl(){
		@SuppressWarnings("unused")
		FileSerialization fs = FileSerialization.getInstance();
	}
	@SuppressWarnings("unchecked")
	@Override
	public Hashtable<String, ArrayList<TeamMatchVO>> getTeamMatch() {
		// TODO Auto-generated method stub
		try{
			return (Hashtable<String, ArrayList<TeamMatchVO>>) FileReadAndWriteBuffer
					.read_from_file(teammatchpath);
		}catch(EOFException e){
			return null;
		}
	}
	@SuppressWarnings("unchecked")
	@Override
	public Hashtable<String, TeamHotVO> getTeamSeasonVari() {
		// TODO Auto-generated method stub
		try{
			return (Hashtable<String, TeamHotVO>) FileReadAndWriteBuffer
					.read_from_file(teamseasonvaripath);
		}catch(EOFException e){
			return null;
		}
	}
	@SuppressWarnings("unchecked")
	@Override
	public Hashtable<String, TeamHotVO> getTeamSeasonMedian() {
		// TODO Auto-generated method stub
		try{
			return (Hashtable<String, TeamHotVO>) FileReadAndWriteBuffer
					.read_from_file(teamseasonmedianpath);
		}catch(EOFException e){
			return null;
		}
	}
	@SuppressWarnings("unchecked")
	@Override
	public Hashtable<String, TeamHotVO> getTeamSeasonAver() {
		// TODO Auto-generated method stub
		try{
			return (Hashtable<String, TeamHotVO>) FileReadAndWriteBuffer
					.read_from_file(teamaverseasonpath);
		}catch(EOFException e){
			return null;
		}
	}
	@SuppressWarnings("unchecked")
	@Override
	public Hashtable<String, Double> getTeamVari() {
		// TODO Auto-generated method stub
		try{
			return (Hashtable<String, Double>) FileReadAndWriteBuffer
					.read_from_file(teamvariancepath);
		}catch(EOFException e){
			return null;
		}
	}
	@SuppressWarnings("unchecked")
	@Override
	public Hashtable<String, Double> getTeamMedian() {
		// TODO Auto-generated method stub
		try{
			return (Hashtable<String, Double>) FileReadAndWriteBuffer
					.read_from_file(teammedianpath);
		}catch(EOFException e){
			return null;
		}
	}
	@SuppressWarnings("unchecked")
	@Override
	public Hashtable<String, Double> getTeamAver() {
		// TODO Auto-generated method stub
		try{
			return (Hashtable<String, Double>) FileReadAndWriteBuffer
					.read_from_file(teamseasonpath);
		}catch(EOFException e){
			return null;
		}
	}
	@SuppressWarnings("unchecked")
	@Override
	public Hashtable<String, TeamInfoVO> getTeamInfo() {
		// TODO Auto-generated method stub
		try{
			return (Hashtable<String, TeamInfoVO>) FileReadAndWriteBuffer
					.read_from_file(teaminfopath);
		}catch(EOFException e){
			return null;
		}
	}
	@SuppressWarnings("unchecked")
	@Override
	public Hashtable<String, TeamNumberVO> getTeamAllNumber() {
		// TODO Auto-generated method stub
		try{
			return (Hashtable<String, TeamNumberVO>) FileReadAndWriteBuffer
					.read_from_file(teamallnumberpath);
		}catch(EOFException e){
			return null;
		}
	}
	@SuppressWarnings("unchecked")
	@Override
	public Hashtable<String, TeamNumberVO> getTeamAverNumber() {
		// TODO Auto-generated method stub
		try{
			return (Hashtable<String, TeamNumberVO>) FileReadAndWriteBuffer
					.read_from_file(teamavernumberpath);
		}catch(EOFException e){
			return null;
		}
	}
	@SuppressWarnings("unchecked")
	@Override
	public Hashtable<String, TeamRateVO> getTeamRate() {
		// TODO Auto-generated method stub
		try{
			return (Hashtable<String, TeamRateVO>) FileReadAndWriteBuffer
					.read_from_file(teamratepath);
		}catch(EOFException e){
			return null;
		}
	}

}
