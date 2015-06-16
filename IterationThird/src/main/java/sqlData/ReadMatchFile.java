package sqlData;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.LineNumberReader;
import java.util.ArrayList;

//import specialpo.MatchDataPO;
//import specialpo.PlayerMatchDataPO;
import specialpo.TeamMatchDataPO;

public class ReadMatchFile {
	/**
	 * gameID
	 * bw.write(gameID+","+teamID+","+teamName+","+playerID+","+playerName+","+
	 * position
	 * +","+MIN+","+FGM+","+FGA+","+FG_PCT+","+FG3M+","+FG3A+","+FG3_PCT+
	 * ","+FTM+
	 * ","+FTA+","+FT_PCT+","+OREB+","+DREB+","+REB+","+AST+","+STL+","+BLK
	 * +","+TO+","+PF+","+PTS+","+PLUS_MINUS); 这是每一条球员的顺序
	 * bw.write(gameID+","+teamID
	 * +","+teamName+","+MIN+","+FGM+","+FGA+","+FG_PCT
	 * +","+FG3M+","+FG3A+","+FG3_PCT
	 * +","+FTM+","+FTA+","+FT_PCT+","+OREB+","+DREB
	 * +","+REB+","+AST+","+STL+","+BLK+","+TO+","+PF+","+PTS+","+PLUS_MINUS);
	 * 这是球队的顺序 最上面应该是比赛日期， 比赛ID 最上面应该是比赛日期，比赛ID 第三行和第二行一样 不过是主队
	 */
	/**
	 * MIN上场时间 FGM命中次数 FGA出手次数 FG_PCT投篮命中率 FG3M三分命中数 FG3A三分出手数 FG3_PCT三分命中率
	 * FTM罚球命中数 FTA罚球出手数 FT_PCT罚球命中率 OREB前场篮板数 DREB后场篮板数 REB篮板数 AST助攻次数 STL抢断次数
	 * BLK盖帽次数 TO失误次数 PF犯规次数 PTS得分 PLUS_MINUS+/-
	 * */
	/**
	 * 读取某个文件夹下的所有文件
	 */
	public ArrayList<String> readfile(String filepath)
			throws FileNotFoundException, IOException {
		ArrayList<String> fileName = new ArrayList<String>();
		try {

			File file = new File(filepath);
			if (!file.isDirectory()) {
				// System.out.println("path=" + file.getPath());
				fileName.add(file.getPath().replaceAll("\\", "/"));
				// System.out.println("absolutepath=" + file.getAbsolutePath());
				// System.out.println("name=" + file.getName());

			} else if (file.isDirectory()) {
				//System.out.println("文件夹");
				String[] filelist = file.list();
				for (int i = 0; i < filelist.length; i++) {

					File readfile = new File(filepath + "\\" + filelist[i]);
					if (!readfile.isDirectory()) {
						// System.out.println("path=" + readfile.getPath());
						fileName.add(readfile.getAbsolutePath());
						// System.out.println("absolutepath="
						// + readfile.getAbsolutePath());
						// System.out.println("name=" + readfile.getName());

					} else if (readfile.isDirectory()) {
						readfile(filepath + "\\" + filelist[i]);
					}
				}

			}

		} catch (FileNotFoundException e) {
			System.out.println("readfile()   Exception:" + e.getMessage());
		}
		return fileName;
	}

	/**
	 * 删除某个文件夹下的所有文件夹和文件
	 */

	/*
	 * public static boolean deletefile(String delpath) throws
	 * FileNotFoundException, IOException { try {
	 * 
	 * File file = new File(delpath); if (!file.isDirectory()) {
	 * System.out.println("1"); file.delete(); } else if (file.isDirectory()) {
	 * System.out.println("2"); String[] filelist = file.list(); for (int i = 0;
	 * i < filelist.length; i++) { File delfile = new File(delpath + "\\" +
	 * filelist[i]); if (!delfile.isDirectory()) { System.out.println("path=" +
	 * delfile.getPath()); System.out.println("absolutepath=" +
	 * delfile.getAbsolutePath()); System.out.println("name=" +
	 * delfile.getName()); delfile.delete(); System.out.println("删除文件成功"); }
	 * else if (delfile.isDirectory()) { deletefile(delpath + "\\" +
	 * filelist[i]); } } file.delete();
	 * 
	 * }
	 * 
	 * } catch (FileNotFoundException e) {
	 * System.out.println("deletefile()   Exception:" + e.getMessage()); }
	 * return true; }
	 */

