package sqlData;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.Hashtable;

import po.MatchPO;
import po.PlayerShortPO;
import po.TeamHotPO;
import po.TeamInfoPO;
import po.TeamNumberPO;
import po.TeamRatePO;

public class TeamData implements TeamDataService {
	Hashtable<String, TeamInfoPO> ipolist = new Hashtable<String, TeamInfoPO>();

	public TeamData() {
		Connection ct = null;
		try {
			Class.forName("sun.jdbc.odbc.JdbcOdbcDriver");
			ct = DriverManager.getConnection("jdbc:odbc:TeamData");
			Statement sm = ct.createStatement();
			ResultSet rs = sm.executeQuery("select * from teambaseinfo");
			while (rs.next()) {
				TeamInfoPO ipo = new TeamInfoPO(rs.getString(2));
				ipolist.put(rs.getString(2), ipo);
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

	@Override
	public ArrayList<PlayerShortPO> getAllPlayer(String shortname) {
		return new ArrayList<PlayerShortPO>();
	}

	@Override
	public TeamInfoPO getTeamBase(String shortname) {
		return new TeamInfoPO("");
	}

	@Override
	public TeamNumberPO getTeamTotal(String shortname) {
		return new TeamNumberPO("");
	}

	@Override
	public TeamRatePO getTeamRate(String shortname) {
		return new TeamRatePO("");
	}

	@Override
	public TeamNumberPO getTeamAverage(String shortname) {
		return new TeamNumberPO("");
	}

	@Override
	public ArrayList<MatchPO> getTeamMatch(String shortname) {
		ArrayList<MatchPO> a = new ArrayList<MatchPO>();
		a.add(new MatchPO(""));
		return a;
	}

	@Override
	public TeamHotPO getTeamHotAverage(String season, int isAfter,
			String shortname, int rate) {
		return new TeamHotPO("");
	}

	@Override
	public ArrayList<TeamHotPO> getTeamHotAll(String season, int isAfter,
			String shortname, int rate) {
		ArrayList<TeamHotPO> a = new ArrayList<TeamHotPO>();
		a.add(new TeamHotPO(""));
		return a;
	}

	@Override
	public TeamHotPO getMedian(String season, int isAfter, String shortname,
			int rate) {
		return new TeamHotPO("");
	}

	@Override
	public TeamHotPO getVariance(String season, int isAfter, String shortname,
			int rate) {
		return new TeamHotPO("");
	}

	@Override
	public TeamHotPO getAverage(String season, int isAfter, String shortname,
			int rate) {
		return new TeamHotPO("");
	}

	@Override
	public TeamHotPO getVariance(String season, int isAfter, int rate) {
		return new TeamHotPO("");
	}

	@Override
	public TeamHotPO getMedian(String season, int isAfter, int rate) {
		return new TeamHotPO("");
	}

	@Override
	public ArrayList<TeamNumberPO> getTeamByConditions(String season,
			int isAfter, boolean isAverage, int rate) {
		ArrayList<TeamNumberPO> a = new ArrayList<TeamNumberPO>();
		a.add(new TeamNumberPO(""));
		return a;
	}
}