package in.nit.controller.rest;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import in.nit.model.WhUserType;
import in.nit.service.IWhUserTypeService;

@RestController
@RequestMapping("/rest/whuser")
public class WhUserRestController {
	@Autowired
	private IWhUserTypeService service;
	
	public ResponseEntity<?> fetchWhUSer(){
		ResponseEntity<?> resp = null;
		try {
			List<WhUserType> whUser = service.getAllWhUser();
			if(whUser != null && !whUser.isEmpty()) {
				resp = new ResponseEntity<List<WhUserType>>(whUser,HttpStatus.OK);
			}
			else {
				resp = new ResponseEntity<String>("WhUser Not Found",HttpStatus.NO_CONTENT);
			}
		}
		catch(Exception e) {
			resp = new ResponseEntity<String>("Unable to fetch",HttpStatus.INTERNAL_SERVER_ERROR);
			e.printStackTrace();
		}
		return resp;
	}

}
