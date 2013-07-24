package th.co.acmesys.domain;

import java.io.Serializable;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.Table;

import org.hibernate.annotations.GenericGenerator;

@Entity
@Table(name="pricing_process")
@GenericGenerator(strategy="th.co.acmesys.utils.HibernateCurrentTimeIDGenerator", name="IDGENERATOR")
public class PricingProcess implements Serializable{
	
	@Id
	@Column(name="pricing_process_id")
	@GeneratedValue(generator="IDGENERATOR")
	private Long id;
	
	@Column(name="pricing_process_name")
	private String pricingProcessName;

	public Long getId() {
		return id;
	}

	public void setId(Long id) {
		this.id = id;
	}

	public String getPricingProcessName() {
		return pricingProcessName;
	}

	public void setPricingProcessName(String pricingProcessName) {
		this.pricingProcessName = pricingProcessName;
	}
}
