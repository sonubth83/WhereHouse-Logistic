package in.nit.service;

import java.util.List;

import in.nit.model.WhUserType;

public interface IWhUserTypeService {
	public Integer saveWhUserType(WhUserType whuser);

	public List<WhUserType> getAllWhUser();

	public WhUserType getOneWhUSer(Integer id);

	public void deleteWhUserType(Integer id);

	public void updateWhUserType(WhUserType whuser);

	public List<Object[]> getWhUserIdAndVendor(String userType);
}
