package in.nit.controller;

import static org.springframework.web.bind.annotation.RequestMethod.POST;
import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;

import in.nit.model.WhUserType;
import in.nit.service.IWhUserTypeService;

@Controller
@RequestMapping("/whuser")
public class WhUserTypeController {
	
	@Autowired
	private IWhUserTypeService service;

	@RequestMapping("/register")
	public String showWhUserType(Model model) {
		model.addAttribute("whUserType", new WhUserType());
		return "WHUserTypeRegister";
	}
	
	@RequestMapping(value="/save",method=POST)
	private String saveWhUserType(
			@ModelAttribute WhUserType whUserType,
			Model model
			) {
		Integer id = service.saveWhUserType(whUserType);
		model.addAttribute("whUserType", new WhUserType());
		String message = "WhUserType '"+id+"' Saved";
		model.addAttribute("message", message);
		return "WHUserTypeRegister";
	}
	
	@RequestMapping("/all")
	public String getAllWhUserType(
			Model model
			) {
		List<WhUserType> list = service.getAllWhUser();
		model.addAttribute("list", list);
		return "WhUserTypeData";
	}
	
	@RequestMapping("/view")
	public String getOneWhUserType(
			@RequestParam("whid")Integer id,
			Model model
			) {
		WhUserType whuser = service.getOneWhUSer(id);
		model.addAttribute("ob", whuser);
		return "WhUserViewData";
	}
	
	@RequestMapping("/delete")
	public String deleteWhUserType(
			@RequestParam("whid")Integer id,
			Model model
			) {
		service.deleteWhUserType(id);
		String message = "WhUser '"+id+"' deleted";
		model.addAttribute("message", message);
		
		List<WhUserType> list = service.getAllWhUser();
		model.addAttribute("list", list);
		return "WhUserTypeData";
	}
	
	@RequestMapping("/edit")
	public String editWhUser(
			@RequestParam("whid")Integer id,
			Model model
			) {
		WhUserType user = service.getOneWhUSer(id);
		model.addAttribute("whUserType", user);
		return "WhUserTypeEditData";
	}
	
	@RequestMapping(value="/update", method=POST)
	public String updateWhUser(
			@ModelAttribute WhUserType whUserType,
			Model model) {
		service.updateWhUserType(whUserType);
		String message = "WhUser '"+whUserType.getWhUserId()+"' Updated";
		model.addAttribute("message", message);
		
		List<WhUserType> list =  service.getAllWhUser();
		model.addAttribute("list", list);
		return "WhUserTypeData";
	}
}
