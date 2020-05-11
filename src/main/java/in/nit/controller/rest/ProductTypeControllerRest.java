package in.nit.controller.rest;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import in.nit.service.IProductService;

@RestController
@RequestMapping("/rest")
public class ProductTypeControllerRest {
	@Autowired
	private IProductService service;

	public ResponseEntity<?> getAllProduct() {
		
		
		return null;
	}

}
