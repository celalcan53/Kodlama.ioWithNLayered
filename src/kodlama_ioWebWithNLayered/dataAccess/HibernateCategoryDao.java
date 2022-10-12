package kodlama_ioWebWithNLayered.dataAccess;

import java.util.Locale.Category;

public class HibernateCategoryDao implements CategoryDao{

	@Override
	public void add(kodlama_ioWebWithNLayered.entities.Category category) {
		System.out.println("Hibernate aracılığıyla veri tabanına eklendi!");
		
	}

	
}
