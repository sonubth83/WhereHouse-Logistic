package in.nit.dao.impl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.orm.hibernate5.HibernateTemplate;
import org.springframework.stereotype.Repository;

import in.nit.dao.ICategoryDao;
import in.nit.model.Category;

@Repository
public class CategoryDaoImpl implements ICategoryDao {
	@Autowired
	private HibernateTemplate ht;

	@Override
	public Integer saveCategory(Category category) {
		return (Integer) ht.save(category);
	}

	@SuppressWarnings({ "deprecation", "unchecked" })
	@Override
	public List<Object[]> getCategoryIdAndName() {
		String hql = " select categoryId,categoryName from " + Category.class.getName();
		return (List<Object[]>) ht.find(hql);
	}
}
