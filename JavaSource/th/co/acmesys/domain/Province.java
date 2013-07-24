package th.co.acmesys.domain;

import java.io.Serializable;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.Table;

import org.hibernate.annotations.GenericGenerator;

@Entity
@Table(name="province")
@GenericGenerator(strategy="th.co.acmesys.utils.HibernateCurrentTimeIDGenerator", name="IDGENERATOR")
public class Province implements Serializable{
	
	@Id
	@Column(name="province_id")
	@GeneratedValue(generator="IDGENERATOR")
	private Long id;
	
	@Column(name="province_name_th")
	private String provinceNameth;
	
	@Column(name="province_name_eng")
	private String provinceNameEng;

	public Long getId() {
		return id;
	}

	public void setId(Long id) {
		this.id = id;
	}

	public String getProvinceNameth() {
		return provinceNameth;
	}

	public void setProvinceNameth(String provinceNameth) {
		this.provinceNameth = provinceNameth;
	}

	public String getProvinceNameEng() {
		return provinceNameEng;
	}

	public void setProvinceNameEng(String provinceNameEng) {
		this.provinceNameEng = provinceNameEng;
	}
}
