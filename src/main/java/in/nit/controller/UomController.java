package in.nit.controller;

import static org.springframework.web.bind.annotation.RequestMethod.POST;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;

import in.nit.model.Uom;
import in.nit.service.IUomService;

@Controller
@RequestMapping("/uom")
public class UomController {
	
	@Autowired
	private IUomService service;

	@RequestMapping("/register")
	public String showUom() {
		return "UomRegistration";
	}
	
	@RequestMapping(value="/save",method=POST)
	public String saveUom(
			@ModelAttribute Uom uom,
			Model model
			) {
		Integer id = service.saveUom(uom);
		String message = "UOM '"+id+"' Saved";
		model.addAttribute("message", message);
		return "UomRegistration";
	}
	
	@RequestMapping("/all")
	public String getAllUom(Model model) {
		List<Uom> list = service.getAllUom();
		model.addAttribute("list", list);
		return "UomData";
	}
	
	@RequestMapping("/view")
	public String getOneUomData(
			@RequestParam("ummid")Integer id,
			Model model
			) {
		Uom uom = service.getOneUom(id);
		model.addAttribute("uom", uom);
		return "UomShowData";
	}
	
	@RequestMapping("/delete")
	public String deleteUomData(
			@RequestParam("ummid")Integer id,
			Model model
			) {
		service.deleteUom(id);
		String message = "Uom '"+id+"' Deleted";
		model.addAttribute("message", message);
		
		List<Uom> list = service.getAllUom();
		model.addAttribute("list", list);
		return "UomData";
	}
	
	@RequestMapping("/edit")
	public String editUom(
			@RequestParam("ummid")Integer id,
			Model model) {
		Uom uom = service.getOneUom(id);
		model.addAttribute("uom", uom);
		return "UomEditData";
	}
	
	@RequestMapping(value="/update",method=POST)
	public String updateUom(
			@ModelAttribute Uom uom,
			Model model
			) {
		service.updateUom(uom);
		String message = "Shipment '"+uom.getUomId()+"' Updated";
		model.addAttribute("message", message);
		
		List<Uom> list = service.getAllUom();
		model.addAttribute("list", list);
		return "UomData";
	}
	
}
