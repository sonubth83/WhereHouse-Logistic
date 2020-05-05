package in.nit.model;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.Table;

@Entity
@Table(name = "parttab")
public class Part {
	@Id
	@GeneratedValue
	@Column(name = "pid")
	private Integer partId;
	@Column(name = "pcode")
	private Integer partCode;
	@Column(name = "width")
	private Double dimWidth;
	@Column(name = "lenth")
	private Double dimLenth;
	@Column(name = "height")
	private Double dimHeight;
	@Column(name = "cost")
	private Double baseCost;
	@Column(name = "currency")
	private Double baseCurrency;

	@ManyToOne
	@JoinColumn(name = "uomIdfk")
	private Uom uomOb;

	/*
	 * @ManyToOne
	 * 
	 * @JoinColumn(name = "orderIdFk") private OrderMethod orderMethod;
	 */

	/*
	 * @ManyToOne
	 * 
	 * @JoinColumn(name="orderPurchaseIdFk") private OrderMethod omPurchaseOb;
	 */

	@Column(name = "descr")
	private String descr;

	public Part() {
		super();
	}

	public Part(Integer partId) {
		super();
		this.partId = partId;
	}

	public Integer getPartId() {
		return partId;
	}

	public void setPartId(Integer partId) {
		this.partId = partId;
	}

	public Integer getPartCode() {
		return partCode;
	}

	public void setPartCode(Integer partCode) {
		this.partCode = partCode;
	}

	public Double getDimWidth() {
		return dimWidth;
	}

	public void setDimWidth(Double dimWidth) {
		this.dimWidth = dimWidth;
	}

	public Double getDimLenth() {
		return dimLenth;
	}

	public void setDimLenth(Double dimLenth) {
		this.dimLenth = dimLenth;
	}

	public Double getDimHeight() {
		return dimHeight;
	}

	public void setDimHeight(Double dimHeight) {
		this.dimHeight = dimHeight;
	}

	public Double getBaseCost() {
		return baseCost;
	}

	public void setBaseCost(Double baseCost) {
		this.baseCost = baseCost;
	}

	public Double getBaseCurrency() {
		return baseCurrency;
	}

	public void setBaseCurrency(Double baseCurrency) {
		this.baseCurrency = baseCurrency;
	}

	public Uom getUomOb() {
		return uomOb;
	}

	public void setUomOb(Uom uomOb) {
		this.uomOb = uomOb;
	}

	public String getDescr() {
		return descr;
	}

	public void setDescr(String descr) {
		this.descr = descr;
	}

	@Override
	public String toString() {
		return "Part [partId=" + partId + ", partCode=" + partCode + ", dimWidth=" + dimWidth + ", dimLenth=" + dimLenth
				+ ", dimHeight=" + dimHeight + ", baseCost=" + baseCost + ", baseCurrency=" + baseCurrency + ", uomOb="
				+ uomOb + ", descr=" + descr + "]";
	}

}
