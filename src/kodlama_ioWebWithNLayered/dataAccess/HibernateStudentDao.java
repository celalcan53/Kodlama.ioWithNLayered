package kodlama_ioWebWithNLayered.dataAccess;

import kodlama_ioWebWithNLayered.entities.Student;

public class HibernateStudentDao implements StudentDao {

	@Override
	public void add(Student student) {
		System.out.println("Hibernate aracılığıyla veri tabanına eklendi!");
		
	}
}
