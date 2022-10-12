package kodlama_ioWebWithNLayered.dataAccess;

import kodlama_ioWebWithNLayered.entities.Student;

public class JdbcStudentDao implements StudentDao{

	@Override
	public void add(Student student) {
		System.out.println("JDBC aracılığıyla veri tabanına eklendi!");
		
	}
}
