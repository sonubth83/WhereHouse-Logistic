package in.nit.dao.impl;

import java.util.List;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.orm.hibernate5.HibernateTemplate;
import org.springframework.stereotype.Repository;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;

import in.nit.dao.IProductDao;
import in.nit.model.Product;

@Repository
public class ProductDaoImpl implements IProductDao {
	@Autowired
	private HibernateTemplate ht;

	private JdbcTemplate template;

	public void setJdbc(JdbcTemplate template) {
		this.template = template;
	}

	@Override
	public Integer saveProduct(Product product) {
		return (Integer) ht.save(product);
	}

	@Override
	public List<Product> getAllProduct() {
		return ht.loadAll(Product.class);
	}

	@Override
	public Product getOneProduct(Integer id) {
		return ht.get(Product.class, id);
	}

	@Override
	public void deleteProduct(Integer id) {
		ht.delete(new Product(id));
	}

}
