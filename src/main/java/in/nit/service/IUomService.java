package in.nit.service;

import java.util.List;

import in.nit.model.Uom;

public interface IUomService {
	Integer saveUom(Uom uom);

	public List<Uom> getAllUom();

	public Uom getOneUom(Integer id);

	public void deleteUom(Integer id);
	
	public void updateUom(Uom uom);
	
	public List<Object[]> getUomIdAndUomModel();
}
