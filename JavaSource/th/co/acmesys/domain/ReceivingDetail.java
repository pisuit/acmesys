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
@Table(name="receiving_detail")
@GenericGenerator(strategy="th.co.acmesys.utils.HibernateCurrentTimeIDGenerator", name="IDGENERATOR")
public class ReceivingDetail implements Serializable{
	
	@Id
	@Column(name="receiving_detail_id")
	@GeneratedValue(generator="IDGENERATOR")
	private Long id;
	
	@ManyToOne(fetch=FetchType.LAZY)
	@JoinColumn(name="receiving_main_id", referencedColumnName="receiving_main_id")
	private ReceivingMain receivingMain;
	
	@Column(name="quantity")
	private int quantity;
	
	@ManyToOne(fetch=FetchType.LAZY)
	@JoinColumn(name="unit_count_id", referencedColumnName="unit_count_id")
	private UnitCount unitCount;
	
	@Column(name="back_order")
	private int backOrder;

	public Long getId() {
		return id;
	}

	public void setId(Long id) {
		this.id = id;
	}

	public ReceivingMain getReceivingMain() {
		return receivingMain;
	}

	public void setReceivingMain(ReceivingMain receivingMain) {
		this.receivingMain = receivingMain;
	}

	public int getQuantity() {
		return quantity;
	}

	public void setQuantity(int quantity) {
		this.quantity = quantity;
	}

	public UnitCount getUnitCount() {
		return unitCount;
	}

	public void setUnitCount(UnitCount unitCount) {
		this.unitCount = unitCount;
	}

	public int getBackOrder() {
		return backOrder;
	}

	public void setBackOrder(int backOrder) {
		this.backOrder = backOrder;
	}
}
