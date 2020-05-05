package in.nit.service.impl;

import java.util.Collections;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import in.nit.dao.IWhUserTypeDao;
import in.nit.model.WhUserType;
import in.nit.service.IWhUserTypeService;

@Service
public class WhUserTypeServiceImpl implements IWhUserTypeService {

	@Autowired
	private IWhUserTypeDao dao;

	@Transactional
	public Integer saveWhUserType(WhUserType whuser) {
		return dao.saveWhUserType(whuser);
	}

	@Transactional
	public List<WhUserType> getAllWhUser() {
		List<WhUserType> list = dao.getAllWhUser();
		Collections.sort(list, (o1, o2) -> o1.getWhUserId() - o2.getWhUserId());
		return list;
	}

	@Transactional
	public WhUserType getOneWhUSer(Integer id) {
		return dao.getOneWhUSer(id);
	}

	@Transactional
	public void deleteWhUserType(Integer id) {
		dao.deleteWhUserType(id);
	}

	@Transactional
	public void updateWhUserType(WhUserType whuser) {
		dao.updateWhUserType(whuser);
	}

	@Transactional(readOnly = true)
	public List<Object[]> getWhUserIdAndVendor(String userType) {
		return dao.getWhUserIdAndVendor(userType);
	}
}
