package kodlama_ioWebWithNLayered.business;

import java.util.ArrayList;
import java.util.List;

import kodlama_ioWebWithNLayered.core.logging.Logger;
import kodlama_ioWebWithNLayered.dataAccess.InstructorDao;
import kodlama_ioWebWithNLayered.entities.Course;
import kodlama_ioWebWithNLayered.entities.Instructor;

public class InstructorManager {

	private InstructorDao instructorDao;
	private Logger[] loggers;

	public InstructorManager(InstructorDao instructorDao, Logger[] loggers) {
		this.instructorDao = instructorDao;
		this.loggers = loggers;
	}
	
	List<Instructor> instructors=new ArrayList<>();

	public void add(Instructor newInstructor) throws Exception {

		for(Instructor instructor1: instructors) {
			if(instructor1.getName().equals(newInstructor.getName())) {
				throw new Exception("Böyle bir eğitmen bulunmaktadır.");
			}
		}
		
		instructors.add(newInstructor);
		instructorDao.add(newInstructor);
		
		for(Logger logger:loggers) { //Database dosyası
			logger.log(newInstructor.getDescription());
		}
		

		}

	}

