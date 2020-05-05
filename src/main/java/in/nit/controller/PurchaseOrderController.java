package in.nit.controller;

import static org.springframework.web.bind.annotation.RequestMethod.POST;

import java.util.List;
import java.util.Map;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;

import in.nit.model.PurchaseDtl;
import in.nit.model.PurchaseOrder;
import in.nit.service.IPartService;
import in.nit.service.IPurchaseOrderService;
import in.nit.service.IShipmentTypeService;
import in.nit.service.IWhUserTypeService;
import in.nit.util.CommonUtil;

@Controller
@RequestMapping("/purchase")
public class PurchaseOrderController {

	@Autowired
	private IPurchaseOrderService service;
	
	@Autowired
	private IPartService partService;

	@Autowired
	private IShipmentTypeService shipService;
	
	@Autowired
	private IWhUserTypeService whUserTypeService;
	
	
	public void CommonUi(Model model) {
		List<Object[]> shipList = shipService.getShipIdAndCode();
		Map<Integer, String> shipMap = CommonUtil.convert(shipList);
		model.addAttribute("shipMap", shipMap);
		
		List<Object[]> whUserList = whUserTypeService.getWhUserIdAndVendor("Vendor");
		Map<Integer, String> whUserMap  = CommonUtil.convert(whUserList);
		model.addAttribute("whUserMap", whUserMap);
	}
	
	/*public void whUserCommonUi(Model model) {
		List<Object[]> whUserList = whUserTypeService.getWhUserIdAndVendor("Vendor");
		Map<Integer, String> whUserMap  = CommonUtil.convert(whUserList);
		model.addAttribute("whUserMap", whUserMap);
	}*/

	@RequestMapping("/register")
	public String showPurchaseOrder(Model model) {
		PurchaseOrder po = new PurchaseOrder();
		po.setDefStatus("OPEN");
		model.addAttribute("purchaseOrder", po);
		CommonUi(model);
		//whUserCommonUi(model);
		return "PurchaseOrderRegister";
	}
	
	@RequestMapping(value="/save",method=POST)
	public String savePurchaseOrder(
			@ModelAttribute PurchaseOrder purchaseOrder,
			Model model
			) {
		Integer id = service.savePurchaseOrder(purchaseOrder);
		model.addAttribute("purchaseOrder",new PurchaseOrder());
		String message = "Purchase Order '"+id+"' saved";
		model.addAttribute("message", message);
		CommonUi(model);
		return "PurchaseOrderRegister";
	}
	
	@RequestMapping("/all")
	public String getAllPurchaseOrder(
			Model model
			) {
		List<PurchaseOrder> list = service.getAllPurchaseOrder();
		model.addAttribute("list", list);
		return "PurchaseOrderData";
	}
	
	@RequestMapping("/get")
	public String getOnePurchaseOrder(
			@RequestParam()Integer id,
			Model model
			) {
		PurchaseOrder order = service.getOnePurchaseOrder(id);
		model.addAttribute("order", order);
		return "";
	}
	
	
	public String showChild(
			@RequestParam("partId")Integer partId,
			Model model
			) {
		PurchaseOrder po = service.getOnePurchaseOrder(partId);
		model.addAttribute("po", po);
		
		model.addAttribute("purchaseDtl", new PurchaseDtl());
		
		//Drop Down Data
		//List<Object[]> partsList = partService.get
		return null;
	}

	
}
