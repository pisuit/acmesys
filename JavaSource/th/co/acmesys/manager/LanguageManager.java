package th.co.acmesys.manager;

import java.util.ArrayList;
import java.util.List;
import java.util.ResourceBundle;

import javax.faces.bean.ManagedBean;
import javax.faces.bean.SessionScoped;
import javax.faces.bean.ViewScoped;

import th.co.acmesys.domain.Country;
import th.co.acmesys.domain.Province;

@ManagedBean(name="langManager")
@ViewScoped
public class LanguageManager {
	private ResourceBundle bundle;
	private String selectedLang = "en";
	
	public LanguageManager(){
		bundle = ResourceBundle.getBundle(selectedLang);
	}
	
	
	public ResourceBundle getBundle() {
		return bundle;
	}
	public void setBundle(ResourceBundle bundle) {
		this.bundle = bundle;
	}
	public String getSelectedLang() {
		return selectedLang;
	}
	public void setSelectedLang(String selectedLang) {
		this.selectedLang = selectedLang;
	}
}
