package in.nit.controller;

import static org.springframework.web.bind.annotation.RequestMethod.POST;

import java.util.List;
import java.util.Map;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;

import in.nit.model.Part;
import in.nit.service.IPartService;
import in.nit.service.IUomService;
import in.nit.util.CommonUtil;

@Controller
@RequestMapping("/part")
public class PartController {
	@Autowired
	private IPartService service;
	
	@Autowired
	private IUomService uomService;
	
	/*@Autowired
	private IOrderMethodService orderMethodService;*/

	@RequestMapping("/register")
	public String showPage(Model model) {
		model.addAttribute("partType", new Part());
		commonUi(model);
		return "PartRegister";
	}
	
	//@SuppressWarnings("unused")
	private void commonUi(Model model) {
		List<Object[]> list = uomService.getUomIdAndUomModel();
		Map<Integer,String> uomMap = CommonUtil.convert(list);
		model.addAttribute("uomMap", uomMap);
		
		
		/*List<Object[]> omPurchaseList = orderMethodService.getOrderIdAndOrderCode("Purchage");
		Map<Integer,String> omPurchaseMap = CommonUtil.convert(omPurchaseList);
		model.addAttribute("omPurchaseMap", omPurchaseMap);*/
	}
	
	@RequestMapping(name="/save", method=POST)
	public String showRegister(
			@ModelAttribute Part part,
			Model model
			) {
		Integer id = service.savePart(part);
		model.addAttribute("part", new Part());
		String message = "Part '"+id+"' saved";
		model.addAttribute("message", message);
		return "ShipmentTypeRegister";
	}
	
	
	
	
	

}
