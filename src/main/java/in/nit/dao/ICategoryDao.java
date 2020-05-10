package in.nit.dao;

import java.util.List;

import in.nit.model.Category;

public interface ICategoryDao {
	Integer saveCategory(Category category);

	public List<Object[]> getCategoryIdAndName();
}
