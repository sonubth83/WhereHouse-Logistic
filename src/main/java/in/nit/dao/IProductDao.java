package in.nit.dao;

import java.util.List;

import in.nit.model.Product;

public interface IProductDao {
	Integer saveProduct(Product product);

	public List<Product> getAllProduct();

	public Product getOneProduct(Integer id);

	public void deleteProduct(Integer id);
	
}
