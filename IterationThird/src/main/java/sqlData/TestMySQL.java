package sqlData;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.Statement;
import java.util.ArrayList;

public class TestMySQL {
	public static void main(String[] args) throws Exception {
		ArrayList<String> al = new ArrayList<String>();
		al.add("1");
/*		al.add("2");
		al.add("3");*/
		//System.out.println(al);
		//save data
		Connection conn = Data.getConnection();
		PreparedStatement pstmt = conn.prepareStatement("insert into books values(1,?)");
		pstmt.setString(1, "a");
/*		pstmt.setString(2, "b");
		pstmt.setString(3, "c");*/
		pstmt.executeUpdate();
		int time = pstmt.executeUpdate();
		System.out.println(time+"�������");
		pstmt.close();
		//������
		Statement stmt = conn.createStatement();
		ResultSet rs = stmt.executeQuery("select * from books");
		while (rs.next()) {
			System.out.println(rs.getString(2));
		}


		rs.close();
		stmt.close();
		conn.close();
	}
}
