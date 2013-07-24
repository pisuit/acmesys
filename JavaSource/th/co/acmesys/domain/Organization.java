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
@Table(name="organization")
@GenericGenerator(strategy="th.co.acmesys.utils.HibernateCurrentTimeIDGenerator", name="IDGENERATOR")
public class Organization implements Serializable{
	
	@Id
	@Column(name="organization_id")
	@GeneratedValue(generator="IDGENERATOR")
	private Long id;
	
	@Column(name="is_same_as_group")
	private boolean isSameAsGroup;
	
	@Column(name="organization_name")
	private String organizationName;
	
	@ManyToOne(fetch=FetchType.LAZY)
	@JoinColumn(name="group_id", referencedColumnName="group_id")
	private OrganizationGroup group;
	
	@Column(name="business_registrationid")
	private String businessRegistrationID;
	
	@Column(name="tax_registrationid")
	private String taxRegistrationID;
	
	@Column(name="registered_address")
	private String registeredAddress;
	
	@Column(name="registered_city")
	private String registeredCity;
	
	@Column(name="registered_state")
	private String registeredState;
	
	@ManyToOne(fetch=FetchType.LAZY)
	@JoinColumn(name="registered_province_id", referencedColumnName="province_id")
	private Province registerdProvince;
	
	@ManyToOne(fetch=FetchType.LAZY)
	@JoinColumn(name="registered_country_id", referencedColumnName="country_id")
	private Country registeredCountry;
	
	@Column(name="registered_postcode")
	private String registeredPostcode;
	
	@Column(name="contact_business_tel1")
	private String contactBusinessTel1;
	
	@Column(name="contact_business_tel2")
	private String contactBusinessTel2;
	
	@Column(name="contact_business_fax")
	private String contactBusinessFax;
	
	@Column(name="delivery_address")
	private String deliveryAddress;
	
	@Column(name="delivery_city")
	private String deliveryCity;
	
	@Column(name="delivery_state")
	private String deliveryState;
	
	@ManyToOne(fetch=FetchType.LAZY)
	@JoinColumn(name="delivery_province_id", referencedColumnName="province_id")
	private Province deliveryProvince;
	
	@ManyToOne(fetch=FetchType.LAZY)
	@JoinColumn(name="delivery_country_id" ,referencedColumnName="country_id")
	private Country deliveryCountry;
	
	@Column(name="delivery_postcode")
	private String deliveryPostcode;
	
	@Column(name="contact_delivery_tel1")
	private String contactDeliveryTel1;
	
	@Column(name="contact_delivery_tel2")
	private String contactDeliveryTel2;
	
	@Column(name="contact_delivery_fax")
	private String contactDeliveryFax;
	
	@Column(name="contact_person1")
	private String contactPerson1;
	
	@Column(name="contact_tel1")
	private String contactTel1;
	
	@Column(name="contact_email1")
	private String contactEmail1;
	
	@Column(name="contact_pperson2")
	private String contactPerson2;
	
	@Column(name="contact_tel2")
	private String contactTel2;
	
	@Column(name="contact_email2")
	private String contactEmail2;

	public Long getId() {
		return id;
	}

	public void setId(Long id) {
		this.id = id;
	}

	public boolean isSameAsGroup() {
		return isSameAsGroup;
	}

	public void setSameAsGroup(boolean isSameAsGroup) {
		this.isSameAsGroup = isSameAsGroup;
	}

	public String getOrganizationName() {
		return organizationName;
	}

	public void setOrganizationName(String organizationName) {
		this.organizationName = organizationName;
	}

	public OrganizationGroup getGroup() {
		return group;
	}

	public void setGroup(OrganizationGroup group) {
		this.group = group;
	}

	public String getBusinessRegistrationID() {
		return businessRegistrationID;
	}

	public void setBusinessRegistrationID(String businessRegistrationID) {
		this.businessRegistrationID = businessRegistrationID;
	}

	public String getTaxRegistrationID() {
		return taxRegistrationID;
	}

	public void setTaxRegistrationID(String taxRegistrationID) {
		this.taxRegistrationID = taxRegistrationID;
	}

	public String getRegisteredAddress() {
		return registeredAddress;
	}

	public void setRegisteredAddress(String registeredAddress) {
		this.registeredAddress = registeredAddress;
	}

