package com.restdemo.model;


import java.util.Date;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.IdClass;
import javax.persistence.SequenceGenerator;
import javax.persistence.SequenceGenerators;
import javax.persistence.Table;

	@Entity
	@Table(name = "applicationdata")
public class ApplicationData {
		
		public ApplicationData() {
			
		}
	
		public ApplicationData(int ssnNumber, String firstName, String middleName, String lastName, Date dateOfBirth,
			String maritalStatus, int loanAmount, String loanPurpose, String description, String addressLine1,
			String addressLine2, String city, String state, int postalCode, int homeNumber, int officeNumber,
			int mobileNumber, String email, String employerName, String designation, int annualSalary, int workExYr,
			int workExMonth, String empAddressLine1, String empAddressLine2, String empCity, String empState,
			int empPostalCode, int status, Date dateOfSubmission) {
		super();
		this.ssnNumber = ssnNumber;
		this.firstName = firstName;
		this.middleName = middleName;
		this.lastName = lastName;
		this.dateOfBirth = dateOfBirth;
		this.maritalStatus = maritalStatus;
		this.loanAmount = loanAmount;
		this.loanPurpose = loanPurpose;
		this.description = description;
		this.addressLine1 = addressLine1;
		this.addressLine2 = addressLine2;
		this.city = city;
		this.state = state;
		this.postalCode = postalCode;
		this.homeNumber = homeNumber;
		this.officeNumber = officeNumber;
		this.mobileNumber = mobileNumber;
		this.email = email;
		this.employerName = employerName;
		this.designation = designation;
		this.annualSalary = annualSalary;
		this.workExYr = workExYr;
		this.workExMonth = workExMonth;
		this.empAddressLine1 = empAddressLine1;
		this.empAddressLine2 = empAddressLine2;
		this.empCity = empCity;
		this.empState = empState;
		this.empPostalCode = empPostalCode;
		this.status = status;
		this.dateOfSubmission = dateOfSubmission;
	}

	    @Id
	    @SequenceGenerator(name="id",sequenceName="id_gen", allocationSize=1)
	    @GeneratedValue(generator="id",strategy=GenerationType.SEQUENCE)
		@Column(name = "id")
		private int id;
		
		
	    @Column(name="ssnNumber")
	    private int ssnNumber;

	    @Column(name="firstName")
	    private String firstName;
	    
	    @Column(name="middleName")
	    private String middleName;
	    
	    @Column(name="lastName")
	    private String lastName;
	    
	    @Column(name="dateOfBirth")
	    private Date dateOfBirth;
	    
	    @Column(name="maritalStatus")
	    private String maritalStatus;
	    
	    @Column(name="loanAmount")
	    private int loanAmount;
	    
	    @Column(name="loanPurpose")
	    private String loanPurpose ;
	    
	    @Column(name="description")
	    private String description;
	    
	    @Column(name="addressLine1")
	    private String addressLine1;
	    
	    @Column(name="addressLine2")
	    private String addressLine2;
	    
	    @Column(name="city")
	    private String city;
	    
	    @Column(name="state")
	    private String state;
	    
	    @Column(name="postalCode")
	    private int postalCode;
	    
	    @Column(name="homeNumber")
	    private int homeNumber;
	    
	    @Column(name="officeNumber")
	    private int officeNumber;
	    
	    @Column(name="mobileNumber")
	    private int mobileNumber;
	    
	    @Column(name="email")
	    private String email;
	    
	    @Column(name="employerName")
	    private String employerName;
	    
	    @Column(name="designation")
	    private String designation;
	    
	    @Column(name="annualSalary")
	    private int annualSalary;
	    
	    @Column(name="workExYr")
	    private int workExYr;
	    
	    @Column(name="workExMonth")
	    private int workExMonth;
	    
	    @Column(name="empAddressLine1")
	    private String empAddressLine1;
	    
	    @Column(name="empAddressLine2")
	    private String empAddressLine2;
	    
	    @Column(name="empCity")
	    private String empCity;
	    
	    @Column(name="empState")
	    private String empState;
	    
	    @Column(name="empPostalCode")
	    private int empPostalCode;
	    
	    @Column(name="status")
	    private int status;
	    
	    @Column(name="dateOfSubmission")
	    private Date dateOfSubmission;
	    
	    
	    
	    
		public int getId() {
			return id;
		}

