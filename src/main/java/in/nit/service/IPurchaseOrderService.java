package in.nit.service;

import java.util.List;

import in.nit.model.PurchaseOrder;

public interface IPurchaseOrderService {
	public Integer savePurchaseOrder(PurchaseOrder order);

	public List<PurchaseOrder> getAllPurchaseOrder();

	public PurchaseOrder getOnePurchaseOrder(Integer id);

	public void deletePurchaseOrderById(Integer id);

	public void updatePurchaseOrder(PurchaseOrder order);
}
