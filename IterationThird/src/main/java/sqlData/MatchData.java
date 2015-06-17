package sqlData;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.Statement;
import java.util.Hashtable;

import po.MatchPO;
import po.MatchShortPO;
import po.PlayerHotPO;

public class MatchData implements MatchDataService {
	Hashtable<String, MatchPO> mpolist = new Hashtable<String, MatchPO>();

	public MatchData() {
		Connection ct = null;
		try {
			Class.forName("sun.jdbc.odbc.JdbcOdbcDriver");
			ct = DriverManager.getConnection("jdbc:odbc:MatchData");
			Statement sm = ct.createStatement();
			ResultSet rs = sm
					.executeQuery("select * from match20122013playoff");
			while (rs.next()) {
				MatchPO po = new MatchPO(rs.getString(2));
				mpolist.put(rs.getString(2), addipo(po, rs));
			}
			rs = sm.executeQuery("select * from match20122013season");
			while (rs.next()) {
				MatchPO po = mpolist.get(rs.getString(2));
				mpolist.put(rs.getString(2), addipo(po, rs));
			}
			rs = sm.executeQuery("select * from match20132014playoff");
			while (rs.next()) {
				MatchPO po = mpolist.get(rs.getString(2));
				mpolist.put(rs.getString(2), addipo(po, rs));
			}
			rs = sm.executeQuery("select * from match20132014season");
			while (rs.next()) {
				MatchPO po = mpolist.get(rs.getString(2));
				mpolist.put(rs.getString(2), addipo(po, rs));
			}
			rs = sm.executeQuery("select * from match20142015playoff");
			while (rs.next()) {
				MatchPO po = mpolist.get(rs.getString(2));
				mpolist.put(rs.getString(2), addipo(po, rs));
			}
			rs = sm.executeQuery("select * from match20142015season");
			while (rs.next()) {
				MatchPO po = mpolist.get(rs.getString(2));
				mpolist.put(rs.getString(2), addipo(po, rs));
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

	private MatchPO addipo(MatchPO ipo, ResultSet rs) {
		return new MatchPO("");
	}

	@Override
	public MatchShortPO getMatchRecent(int num) {
		return new MatchShortPO("");
	}

	@Override
	public MatchPO getMatchDetail(String id) {
		return new MatchPO("");
	}

	@Override
	public PlayerHotPO getMatchHotPlayer(String id) {
		return new PlayerHotPO("");
	}

}
