package in.nit.model;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name = "uomtab")
public class Uom {
	@Id
	@GeneratedValue
	@Column(name = "ummid")
	private Integer uomId;
	@Column(name = "ummtype")
	private String uomType;
	@Column(name = "ummmodel")
	private String uomModel;
	@Column(name = "ummdesc")
	private String description;

	public Uom() {
		super();
	}

	public Uom(Integer uomId) {
		super();
		this.uomId = uomId;
	}

	public Integer getUomId() {
		return uomId;
	}

	public void setUomId(Integer uomId) {
		this.uomId = uomId;
	}

	public String getUomType() {
		return uomType;
	}

	public void setUomType(String uomType) {
		this.uomType = uomType;
	}

	public String getUomModel() {
		return uomModel;
	}

	public void setUomModel(String uomModel) {
		this.uomModel = uomModel;
	}

	public String getDescription() {
		return description;
	}

	public void setDescription(String description) {
		this.description = description;
	}

	@Override
	public String toString() {
		return "Uom [uomId=" + uomId + ", uomType=" + uomType + ", uomModel=" + uomModel + ", description="
				+ description + "]";
	}

}
