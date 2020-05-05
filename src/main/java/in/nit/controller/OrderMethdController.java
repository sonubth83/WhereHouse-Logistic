package in.nit.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import static org.springframework.web.bind.annotation.RequestMethod.POST;
import org.springframework.web.bind.annotation.RequestParam;

import in.nit.model.OrderMethod;
import in.nit.service.IOrderMethodService;

@Controller
@RequestMapping("/order")
public class OrderMethdController {
	@Autowired
	private IOrderMethodService service;
	
	@RequestMapping("/register")
	public String showOrderMethod() {
		return "OrderMethodRegister";
	}
	
	@RequestMapping(value="/insert",method=POST)
	public String saveOrderMethod(
			@ModelAttribute OrderMethod orderMethod,
			Model model
			) {
		Integer id = service.saveOrderMethod(orderMethod);
		String message = "Order Method '"+id+"' saved";
		model.addAttribute("message", message);
		return "OrderMethodRegister";
	}
	
	@RequestMapping("/all")
	public String getAllOrderMethod(Model model) {
		List<OrderMethod> list = service.getAllOrderMethod();
		model.addAttribute("list", list);
		return "OrderMethodData";
	}
	
	@RequestMapping("/delete")
	public String deleteById(
			@RequestParam("oid")Integer id,
			Model model
			) {
		service.deleteShipmentType(id);
		String msg = id+" deleted";
		model.addAttribute("message", msg);
		
		List<OrderMethod> list = service.getAllOrderMethod();
		model.addAttribute("list", list);
		return "OrderMethodData";
	}
	
	@RequestMapping("/edit")
	public String showEditPage(
			@RequestParam("oid")Integer id,
			Model model
			) {
		OrderMethod order = service.getOneOrderType(id);
		model.addAttribute("orderMethod", order);
		return "OrderMethodEdit";
	}
	
	@RequestMapping(value="/update",method=POST)
	public String uploadOrderMethod(
			@ModelAttribute OrderMethod orderMethod,
			Model model
			) {
		service.uploadOrderMethod(orderMethod);
		String str = "Order Method '"+orderMethod.getOrderId()+"' Updated";
		model.addAttribute("message", str);
		
		List<OrderMethod> list = service.getAllOrderMethod();
		model.addAttribute("list", list);
		return "OrderMethodData";
	}
	
	@RequestMapping("/view")
	public String viewOrderMethod(
			@RequestParam("oid")Integer id,
			Model model
			) {
		OrderMethod view = service.getOneOrderType(id);
		model.addAttribute("view", view);
		return "OrderMethodView";
	}
}
