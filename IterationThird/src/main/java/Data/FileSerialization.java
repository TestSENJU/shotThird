package Data;

import java.io.File;
import java.io.IOException;

public class FileSerialization {
	private static String matchshortpath="Serialization/matchfolder/matchvoser";
	private static String matchpath="Serialization/matchfolder/matchshortvoser";
	private static String teaminfopath="Serialization/matchfolder/matchshortvoser";
	private static String playerinfopath="Serialization/matchfolder/matchshortvoser";
	private static String teamavernumberpath="Serialization/matchfolder/matchshortvoser";
	private static String teamallnumberpath="Serialization/matchfolder/matchshortvoser";
	private static String teamratepath="Serialization/matchfolder/matchshortvoser";
	private static String teamseasonpath="Serialization/matchfolder/matchshortvoser";
	private static String teamaverseasonpath="Serialization/matchfolder/matchshortvoser";
	private static String teamseasonmedianpath="Serialization/matchfolder/matchshortvoser";
	private static String teammedianpath="Serialization/matchfolder/matchshortvoser";
	private static String teamvariancepath="Serialization/matchfolder/matchshortvoser";
	private static String teamseasonvaripath="Serialization/matchfolder/matchshortvoser";
	private static String playerallnumberpath="Serialization/matchfolder/matchshortvoser";
	private static String playeravernumberpath="Serialization/matchfolder/matchshortvoser";
	private static String  playerratepath="Serialization/matchfolder/matchshortvoser";
    private static String playeraverpath="Serialization/matchfolder/matchshortvoser";
	private static String playeraverseasonpath="Serialization/matchfolder/matchshortvoser";
	private static String playeraverteampath="Serialization/matchfolder/matchshortvoser";
	private static String  playermedianpath="Serialization/matchfolder/matchshortvoser";
	private static String playermedianteampath="Serialization/matchfolder/matchshortvoser";
	private static String playermedianseasonpath="Serialization/matchfolder/matchshortvoser";
	private static String playervariseasonpath="Serialization/matchfolder/matchshortvoser";
	private static String playervaripath="Serialization/matchfolder/matchshortvoser";
	private static String playervariteampath="Serialization/matchfolder/matchshortvoser";
	private static String playermatchpath="Serialization/matchfolder/matchshortvoser";

	private static FileSerialization fs;

	public static synchronized FileSerialization getInstance() {
		if (fs == null)
			fs = new FileSerialization();
		return fs;
	}

	public FileSerialization() {
		File file[]=new File[27];
		file[0]=new File(matchshortpath);
		file[1]=new File(matchpath);
		file[2]=new File(teaminfopath);
		file[3]=new File(playerinfopath);
		file[4]=new File(teamavernumberpath);
		file[5]=new File(teamallnumberpath);
		file[6]=new File(teamratepath);
		file[7]=new File(teamseasonpath);
		file[8]=new File(teamaverseasonpath);
		file[9]=new File(teamseasonmedianpath);
		file[10]=new File(teammedianpath);
		file[11]=new File(teamvariancepath);
		file[12]=new File(teamseasonvaripath);
		file[13]=new File(playerallnumberpath);
		file[14]=new File(playeravernumberpath);
		file[15]=new File(playerratepath);
		file[16]=new File(playeraverpath);
		file[17]=new File(playeraverseasonpath);
		file[18]=new File(playeraverteampath);
		file[19]=new File(playermedianpath);
		file[20]=new File(playermedianteampath);
		file[21]=new File(playeraverseasonpath);
		file[22]=new File(playermedianseasonpath);
		file[23]=new File(playervariseasonpath);
		file[24]=new File(playervaripath);
		file[25]=new File(playervariteampath);
		file[26]=new File(playermatchpath);

		for(int i=0;i<file.length;i++){
			if(file[i].exists()){
				
			}else{
				try {
					file[i].createNewFile();
					new Serialization();
				} catch (IOException e) {
					// TODO Auto-generated catch block
					e.printStackTrace();
				}
			
			}
		}

	}
}