package th.co.acmesys.domain;

import java.util.Date;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.EnumType;
import javax.persistence.Enumerated;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.Table;

import org.hibernate.annotations.GenericGenerator;

import th.co.acmesys.customtype.PurchasingStatus;

@Entity
@Table(name="pr_main")
@GenericGenerator(strategy="th.co.acmesys.utils.HibernateCurrentTimeIDGenerator", name="IDGENERATOR")
public class PRMain {
	
	@Id
	@Column(name="pr_main_id")
	@GeneratedValue(generator="IDGENERATOR")
	private Long id;
	
	@Column(name="pr_date")
	private Date prDate;
	
	@ManyToOne(fetch=FetchType.LAZY)
	@JoinColumn(name="creator_id", referencedColumnName="user_id")
	private User createdBy;
	
	@Column(name="created_date")
	private Date createdDate;
	
	@ManyToOne(fetch=FetchType.LAZY)
	@JoinColumn(name="product_set_main_id", referencedColumnName="product_set_main_id")
	private ProductSetMain productSetMain;
	
	@Column(name="submit_count")
	private int submitCount;
	
	@ManyToOne(fetch=FetchType.LAZY)
	@JoinColumn(name="pricing_process_id", referencedColumnName="pricing_process_id")
	private PricingProcess pricingProcess;
	
	@Column(name="delivery_date")
	private Date deliveryDate;
	
	@ManyToOne(fetch=FetchType.LAZY)
	@JoinColumn(name="cost_center_code_id", referencedColumnName="cost_center_code_id")
	private CostCenterCode costCenterCode;
	
	@ManyToOne(fetch=FetchType.LAZY)
	@JoinColumn(name="account_code_id", referencedColumnName="account_code_id")
	private AccountCode accountCode;
	
	@Column(name="purchasing_status")
	@Enumerated(EnumType.STRING)
	private PurchasingStatus purchasingStatus;

	public Long getId() {
		return id;
	}

	public void setId(Long id) {
		this.id = id;
	}

	public Date getPrDate() {
		return prDate;
	}

	public void setPrDate(Date prDate) {
		this.prDate = prDate;
	}

	public User getCreatedBy() {
		return createdBy;
	}

	public void setCreatedBy(User createdBy) {
		this.createdBy = createdBy;
	}

	public Date getCreatedDate() {
		return createdDate;
	}

	public void setCreatedDate(Date createdDate) {
		this.createdDate = createdDate;
	}

	public ProductSetMain getProductSetMain() {
		return productSetMain;
	}

	public void setProductSetMain(ProductSetMain productSetMain) {
		this.productSetMain = productSetMain;
	}

	public int getSubmitCount() {
		return submitCount;
	}

	public void setSubmitCount(int submitCount) {
		this.submitCount = submitCount;
	}

	public PricingProcess getPricingProcess() {
		return pricingProcess;
	}

	public void setPricingProcess(PricingProcess pricingProcess) {
		this.pricingProcess = pricingProcess;
	}

	public Date getDeliveryDate() {
		return deliveryDate;
	}

	public void setDeliveryDate(Date deliveryDate) {
		this.deliveryDate = deliveryDate;
	}

	public CostCenterCode getCostCenterCode() {
		return costCenterCode;
	}

	public void setCostCenterCode(CostCenterCode costCenterCode) {
		this.costCenterCode = costCenterCode;
	}

	public AccountCode getAccountCode() {
		return accountCode;
	}

	public void setAccountCode(AccountCode accountCode) {
		this.accountCode = accountCode;
	}

	public PurchasingStatus getPurchasingStatus() {
		return purchasingStatus;
	}

	public void setPurchasingStatus(PurchasingStatus purchasingStatus) {
		this.purchasingStatus = purchasingStatus;
	}
}
