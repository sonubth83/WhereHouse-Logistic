package in.nit.controller.rest;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import in.nit.model.OrderMethod;
import in.nit.service.IOrderMethodService;

@RestController
@RequestMapping("/rest/order")
public class OrderMethodRestController {

	@Autowired
	private IOrderMethodService service;
	
	@GetMapping("/all")
	public ResponseEntity<?> fetchAllOrder(){
		ResponseEntity<?> resp = null;
		try {
			List<OrderMethod> order = service.getAllOrderMethod();
			if(order != null && !order.isEmpty()){
				resp = new ResponseEntity<List<OrderMethod>>(order,HttpStatus.OK);
			}
			else {
				resp = new ResponseEntity<String>("Order Method Not Found",HttpStatus.NO_CONTENT);
			}
		}
		catch(Exception e) {
			resp = new ResponseEntity<String>("Unable to fetch data",HttpStatus.INTERNAL_SERVER_ERROR);
			e.printStackTrace();
		}
		return resp;
	}
	
	@GetMapping("/one")
	public ResponseEntity<?> getOneOrder(
			@RequestParam("id")Integer id
			){
		ResponseEntity<?> resp = null;
		try {
			OrderMethod order = service.getOneOrderType(id);
			if(order != null) {
				resp = new ResponseEntity<OrderMethod>(order,HttpStatus.OK);				
			}
			else {
				resp = new ResponseEntity<String>("Order Method '"+id+"' not Exist",HttpStatus.BAD_REQUEST);
			}
		}
		catch(Exception e) {
			resp = new ResponseEntity<String>("Unable to fetch Order Methd",HttpStatus.INTERNAL_SERVER_ERROR);
			e.printStackTrace();
		}
		return resp;
	}
	
	@PostMapping("/save")
	public ResponseEntity<String> saveOrderMethod(
			@RequestBody OrderMethod order
			){
		ResponseEntity<String> resp = null;
		try {
			Integer id = service.saveOrderMethod(order);
			resp = new ResponseEntity<String>("Uom '"+id+"' saved",HttpStatus.OK);
		}
		catch(Exception e) {
			resp = new ResponseEntity<String>("Unable to fetch Order Method",HttpStatus.INTERNAL_SERVER_ERROR);
			e.printStackTrace();
		}
		return resp;
	}
	
	@DeleteMapping("/remove")
	public ResponseEntity<String> deleteOrder(
			@RequestParam("id")Integer id
			){
		ResponseEntity<String> resp = null;
		try {
			service.deleteShipmentType(id);
			resp = new ResponseEntity<String>("Uom '"+id+"' Deleted",HttpStatus.OK);
		}
		catch(Exception e) {
			resp = new ResponseEntity<String>("Unable to Delete Order",HttpStatus.INTERNAL_SERVER_ERROR);
			e.printStackTrace();
		}
		return resp;
	}
	
	@PutMapping("/update")
	public ResponseEntity<String> updateOrder(
			@RequestBody OrderMethod order
			){
		ResponseEntity<String> resp = null;
		try {
			service.uploadOrderMethod(order);
			resp = new ResponseEntity<String>("Order Method '"+order.getOrderId()+"' Updated",HttpStatus.OK);
		}
		catch(Exception e) {
			resp = new ResponseEntity<String>("Unable to Update Order Method",HttpStatus.INTERNAL_SERVER_ERROR);
			e.printStackTrace();
		}
		return resp;
	}
}
