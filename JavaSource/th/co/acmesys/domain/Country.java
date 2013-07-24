package th.co.acmesys.domain;

import java.io.Serializable;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.Table;

import org.hibernate.annotations.GenericGenerator;


@Entity
@Table(name="country")
@GenericGenerator(strategy="th.co.acmesys.utils.HibernateCurrentTimeIDGenerator", name="IDGENERATOR")
public class Country implements Serializable{
	
	@Id
	@Column(name="country_id")
	@GeneratedValue(generator="IDGENERATOR")
	private Long id;
	
	@Column(name="thai_name")
	private String thaiName;
	
	@Column(name="eng_name")
	private String engName;

	public Long getId() {
		return id;
	}

	public void setId(Long id) {
		this.id = id;
	}

	public String getThaiName() {
		return thaiName;
	}

	public void setThaiName(String thaiName) {
		this.thaiName = thaiName;
	}

	public String getEngName() {
		return engName;
	}

	public void setEngName(String engName) {
		this.engName = engName;
	}
}
