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
@Table(name="approval_process_detail")
@GenericGenerator(strategy="th.co.acmesys.utils.HibernateCurrentTimeIDGenerator", name="IDGENERATOR")
public class ApprovalProcessDetail implements Serializable{
	
	@Id
	@Column(name="approval_process_detail_id")
	@GeneratedValue(generator="IDGENERATOR")
	private Long id;
	
	@ManyToOne(fetch=FetchType.LAZY)
	@JoinColumn(name="approval_process_id", referencedColumnName="approval_process_id")
	private ApprovalProcess approvalProcess;
	
	@ManyToOne(fetch=FetchType.LAZY)
	@JoinColumn(name="approval_team_id", referencedColumnName="approval_team_id")
	private ApprovalTeam approvalTeam;
	
	@Column(name="rank")
	private int rank;
	
	@Column(name="number_of_approver")
	private int numberOfApprover;

	public Long getId() {
		return id;
	}

	public void setId(Long id) {
		this.id = id;
	}

	public ApprovalProcess getApprovalProcess() {
		return approvalProcess;
	}

	public void setApprovalProcess(ApprovalProcess approvalProcess) {
		this.approvalProcess = approvalProcess;
	}

	public ApprovalTeam getApprovalTeam() {
		return approvalTeam;
	}

	public void setApprovalTeam(ApprovalTeam approvalTeam) {
		this.approvalTeam = approvalTeam;
	}

	public int getRank() {
		return rank;
	}

	public void setRank(int rank) {
		this.rank = rank;
	}

	public int getNumberOfApprover() {
		return numberOfApprover;
	}

	public void setNumberOfApprover(int numberOfApprover) {
		this.numberOfApprover = numberOfApprover;
	}
}
