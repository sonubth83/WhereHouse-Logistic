package in.nit.controller;

import static org.springframework.web.bind.annotation.RequestMethod.POST;

import java.util.Arrays;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.servlet.ModelAndView;

import in.nit.model.ShipmentType;
import in.nit.service.IShipmentTypeService;
import in.nit.view.ShipmentTypeExcelView;
import in.nit.view.ShipmentTypePdfView;

@Controller
@RequestMapping("/shipment")
public class ShipmentTypeController {
	@Autowired
	private IShipmentTypeService service;

	/**
	 * 1.method to display the ui url:shipment,get type
	 */
	@RequestMapping("/register")
	public String showShipmentType( Model model) {
		model.addAttribute("shipmentType", new ShipmentType());
		return "ShipmentTypeRegister";
	}


	/**
	 * @ModelAttribute is read the object & model class is to send back data
	 * @param shipmenttype
	 * @param model
	 * @return
	 */
	@RequestMapping(value = "/insert", method = POST)
	public String saveShipment(
			@ModelAttribute ShipmentType shipmentType, 
			Model model
			) {
		Integer id = service.saveShipmentType(shipmentType);
		model.addAttribute("shipmentType", new ShipmentType());
		String message = "Shipment Type '" + id + "' saved";
		model.addAttribute("message", message);
		return "ShipmentTypeRegister";
	}

	/**
	 * @param model : getAllShipmentType
	 * url : all
	 * @return : ShipmentTypeData
	 */
	@RequestMapping("/all")
	public String getAllShipmentType(Model model) {
		List<ShipmentType> list = service.getAllShipmentType();
		model.addAttribute("list", list);
		return "ShipmentTypeData";
	}

	@RequestMapping("/delete")
	public String deleteShipment(
			@RequestParam("sid")Integer id, 
			Model model
			) {
		service.deleteShipmentType(id);
		String message = "Shipment '" + id + "' Deleted";
		model.addAttribute("message", message);

		// fetch new Data
		List<ShipmentType> list = service.getAllShipmentType();
		model.addAttribute("list", list);
		return "ShipmentTypeData";
	}
	
	/**
	 * url : /edit
	 * method : showEditPage
	 * return ShipmentTypeEdit
	 */
	@RequestMapping("/edit")
	public String showEditPage(
			@RequestParam("sid")Integer id,
			Model model
			) {
		ShipmentType ship = service.getOneShipmentType(id);
		model.addAttribute("shipmentType", ship);
		return "ShipmentTypeEdit";
	}
	
	/**
	 * url : edit
	 * method : updateShipmentType
	 * retyrn ShipmentTypeData
	 */
	@RequestMapping("/update")
	public String updateShipmentType(
			@ModelAttribute ShipmentType shipmentType,
			Model model
			) {
		service.updateShipmentType(shipmentType);
		String message = "Shipment '"+shipmentType.getShipId()+"' Update";
		model.addAttribute("message", message);
		
		List<ShipmentType> list = service.getAllShipmentType();
		model.addAttribute("list", list);
		return "ShipmentTypeData";
	}
	
	/**
	 * View Page
	 * url : /view
	 * method : showOneShipment
	 * page : ShipmentTypeView
	 */
	@RequestMapping("/view")
	public String showOneSipment(
			@RequestParam("sid")Integer id,
			Model model
			) {
		ShipmentType st = service.getOneShipmentType(id);
		model.addAttribute("ob", st);
		return "ShipmentTypeView";
	}
	
	/*
	 * Excel Generate
	 */
	@RequestMapping("/excel")
	public ModelAndView showExcel(
			@RequestParam (value="id", required=false)
			Integer id
			) {
		ModelAndView mav = new ModelAndView();
		mav.setView(new ShipmentTypeExcelView());
		
		if(id==null) {
			List<ShipmentType> list = service.getAllShipmentType();
			mav.addObject("list", list);			
		}
		else {
			ShipmentType st = service.getOneShipmentType(id);
			mav.addObject("lisrt", Arrays.asList(st));
		}
		
		return mav;
	}
	
	@RequestMapping("/pdf")
	public ModelAndView showPdf() {
		ModelAndView mav = new ModelAndView();
		mav.setView(new ShipmentTypePdfView());
		List<ShipmentType> list = service.getAllShipmentType();
		//send data to pdf file
		mav.addObject("list", list);
		return mav;
	}
}
