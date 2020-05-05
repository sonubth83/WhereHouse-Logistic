package in.nit.dao.impl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.orm.hibernate5.HibernateTemplate;
import org.springframework.stereotype.Repository;

import in.nit.dao.IShipmentTypeDao;
import in.nit.model.ShipmentType;

@Repository
public class ShipmentTypeDaoImpl implements IShipmentTypeDao {
	@Autowired
	private HibernateTemplate ht;

	public Integer saveShipmentType(ShipmentType sh) {
		return (Integer) ht.save(sh);
	}

	@Override
	public List<ShipmentType> getAllShipmentType() {
		return ht.loadAll(ShipmentType.class);
	}

	@Override
	public void deleteShipmentType(Integer id) {
		ht.delete(new ShipmentType(id));

	}

	@Override
	public ShipmentType getOneShipmentType(Integer id) {
		return ht.get(ShipmentType.class, id);
	}
	
	@Override
	public void updateShipmentType(ShipmentType shipmentType) {
		ht.update(shipmentType);
	}
	
	@Override
	public List<Object[]> getShipIdAndCode() {
		String hql = " select shipId,shipCode from "+ShipmentType.class.getName()+" where enbShip='YES' ";
		@SuppressWarnings({ "unchecked", "deprecation" })
		List<Object[]> list = (List<Object[]>) ht.find(hql);
		return list;
	}

}
