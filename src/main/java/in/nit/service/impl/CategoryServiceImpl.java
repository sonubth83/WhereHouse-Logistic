package in.nit.service.impl;

import java.util.List;

import javax.transaction.Transactional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import in.nit.dao.ICategoryDao;
import in.nit.model.Category;
import in.nit.service.ICategoryService;

@Service
public class CategoryServiceImpl implements ICategoryService {
	@Autowired
	private ICategoryDao dao;

	@Transactional
	public Integer saveCategory(Category category) {
		return dao.saveCategory(category);
	}

	@Transactional
	public List<Object[]> getCategoryIdAndName() {
		return dao.getCategoryIdAndName();
	}

	
}
