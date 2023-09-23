package com.hospital;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;

@Entity
public class Doctor {
	
	@Id
	@GeneratedValue
	private int id;
    private String firstName;
    private String middleName;
    private String lastName;
    private String registrationNo;
    private String dateOfBirth;
    private String gender;
    private String email;
    private String specialization;
    private String qualification;
    private String contactNumber;
    private String address;
    private String visitingTime;
    private String[] visitingDays;
    private int noOfPatientsPerDay;
    private int departmentNo;
	public Doctor(String firstName, String middleName, String lastName, String registrationNo, String dateOfBirth,
			String gender, String email, String specialization, String qualification, String contactNumber,
			String address, String visitingTime, String[] visitingDays, int noOfPatientsPerDay, int departmentNo) {
		super();
		this.firstName = firstName;
		this.middleName = middleName;
		this.lastName = lastName;
		this.registrationNo = registrationNo;
		this.dateOfBirth = dateOfBirth;
		this.gender = gender;
		this.email = email;
		this.specialization = specialization;
		this.qualification = qualification;
		this.contactNumber = contactNumber;
		this.address = address;
		this.visitingTime = visitingTime;
		this.visitingDays = visitingDays;
		this.noOfPatientsPerDay = noOfPatientsPerDay;
		this.departmentNo = departmentNo;
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
	public String getRegistrationNo() {
		return registrationNo;
	}
	public void setRegistrationNo(String registrationNo) {
		this.registrationNo = registrationNo;
	}
	public String getDateOfBirth() {
		return dateOfBirth;
	}
	public void setDateOfBirth(String dateOfBirth) {
		this.dateOfBirth = dateOfBirth;
	}
	public String getGender() {
		return gender;
	}
	public void setGender(String gender) {
		this.gender = gender;
	}
	public String getEmail() {
		return email;
	}
	public void setEmail(String email) {
		this.email = email;
	}
	public String getSpecialization() {
		return specialization;
	}
	public void setSpecialization(String specialization) {
		this.specialization = specialization;
	}
	public String getQualification() {
		return qualification;
	}
	public void setQualification(String qualification) {
		this.qualification = qualification;
	}
	public String getContactNumber() {
		return contactNumber;
	}
	public void setContactNumber(String contactNumber) {
		this.contactNumber = contactNumber;
	}
	public String getAddress() {
		return address;
	}
	public void setAddress(String address) {
		this.address = address;
	}
	public String getVisitingTime() {
		return visitingTime;
	}
	public void setVisitingTime(String visitingTime) {
		this.visitingTime = visitingTime;
	}
	public String[] getVisitingDays() {
		return visitingDays;
	}
	public void setVisitingDays(String[] visitingDays) {
		this.visitingDays = visitingDays;
	}
	public int getNoOfPatientsPerDay() {
		return noOfPatientsPerDay;
	}
	public void setNoOfPatientsPerDay(int noOfPatientsPerDay) {
		this.noOfPatientsPerDay = noOfPatientsPerDay;
	}
	public int getDepartmentNo() {
		return departmentNo;
	}
	public void setDepartmentNo(int departmentNo) {
		this.departmentNo = departmentNo;
	}

    
}

