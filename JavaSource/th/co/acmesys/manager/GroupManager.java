package th.co.acmesys.manager;

import java.util.ArrayList;
import java.util.List;

import javax.faces.bean.ManagedBean;
import javax.faces.bean.ViewScoped;

import th.co.acmesys.dao.GenericDao;
import th.co.acmesys.domain.Country;
import th.co.acmesys.domain.OrganizationGroup;
import th.co.acmesys.domain.Province;

@ManagedBean
@ViewScoped
public class GroupManager {
	private OrganizationGroup savedGroup = new OrganizationGroup();
	private List<OrganizationGroup> groupList = new ArrayList<OrganizationGroup>();
	private List<Country> countryList = new ArrayList<Country>();
	private List<Province> provonceList = new ArrayList<Province>();
	
	public GroupManager(){
	
	}
	
	private void createCountryList(){
		countryList.addAll(GenericDao.getCountryList());
	}
	
	private void createProvinceList(){
		provonceList.addAll(GenericDao.getProvinceList());
	}
	
	public OrganizationGroup getSavedGroup() {
		return savedGroup;
	}

	public void setSavedGroup(OrganizationGroup savedGroup) {
		this.savedGroup = savedGroup;
	}

	public List<OrganizationGroup> getGroupList() {
		return groupList;
	}

	public void setGroupList(List<OrganizationGroup> groupList) {
		this.groupList = groupList;
	}

	public List<Country> getCountryList() {
		return countryList;
	}

	public void setCountryList(List<Country> countryList) {
		this.countryList = countryList;
	}

	public List<Province> getProvonceList() {
		return provonceList;
	}

	public void setProvonceList(List<Province> provonceList) {
		this.provonceList = provonceList;
	}
}
