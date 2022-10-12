package kodlama_ioWebWithNLayered.dataAccess;

import kodlama_ioWebWithNLayered.entities.Course;

public class JdbcCourseDao implements CourseDao {

	@Override
	public void add(Course course) {
		System.out.println("JDBC aracılığıyla veri tabanına eklendi!");
		
	}
	

	
}
