package specialpo;

public class PlayerBasicInfo {
	
	private String id;
	private String name;
	private String team;
	private String position;
	private String height;
	private String weight;
	private String exp;
	private String jerseyNo;
	private String birthday;
	private String school;
	private String code;

	public PlayerBasicInfo() {
		id = "";
		name = "";
		team = "";
		position = "";
		height = "";
		weight = "";
		exp = "";
		jerseyNo = "";
		birthday = "";
		school = "";
		code = "";
	}

	public String getId() {
		return id;
	}

	public void setId(String id) {
		this.id = id;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getTeam() {
		return team;
	}

	public void setTeam(String team) {
		this.team = team;
	}

	public String getPosition() {
		return position;
	}

	public void setPosition(String position) {
		this.position = position;
	}

	public String getHeight() {
		return height;
	}

	public void setHeight(String height) {
		this.height = height;
	}

	public String getWeight() {
		return weight;
	}

	public void setWeight(String weight) {
		this.weight = weight;
	}

	public String getExp() {
		return exp;
	}

	public void setExp(String exp) {
		this.exp = exp;
	}

	public String getJerseyNo() {
		return jerseyNo;
	}

	public void setJerseyNo(String jerseyNo) {
		this.jerseyNo = jerseyNo;
	}

	public String getBirthday() {
		return birthday;
	}

	public void setBirthday(String birthday) {
		this.birthday = birthday;
	}

	public String getSchool() {
		return school;
	}

	public void setSchool(String school) {
		this.school = school;
	}

	public String getCode() {
		return code;
	}

	public void setCode(String urlName) {
		this.code = urlName;
	}

	@Override
	public String toString() {
		return "PlayerBasicInfo [id=" + id + ", name=" + name + ", team="
				+ team + ", position=" + position + ", height=" + height
				+ ", weight=" + weight + ", exp=" + exp + ", jerseyNo="
				+ jerseyNo + ", birthday=" + birthday + ", school=" + school
				+ ", urlName=" + code + "]";
	}

}
