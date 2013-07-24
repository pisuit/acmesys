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
@Table(name="approval_budget_detail")
@GenericGenerator(strategy="th.co.acmesys.utils.HibernateCurrentTimeIDGenerator", name="IDGENERATOR")
public class ApprovalBudgetDetail implements Serializable{
	
	@Id
	@Column(name="approval_budget_detail_id")
	@GeneratedValue(generator="IDGENERATOR")
	private Long id;
	
	@ManyToOne(fetch=FetchType.LAZY)
	@JoinColumn(name="approval_budget_id", referencedColumnName="approval_budget_id")
	private ApprovalBudget approvalBudget;
	
	@ManyToOne(fetch=FetchType.LAZY)
	@JoinColumn(name="approval_process_id", referencedColumnName="approval_process_id")
	private ApprovalProcess approvalProcess;
	
	@Column(name="min_budget")
	private BigDecimal minBudget;
	
	@Column(name="max_budget")
	private BigDecimal maxBudget;

	public Long getId() {
		return id;
	}

	public void setId(Long id) {
		this.id = id;
	}

	public ApprovalBudget getApprovalBudget() {
		return approvalBudget;
	}

	public void setApprovalBudget(ApprovalBudget approvalBudget) {
		this.approvalBudget = approvalBudget;
	}

	public ApprovalProcess getApprovalProcess() {
		return approvalProcess;
	}

	public void setApprovalProcess(ApprovalProcess approvalProcess) {
		this.approvalProcess = approvalProcess;
	}

	public BigDecimal getMinBudget() {
		return minBudget;
	}

	public void setMinBudget(BigDecimal minBudget) {
		this.minBudget = minBudget;
	}

	public BigDecimal getMaxBudget() {
		return maxBudget;
	}

	public void setMaxBudget(BigDecimal maxBudget) {
		this.maxBudget = maxBudget;
	}
}
