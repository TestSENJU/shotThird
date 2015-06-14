package logic;

import java.util.ArrayList;

import VO.PlayerHotVO;
import VO.PlayerInfoVO;
import VO.PlayerMatchVO;
import VO.PlayerNumberVO;
import VO.PlayerRateVO;
import VO.PlayerShortVO;
import VO.PlayerVO;

public class PlayerBL_Impl implements PlayerBL{
	  private static PlayerBL_Impl instance ;
	    private PlayerBL_Impl() {

	    }
	    public static synchronized PlayerBL_Impl getInstance() {  
	    	if (instance == null) {  
	    		 instance = new PlayerBL_Impl();  
	    	 }  
	    	 return instance;  
	    	 }
		@Override
		public ArrayList<PlayerShortVO> getPlayerList() {
			// TODO Auto-generated method stub
			return null;
		}
		@Override
		public PlayerInfoVO getPlayerInfoVO(String playerid) {
			// TODO Auto-generated method stub
			return null;
		}
		@Override
		public PlayerNumberVO getPlayerAverageNumber(String playerid,
				String season, int isAfter) {
			// TODO Auto-generated method stub
			return null;
		}
		@Override
		public PlayerNumberVO getPlayerAllNumber(String playerid,
				String season, int isAfter) {
			// TODO Auto-generated method stub
			return null;
		}
		@Override
		public PlayerRateVO getPlayerRate(String playerid, String season,
				int isAfter) {
			// TODO Auto-generated method stub
			return null;
		}  
	    
//	public ArrayList<PlayerHotVO> getTodayHotPlayer(int num) {
//		// TODO Auto-generated method stub
//		ArrayList<PlayerHotVO> list=new ArrayList<PlayerHotVO>();
//		list.add(new PlayerHotVO("20131212"));
//		list.add(new PlayerHotVO("20131112"));
//		return list;
//	}
//
//	public ArrayList<PlayerHotVO> getSeasonHotPlayer(int num) {
//		// TODO Auto-generated method stub
//		ArrayList<PlayerHotVO> list=new ArrayList<PlayerHotVO>();
//		list.add(new PlayerHotVO("20131212"));
//		list.add(new PlayerHotVO("20131112"));
//		return list;
//	}
//
//	public ArrayList<PlayerHotVO> getImprovedPlayer(int num) {
//		// TODO Auto-generated method stub
//		ArrayList<PlayerHotVO> list=new ArrayList<PlayerHotVO>();
//		list.add(new PlayerHotVO("20131212"));
//		list.add(new PlayerHotVO("20131112"));
//		return list;
//	}
//
//	public ArrayList<PlayerShortVO> getPlayersShortVO(int num) {
//		// TODO Auto-generated method stub
//		ArrayList<PlayerShortVO> list=new ArrayList<PlayerShortVO>();
//		list.add(new PlayerShortVO("20131212"));
//		list.add(new PlayerShortVO("20131112"));
//		return list;
//	}
//
//	public ArrayList<PlayerShortVO> getPlayerShortVOByStr(String str) {
//		// TODO Auto-generated method stub
//		ArrayList<PlayerShortVO> list=new ArrayList<PlayerShortVO>();
//		list.add(new PlayerShortVO("20131212"));
//		list.add(new PlayerShortVO("20131112"));
//		return list;
//	}
//
//	public PlayerInfoVO getPlayerInfo(String playerid) {
//		// TODO Auto-generated method stub
//		return new PlayerInfoVO("20131112");
//	}
//
//	public PlayerNumberVO getPlayerNumber(String playerid) {
//		// TODO Auto-generated method stub
//		
//		return new PlayerNumberVO("20131112");
//	}
//
//	public PlayerRateVO getPlayerRate(String playerid) {
//		// TODO Auto-generated method stub
//		return  new PlayerRateVO("20131112");
//	}
//
//	public ArrayList<PlayerShortVO> getPlayerShortByConditions(String team,
//			String location, String isAfter, String begin) {
//		// TODO Auto-generated method stub
//		ArrayList<PlayerShortVO> list=new ArrayList<PlayerShortVO>();
//		list.add(new PlayerShortVO("20131212"));
//		list.add(new PlayerShortVO("20131112"));
//		return list;
//	}
//
//	public ArrayList<PlayerMatchVO> getPlayerMatchData(String playerid) {
//		// TODO Auto-generated method stub
//		ArrayList<PlayerMatchVO> list=new ArrayList<PlayerMatchVO>();
//		list.add(new PlayerMatchVO("20131212","2"));
//		list.add(new PlayerMatchVO("20131112","2"));
//		return list;
//	}
//
//	public PlayerVO getPlayerSeasonVO(String playerid, String season,
//			boolean isAfter) {
//		// TODO Auto-generated method stub
//		return new PlayerVO("21023");
//	}
//
//	public PlayerVO getPlayerVO(String playerid) {
//		// TODO Auto-generated method stub
//		return new PlayerVO("21023");
//	}
//
//	public PlayerVO getAllPlayerSeasonVO(String season, boolean isAfter) {
//		// TODO Auto-generated method stub
//		return new PlayerVO("21023");
//	}
//
//	public PlayerVO getPlayerSeasonCenter(String playerid, String season,
//			boolean isAfter) {
//		// TODO Auto-generated method stub
//		return new PlayerVO("21023");
//	}
//
//	public PlayerVO getPlayerCenter(String playerid) {
//		// TODO Auto-generated method stub
//		return new PlayerVO("21023");
//	}
//
//	public PlayerVO getAllPlayerSeasonCenter(String season, boolean isAfter) {
//		// TODO Auto-generated method stub
//		return new PlayerVO("21023");
//	}
//
//	public PlayerVO getPlayerSeasonCha(String playerid, String season,
//			boolean isAfter) {
//		// TODO Auto-generated method stub
//		return new PlayerVO("21023");
//	}
//
//	public PlayerVO getPlayerCha(String playerid) {
//		// TODO Auto-generated method stub
//		return new PlayerVO("21023");
//	}
//
//	public PlayerVO getAllPlayerSeasonCha(String season, boolean isAfter) {
//		// TODO Auto-generated method stub
//		return new PlayerVO("21023");
//	}
//
//	public ArrayList<PlayerVO> getPlayerSeasonVOList(String playerid,
//			String season, boolean isAfter) {
//		// TODO Auto-generated method stub
//		ArrayList<PlayerVO> list=new ArrayList<PlayerVO>();
//		list.add(new PlayerVO("20131212"));
//		list.add(new PlayerVO("20131112"));
//		return list;
//	}
//
//	public ArrayList<PlayerVO> getPlayerVOList(String playerid) {
//		// TODO Auto-generated method stub
//		ArrayList<PlayerVO> list=new ArrayList<PlayerVO>();
//		list.add(new PlayerVO("20131212"));
//		list.add(new PlayerVO("20131112"));
//		return list;
//	}
//
//	public ArrayList<PlayerNumberVO> getPlayerAllNumberDeclining(String rate,
//			String location, String league, String season, boolean isAfter,
//			boolean isOn) {
//		// TODO Auto-generated method stub
//		ArrayList<PlayerNumberVO> list=new ArrayList<PlayerNumberVO>();
//		list.add(new PlayerNumberVO("20131212"));
//		list.add(new PlayerNumberVO("20131112"));
//		return list;
//	}
//
//	public ArrayList<PlayerNumberVO> getPlayerAllNumberRaising(String rate,
//			String location, String league, String season, boolean isAfter,
//			boolean isOn) {
//		// TODO Auto-generated method stub
//		ArrayList<PlayerNumberVO> list=new ArrayList<PlayerNumberVO>();
//		list.add(new PlayerNumberVO("20131212"));
//		list.add(new PlayerNumberVO("20131112"));
//		return list;
//	}
//
//	public ArrayList<PlayerNumberVO> getPlayerAverageNumberDeclining(
//			String rate, String location, String league, String season,
//			boolean isAfter, boolean isOn) {
//		// TODO Auto-generated method stub
//		ArrayList<PlayerNumberVO> list=new ArrayList<PlayerNumberVO>();
//		list.add(new PlayerNumberVO("20131212"));
//		list.add(new PlayerNumberVO("20131112"));
//		return list;
//	}
//
//	public ArrayList<PlayerNumberVO> getPlayerAverageNumberRaising(String rate,
//			String location, String league, String season, boolean isAfter,
//			boolean isOn) {
//		// TODO Auto-generated method stub
//		ArrayList<PlayerNumberVO> list=new ArrayList<PlayerNumberVO>();
//		list.add(new PlayerNumberVO("20131212"));
//		list.add(new PlayerNumberVO("20131112"));
//		return list;
//	}
//
//	public ArrayList<PlayerRateVO> getPlayerAllRateDeclining(String rate,
//			String location, String league, String season, boolean isAfter,
//			boolean isOn) {
//		// TODO Auto-generated method stub
//		ArrayList<PlayerRateVO> list=new ArrayList<PlayerRateVO>();
//		list.add(new PlayerRateVO("20131212"));
//		list.add(new PlayerRateVO("20131112"));
//		return list;
//	}
//
//	public ArrayList<PlayerRateVO> getPlayerAllRateRaising(String rate,
//			String location, String league, String season, boolean isAfter,
//			boolean isOn) {
//		// TODO Auto-generated method stub
//		ArrayList<PlayerRateVO> list=new ArrayList<PlayerRateVO>();
//		list.add(new PlayerRateVO("20131212"));
//		list.add(new PlayerRateVO("20131112"));
//		return list;
//	}
//
//	public ArrayList<PlayerNumberVO> getPlayerAllNumber() {
//		// TODO Auto-generated method stub
//		ArrayList<PlayerNumberVO> list=new ArrayList<PlayerNumberVO>();
//		list.add(new PlayerNumberVO("20131212"));
//		list.add(new PlayerNumberVO("20131112"));
//		return list;
//	}
//
//	public ArrayList<PlayerRateVO> getPlayerAllRate() {
//		// TODO Auto-generated method stub
//		ArrayList<PlayerRateVO> list=new ArrayList<PlayerRateVO>();
//		list.add(new PlayerRateVO("20131212"));
//		list.add(new PlayerRateVO("20131112"));
//		return list;
//	}
//
//	public ArrayList<PlayerNumberVO> getPlayerAverageNumber() {
//		// TODO Auto-generated method stub
//		ArrayList<PlayerNumberVO> list=new ArrayList<PlayerNumberVO>();
//		list.add(new PlayerNumberVO("20131212"));
//		list.add(new PlayerNumberVO("20131112"));
//		return list;
//	}

}
