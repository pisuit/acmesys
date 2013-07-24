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
@Table(name="product_set_main")
@GenericGenerator(strategy="th.co.acmesys.utils.HibernateCurrentTimeIDGenerator", name="IDGENERATOR")
public class ProductSetMain implements Serializable{
	
	@Id
	@Column(name="product_set_main_id")
	@GeneratedValue(generator="IDGENERATOR")
	private Long id;
	
	@ManyToOne(fetch=FetchType.LAZY)
	@JoinColumn(name="group_id",referencedColumnName="group_id")
	private OrganizationGroup group;
	
	@ManyToOne(fetch=FetchType.LAZY)
	@JoinColumn(name="organization_id", referencedColumnName="organization_id")
	private Organization organization;
	
	@Column(name="product_set_name")
	private String productSetName;
	
	@ManyToOne(fetch=FetchType.LAZY)
	@JoinColumn(name="cost_center_code_id", referencedColumnName="cost_center_code_id")
	private CostCenterCode costCenterCode;
	
	@ManyToOne(fetch=FetchType.LAZY)
	@JoinColumn(name="account_code_id", referencedColumnName="account_code_id")
	private AccountCode accountCode;
	
	@ManyToOne(fetch=FetchType.LAZY)
	@JoinColumn(name="approval_budget_id", referencedColumnName="approval_budget_id")
	private ApprovalBudget approvalBudget;
	
	@ManyToOne(fetch=FetchType.LAZY)
	@JoinColumn(name="creator_id", referencedColumnName="user_id")
	private User createdBy;

	public Long getId() {
		return id;
	}

	public void setId(Long id) {
		this.id = id;
	}

	public OrganizationGroup getGroup() {
		return group;
	}

	public void setGroup(OrganizationGroup group) {
		this.group = group;
	}

	public Organization getOrganization() {
		return organization;
	}

	public void setOrganization(Organization organization) {
		this.organization = organization;
	}

	public String getProductSetName() {
		return productSetName;
	}

	public void setProductSetName(String productSetName) {
		this.productSetName = productSetName;
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

	public ApprovalBudget getApprovalBudget() {
		return approvalBudget;
	}

	public void setApprovalBudget(ApprovalBudget approvalBudget) {
		this.approvalBudget = approvalBudget;
	}

	public User getCreatedBy() {
		return createdBy;
	}

	public void setCreatedBy(User createdBy) {
		this.createdBy = createdBy;
	}
}
