package in.nit.service.impl;

import java.util.Collections;
import java.util.List;

import javax.transaction.Transactional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import in.nit.dao.IProductDao;
import in.nit.model.Product;
import in.nit.service.IProductService;

@Service
public class ProductServiceImpl implements IProductService {
	@Autowired
	private IProductDao dao;

	@Transactional
	public Integer saveProduct(Product product) {
		return dao.saveProduct(product);
	}

	@Transactional
	public List<Product> getAllProduct() {
		List<Product> list = dao.getAllProduct();
		Collections.sort(list, (o1, o2) -> o1.getProductId() - o2.getProductId());
		return list;
	}

	@Transactional
	public Product getOneProduct(Integer id) {
		return dao.getOneProduct(id);
	}

	@Transactional
	public void deleteProduct(Integer id) {
		dao.deleteProduct(id);
	}

	/*@Override
	public List<Product> getProductByPage(int pageid, int total) {
		return dao.getProductByPage(pageid, total);
	}*/

}