		public void setId(int id) {
			this.id = id;
		}

		public int getSsnNumber() {
			return ssnNumber;
		}

		public void setSsnNumber(int ssnNumber) {
			this.ssnNumber = ssnNumber;
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

		public Date getDateOfBirth() {
			return dateOfBirth;
		}

		public void setDateOfBirth(Date dateOfBirth) {
			this.dateOfBirth = dateOfBirth;
		}

		public String getMaritalStatus() {
			return maritalStatus;
		}

		public void setMaritalStatus(String maritalStatus) {
			this.maritalStatus = maritalStatus;
		}

		public int getLoanAmount() {
			return loanAmount;
		}

		public void setLoanAmount(int loanAmount) {
			this.loanAmount = loanAmount;
		}

		public String getLoanPurpose() {
			return loanPurpose;
		}

		public void setLoanPurpose(String loanPurpose) {
			this.loanPurpose = loanPurpose;
		}

		public String getDescription() {
			return description;
		}

		public void setDescription(String description) {
			this.description = description;
		}

		public String getAddressLine1() {
			return addressLine1;
		}

		public void setAddressLine1(String addressLine1) {
			this.addressLine1 = addressLine1;
		}

		public String getAddressLine2() {
			return addressLine2;
		}

		public void setAddressLine2(String addressLine2) {
			this.addressLine2 = addressLine2;
		}

		public String getCity() {
			return city;
		}

		public void setCity(String city) {
			this.city = city;
		}

		public String getState() {
			return state;
		}

		public void setState(String state) {
			this.state = state;
		}

		public int getPostalCode() {
			return postalCode;
		}

		public void setPostalCode(int postalCode) {
			this.postalCode = postalCode;
		}

		public int getHomeNumber() {
			return homeNumber;
		}

		public void setHomeNumber(int homeNumber) {
			this.homeNumber = homeNumber;
		}

		public int getOfficeNumber() {
			return officeNumber;
		}

		public void setOfficeNumber(int officeNumber) {
			this.officeNumber = officeNumber;
		}

		public int getMobileNumber() {
			return mobileNumber;
		}

		public void setMobileNumber(int mobileNumber) {
			this.mobileNumber = mobileNumber;
		}

		public String getEmail() {
			return email;
		}

		public void setEmail(String email) {
			this.email = email;
		}

		public String getEmployerName() {
			return employerName;
		}

		public void setEmployerName(String employerName) {
			this.employerName = employerName;
		}

		public String getDesignation() {
			return designation;
		}

		public void setDesignation(String designation) {
			this.designation = designation;
		}

		public int getAnnualSalary() {
			return annualSalary;
		}

		public void setAnnualSalary(int annualSalary) {
			this.annualSalary = annualSalary;
		}

		public int getWorkExYr() {
			return workExYr;
		}

		public void setWorkExYr(int workExYr) {
			this.workExYr = workExYr;
		}

		public int getWorkExMonth() {
			return workExMonth;
		}

		public void setWorkExMonth(int workExMonth) {
			this.workExMonth = workExMonth;
		}

		public String getEmpAddressLine1() {
			return empAddressLine1;
		}

		public void setEmpAddressLine1(String empAddressLine1) {
			this.empAddressLine1 = empAddressLine1;
		}

		public String getEmpAddressLine2() {
			return empAddressLine2;
		}

		public void setEmpAddressLine2(String empAddressLine2) {
			this.empAddressLine2 = empAddressLine2;
		}

		public String getEmpCity() {
			return empCity;
		}

		public void setEmpCity(String empCity) {
			this.empCity = empCity;
		}

		public String getEmpState() {
			return empState;
		}

		public void setEmpState(String empState) {
			this.empState = empState;
		}

		public int getEmpPostalCode() {
			return empPostalCode;
		}

		public void setEmpPostalCode(int empPostalCode) {
			this.empPostalCode = empPostalCode;
		}

		public int getStatus() {
			return status;
		}

		public void setStatus(int status) {
			this.status = status;
		}

		public Date getDateOfSubmission() {
			return dateOfSubmission;
		}

		public void setDateOfSubmission(Date dateOfSubmission) {
			this.dateOfSubmission = dateOfSubmission;
		}

	    
	    

}
