package kodlama_ioWebWithNLayered;

import kodlama_ioWebWithNLayered.business.CategoryManager;
import kodlama_ioWebWithNLayered.business.CourseManager;
import kodlama_ioWebWithNLayered.business.InstructorManager;
import kodlama_ioWebWithNLayered.business.StudentManager;
import kodlama_ioWebWithNLayered.core.logging.DatabaseLogger;
import kodlama_ioWebWithNLayered.core.logging.FileLogger;
import kodlama_ioWebWithNLayered.core.logging.Logger;
import kodlama_ioWebWithNLayered.core.logging.MailLogger;
import kodlama_ioWebWithNLayered.dataAccess.HibernateCategoryDao;
import kodlama_ioWebWithNLayered.dataAccess.HibernateStudentDao;
import kodlama_ioWebWithNLayered.dataAccess.JdbcCourseDao;
import kodlama_ioWebWithNLayered.dataAccess.JdbcInstructorDao;
import kodlama_ioWebWithNLayered.entities.Category;
import kodlama_ioWebWithNLayered.entities.Course;
import kodlama_ioWebWithNLayered.entities.Instructor;
import kodlama_ioWebWithNLayered.entities.Student;

public class Main {

	public static void main(String[] args) throws Exception {
		
		Category category1 =new Category(1, "Kategori-1");
		Category category2=new Category(2,"Kategori-1");
		Course course1=new Course(1, "Java Kursu", 24.99, "İleri Seviye Java Kursu");
		Course course2=new Course(2, "Java Kursu", -5, "İleri Seviye Java Kursu");
		Instructor instructor1=new Instructor(1, "Ali Kırgız", 32, "Ali Kırgız, Senior Java Developer", "Halkbank ve İş Bankası");
		Instructor instructor2=new Instructor(2, "Ali Kırgız", 32, "Ali Kırgız, Senior Java Developer", "Halkbank ve İş Bankası");
		Student student1 =new Student(1,"Cem Can", 21, "Başlangıç Seviyesi Java Kursu");
		Student student2 =new Student(1,"Cem Can", 21, "Başlangıç Seviyesi Java Kursu");
	
		
		Logger[] loggers = {new DatabaseLogger(), new FileLogger(), new MailLogger()};
		
		System.out.println("-------------------------------------");
		CategoryManager categoryManager= new CategoryManager(new HibernateCategoryDao(), loggers);
		categoryManager.add(category1);
		System.out.println("-------------------------------------");
		CourseManager courseManager = new CourseManager(new JdbcCourseDao(), loggers);
		courseManager.add(course1);
		System.out.println("-------------------------------------");
		InstructorManager instructorManager =new InstructorManager(new JdbcInstructorDao(), loggers);
		instructorManager.add(instructor1);
		System.out.println("-------------------------------------");
		StudentManager studentManager=new StudentManager(new HibernateStudentDao(), loggers);
		studentManager.add(student1);
		System.out.println("-----------------Error Logs-------------------");
		//categoryManager.add(category2); // Aynı isimde kategori durumu!
		System.out.println("-------------------------------------");
		// courseManager.add(course2); // Kurs fiyatının 0'dan az olması durumu!
		System.out.println("-------------------------------------");
	    // instructorManager.add(instructor2); // Aynı isimde eğitmen durumu!
		System.out.println("-------------------------------------");
		// studentManager.add(student2); // Aynı isimde öğrenci durumu!
	}

}
