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
@Table(name="po_detail")
@GenericGenerator(strategy="th.co.acmesys.utils.HibernateCurrentTimeIDGenerator", name="IDGENERATOR")
public class PODetail implements Serializable{
	
	@Id
	@Column(name="po_detail_id")
	@GeneratedValue(generator="IDGENERATOR")
	private Long id;
	
	@ManyToOne(fetch=FetchType.LAZY)
	@JoinColumn(name="po_main_id", referencedColumnName="po_main_id")
	private POMain poMain;
	
	@Column(name="back_order")
	private int backOrder;

	public Long getId() {
		return id;
	}

	public void setId(Long id) {
		this.id = id;
	}

	public POMain getPoMain() {
		return poMain;
	}

	public void setPoMain(POMain poMain) {
		this.poMain = poMain;
	}

	public int getBackOrder() {
		return backOrder;
	}

	public void setBackOrder(int backOrder) {
		this.backOrder = backOrder;
	}
}
