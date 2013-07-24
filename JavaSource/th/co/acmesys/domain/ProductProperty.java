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
@Table(name="product_property")
@GenericGenerator(strategy="th.co.acmesys.utils.HibernateCurrentTimeIDGenerator", name="IDGENERATOR")
public class ProductProperty implements Serializable{
	
	@Id
	@Column(name="product_property_id")
	@GeneratedValue(generator="IDGENERATOR")
	private Long id;
	
	@ManyToOne(fetch=FetchType.LAZY)
	@JoinColumn(name="product_group_id", referencedColumnName="product_group_id")
	private ProductGroup productGroup;
	
	@Column(name="product_name_eng")
	private String productNameEng;
	
	@Column(name="product_name_th")
	private String productNameTh;
	
	@Column(name="product_name_chn")
	private String productNameChn;
	
	@Column(name="product_name_jpn")
	private String productNameJpn;
	
	@ManyToOne(fetch=FetchType.LAZY)
	@JoinColumn(name="product_category_id", referencedColumnName="product_category_id")
	private ProductCategory productCategory;
	
	@ManyToOne(fetch=FetchType.LAZY)
	@JoinColumn(name="product_sub_category_id", referencedColumnName="product_sub_category_id")
	private ProductSubCategory productSubCategory;
	
	@ManyToOne(fetch=FetchType.LAZY)
	@JoinColumn(name="brand_id", referencedColumnName="brand_id")
	private Brand brand;
	
	@ManyToOne(fetch=FetchType.LAZY)
	@JoinColumn(name="unit_count_id", referencedColumnName="unit_count_id")
	private UnitCount unitCount;
	
	@Column(name="origin")
	private String origin;
	
	@Column(name="specification")
	private String specification;
	
	@Column(name="picture")
	private byte[] picture;

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

	public String getProductNameEng() {
		return productNameEng;
	}

	public void setProductNameEng(String productNameEng) {
		this.productNameEng = productNameEng;
	}

	public String getProductNameTh() {
		return productNameTh;
	}

	public void setProductNameTh(String productNameTh) {
		this.productNameTh = productNameTh;
	}

	public String getProductNameChn() {
		return productNameChn;
	}

	public void setProductNameChn(String productNameChn) {
		this.productNameChn = productNameChn;
	}

	public String getProductNameJpn() {
		return productNameJpn;
	}

	public void setProductNameJpn(String productNameJpn) {
		this.productNameJpn = productNameJpn;
	}

	public ProductCategory getProductCategory() {
		return productCategory;
	}

	public void setProductCategory(ProductCategory productCategory) {
		this.productCategory = productCategory;
	}

	public ProductSubCategory getProductSubCategory() {
		return productSubCategory;
	}

	public void setProductSubCategory(ProductSubCategory productSubCategory) {
		this.productSubCategory = productSubCategory;
	}

	public Brand getBrand() {
		return brand;
	}

	public void setBrand(Brand brand) {
		this.brand = brand;
	}

	public UnitCount getUnitCount() {
		return unitCount;
	}

	public void setUnitCount(UnitCount unitCount) {
		this.unitCount = unitCount;
	}

	public String getOrigin() {
		return origin;
	}

	public void setOrigin(String origin) {
		this.origin = origin;
	}

	public String getSpecification() {
		return specification;
	}

	public void setSpecification(String specification) {
		this.specification = specification;
	}

	public byte[] getPicture() {
		return picture;
	}

	public void setPicture(byte[] picture) {
		this.picture = picture;
	}
}
