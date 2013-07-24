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
@Table(name="receiving_main")
@GenericGenerator(strategy="th.co.acmesys.utils.HibernateCurrentTimeIDGenerator", name="IDGENERATOR")
public class ReceivingMain implements Serializable{
	
	@Id
	@Column(name="receiving_main_id")
	@GeneratedValue(generator="IDGENERATOR")
	private Long id;
	
	@Column(name="receive_date")
	private Date receiveDate;
	
	@ManyToOne(fetch=FetchType.LAZY)
	@JoinColumn(name="receiver_id" ,referencedColumnName="user_id")
	private User receivedBy;
	
	@Column(name="created_date")
	private Date createdDate;
	
	@ManyToOne(fetch=FetchType.LAZY)
	@JoinColumn(name="po_main_id", referencedColumnName="po_main_id")
	private POMain poMain;
	
	@Column(name="receive_count")
	private int receiveCount;
	
	@Column(name="delivery_docid")
	private String deliveryDocID;
	
	@Column(name="purchasing_status")
	@Enumerated(EnumType.STRING)
	private PurchasingStatus purchasingStatus;

	public Long getId() {
		return id;
	}

	public void setId(Long id) {
		this.id = id;
	}

	public Date getReceiveDate() {
		return receiveDate;
	}

	public void setReceiveDate(Date receiveDate) {
		this.receiveDate = receiveDate;
	}

	public User getReceivedBy() {
		return receivedBy;
	}

	public void setReceivedBy(User receivedBy) {
		this.receivedBy = receivedBy;
	}

	public Date getCreatedDate() {
		return createdDate;
	}

	public void setCreatedDate(Date createdDate) {
		this.createdDate = createdDate;
	}

	public POMain getPoMain() {
		return poMain;
	}

	public void setPoMain(POMain poMain) {
		this.poMain = poMain;
	}

	public int getReceiveCount() {
		return receiveCount;
	}

	public void setReceiveCount(int receiveCount) {
		this.receiveCount = receiveCount;
	}

	public String getDeliveryDocID() {
		return deliveryDocID;
	}

	public void setDeliveryDocID(String deliveryDocID) {
		this.deliveryDocID = deliveryDocID;
	}

	public PurchasingStatus getPurchasingStatus() {
		return purchasingStatus;
	}

	public void setPurchasingStatus(PurchasingStatus purchasingStatus) {
		this.purchasingStatus = purchasingStatus;
	}
}
