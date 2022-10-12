package kodlama_ioWebWithNLayered.entities;

public class Instructor {
	
	private int id;
	private String name;
	private int age;
	private String description;
	private String career;
	
	public Instructor() {}

	public Instructor(int id, String name, int age, String description, String career) {
		this.id = id;
		this.name = name;
		this.age = age;
		this.description = description;
		this.career = career;
	}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public int getAge() {
		return age;
	}

	public void setAge(int age) {
		this.age = age;
	}

	public String getDescription() {
		return description;
	}

	public void setDescription(String description) {
		this.description = description;
	}

	public String getCareer() {
		return career;
	}

	public void setCareer(String career) {
		this.career = career;
	}
	
	
	

}
