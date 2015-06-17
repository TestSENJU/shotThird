package Data;

import java.io.EOFException;
import java.util.ArrayList;
import java.util.Hashtable;

import VO.PlayerHotVO;
import VO.PlayerInfoVO;
import VO.PlayerMatchVO;
import VO.PlayerNumberVO;
import VO.PlayerRateVO;
import VO.PlayerShortVO;
import VO.TeamHotVO;

public class PlayerData_Impl implements PlayerData{
	private static String playerinfopath="Serialization/matchfolder/playerinfo";
	private static String playerallnumberpath="Serialization/matchfolder/playerallnumber";
	private static String playeravernumberpath="Serialization/matchfolder/playeravernumber";
	private static String  playerratepath="Serialization/matchfolder/playerrate";
    private static String playeraverpath="Serialization/matchfolder/playeraver";
	private static String playeraverseasonpath="Serialization/matchfolder/playeraverseason";
	private static String playeraverteampath="Serialization/matchfolder/playeraverteam";
	private static String  playermedianpath="Serialization/matchfolder/ playermedian";
	private static String playermedianteampath="Serialization/matchfolder/playermedianteam";
	private static String playermedianseasonpath="Serialization/matchfolder/playermedianseason";
	private static String playervariseasonpath="Serialization/matchfolder/playervariseason";
	private static String playervariteampath="Serialization/matchfolder/playervariteam";
	private static String playermatchpath="Serialization/matchfolder/playermatch";
	private static String playershortpath="Serialization/matchfolder/playershort";
	
	public static PlayerData_Impl pdi;
	public static synchronized PlayerData_Impl getInstance() {
		if (pdi == null)
			pdi = new PlayerData_Impl();
		return pdi;
	}
	public PlayerData_Impl(){
		@SuppressWarnings("unused")
		FileSerialization fs = FileSerialization.getInstance();
	}
	
	@SuppressWarnings("unchecked")
	@Override
	public Hashtable<String, PlayerShortVO> getPlayerShort() {
		// TODO Auto-generated method stub
		try{
			return (Hashtable<String, PlayerShortVO>) FileReadAndWriteBuffer
					.read_from_file(playershortpath);
		}catch(EOFException e){
			return null;
		}
	}
	@SuppressWarnings("unchecked")
	@Override
	public Hashtable<String, PlayerInfoVO> getPlayerinfo() {
		// TODO Auto-generated method stub
		try{
			return (Hashtable<String, PlayerInfoVO>) FileReadAndWriteBuffer
					.read_from_file(playerinfopath);
		}catch(EOFException e){
			return null;
		}
	}
	@SuppressWarnings("unchecked")
	@Override
	public Hashtable<String, PlayerNumberVO> getPlayerAllnumber() {
		// TODO Auto-generated method stub
		try{
			return (Hashtable<String, PlayerNumberVO>) FileReadAndWriteBuffer
					.read_from_file(playerallnumberpath);
		}catch(EOFException e){
			return null;
		}
	}
	@SuppressWarnings("unchecked")
	@Override
	public Hashtable<String, PlayerNumberVO> getPlayerAverNumber() {
		// TODO Auto-generated method stub
		try{
			return (Hashtable<String, PlayerNumberVO>) FileReadAndWriteBuffer
					.read_from_file(playeravernumberpath);
		}catch(EOFException e){
			return null;
		}
	}
	@SuppressWarnings("unchecked")
	public Hashtable<String, PlayerRateVO> getPlayerRate() {
		// TODO Auto-generated method stub
		try{
			return (Hashtable<String, PlayerRateVO>) FileReadAndWriteBuffer
					.read_from_file(playerratepath);
		}catch(EOFException e){
			return null;
		}
	}
	@SuppressWarnings("unchecked")
	@Override
	public Hashtable<String, Double> getPlayerAver() {
		// TODO Auto-generated method stub
		try{
			return (Hashtable<String, Double>) FileReadAndWriteBuffer
					.read_from_file(playeraverpath);
		}catch(EOFException e){
			return null;
		}
	}
	@SuppressWarnings("unchecked")
	@Override
	public Hashtable<String, PlayerHotVO> getPlayerAverSeason() {
		// TODO Auto-generated method stub
		try{
			return (Hashtable<String, PlayerHotVO>) FileReadAndWriteBuffer
					.read_from_file(playeraverseasonpath);
		}catch(EOFException e){
			return null;
		}
	}
	@SuppressWarnings("unchecked")
	@Override
	public Hashtable<String, TeamHotVO> getPlayerAverTeam() {
		// TODO Auto-generated method stub
		try{
			return (Hashtable<String, TeamHotVO>) FileReadAndWriteBuffer
					.read_from_file(playeraverteampath);
		}catch(EOFException e){
			return null;
		}
	}
	@SuppressWarnings("unchecked")
	@Override
	public Hashtable<String, Double> getPlayerMedian() {
		// TODO Auto-generated method stub
		try{
			return (Hashtable<String, Double>) FileReadAndWriteBuffer
					.read_from_file(playermedianpath);
		}catch(EOFException e){
			return null;
		}
	}
	@SuppressWarnings("unchecked")
	@Override
	public Hashtable<String, TeamHotVO> getPlayerMedianTeam() {
		// TODO Auto-generated method stub
			try{
			return (Hashtable<String, TeamHotVO>) FileReadAndWriteBuffer
					.read_from_file(playermedianteampath);
		}catch(EOFException e){
			return null;
		}
	}
	@SuppressWarnings("unchecked")
	@Override
	public Hashtable<String, PlayerHotVO> getPlayerMedianSeason() {
		// TODO Auto-generated method stub
		try{
			return (Hashtable<String, PlayerHotVO>) FileReadAndWriteBuffer
					.read_from_file(playermedianseasonpath);
		}catch(EOFException e){
			return null;
		}
	}
	@SuppressWarnings("unchecked")
	@Override
	public Hashtable<String, TeamHotVO> getPlayerVariTeam() {
		// TODO Auto-generated method stub
		try{
			return (Hashtable<String, TeamHotVO>) FileReadAndWriteBuffer
					.read_from_file(playervariteampath);
		}catch(EOFException e){
			return null;
		}
	}
	@SuppressWarnings("unchecked")
	@Override
	public Hashtable<String, PlayerHotVO> getPlayerVariSeason() {
		// TODO Auto-generated method stub
		try{
			return (Hashtable<String, PlayerHotVO>) FileReadAndWriteBuffer
					.read_from_file(playervariseasonpath);
		}catch(EOFException e){
			return null;
		}
	}
	@SuppressWarnings("unchecked")
	@Override
	public Hashtable<String, ArrayList<PlayerMatchVO>> getPlayerMatch() {
		// TODO Auto-generated method stub
		try{
			return (Hashtable<String, ArrayList<PlayerMatchVO>>) FileReadAndWriteBuffer
					.read_from_file(playermatchpath);
		}catch(EOFException e){
			return null;
		}
	}

}
