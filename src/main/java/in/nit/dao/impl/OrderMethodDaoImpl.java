package in.nit.dao.impl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.orm.hibernate5.HibernateTemplate;
import org.springframework.stereotype.Repository;

import in.nit.dao.IOrderMethodDao;
import in.nit.model.OrderMethod;

@Repository
public class OrderMethodDaoImpl implements IOrderMethodDao {
	@Autowired
	private HibernateTemplate ht;

	@Override
	public Integer saveOrderMethod(OrderMethod order) {
		return (Integer) ht.save(order);
	}

	@Override
	public List<OrderMethod> getAllOrderMethod() {
		return ht.loadAll(OrderMethod.class);
	}

	@Override
	public void deleteShipmentType(Integer id) {
		ht.delete(new OrderMethod(id));
	}
	
	@Override
	public void uploadOrderMethod(OrderMethod orderMethod) {
		ht.update(orderMethod);
	}
	
	@Override
	public OrderMethod getOneOrderType(Integer id) {
		return ht.get(OrderMethod.class, id);
	}
	
	
	public List<Object[]> getOrderIdAndOrderCode(String mode) {
		String hql = "select orderId,orderCode from in.nit.model.OrderMethod where orderMode=?0";
		@SuppressWarnings({ "unchecked", "deprecation" })
		List<Object[]> list = (List<Object[]>) ht.find(hql, mode);
		return list;
	}
}
