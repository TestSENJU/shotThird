package specialpo;

public class TeamMatchDataPO {
	String gameID;
	String teamID;
	String teamName;
	String MIN;// 在场时间
	int FGM;
	int FGA;
	double FGPCT;
	int FG3M;
	int FG3A;
	double FG3PCT;
	int FTM;
	int FTA;
	double FTPCT;
	int OREB;
	int DREB;
	int REB;
	int AST;
	int STL;
	int BLK;
	int TONum;
	int PFNum;
	int PTS;
	double PLUSMINUS;

	public TeamMatchDataPO(String gameID, String teamID, String teamName,
			String MIN,
			int FGM, int FGA, double FGPCT, int FG3M, int FG3A, double FG3PCT,
			int FTM, int FTA, double FTPCT, int OREB, int DREB, int REB,
			int AST, int STL, int BLK, int TONum, int PFNum, int PTS,
			double PLUSMINUS) {
		this.gameID = gameID;
		this.teamID = teamID;
		this.teamName = teamName;
		this.MIN = MIN;
		this.FGM = FGM;
		this.FGA = FGA;
		this.FGPCT = FGPCT;
		this.FG3M = FG3M;
		this.FG3A = FG3A;
		this.FG3PCT = FG3PCT;
		this.FTM = FTM;
		this.FTA = FTA;
		this.FTPCT = FTPCT;
		this.OREB = OREB;
		this.DREB = DREB;
		this.REB = REB;
		this.AST = AST;
		this.STL = STL;
		this.BLK = BLK;
		this.TONum = TONum;
		this.PFNum = PFNum;
		this.PTS = PTS;
		this.PLUSMINUS = PLUSMINUS;
	}
	
	public String getGameID(){
		return gameID;
	}

	public String getTeamID() {
		return teamID;
	}

	public void setTeamID(String teamID) {
		this.teamID = teamID;
	}

	public String getTeamName() {
		return teamName;
	}

	public void setTeamName(String teamName) {
		this.teamName = teamName;
	}

	public String getMIN() {
		return MIN;
	}

	public void setMIN(String mIN) {
		MIN = mIN;
	}

	public int getFGM() {
		return FGM;
	}

	public void setFGM(int fGM) {
		FGM = fGM;
	}

	public int getFGA() {
		return FGA;
	}

	public void setFGA(int fGA) {
		FGA = fGA;
	}

	public double getFGPCT() {
		return FGPCT;
	}

	public void setFGPCT(double fGPCT) {
		FGPCT = fGPCT;
	}

	public int getFG3M() {
		return FG3M;
	}

	public void setFG3M(int fG3M) {
		FG3M = fG3M;
	}

	public int getFG3A() {
		return FG3A;
	}

	public void setFG3A(int fG3A) {
		FG3A = fG3A;
	}

	public double getFG3PCT() {
		return FG3PCT;
	}

	public void setFG3PCT(double fG3PCT) {
		FG3PCT = fG3PCT;
	}

	public int getFTM() {
		return FTM;
	}

	public void setFTM(int fTM) {
		FTM = fTM;
	}

	public int getFTA() {
		return FTA;
	}

	public void setFTA(int fTA) {
		FTA = fTA;
	}

	public double getFTPCT() {
		return FTPCT;
	}

	public void setFTPCT(double fTPCT) {
		FTPCT = fTPCT;
	}

	public int getOREB() {
		return OREB;
	}

	public void setOREB(int oREB) {
		OREB = oREB;
	}

	public int getDREB() {
		return DREB;
	}

	public void setDREB(int dREB) {
		DREB = dREB;
	}

	public int getREB() {
		return REB;
	}

	public void setREB(int rEB) {
		REB = rEB;
	}

	public int getAST() {
		return AST;
	}

	public void setAST(int aST) {
		AST = aST;
	}

	public int getSTL() {
		return STL;
	}

	public void setSTL(int sTL) {
		STL = sTL;
	}

	public int getBLK() {
		return BLK;
	}

	public void setBLK(int bLK) {
		BLK = bLK;
	}

	public int getTONum() {
		return TONum;
	}

	public void setTONum(int tONum) {
		TONum = tONum;
	}

	public int getPFNum() {
		return PFNum;
	}

	public void setPFNum(int pFNum) {
		PFNum = pFNum;
	}

	public int getPTS() {
		return PTS;
	}

	public void setPTS(int pTS) {
		PTS = pTS;
	}

	public double getPLUSMINUS() {
		return PLUSMINUS;
	}

	public void setPLUSMINUS(double pLUSMINUS) {
		PLUSMINUS = pLUSMINUS;
	}

	public void setGameID(String gameID) {
		this.gameID = gameID;
	}
	
}
