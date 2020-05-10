package in.nit.model;

import java.util.Arrays;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.Lob;
import javax.persistence.ManyToOne;
import javax.persistence.Table;
/*import sun.misc.BASE64Encoder;*/

@Entity
@Table(name = "db_product")
public class Product {
	@Id
	@GeneratedValue
	@Column(name = "pid")
	private Integer productId;

	@Column(name = "pname")
	private String prdName;

	@Column(name = "filename")
	private String fileName;

	@Lob
	private byte[] data;

	@ManyToOne
	@JoinColumn(name = "categoryFK")
	private Category categoryData;

	@Column(name = "color")
	private String color;

	@Column(name = "price")
	private Double price;

	public Product() {
		super();
	}

	public Product(Integer productId) {
		super();
		this.productId = productId;
	}

	public Integer getProductId() {
		return productId;
	}

	public void setProductId(Integer productId) {
		this.productId = productId;
	}

	public String getPrdName() {
		return prdName;
	}

	public void setPrdName(String prdName) {
		this.prdName = prdName;
	}

	public String getColor() {
		return color;
	}

	public void setColor(String color) {
		this.color = color;
	}

	public Double getPrice() {
		return price;
	}

	public void setPrice(Double price) {
		this.price = price;
	}

	public String getFileName() {
		return fileName;
	}

	public void setFileName(String fileName) {
		this.fileName = fileName;
	}

	/*
	 * public String getDataImage() { BASE64Encoder base64Encoder = new
	 * BASE64Encoder(); StringBuilder imageString = new StringBuilder();
	 * imageString.append("data:image/png;base64,");
	 * imageString.append(base64Encoder.encode(data)); String image =
	 * imageString.toString(); return image; }
	 */
	public byte[] getData() {
		return data;
	}

	public void setData(byte[] data) {
		this.data = data;
	}

	public Category getCategoryData() {
		return categoryData;
	}

	public void setCategoryData(Category categoryData) {
		this.categoryData = categoryData;
	}

	@Override
	public String toString() {
		return "Product [productId=" + productId + ", prdName=" + prdName + ", fileName=" + fileName + ", data="
				+ Arrays.toString(data) + ", categoryData=" + categoryData + ", color=" + color + ", price=" + price
				+ "]";
	}

}
