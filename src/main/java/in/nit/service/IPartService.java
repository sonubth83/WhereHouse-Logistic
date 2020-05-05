package in.nit.service;

import java.util.List;

import in.nit.model.Part;

public interface IPartService {
	
	public Integer savePart(Part part);

	public List<Part> getAllPart();

	public void deletePart(Integer id);

	public Part getOnePart(Integer id);

	public void updatePart(Part part);

	public List<Object[]> getPartIdAndCode();
}
