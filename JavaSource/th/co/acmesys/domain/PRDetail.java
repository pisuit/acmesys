package th.co.acmesys.domain;

import java.io.Serializable;
import java.math.BigDecimal;

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
@Table(name="pr_detail")
@GenericGenerator(strategy="th.co.acmesys.utils.HibernateCurrentTimeIDGenerator", name="IDGENERATOR")
public class PRDetail implements Serializable{
	
	@Id
	@Column(name="pr_detail_id")
	@GeneratedValue(generator="IDGENERATOR")
	private Long id;
	
	@ManyToOne(fetch=FetchType.LAZY)
	@JoinColumn(name="pr_main_id", referencedColumnName="pr_main_id")
	private PRMain prMain;
	
	@ManyToOne(fetch=FetchType.LAZY)
	@JoinColumn(name="product_group_id", referencedColumnName="product_group_id")
	private ProductGroup productGroup;
	
	@Column(name="quantity")
	private int quantity;
	
	@ManyToOne(fetch=FetchType.LAZY)
	@JoinColumn(name="unit_count_id", referencedColumnName="unit_count_id")
	private UnitCount unitCount;
	
	@Column(name="price")
	private BigDecimal price;
	
	@Column(name="vat")
	private float vat;

	public Long getId() {
		return id;
	}

	public void setId(Long id) {
		this.id = id;
	}

	public PRMain getPrMain() {
		return prMain;
	}

	public void setPrMain(PRMain prMain) {
		this.prMain = prMain;
	}

	public ProductGroup getProductGroup() {
		return productGroup;
	}

	public void setProductGroup(ProductGroup productGroup) {
		this.productGroup = productGroup;
	}

	public int getQuantity() {
		return quantity;
	}

	public void setQuantity(int quantity) {
		this.quantity = quantity;
	}

	public UnitCount getUnitCount() {
		return unitCount;
	}

	public void setUnitCount(UnitCount unitCount) {
		this.unitCount = unitCount;
	}

	public BigDecimal getPrice() {
		return price;
	}

	public void setPrice(BigDecimal price) {
		this.price = price;
	}

	public float getVat() {
		return vat;
	}

	public void setVat(float vat) {
		this.vat = vat;
	}
}
