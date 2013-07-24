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
@Table(name="product_set_detail")
@GenericGenerator(strategy="th.co.acmesys.utils.HibernateCurrentTimeIDGenerator", name="IDGENERATOR")
public class ProductSetDetail implements Serializable{
	
	@Id
	@Column(name="product_set_detail_id")
	@GeneratedValue(generator="IDGENERATOR")
	private Long id;
	
	@ManyToOne(fetch=FetchType.LAZY)
	@JoinColumn(name="product_set_main_id", referencedColumnName="product_set_main_id")
	private ProductSetMain productSetMain;
	
	@ManyToOne(fetch=FetchType.LAZY)
	@JoinColumn(name="product_group_id", referencedColumnName="product_group_id")
	private ProductGroup productGroup;

	public Long getId() {
		return id;
	}

	public void setId(Long id) {
		this.id = id;
	}

	public ProductSetMain getProductSetMain() {
		return productSetMain;
	}

	public void setProductSetMain(ProductSetMain productSetMain) {
		this.productSetMain = productSetMain;
	}

	public ProductGroup getProductGroup() {
		return productGroup;
	}

	public void setProductGroup(ProductGroup productGroup) {
		this.productGroup = productGroup;
	}
}
