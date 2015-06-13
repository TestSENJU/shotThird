package data;

import java.util.ArrayList;

import po.PlayerMatchPO;
import po.PlayerNumberPO;
import po.PlayerPO;
import po.PlayerRatePO;
import po.PlayerShortPO;

public class PlayerData implements PlayerDataService {

	public ArrayList<PlayerShortPO> getPlayerShortList() {
		// TODO Auto-generated method stub
		return null;
	}

	public ArrayList<PlayerShortPO> getPlayerShortByConditions(String location,
			String teamname, String begin, boolean isOn) {
		// TODO Auto-generated method stub
		return null;
	}

	public ArrayList<PlayerMatchPO> getPlayerMatchesSeason(String playerid,
			String season) {
		// TODO Auto-generated method stub
		return null;
	}

	public ArrayList<PlayerNumberPO> getPlayerNumberByConditions(
			String location, String league, String season, boolean isAfter,
			boolean isOn) {
		// TODO Auto-generated method stub
		return null;
	}

	public ArrayList<PlayerRatePO> getPlayerRateByConditions(String location,
			String league, String season, boolean isAfter, boolean isOn) {
		// TODO Auto-generated method stub
		return null;
	}

	public ArrayList<PlayerPO> getPlayerPO(String playerid) {
		// TODO Auto-generated method stub
		return null;
	}

	public ArrayList<PlayerPO> getPlayerSeasonPO(String playerid, String season) {
		// TODO Auto-generated method stub
		return null;
	}

	public PlayerPO getAllPlayerSeasonPO(String season) {
		// TODO Auto-generated method stub
		return null;
	}

	public ArrayList<PlayerMatchPO> getPlayerMatches(String playerid) {
		// TODO Auto-generated method stub
		return null;
	}

	public ArrayList<PlayerNumberPO> getPlayerNumberAverageByConditions(
			String location, String league, String season, boolean isAfter,
			boolean isOn) {
		// TODO Auto-generated method stub
		return null;
	}

	public ArrayList<PlayerNumberPO> getPlayerNumberAllByConditions(
			String location, String league, String season, boolean isAfter,
			boolean isOn) {
		// TODO Auto-generated method stub
		return null;
	}

}
