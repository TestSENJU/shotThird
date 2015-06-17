package Data;

import java.io.EOFException;
import java.util.Hashtable;

import VO.MatchShortVO;
import VO.MatchVO;

public class MatchData_Impl implements MatchData{
	public static MatchData_Impl pdi;
	private static String matchshortpath="Serialization/matchfolder/matchshort";
	private static String matchpath="Serialization/matchfolder/match";
	public static synchronized MatchData_Impl getInstance() {
		if (pdi == null)
			pdi = new MatchData_Impl();
		return pdi;
	}
	public MatchData_Impl(){
		@SuppressWarnings("unused")
		FileSerialization fs = FileSerialization.getInstance();
	}
	@SuppressWarnings("unchecked")
	@Override
	public Hashtable<String, MatchVO> getMatchvotable() {
		// TODO Auto-generated method stub
		try{
			return (Hashtable<String, MatchVO>) FileReadAndWriteBuffer
					.read_from_file(matchpath);
		}catch(EOFException e){
			return null;
		}

	}

	@SuppressWarnings("unchecked")
	@Override
	public Hashtable<String, MatchShortVO> getMatchShorttable() {
		// TODO Auto-generated method stub
		try{
			return (Hashtable<String, MatchShortVO>) FileReadAndWriteBuffer
					.read_from_file(matchshortpath);
		}catch(EOFException e){
			return null;
		}

	}

}
