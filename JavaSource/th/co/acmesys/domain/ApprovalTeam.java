package th.co.acmesys.domain;

import java.io.Serializable;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.Table;

import org.hibernate.annotations.GenericGenerator;


@Entity
@Table(name="approval_team")
@GenericGenerator(strategy="th.co.acmesys.utils.HibernateCurrentTimeIDGenerator", name="IDGENERATOR")
public class ApprovalTeam implements Serializable{
	
	@Id
	@Column(name="approval_team_id")
	@GeneratedValue(generator="IDGENERATOR")
	private Long id;
	
	@Column(name="approval_team_name")
	private String approvalTeamName;

	public Long getId() {
		return id;
	}

	public void setId(Long id) {
		this.id = id;
	}

	public String getApprovalTeamName() {
		return approvalTeamName;
	}

	public void setApprovalTeamName(String approvalTeamName) {
		this.approvalTeamName = approvalTeamName;
	}
}
