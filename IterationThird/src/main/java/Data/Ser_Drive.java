package Data;

import java.io.EOFException;
import java.util.Hashtable;

import VO.MatchVO;

public class Ser_Drive {
	static  Hashtable<String,MatchVO>matchvotable=new Hashtable<String ,MatchVO>();
	private static String matchpath="Serialization/matchfolder/match";

	public Ser_Drive(){
		@SuppressWarnings("unused")
		FileSerialization fs = FileSerialization.getInstance();
	}
	@SuppressWarnings("unchecked")
	public Hashtable<String, MatchVO> getPlayerBasic() {
		// TODO Auto-generated method stub
		try {
			matchvotable = (Hashtable<String,MatchVO>) FileReadAndWriteBuffer
					.read_from_file(matchpath);
		} catch (EOFException e) {
			System.out.println("getPlayerBasic eof");
		}
		return matchvotable;
	}
	
	public static void main(String args[]){
		Ser_Drive drive=new Ser_Drive();
	}
}
