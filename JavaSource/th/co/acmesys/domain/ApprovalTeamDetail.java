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
@Table(name="approval_team_detail")
@GenericGenerator(strategy="th.co.acmesys.utils.HibernateCurrentTimeIDGenerator", name="IDGENERATOR")
public class ApprovalTeamDetail implements Serializable{
	
	@Id
	@Column(name="approval_team_detail_id")
	@GeneratedValue(generator="IDGENERATOR")
	private Long id;
	
	@ManyToOne(fetch=FetchType.LAZY)
	@JoinColumn(name="approval_team_id", referencedColumnName="approval_team_id")
	private ApprovalTeam approvalTeam;
	
	@ManyToOne(fetch=FetchType.LAZY)
	@JoinColumn(name="user_id", referencedColumnName="user_id")
	private User user;

	public Long getId() {
		return id;
	}

	public void setId(Long id) {
		this.id = id;
	}

	public ApprovalTeam getApprovalTeam() {
		return approvalTeam;
	}

	public void setApprovalTeam(ApprovalTeam approvalTeam) {
		this.approvalTeam = approvalTeam;
	}

	public User getUser() {
		return user;
	}

	public void setUser(User user) {
		this.user = user;
	}
}
