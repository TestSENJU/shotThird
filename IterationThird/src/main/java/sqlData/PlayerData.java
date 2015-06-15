package sqlData;

import java.util.ArrayList;

import po.PlayerHotPO;
import po.PlayerMatchPO;
import po.PlayerNumberPO;
import po.PlayerRatePO;
import po.PlayerShortPO;
import VO.PlayerNumberVO;
import VO.PlayerRateVO;

public class PlayerData implements PlayerDataService {

	@Override
	public ArrayList<PlayerShortPO> getAllPlayer() {
		// TODO Auto-generated method stub
		ArrayList<PlayerShortPO> a = new ArrayList<PlayerShortPO>();
		a.add(new PlayerShortPO(""));
		return a;
	}

	@Override
	public PlayerShortPO getPlayerbase(String id) {
		// TODO Auto-generated method stub
		return new PlayerShortPO("");
	}

	@Override
	public PlayerNumberPO getPlayerTotal(String id, int isAfter) {
		// TODO Auto-generated method stub
		return new PlayerNumberPO("");
	}

	@Override
	public PlayerNumberPO getPlayerAverage(String id, int isAfter) {
		// TODO Auto-generated method stub
		return new PlayerNumberPO("");
	}

	@Override
	public PlayerRatePO getPlayerRate(String id, int isAfter) {
		// TODO Auto-generated method stub
		return new PlayerRatePO("");
	}

	@Override
	public ArrayList<PlayerMatchPO> getPlayerMatch(String id, String season,
			int isAfter) {
		// TODO Auto-generated method stub
		ArrayList<PlayerMatchPO> a = new ArrayList<PlayerMatchPO>();
		a.add(new PlayerMatchPO("", ""));
		return a;
	}

	@Override
	public ArrayList<PlayerNumberVO> getPlayerAverageNumberByConditions(
			String location, String league, boolean isActive, String season,
			int rate) {
		ArrayList<PlayerNumberVO> a = new ArrayList<PlayerNumberVO>();
		a.add(new PlayerNumberVO(""));
		return a;
	}

	@Override
	public ArrayList<PlayerNumberVO> getPlayerAllNumberByConditions(
			String location, String league, boolean isActive, String season,
			int rate) {
		ArrayList<PlayerNumberVO> a = new ArrayList<PlayerNumberVO>();
		a.add(new PlayerNumberVO(""));
		return a;
	}

	@Override
	public ArrayList<PlayerRateVO> getPlayerRateByConditions(String location,
			String league, boolean isActive, String season, int rate) {
		ArrayList<PlayerRateVO> a = new ArrayList<PlayerRateVO>();
		a.add(new PlayerRateVO(""));
		return a;
	}

	@Override
	public ArrayList<PlayerShortPO> getPlayerSimple(String location,
			String team, boolean isActive, String FirstChar) {
		ArrayList<PlayerShortPO> a = new ArrayList<PlayerShortPO>();
		a.add(new PlayerShortPO(""));
		return a;
	}

	@Override
	public PlayerHotPO getPlayerTeamAverage(String team, String season,
			int isAfter, int rate) {
		// TODO Auto-generated method stub
		return new PlayerHotPO("");
	}

	@Override
	public PlayerHotPO getPlayerSeasonAllAverage(String season, int isAfter,
			int rate) {
		// TODO Auto-generated method stub
		return new PlayerHotPO("");
	}

	@Override
	public PlayerHotPO getPlayerSeasonAverage(String season, String playerid,
			int isAfter, int rate) {
		// TODO Auto-generated method stub
		return new PlayerHotPO("");
	}

	@Override
	public PlayerHotPO getTeamMedian(String team, String season, int isAfter,
			int rate) {
		// TODO Auto-generated method stub
		return new PlayerHotPO("");
	}

	@Override
	public PlayerHotPO getSeasonMedian(String season, int isAfter, int rate) {
		// TODO Auto-generated method stub
		return new PlayerHotPO("");
	}

	@Override
	public PlayerHotPO getThePlayerMedian(String season, String id,
			int isAfter, int rate) {
		// TODO Auto-generated method stub
		return new PlayerHotPO("");
	}

	@Override
	public PlayerHotPO getTeamVariance(String team, String season, int isAfter,
			int rate) {
		// TODO Auto-generated method stub
		return new PlayerHotPO("");
	}

	@Override
	public PlayerHotPO getThePlayerVariance(String season, String id,
			int isAfter, int rate) {
		// TODO Auto-generated method stub
		return new PlayerHotPO("");
	}

	@Override
	public double getSeasonVariance(String season, String team, String id,
			int isAfter, int rate) {
		// TODO Auto-generated method stub
		return 0;
	}

	@Override
	public ArrayList<PlayerHotPO> getEveryMatch(String season, int isAfter,
			int rate) {
		// TODO Auto-generated method stub
		ArrayList<PlayerHotPO> a = new ArrayList<PlayerHotPO>();
		a.add(new PlayerHotPO(""));
		return a;
	}

	@Override
	public ArrayList<PlayerHotPO> getProgress(int rate) {
		// TODO Auto-generated method stub
		ArrayList<PlayerHotPO> a = new ArrayList<PlayerHotPO>();
		a.add(new PlayerHotPO(""));
		return a;
	}

	@Override
	public ArrayList<PlayerHotPO> getSeasonHotPlayer(int rate) {
		// TODO Auto-generated method stub
		ArrayList<PlayerHotPO> a = new ArrayList<PlayerHotPO>();
		a.add(new PlayerHotPO(""));
		return a;
	}

	@Override
	public ArrayList<PlayerHotPO> getDayHotPlayer(int rate) {
		// TODO Auto-generated method stub
		ArrayList<PlayerHotPO> a = new ArrayList<PlayerHotPO>();
		a.add(new PlayerHotPO(""));
		return a;
	}

}