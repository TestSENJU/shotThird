package specialpo;

public class TeamBasicInfo {

	private String id;
	private String fullName;
	private String abbreviation;
	private String location;
	private String division;
	private String section;
	private String setUpTime;
	private String code;
	
	public TeamBasicInfo() {
		id = "";
		fullName = "";
		abbreviation = "";
		location = "";
		division = "";
		section = "";
		setUpTime = "";
		code = "";
	}

	public String getId() {
		return id;
	}

	public void setId(String id) {
		this.id = id;
	}

	public String getFullName() {
		return fullName;
	}

	public void setFullName(String fullName) {
		this.fullName = fullName;
	}

	public String getAbbreviation() {
		return abbreviation;
	}

	public void setAbbreviation(String abbreviation) {
		this.abbreviation = abbreviation;
	}

	public String getLocation() {
		return location;
	}

	public void setLocation(String location) {
		this.location = location;
	}

	public String getDivision() {
		return division;
	}

	public void setDivision(String division) {
		this.division = division;
	}

	public String getSection() {
		return section;
	}

	public void setSection(String section) {
		this.section = section;
	}

	public String getSetUpTime() {
		return setUpTime;
	}

	public void setSetUpTime(String setUpTime) {
		this.setUpTime = setUpTime;
	}

	public String getCode() {
		return code;
	}

	public void setCode(String code) {
		this.code = code;
	}

	@Override
	public String toString() {
		return "TeamBasicInfo [id=" + id + ", fullName=" + fullName
				+ ", abbreviation=" + abbreviation + ", location=" + location
				+ ", division=" + division + ", section=" + section
				+ ", setUpTime=" + setUpTime + ", code=" + code + "]";
	}

}
