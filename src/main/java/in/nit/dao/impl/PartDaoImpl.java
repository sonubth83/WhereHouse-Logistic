package in.nit.dao.impl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.orm.hibernate5.HibernateTemplate;
import org.springframework.stereotype.Repository;

import in.nit.dao.IPartDao;
import in.nit.model.Part;

@Repository
public class PartDaoImpl implements IPartDao {

	@Autowired
	private HibernateTemplate ht;

	@Override
	public Integer savePart(Part part) {
		return (Integer) ht.save(part);
	}

	@Override
	public List<Part> getAllPart() {
		return ht.loadAll(Part.class);
	}

	@Override
	public void deletePart(Integer id) {
		ht.delete(new Part(id));
	}

	@Override
	public Part getOnePart(Integer id) {
		return ht.get(Part.class, id);
	}

	@Override
	public void updatePart(Part part) {
		ht.update(part);
	}

	@Override
	public List<Object[]> getPartIdAndCode() {
		String hql = " select partId,partCode 	from in.nit.model.Part ";
		@SuppressWarnings({ "deprecation", "unchecked" })
		List<Object[]> list = (List<Object[]>) ht.find(hql);
		return list;
	}

}
