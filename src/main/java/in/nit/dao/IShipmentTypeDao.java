package in.nit.dao;

import java.util.List;

import in.nit.model.ShipmentType;

public interface IShipmentTypeDao {
	Integer saveShipmentType(ShipmentType sh);

	List<ShipmentType> getAllShipmentType();

	public void deleteShipmentType(Integer id);

	ShipmentType getOneShipmentType(Integer id);

	void updateShipmentType(ShipmentType shipmentType);

	public List<Object[]> getShipIdAndCode();

}