	public String getRegisteredCity() {
		return registeredCity;
	}

	public void setRegisteredCity(String registeredCity) {
		this.registeredCity = registeredCity;
	}

	public String getRegisteredState() {
		return registeredState;
	}

	public void setRegisteredState(String registeredState) {
		this.registeredState = registeredState;
	}

	public Province getRegisterdProvince() {
		return registerdProvince;
	}

	public void setRegisterdProvince(Province registerdProvince) {
		this.registerdProvince = registerdProvince;
	}

	public Country getRegisteredCountry() {
		return registeredCountry;
	}

	public void setRegisteredCountry(Country registeredCountry) {
		this.registeredCountry = registeredCountry;
	}

	public String getRegisteredPostcode() {
		return registeredPostcode;
	}

	public void setRegisteredPostcode(String registeredPostcode) {
		this.registeredPostcode = registeredPostcode;
	}

	public String getContactBusinessTel1() {
		return contactBusinessTel1;
	}

	public void setContactBusinessTel1(String contactBusinessTel1) {
		this.contactBusinessTel1 = contactBusinessTel1;
	}

	public String getContactBusinessTel2() {
		return contactBusinessTel2;
	}

	public void setContactBusinessTel2(String contactBusinessTel2) {
		this.contactBusinessTel2 = contactBusinessTel2;
	}

	public String getContactBusinessFax() {
		return contactBusinessFax;
	}

	public void setContactBusinessFax(String contactBusinessFax) {
		this.contactBusinessFax = contactBusinessFax;
	}

	public String getDeliveryAddress() {
		return deliveryAddress;
	}

	public void setDeliveryAddress(String deliveryAddress) {
		this.deliveryAddress = deliveryAddress;
	}

	public String getDeliveryCity() {
		return deliveryCity;
	}

	public void setDeliveryCity(String deliveryCity) {
		this.deliveryCity = deliveryCity;
	}

	public String getDeliveryState() {
		return deliveryState;
	}

	public void setDeliveryState(String deliveryState) {
		this.deliveryState = deliveryState;
	}

	public Province getDeliveryProvince() {
		return deliveryProvince;
	}

	public void setDeliveryProvince(Province deliveryProvince) {
		this.deliveryProvince = deliveryProvince;
	}

	public Country getDeliveryCountry() {
		return deliveryCountry;
	}

	public void setDeliveryCountry(Country deliveryCountry) {
		this.deliveryCountry = deliveryCountry;
	}

	public String getDeliveryPostcode() {
		return deliveryPostcode;
	}

	public void setDeliveryPostcode(String deliveryPostcode) {
		this.deliveryPostcode = deliveryPostcode;
	}

	public String getContactDeliveryTel1() {
		return contactDeliveryTel1;
	}

	public void setContactDeliveryTel1(String contactDeliveryTel1) {
		this.contactDeliveryTel1 = contactDeliveryTel1;
	}

	public String getContactDeliveryTel2() {
		return contactDeliveryTel2;
	}

	public void setContactDeliveryTel2(String contactDeliveryTel2) {
		this.contactDeliveryTel2 = contactDeliveryTel2;
	}

	public String getContactDeliveryFax() {
		return contactDeliveryFax;
	}

	public void setContactDeliveryFax(String contactDeliveryFax) {
		this.contactDeliveryFax = contactDeliveryFax;
	}

	public String getContactPerson1() {
		return contactPerson1;
	}

	public void setContactPerson1(String contactPerson1) {
		this.contactPerson1 = contactPerson1;
	}

	public String getContactTel1() {
		return contactTel1;
	}

	public void setContactTel1(String contactTel1) {
		this.contactTel1 = contactTel1;
	}

	public String getContactEmail1() {
		return contactEmail1;
	}

	public void setContactEmail1(String contactEmail1) {
		this.contactEmail1 = contactEmail1;
	}

	public String getContactPerson2() {
		return contactPerson2;
	}

	public void setContactPerson2(String contactPerson2) {
		this.contactPerson2 = contactPerson2;
	}

	public String getContactTel2() {
		return contactTel2;
	}

	public void setContactTel2(String contactTel2) {
		this.contactTel2 = contactTel2;
	}

	public String getContactEmail2() {
		return contactEmail2;
	}

	public void setContactEmail2(String contactEmail2) {
		this.contactEmail2 = contactEmail2;
	}
}