	public String[] HandleTxt(String filePath) {
		String match = "";
		String player = "";
		String team = "";
		try {
			String encoding = "UTF-8";
			File file = new File(filePath);
			if (file.isFile() && file.exists()) { // 判断文件是否存在
				InputStreamReader read = new InputStreamReader(
						new FileInputStream(file), encoding);// 考虑到编码格式
				//BufferedReader bufferedReader = new BufferedReader(read);
				LineNumberReader lineReader = new LineNumberReader(read);
				String lineTxt;
				int flag = -1;
				while ((lineTxt = lineReader.readLine()) != null) {
					if(lineReader.getLineNumber()<=3){
						match = match+lineTxt.trim().replaceAll("'", "")+",";
					} else if (flag>0) {
						team = team+lineTxt.trim().replaceAll("'", "")+";";
					} else {
						player = player + lineTxt.trim().replaceAll("'", "")+";";
					}
					if (lineTxt.startsWith("Total:")) {
						player = player.trim().substring(0,player.length()-7);
						flag = lineReader.getLineNumber();
					}
					
					//System.out.println(lineTxt);
				}
				read.close();
			} else {
				System.out.println("找不到指定的文件");
			}
		} catch (Exception e) {
			System.out.println("读取文件内容出错");
			e.printStackTrace();
		}
		return new String[]{match,player,team};
	}

