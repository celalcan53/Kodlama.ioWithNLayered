package kodlama_ioWebWithNLayered.business;

import java.util.ArrayList;
import java.util.List;

import kodlama_ioWebWithNLayered.core.logging.Logger;
import kodlama_ioWebWithNLayered.dataAccess.StudentDao;
import kodlama_ioWebWithNLayered.entities.Student;

public class StudentManager {

	private StudentDao studentDao;
	private Logger[] loggers;
	
	public StudentManager (StudentDao studentDao, Logger[] loggers) {
		this.studentDao=studentDao;
		this.loggers=loggers;
	}
	
	List<Student> students=new ArrayList<>();
	
	public void add (Student newStudent) throws Exception{
		for(Student student1:students) {
			if(student1.getName().equals(newStudent.getName())) {
				throw new Exception("Öğrenci mevcut!");
			}
		}
		
		
		students.add(newStudent);
		studentDao.add(newStudent);
		
		for(Logger logger:loggers) { //Database dosyası
			logger.log(newStudent.getName());
		}
	}
}
