package kodlama_ioWebWithNLayered.dataAccess;

import kodlama_ioWebWithNLayered.entities.Course;

public class HibernateCourseDao implements CourseDao{

	@Override
	public void add(Course course) {
		System.out.println("Hibernate aracılığıyla veri tabanına eklendi!");
		
	}

	
}
