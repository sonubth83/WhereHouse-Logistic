package in.nit.model;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.Table;

@Entity
@Table(name = "purchOrd")
public class PurchaseOrder {
	@Id
	@GeneratedValue
	@Column(name = "pid")
	private Integer purchId;
	@Column(name = "pcode")
	private String purchOrdCode;

	@ManyToOne
	@JoinColumn(name = "shipCodeFk")
	private ShipmentType shipType;

	@ManyToOne
	@JoinColumn(name = "whuVenFk")
	private WhUserType whUserVendor;

	@Column(name = "rnum")
	private String refNum;
	@Column(name = "qcheck")
	private String qualCheck;
	@Column(name = "defstatus")
	private String defStatus;
	@Column(name = "desrc")
	private String descr;

	public PurchaseOrder() {
		super();
	}

	public PurchaseOrder(Integer purchId) {
		super();
		this.purchId = purchId;
	}

	public Integer getPurchId() {
		return purchId;
	}

	public void setPurchId(Integer purchId) {
		this.purchId = purchId;
	}

	public String getPurchOrdCode() {
		return purchOrdCode;
	}

	public void setPurchOrdCode(String purchOrdCode) {
		this.purchOrdCode = purchOrdCode;
	}

	public ShipmentType getShipType() {
		return shipType;
	}

	public void setShipType(ShipmentType shipType) {
		this.shipType = shipType;
	}

	public String getRefNum() {
		return refNum;
	}

	public void setRefNum(String refNum) {
		this.refNum = refNum;
	}

	public String getQualCheck() {
		return qualCheck;
	}

	public void setQualCheck(String qualCheck) {
		this.qualCheck = qualCheck;
	}

	public String getDefStatus() {
		return defStatus;
	}

	public void setDefStatus(String defStatus) {
		this.defStatus = defStatus;
	}

	public String getDescr() {
		return descr;
	}

	public void setDescr(String descr) {
		this.descr = descr;
	}

	public WhUserType getWhUserVendor() {
		return whUserVendor;
	}

	public void setWhUserVendor(WhUserType whUserVendor) {
		this.whUserVendor = whUserVendor;
	}

	@Override
	public String toString() {
		return "PurchaseOrder [purchId=" + purchId + ", purchOrdCode=" + purchOrdCode + ", shipType=" + shipType
				+ ", whUserVendor=" + whUserVendor + ", refNum=" + refNum + ", qualCheck=" + qualCheck + ", defStatus="
				+ defStatus + ", descr=" + descr + "]";
	}

}
