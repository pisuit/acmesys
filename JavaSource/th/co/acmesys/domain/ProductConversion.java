package th.co.acmesys.domain;

import java.io.Serializable;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.Table;

import org.hibernate.annotations.GenericGenerator;


@Entity
@Table(name="product_conversion")
@GenericGenerator(strategy="th.co.acmesys.utils.HibernateCurrentTimeIDGenerator", name="IDGENERATOR")
public class ProductConversion implements Serializable{
	
	@Id
	@Column(name="product_conversion_id")
	@GeneratedValue(generator="IDGENERATOR")
	private Long id;
	
	@ManyToOne(fetch=FetchType.LAZY)
	@JoinColumn(name="product_group_id", referencedColumnName="product_group_id")
	private ProductGroup productGroup;
	
	@ManyToOne(fetch=FetchType.LAZY)
	@JoinColumn(name="unit_count_id", referencedColumnName="unit_count_id")
	private UnitCount unitCount;
	
	@Column(name="main_unit_quantity")
	private int mainUnitQuantity;

	public Long getId() {
		return id;
	}

	public void setId(Long id) {
		this.id = id;
	}

	public ProductGroup getProductGroup() {
		return productGroup;
	}

	public void setProductGroup(ProductGroup productGroup) {
		this.productGroup = productGroup;
	}

	public UnitCount getUnitCount() {
		return unitCount;
	}

	public void setUnitCount(UnitCount unitCount) {
		this.unitCount = unitCount;
	}

	public int getMainUnitQuantity() {
		return mainUnitQuantity;
	}

	public void setMainUnitQuantity(int mainUnitQuantity) {
		this.mainUnitQuantity = mainUnitQuantity;
	}
}
