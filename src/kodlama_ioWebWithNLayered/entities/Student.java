package kodlama_ioWebWithNLayered.entities;

public class Student {
	
	private int id;
	private String name;
	private int age;
    private String courses;
    
    
    public Student() {}


	public Student(int id, String name, int age, String courses) {
		this.id = id;
		this.name = name;
		this.age = age;
		this.courses = courses;
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


	public String getCourses() {
		return courses;
	}


	public void setCourses(String courses) {
		this.courses = courses;
	}
	
	
    
    
}
