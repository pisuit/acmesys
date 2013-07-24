package th.co.acmesys.domain;

import java.io.Serializable;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.Table;

import org.hibernate.annotations.GenericGenerator;

@Entity
@Table(name="approval_budget")
@GenericGenerator(strategy="th.co.acmesys.utils.HibernateCurrentTimeIDGenerator", name="IDGENERATOR")
public class ApprovalBudget implements Serializable{
	
	@Id
	@Column(name="approval_budget_id")
	@GeneratedValue(generator="IDGENERATOR")
	private Long id;
	
	@Column(name="approval_budget_name")
	private String approvalBudgetName;
	
	public Long getId() {
		return id;
	}
	public void setId(Long id) {
		this.id = id;
	}
	public String getApprovalBudgetName() {
		return approvalBudgetName;
	}
	public void setApprovalBudgetName(String approvalBudgetName) {
		this.approvalBudgetName = approvalBudgetName;
	}
}