	public static void main(String[] args) throws Exception {
		ReadMatchFile mpd = new ReadMatchFile();
		ArrayList<String> f = new ArrayList<String>();
		//ArrayList<MatchDataPO> md = new ArrayList<MatchDataPO>();
		//ArrayList<PlayerMatchDataPO> pmd = new ArrayList<PlayerMatchDataPO>();
		ArrayList<TeamMatchDataPO> tmd = new ArrayList<TeamMatchDataPO>();
		try {
			f = mpd.readfile("E:/guo14s/");
			// deletefile("D:/file");
		} catch (FileNotFoundException ex) {
		} catch (IOException ex) {
		}
		// String path = "E:/guo/2015-02-06-0021400752.txt";
		for (int i=0;i < f.size();i++) {
			String path = f.get(i);
			String[] a = mpd.HandleTxt(path);
			//String[] tempMatch = a[0].split(",");
			//String[] tempPlayer = a[1].split(";");
			String[] tempTeam = a[2].split(";");
			/*if (tempMatch.length==1) {
				System.out.println(f.get(i));
			} else {
				md.add(new MatchDataPO(tempMatch[1],tempMatch[0],tempMatch[2],tempMatch[3],tempMatch[9],tempMatch[10],
						Integer.parseInt(tempMatch[4]),Integer.parseInt(tempMatch[5]),Integer.parseInt(tempMatch[6]),
						Integer.parseInt(tempMatch[7]),Integer.parseInt(tempMatch[8]),Integer.parseInt(tempMatch[11]),
						Integer.parseInt(tempMatch[12]),Integer.parseInt(tempMatch[13]),Integer.parseInt(tempMatch[14]),
						Integer.parseInt(tempMatch[15])));
			}*/
			
			/*for (int j=0;j < tempPlayer.length;j++) {
				if (tempPlayer.length==1) {
					System.out.println(f.get(i));
				} else {
					String[] info = tempPlayer[j].split(",");
					pmd.add(new PlayerMatchDataPO(info[0],info[1],info[2],info[3],info[4],info[5],info[6],
							Integer.parseInt(info[7]),Integer.parseInt(info[8]),Double.valueOf(info[9]),
							Integer.parseInt(info[10]),Integer.parseInt(info[11]),Double.valueOf(info[12]),
							Integer.parseInt(info[13]),Integer.parseInt(info[14]),Double.valueOf(info[15]),
							Integer.parseInt(info[16]),Integer.parseInt(info[17]),Integer.parseInt(info[18]),
							Integer.parseInt(info[19]),Integer.parseInt(info[20]),Integer.parseInt(info[21]),
							Integer.parseInt(info[22]),Integer.parseInt(info[23]),Integer.parseInt(info[24]),
							Double.parseDouble(info[25])));
				}
				
			}*/
			for (int k=0;k < 2;k++) {
				if (tempTeam.length==1) {
					System.out.println(f.get(i));
				} else {
				String[] info = tempTeam[k].split(",");
				tmd.add(new TeamMatchDataPO(info[0],info[1],info[2],info[3],
						Integer.parseInt(info[4]),Integer.parseInt(info[5]),Double.valueOf(info[6]),
						Integer.parseInt(info[7]),Integer.parseInt(info[8]),Double.valueOf(info[9]),
						Integer.parseInt(info[10]),Integer.parseInt(info[11]),Double.valueOf(info[12]),
						Integer.parseInt(info[13]),Integer.parseInt(info[14]),Integer.parseInt(info[15]),
						Integer.parseInt(info[16]),Integer.parseInt(info[17]),Integer.parseInt(info[20]),
						Integer.parseInt(info[19]),Integer.parseInt(info[20]),Integer.parseInt(info[21]),
						Double.parseDouble(info[22])));
				}
			}
		}
		
	/*	String path = f.get(0);
		String[] a = mpd.HandleTxt(path);
		System.out.println(a[0]);
		System.out.println(a[1]);
		System.out.println(a[2]);*/
/*		System.out.println(md.size());
		System.out.println(pmd.size());
		System.out.println(tmd.size());*/
		TestMySQL filldata = new TestMySQL();
		/*for (int i=0;i < md.size();i++) {
			String sql = "insert into Match20142015Season values ("+"'"+md.get(i).getGameID()
					+"','"+md.get(i).getmTime()+"','"+md.get(i).getFirstTeamID()
					+"','"+md.get(i).getFirstTeamName()+"','"+md.get(i).getLastTeamID()
					+"','"+md.get(i).getLastTeamName()+"',"+md.get(i).getFirstScore()
					+","+md.get(i).getFirst1()+","+md.get(i).getFirst2()+","
					+md.get(i).getFirst3()+","+md.get(i).getFirst4()
					+","+md.get(i).getSecondScore()
					+","+md.get(i).getSecond1()+","+md.get(i).getSecond2()+","
					+md.get(i).getSecond3()+","+md.get(i).getSecond4()
					+");";
			filldata.createTable(sql);
		}*/
		/*for (int i=0;i < pmd.size();i++) {
			String sql = "insert into PlayerMatch20142015PlayOff values ("+"'"+pmd.get(i).getGameID()
					+"','"+pmd.get(i).getTeamID()+"','"+pmd.get(i).getTeamName()+"','"+pmd.get(i).getPlayerID()
					+"','"+pmd.get(i).getPlayerName()+"','"+pmd.get(i).getPosition()+"','"+pmd.get(i).getMIN()
					+"',"+pmd.get(i).getFGM()+","+pmd.get(i).getFGA()+","+pmd.get(i).getFGPCT()
					+","+pmd.get(i).getFG3M()+","+pmd.get(i).getFG3A()+","+pmd.get(i).getFG3PCT()
					+","+pmd.get(i).getFTM()+","+pmd.get(i).getFTA()+","+pmd.get(i).getFTPCT()
					+","+pmd.get(i).getOREB()+","+pmd.get(i).getDREB()+","+pmd.get(i).getREB()
					+","+pmd.get(i).getAST()+","+pmd.get(i).getSTL()+","+pmd.get(i).getBLK()
					+","+pmd.get(i).getTONum()+","+pmd.get(i).getPFNum()+","+pmd.get(i).getPTS()
					+","+pmd.get(i).getPLUSMINUS()
					+");";
			filldata.createTable(sql);
		}*/
		for (int i=0;i < tmd.size();i++) {
			String sql = "insert into TeamMatch20142015Season values ("+"'"+tmd.get(i).getGameID()
					+"','"+tmd.get(i).getTeamID()+"','"+tmd.get(i).getTeamName()+"','"+tmd.get(i).getMIN()
					+"',"+tmd.get(i).getFGM()+","+tmd.get(i).getFGA()+","+tmd.get(i).getFGPCT()
					+","+tmd.get(i).getFG3M()+","+tmd.get(i).getFG3A()+","+tmd.get(i).getFG3PCT()
					+","+tmd.get(i).getFTM()+","+tmd.get(i).getFTA()+","+tmd.get(i).getFTPCT()
					+","+tmd.get(i).getOREB()+","+tmd.get(i).getDREB()+","+tmd.get(i).getREB()
					+","+tmd.get(i).getAST()+","+tmd.get(i).getSTL()+","+tmd.get(i).getBLK()
					+","+tmd.get(i).getTONum()+","+tmd.get(i).getPFNum()+","+tmd.get(i).getPTS()
					+","+tmd.get(i).getPLUSMINUS()
					+");";
			filldata.createTable(sql);
		}
		System.out.println("ok");
	}

}
