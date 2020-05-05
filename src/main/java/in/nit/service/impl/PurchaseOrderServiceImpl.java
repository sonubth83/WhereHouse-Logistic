package in.nit.service.impl;

import java.util.Collections;
import java.util.List;

import javax.transaction.Transactional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import in.nit.dao.IPurchaseOrderDao;
import in.nit.model.PurchaseOrder;
import in.nit.service.IPurchaseOrderService;

@Service
public class PurchaseOrderServiceImpl implements IPurchaseOrderService {

	@Autowired
	private IPurchaseOrderDao dao;

	@Transactional
	public Integer savePurchaseOrder(PurchaseOrder order) {
		return dao.savePurchaseOrder(order);
	}

	@Transactional
	public List<PurchaseOrder> getAllPurchaseOrder() {
		List<PurchaseOrder> list = dao.getAllPurchaseOrder();
		Collections.sort(list, (o1, o2) -> o1.getPurchId() - o2.getPurchId());
		return list;
	}

	@Transactional
	public PurchaseOrder getOnePurchaseOrder(Integer id) {
		return dao.getOnePurchaseOrder(id);
	}

	@Transactional
	public void deletePurchaseOrderById(Integer id) {
		dao.deletePurchaseOrderById(id);
	}

	@Transactional
	public void updatePurchaseOrder(PurchaseOrder order) {
		dao.updatePurchaseOrder(order);
	}

}
