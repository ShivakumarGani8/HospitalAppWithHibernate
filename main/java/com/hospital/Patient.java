package com.hospital;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;

@Entity
public class Patient {
	@Id
	@GeneratedValue
	private int id;
    private String firstName;
    private String lastName;
    private String dateOfBirth;
    private String gender;
    private String fatherOrSpouseName;
    private String bloodGroup;
    private String contactNumber;
    private boolean visitedEarlier;
    
    public Patient(String firstName, String lastName, String dateOfBirth, String gender, String fatherOrSpouseName,
			String bloodGroup, String contactNumber, boolean visitedEarlier) {
		super();
		this.firstName = firstName;
		this.lastName = lastName;
		this.dateOfBirth = dateOfBirth;
		this.gender = gender;
		this.fatherOrSpouseName = fatherOrSpouseName;
		this.bloodGroup = bloodGroup;
		this.contactNumber = contactNumber;
		this.visitedEarlier = visitedEarlier;
	}
    
	public String getFirstName() {
		return firstName;
	}
	public void setFirstName(String firstName) {
		this.firstName = firstName;
	}
	public String getLastName() {
		return lastName;
	}
	public void setLastName(String lastName) {
		this.lastName = lastName;
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
	public String getFatherOrSpouseName() {
		return fatherOrSpouseName;
	}
	public void setFatherOrSpouseName(String fatherOrSpouseName) {
		this.fatherOrSpouseName = fatherOrSpouseName;
	}
	public String getBloodGroup() {
		return bloodGroup;
	}
	public void setBloodGroup(String bloodGroup) {
		this.bloodGroup = bloodGroup;
	}
	public String getContactNumber() {
		return contactNumber;
	}
	public void setContactNumber(String contactNumber) {
		this.contactNumber = contactNumber;
	}
	public boolean isVisitedEarlier() {
		return visitedEarlier;
	}
	public void setVisitedEarlier(boolean visitedEarlier) {
		this.visitedEarlier = visitedEarlier;
	}

	@Override
	public String toString() {
		return "Patient [firstName=" + firstName + ", lastName=" + lastName + ", dateOfBirth=" + dateOfBirth
				+ ", gender=" + gender + ", fatherOrSpouseName=" + fatherOrSpouseName + ", bloodGroup=" + bloodGroup
				+ ", contactNumber=" + contactNumber + ", visitedEarlier=" + visitedEarlier + "]";
	}
    
}
