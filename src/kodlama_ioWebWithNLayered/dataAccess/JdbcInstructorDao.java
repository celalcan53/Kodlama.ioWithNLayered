package kodlama_ioWebWithNLayered.dataAccess;

import kodlama_ioWebWithNLayered.entities.Instructor;

public class JdbcInstructorDao implements InstructorDao{

	@Override
	public void add(Instructor instructor) {
		System.out.println("JDBC aracılığıyla veri tabanına eklendi!");
		
	}

	
}
