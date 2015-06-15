package sqlData;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.ArrayList;

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
				//System.out.println("path=" + file.getPath());
				fileName.add(file.getPath());
				//System.out.println("absolutepath=" + file.getAbsolutePath());
				//System.out.println("name=" + file.getName());

			} else if (file.isDirectory()) {
				System.out.println("文件夹");
				String[] filelist = file.list();
				for (int i = 0; i < filelist.length; i++) {
					File readfile = new File(filepath + "\\" + filelist[i]);
					if (!readfile.isDirectory()) {
						System.out.println("path=" + readfile.getPath());
						System.out.println("absolutepath="
								+ readfile.getAbsolutePath());
						System.out.println("name=" + readfile.getName());

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

	public void HandleTxt() {
		
	}
	
	public static void main(String[] args) {
		ReadMatchFile mpd = new ReadMatchFile();
		
		try {
			mpd.readfile("E:/guo");
			// deletefile("D:/file");
		} catch (FileNotFoundException ex) {
		} catch (IOException ex) {
		}
		System.out.println("ok");
	}

}
