package in.nit.model;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name = "whuser")
public class WhUserType {
	@Id
	@GeneratedValue
	@Column(name = "whid")
	private Integer whUserId;
	
	@Column(name = "type")
	private String userType;
	
	@Column(name = "code")
	private String userCode;
	
	// private String forUser;
	@Column(name = "email")
	private String userEmail;
	
	@Column(name = "contact")
	private String userContact;
	
	@Column(name = "idtype")
	private String userIdType;
	
	@Column(name = "idnum")
	private String idNumber;

	public WhUserType() {
		super();
	}

	public WhUserType(Integer whUserId) {
		super();
		this.whUserId = whUserId;
	}

	public Integer getWhUserId() {
		return whUserId;
	}

	public void setWhUserId(Integer whUserId) {
		this.whUserId = whUserId;
	}

	public String getUserType() {
		return userType;
	}

	public void setUserType(String userType) {
		this.userType = userType;
	}

	public String getUserCode() {
		return userCode;
	}

	public void setUserCode(String userCode) {
		this.userCode = userCode;
	}

	public String getUserEmail() {
		return userEmail;
	}

	public void setUserEmail(String userEmail) {
		this.userEmail = userEmail;
	}

	public String getUserContact() {
		return userContact;
	}

	public void setUserContact(String userContact) {
		this.userContact = userContact;
	}

	public String getUserIdType() {
		return userIdType;
	}

	public void setUserIdType(String userIdType) {
		this.userIdType = userIdType;
	}

	public String getIdNumber() {
		return idNumber;
	}

	public void setIdNumber(String idNumber) {
		this.idNumber = idNumber;
	}

	@Override
	public String toString() {
		return "WhUserType [whUserId=" + whUserId + ", userType=" + userType + ", userCode=" + userCode + ", userEmail="
				+ userEmail + ", userContact=" + userContact + ", userIdType=" + userIdType + ", idNumber=" + idNumber
				+ "]";
	}

}
