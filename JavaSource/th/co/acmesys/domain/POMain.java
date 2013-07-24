package th.co.acmesys.domain;

import java.io.Serializable;
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
@Table(name="po_main")
@GenericGenerator(strategy="th.co.acmesys.utils.HibernateCurrentTimeIDGenerator", name="IDGENERATOR")
public class POMain implements Serializable{
	
	@Id
	@Column(name="po_main_id")
	@GeneratedValue(generator="IDGENERATOR")
	private Long id;
	
	@ManyToOne(fetch=FetchType.LAZY)
	@JoinColumn(name="pr_main_id", referencedColumnName="pr_main_id")
	private PRMain prMain;
	
	@Column(name="po_date")
	private Date poDate;
	
	@ManyToOne(fetch=FetchType.LAZY)
	@JoinColumn(name="creator_id", referencedColumnName="user_id")
	private User createdBy;
	
	@Column(name="created_date")
	private Date createdDate;
	
	@Column(name="purchasing_status")
	@Enumerated(EnumType.STRING)
	private PurchasingStatus purchasingStatus;

	public Long getId() {
		return id;
	}

	public void setId(Long id) {
		this.id = id;
	}

	public PRMain getPrMain() {
		return prMain;
	}

	public void setPrMain(PRMain prMain) {
		this.prMain = prMain;
	}

	public Date getPoDate() {
		return poDate;
	}

	public void setPoDate(Date poDate) {
		this.poDate = poDate;
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

	public PurchasingStatus getPurchasingStatus() {
		return purchasingStatus;
	}

	public void setPurchasingStatus(PurchasingStatus purchasingStatus) {
		this.purchasingStatus = purchasingStatus;
	}
}
