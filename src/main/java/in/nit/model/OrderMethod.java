package in.nit.model;

import java.util.List;

import javax.persistence.CollectionTable;
import javax.persistence.Column;
import javax.persistence.ElementCollection;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.OrderColumn;
import javax.persistence.Table;

import org.hibernate.annotations.GenericGenerator;

@Entity
@Table(name = "ordertab")
public class OrderMethod {
	@Id
	@GeneratedValue(generator = "omidgen")
	@GenericGenerator(name = "omidgen", strategy = "increment")
	@Column(name = "oid")
	private Integer orderId;
	@Column(name = "omode")
	private String orderMode;
	@Column(name = "ocode")
	private String orderCode;
	@Column(name = "otype")
	private String orderType;

	@ElementCollection(fetch = FetchType.EAGER)
	@CollectionTable(name = "orderaccpt", joinColumns = @JoinColumn(name = "oid"))
	@OrderColumn(name = "pos")
	@Column(name = "oaccpt")
	private List<String> orderAccpt;
	@Column(name = "descr")
	private String description;

	public OrderMethod() {
		super();
	}

	public OrderMethod(Integer orderId) {
		super();
		this.orderId = orderId;
	}

	public Integer getOrderId() {
		return orderId;
	}

	public void setOrderId(Integer orderId) {
		this.orderId = orderId;
	}

	public String getOrderMode() {
		return orderMode;
	}

	public void setOrderMode(String orderMode) {
		this.orderMode = orderMode;
	}

	public String getOrderCode() {
		return orderCode;
	}

	public void setOrderCode(String orderCode) {
		this.orderCode = orderCode;
	}

	public String getOrderType() {
		return orderType;
	}

	public void setOrderType(String orderType) {
		this.orderType = orderType;
	}

	public List<String> getOrderAccpt() {
		return orderAccpt;
	}

	public void setOrderAccpt(List<String> orderAccpt) {
		this.orderAccpt = orderAccpt;
	}

	public String getDescription() {
		return description;
	}

	public void setDescription(String description) {
		this.description = description;
	}

	@Override
	public String toString() {
		return "OrderMethod [orderId=" + orderId + ", orderMode=" + orderMode + ", orderCode=" + orderCode
				+ ", orderType=" + orderType + ", orderAccpt=" + orderAccpt + ", description=" + description + "]";
	}

}
