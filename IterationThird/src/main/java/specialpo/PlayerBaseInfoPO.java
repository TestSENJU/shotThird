package specialpo;

public class PlayerBaseInfoPO {
	String EnglishName;
	String name;
	String team;
	String position;
	String height;
	String weight;
	String experience;
	//String nationality;

	public PlayerBaseInfoPO(String EnglishName, String name, String team,
			String position, String height, String weight, String experience
			) {
		this.EnglishName = EnglishName;
		this.name = name;
		this.team = team;
		this.position = position;
		this.height = height;
		this.weight = weight;
		this.experience = experience;
		//this.nationality = nationality;
	}

	public PlayerBaseInfoPO() {

	}
	
	public String getEnglishName(){
		return EnglishName;
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

	public String getExperience() {
		return experience;
	}

	public void setExperience(String experience) {
		this.experience = experience;
	}

/*	public String getNationality() {
		return nationality;
	}

	public void setNationality(String nationality) {
		this.nationality = nationality;
	}*/

	public void setEnglishName(String englishName) {
		EnglishName = englishName;
	}
	
}
