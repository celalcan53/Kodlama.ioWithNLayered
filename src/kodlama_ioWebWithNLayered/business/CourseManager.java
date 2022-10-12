package kodlama_ioWebWithNLayered.business;

import kodlama_ioWebWithNLayered.core.logging.Logger;
import kodlama_ioWebWithNLayered.dataAccess.CategoryDao;
import kodlama_ioWebWithNLayered.dataAccess.CourseDao;
import kodlama_ioWebWithNLayered.entities.Course;

public class CourseManager {
	
	private CourseDao courseDao;
	private Logger[] loggers;
	
	public CourseManager (CourseDao courseDao, Logger[] loggers) {
		this.courseDao= courseDao;
		this.loggers= loggers;
	}
	
	public void add(Course course) throws Exception {
		
		if(course.getPrice()<0) {
			throw new Exception("Kursun fiyatı 0'dan küçük olamaz!");
		}
		
		courseDao.add(course);
		
		for(Logger logger:loggers) { //Database dosyası
			logger.log(course.getDescription());
		
	}
 
}
	
}
