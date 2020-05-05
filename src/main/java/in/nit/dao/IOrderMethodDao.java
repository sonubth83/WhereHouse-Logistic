package in.nit.dao;

import java.util.List;

import in.nit.model.OrderMethod;

public interface IOrderMethodDao {
	Integer saveOrderMethod(OrderMethod order);

	List<OrderMethod> getAllOrderMethod();

	public void deleteShipmentType(Integer id);
	
	OrderMethod getOneOrderType(Integer id);
	
	void uploadOrderMethod(OrderMethod orderMethod);
	
	public List<Object[]> getOrderIdAndOrderCode(String mode);
}
