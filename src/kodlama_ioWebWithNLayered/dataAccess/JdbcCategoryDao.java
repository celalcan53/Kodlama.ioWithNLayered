package kodlama_ioWebWithNLayered.dataAccess;

import java.util.Locale.Category;

public class JdbcCategoryDao implements CategoryDao {

	@Override
	public void add(kodlama_ioWebWithNLayered.entities.Category category) {
		System.out.println("JDBC aracılığıyla veri tabanına eklendi!");
		
	}

}
