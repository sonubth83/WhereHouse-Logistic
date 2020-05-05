package in.nit.service.impl;

import java.util.Collections;
import java.util.List;

import javax.transaction.Transactional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import in.nit.dao.IOrderMethodDao;
import in.nit.model.OrderMethod;
import in.nit.service.IOrderMethodService;

@Service
public class OrderMethodServiceImpl implements IOrderMethodService {
	@Autowired
	private IOrderMethodDao dao;

	@Transactional
	public Integer saveOrderMethod(OrderMethod order) {
		return dao.saveOrderMethod(order);
	}

	@Transactional
	public List<OrderMethod> getAllOrderMethod() {
		List<OrderMethod> list = dao.getAllOrderMethod();
		Collections.sort(list, (o1, o2) -> o1.getOrderId() - o2.getOrderId());
		return list;
	}

	@Transactional
	public void deleteShipmentType(Integer id) {
		dao.deleteShipmentType(id);
	}

	@Transactional
	public OrderMethod getOneOrderType(Integer id) {
		return dao.getOneOrderType(id);
	}
	
	@Transactional
	public void uploadOrderMethod(OrderMethod orderMethod) {
		dao.uploadOrderMethod(orderMethod);
	}
	
	@Override
	public List<Object[]> getOrderIdAndOrderCode(String mode) {
		return dao.getOrderIdAndOrderCode(mode);
	}

}
