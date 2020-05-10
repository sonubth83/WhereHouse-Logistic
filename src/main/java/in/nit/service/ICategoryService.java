package in.nit.service;

import java.util.List;

import in.nit.model.Category;

public interface ICategoryService {
	
	Integer saveCategory(Category category);

	public List<Object[]> getCategoryIdAndName();

}
