package th.co.acmesys.domain;

import java.util.Date;

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
@Table(name="user")
@GenericGenerator(strategy="th.co.acmesys.utils.HibernateCurrentTimeIDGenerator", name="IDGENERATOR")
public class User {
	
	@Id
	@Column(name="user_id")
	@GeneratedValue(generator="IDGENERATOR")
	private Long id;
	
	@Column(name="user_account")
	private String userAccount;
	
	@Column(name="password")
	private String password;
	
	@ManyToOne(fetch=FetchType.LAZY)
	@JoinColumn(name="title_id", referencedColumnName="title_id")
	private Title title;
	
	@Column(name="first_name")
	private String firstName;
	
	@Column(name="middle_name")
	private String middleName;
	
	@Column(name="last_name")
	private String lastName;
	
	@ManyToOne(fetch=FetchType.LAZY)
	@JoinColumn(name="position_id", referencedColumnName="position_id")
	private Position position;
	
	@ManyToOne(fetch=FetchType.LAZY)
	@JoinColumn(name="department_id", referencedColumnName="department_id")
	private Department department;
	
	@ManyToOne(fetch=FetchType.LAZY)
	@JoinColumn(name="organization_id", referencedColumnName="organization_id")
	private Organization organization;
	
	@Column(name="contact_name")
	private String contactNumber;
	
	@Column(name="extension")
	private String extension;
	
	@Column(name="mobile")
	private String mobile;
	
	@Column(name="fax")
	private String fax;
	
	@Column(name="email")
	private String email;
	
	@Column(name="alternative_email")
	private String alternativeEmail;
	
	@ManyToOne(fetch=FetchType.LAZY)
	@JoinColumn(name="cost_center_code_id", referencedColumnName="cost_center_code_id")
	private CostCenterCode costCenterCode;
	
	@ManyToOne(fetch=FetchType.LAZY)
	@JoinColumn(name="account_code_id", referencedColumnName="account_code_id")
	private AccountCode accountCode;
	
	@ManyToOne(fetch=FetchType.LAZY)
	@JoinColumn(name="question_id", referencedColumnName="question_id")
	private Question question;
	
	@Column(name="answer")
	private String answer;
	
	@Column(name="out_of_office")
	private boolean outOfOffice;
	
	@Column(name="start_date")
	private Date startDate;
	
	@Column(name="end_date")
	private Date endDate;

	public Long getId() {
		return id;
	}

	public void setId(Long id) {
		this.id = id;
	}

	public String getUserAccount() {
		return userAccount;
	}

	public void setUserAccount(String userAccount) {
		this.userAccount = userAccount;
	}

	public String getPassword() {
		return password;
	}

	public void setPassword(String password) {
		this.password = password;
	}

	public Title getTitle() {
		return title;
	}

	public void setTitle(Title title) {
		this.title = title;
	}

	public String getFirstName() {
		return firstName;
	}

	public void setFirstName(String firstName) {
		this.firstName = firstName;
	}

	public String getMiddleName() {
		return middleName;
	}

	public void setMiddleName(String middleName) {
		this.middleName = middleName;
	}

	public String getLastName() {
		return lastName;
	}

	public void setLastName(String lastName) {
		this.lastName = lastName;
	}

	public Position getPosition() {
		return position;
	}

	public void setPosition(Position position) {
		this.position = position;
	}

	public Department getDepartment() {
		return department;
	}

	public void setDepartment(Department department) {
		this.department = department;
	}

	public Organization getOrganization() {
		return organization;
	}

	public void setOrganization(Organization organization) {
		this.organization = organization;
	}

	public String getContactNumber() {
		return contactNumber;
	}

	public void setContactNumber(String contactNumber) {
		this.contactNumber = contactNumber;
	}

	public String getExtension() {
		return extension;
	}

	public void setExtension(String extension) {
		this.extension = extension;
	}

	public String getMobile() {
		return mobile;
	}

	public void setMobile(String mobile) {
		this.mobile = mobile;
	}

	public String getFax() {
		return fax;
	}

	public void setFax(String fax) {
		this.fax = fax;
	}

	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
	}

	public String getAlternativeEmail() {
		return alternativeEmail;
	}

	public void setAlternativeEmail(String alternativeEmail) {
		this.alternativeEmail = alternativeEmail;
	}

	public CostCenterCode getCostCenterCode() {
		return costCenterCode;
	}

	public void setCostCenterCode(CostCenterCode costCenterCode) {
		this.costCenterCode = costCenterCode;
	}

	public AccountCode getAccountCode() {
		return accountCode;
	}

	public void setAccountCode(AccountCode accountCode) {
		this.accountCode = accountCode;
	}

	public Question getQuestion() {
		return question;
	}

	public void setQuestion(Question question) {
		this.question = question;
	}

	public String getAnswer() {
		return answer;
	}

	public void setAnswer(String answer) {
		this.answer = answer;
	}

	public boolean isOutOfOffice() {
		return outOfOffice;
	}

	public void setOutOfOffice(boolean outOfOffice) {
		this.outOfOffice = outOfOffice;
	}

	public Date getStartDate() {
		return startDate;
	}

	public void setStartDate(Date startDate) {
		this.startDate = startDate;
	}

	public Date getEndDate() {
		return endDate;
	}

	public void setEndDate(Date endDate) {
		this.endDate = endDate;
	}
}
