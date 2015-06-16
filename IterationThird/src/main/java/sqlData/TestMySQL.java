package sqlData;

import java.sql.Connection;
import java.sql.Statement;


public class TestMySQL {
	Statement stmt;
	Connection conn;

	public static void main(String[] args) throws Exception {
		//TestMySQL mysqltest = new TestMySQL();
		// String sqlCMD =
		// "CREATE TABLE Match20122013Season(gameID VARCHAR(20),mTime VARCHAR(10),firstTeamID VARCHAR(20),firstTeamName VARCHAR(3),lastTeamID VARCHAR(20),lastTeamName VARCHAR(3),firstScore int,first1 int,first2 int,first3 int,first4 int,secondScore int,second1 int,second2 int,second3 int,second4 int);";
		// String sqlCMD =
		// "CREATE TABLE PlayerMatch20122013PlayOff(gameID VARCHAR(20),teamID VARCHAR(20),"
		// +
		// "teamName VARCHAR(3),playerID VARCHAR(20),playerName VARCHAR(40),position VARCHAR(5),"
		// +
		// "MIN VARCHAR(20),FGM int,FGA int,FGPCT double,FG3M int,FG3A int,FG3PCT double,"
		// + "FTM int,FTA int,FTPCT Double,OREB int,DREB int,REB int,AST int,"
		// + "STL int,BLK int,TONum int,PFNum int,PTS int,PLUSMINUS double);";
		/*String sqlCMD = "CREATE TABLE TeamMatch20122013Season(gameID VARCHAR(20),teamID VARCHAR(20),"
				+ "teamName VARCHAR(3),"
				+ "MIN VARCHAR(20),FGM int,FGA int,FGPCT double,FG3M int,FG3A int,FG3PCT double,"
				+ "FTM int,FTA int,FTPCT Double,OREB int,DREB int,REB int,AST int,"
				+ "STL int,BLK int,TONum int,PFNum int,PTS int,PLUSMINUS double);";*/
		//String sqlCMD = "CREATE TABLE PlayerBaseInfo(EName VARCHAR(40),CName VARCHAR(40),TeamName VARCHAR(20),position VARCHAR(10),height VARCHAR(10),weight VARCHAR(10),experience VARCHAR(5));";
		//String sqlCMD = "CREATE TABLE TeamBaseInfo()";
		//mysqltest.createTable(sqlCMD);

		// mysqltest.createTable("CREATE TABLE flower(id VARCHAR(20),name VARCHAR(25));");
		// for (int j=0;j < testArr.size();j++) {
		// mysqltest.createTable("insert into flower values ("+"'"+testArr.get(j).getId()+"','"+testArr.get(j).getName()+"'"+");");
		// }
		// mysqltest.createTable("insert into tree values(0041400304,'manytreesinthetable');");
		// mysqltest.createTable("");
		System.out.println("over");
	}

	public void createTable(String sql) throws Exception {
		try {
			conn = Data.getConnection();
			stmt = conn.createStatement();
			stmt.executeUpdate(sql);
		} finally {
			if (stmt != null) {
				stmt.close();
			}
			if (conn != null) {
				conn.close();
			}
		}
	}
}
