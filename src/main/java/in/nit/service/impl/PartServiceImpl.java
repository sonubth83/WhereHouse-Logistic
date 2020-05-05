package in.nit.service.impl;

import java.util.Collections;
import java.util.List;

import javax.transaction.Transactional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import in.nit.dao.IPartDao;
import in.nit.model.Part;
import in.nit.service.IPartService;

@Service
public class PartServiceImpl implements IPartService {
	@Autowired
	private IPartDao dao;

	@Transactional
	public Integer savePart(Part part) {
		return dao.savePart(part);
	}

	@Transactional
	public List<Part> getAllPart() {
		List<Part> list = dao.getAllPart();
		Collections.sort(list, (o1, o2) -> o1.getPartId() - o2.getPartId());
		return list;
	}

	@Transactional
	public void deletePart(Integer id) {
		dao.deletePart(id);
	}

	@Transactional
	public Part getOnePart(Integer id) {
		return dao.getOnePart(id);
	}

	@Transactional
	public void updatePart(Part part) {
		dao.updatePart(part);
	}

	@Transactional
	public List<Object[]> getPartIdAndCode() {
		return dao.getPartIdAndCode();
	}
}
