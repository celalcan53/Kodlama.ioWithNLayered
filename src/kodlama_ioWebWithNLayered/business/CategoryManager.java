package kodlama_ioWebWithNLayered.business;

import java.util.ArrayList;
import java.util.List;

import kodlama_ioWebWithNLayered.core.logging.Logger;
import kodlama_ioWebWithNLayered.dataAccess.CategoryDao;
import kodlama_ioWebWithNLayered.entities.Category;
import kodlama_ioWebWithNLayered.entities.Instructor;

public class CategoryManager {

	private CategoryDao categoryDao;
	private Logger[] loggers;
	
	public CategoryManager(CategoryDao categoryDao, Logger[] loggers) {
		this.categoryDao= categoryDao;
		this.loggers= loggers;
	}
	
	List<Category> categories=new ArrayList<>();
	
	public  void add(Category newCategory) throws Exception{
		
		for(Category category1:categories) {
			if (category1.getName().equals(newCategory.getName())) {
				throw new Exception("Böyle bir kategori mevcut!");
			}
		}
		
		categories.add(newCategory);
		categoryDao.add(newCategory);
		
		for(Logger logger:loggers) { //Database dosyası
			logger.log(newCategory.getName());
		}
	}
}
