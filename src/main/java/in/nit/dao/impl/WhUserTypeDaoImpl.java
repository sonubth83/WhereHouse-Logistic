package in.nit.dao.impl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.orm.hibernate5.HibernateTemplate;
import org.springframework.stereotype.Repository;

import in.nit.dao.IWhUserTypeDao;
import in.nit.model.WhUserType;

@Repository
public class WhUserTypeDaoImpl implements IWhUserTypeDao {

	@Autowired
	private HibernateTemplate ht;

	@Override
	public Integer saveWhUserType(WhUserType whuser) {
		return (Integer) ht.save(whuser);
	}

	@Override
	public List<WhUserType> getAllWhUser() {
		return ht.loadAll(WhUserType.class);
	}

	@Override
	public WhUserType getOneWhUSer(Integer id) {
		return ht.get(WhUserType.class, id);
	}

	@Override
	public void deleteWhUserType(Integer id) {
		ht.delete(new WhUserType());
	}

	@Override
	public void updateWhUserType(WhUserType whuser) {
		ht.update(whuser);
	}

	@SuppressWarnings({ "deprecation", "unchecked" })
	@Override
	public List<Object[]> getWhUserIdAndVendor(String userType) {
		String hql = " select whUserId, userCode from " + WhUserType.class.getName() + " where userType=?0 ";
		return (List<Object[]>) ht.find(hql, userType);
	}
}
