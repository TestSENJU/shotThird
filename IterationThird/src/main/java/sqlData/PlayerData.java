package sqlData;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.Hashtable;

import po.MatchPO;
import po.PlayerHotPO;
import po.PlayerMatchPO;
import po.PlayerNumberPO;
import po.PlayerPO;
import po.PlayerRatePO;
import po.PlayerShortPO;
import specialpo.PlayerBaseInfoPO;
import VO.PlayerNumberVO;
import VO.PlayerRateVO;

public class PlayerData implements PlayerDataService {
	Hashtable<String, PlayerBaseInfoPO> bpolist = new Hashtable<String, PlayerBaseInfoPO>();
	Hashtable<String, PlayerPO> polist = new Hashtable<String, PlayerPO>();

	public PlayerData() {
		Connection ct = null;
		try {
			Class.forName("sun.jdbc.odbc.JdbcOdbcDriver");
			ct = DriverManager.getConnection("jdbc:odbc:PlayerData");
			Statement sm = ct.createStatement();
			ResultSet rs = sm
					.executeQuery("select * from playermatch20122013playoff");
			while (rs.next()) {
				PlayerPO po = new PlayerPO(rs.getString(2));
				polist.put(rs.getString(2), addipo(po, rs));
			}
			rs = sm.executeQuery("select * from playermatch20122013season");
			while (rs.next()) {
				PlayerPO po = polist.get(rs.getString(2));
				polist.put(rs.getString(2), addipo(po, rs));
			}
			rs = sm.executeQuery("select * from playermatch20132014playoff");
			while (rs.next()) {
				PlayerPO po = polist.get(rs.getString(2));
				polist.put(rs.getString(2), addipo(po, rs));
			}
			rs = sm.executeQuery("select * from playermatch20132014season");
			while (rs.next()) {
				PlayerPO po = polist.get(rs.getString(2));
				polist.put(rs.getString(2), addipo(po, rs));
			}
			rs = sm.executeQuery("select * from playermatch20142015playoff");
			while (rs.next()) {
				PlayerPO po = polist.get(rs.getString(2));
				polist.put(rs.getString(2), addipo(po, rs));
			}
			rs = sm.executeQuery("select * from playermatch20142015season");
			while (rs.next()) {
				PlayerPO po = polist.get(rs.getString(2));
				polist.put(rs.getString(2), addipo(po, rs));
			}
		} catch (Exception e) {

		} finally {
			try {
				if (ct != null) {
					ct.close();
				}

			} catch (Exception e2) {
			}
		}
	}

	private PlayerPO addipo(PlayerPO po, ResultSet rs) {
		return new PlayerPO("");
	}

	@Override
	public ArrayList<PlayerShortPO> getAllPlayer() {
		ArrayList<PlayerShortPO> a = new ArrayList<PlayerShortPO>();
		a.add(new PlayerShortPO(""));
		return a;
	}

	@Override
	public PlayerShortPO getPlayerbase(String id) {
		return new PlayerShortPO("");
	}

	@Override
	public PlayerNumberPO getPlayerTotal(String id, int isAfter) {
		return new PlayerNumberPO("");
	}

	@Override
	public PlayerNumberPO getPlayerAverage(String id, int isAfter) {
		return new PlayerNumberPO("");
	}

	@Override
	public PlayerRatePO getPlayerRate(String id, int isAfter) {
		return new PlayerRatePO("");
	}

	@Override
	public ArrayList<PlayerMatchPO> getPlayerMatch(String id, String season,
			int isAfter) {
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
		return new PlayerHotPO("");
	}

	@Override
	public PlayerHotPO getPlayerSeasonAllAverage(String season, int isAfter,
			int rate) {
		return new PlayerHotPO("");
	}

	@Override
	public PlayerHotPO getPlayerSeasonAverage(String season, String playerid,
			int isAfter, int rate) {
		return new PlayerHotPO("");
	}

	@Override
	public PlayerHotPO getTeamMedian(String team, String season, int isAfter,
			int rate) {
		return new PlayerHotPO("");
	}

	@Override
	public PlayerHotPO getSeasonMedian(String season, int isAfter, int rate) {
		return new PlayerHotPO("");
	}

	@Override
	public PlayerHotPO getThePlayerMedian(String season, String id,
			int isAfter, int rate) {
		return new PlayerHotPO("");
	}

	@Override
	public PlayerHotPO getTeamVariance(String team, String season, int isAfter,
			int rate) {
		return new PlayerHotPO("");
	}

	@Override
	public PlayerHotPO getThePlayerVariance(String season, String id,
			int isAfter, int rate) {
		return new PlayerHotPO("");
	}

	@Override
	public double getSeasonVariance(String season, String team, String id,
			int isAfter, int rate) {
		return 0;
	}

	@Override
	public ArrayList<PlayerHotPO> getEveryMatch(String season, int isAfter,
			int rate) {
		ArrayList<PlayerHotPO> a = new ArrayList<PlayerHotPO>();
		a.add(new PlayerHotPO(""));
		return a;
	}

	@Override
	public ArrayList<PlayerHotPO> getProgress(int rate) {
		ArrayList<PlayerHotPO> a = new ArrayList<PlayerHotPO>();
		a.add(new PlayerHotPO(""));
		return a;
	}

	@Override
	public ArrayList<PlayerHotPO> getSeasonHotPlayer(int rate) {
		ArrayList<PlayerHotPO> a = new ArrayList<PlayerHotPO>();
		a.add(new PlayerHotPO(""));
		return a;
	}

	@Override
	public ArrayList<PlayerHotPO> getDayHotPlayer(int rate) {
		ArrayList<PlayerHotPO> a = new ArrayList<PlayerHotPO>();
		a.add(new PlayerHotPO(""));
		return a;
	}

}