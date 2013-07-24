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
@Table(name="unit_count")
@GenericGenerator(strategy="th.co.acmesys.utils.HibernateCurrentTimeIDGenerator", name="IDGENERATOR")
public class UnitCount implements Serializable{
	
	@Id
	@Column(name="unit_count_id")
	@GeneratedValue(generator="IDGENERATOR")
	private Long id;
	
	@Column(name="unit_count_name")
	private String unitCountName;
	
	@ManyToOne(fetch=FetchType.LAZY)
	@JoinColumn(name="organization_id", referencedColumnName="organization_id")
	private Organization organization;

	public Long getId() {
		return id;
	}

	public void setId(Long id) {
		this.id = id;
	}

	public String getUnitCountName() {
		return unitCountName;
	}

	public void setUnitCountName(String unitCountName) {
		this.unitCountName = unitCountName;
	}

	public Organization getOrganization() {
		return organization;
	}

	public void setOrganization(Organization organization) {
		this.organization = organization;
	}
}
