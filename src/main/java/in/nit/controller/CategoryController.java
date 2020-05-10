package in.nit.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import static org.springframework.web.bind.annotation.RequestMethod.POST;

import in.nit.model.Category;
import in.nit.service.ICategoryService;

@Controller
@RequestMapping("/category")
public class CategoryController {
	@Autowired
	private ICategoryService service;
	
	@RequestMapping("/register")
	public String showCategory() {
		return "CategoryRegister";
	}
	
	@RequestMapping(value="/insert",method=POST)
	public String saveCategory(
			@ModelAttribute Category category,
			Model model
			) {
		Integer id = service.saveCategory(category);
		String message = "Category '"+id+"' saved";
		model.addAttribute("message", message);
		return "CategoryRegister";
	}
}
