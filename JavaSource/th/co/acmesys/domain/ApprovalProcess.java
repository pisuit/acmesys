package th.co.acmesys.domain;

import java.io.Serializable;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.Table;

import org.hibernate.annotations.GenericGenerator;

@Entity
@Table(name="approval_process")
@GenericGenerator(strategy="th.co.acmesys.utils.HibernateCurrentTimeIDGenerator", name="IDGENERATOR")
public class ApprovalProcess implements Serializable{
	
	@Id
	@Column(name="approval_process_id")
	@GeneratedValue(generator="IDGENERATOR")
	private Long id;
	
	@Column(name="approval_process_name")
	private String approvalProcessName;

	public Long getId() {
		return id;
	}

	public void setId(Long id) {
		this.id = id;
	}

	public String getApprovalProcessName() {
		return approvalProcessName;
	}

	public void setApprovalProcessName(String approvalProcessName) {
		this.approvalProcessName = approvalProcessName;
	}
}
