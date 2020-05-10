package in.nit.service;

import java.util.List;

import in.nit.model.Product;

public interface IProductService {

	Integer saveProduct(Product product);

	public List<Product> getAllProduct();

	public Product getOneProduct(Integer id);

	public void deleteProduct(Integer id);
	
	
	//public List<Product> getProductByPage(int pageid,int total);
}
