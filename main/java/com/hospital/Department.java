package com.hospital;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;

@Entity
public class Department {
	@Id
	@GeneratedValue
	private int id;
	
    private String departmentName;
    private String departmentDescription;
    private int noOfDoctors;
    private int generalRooms;
    private int acRooms;
    private int nonAcRooms;
    private int icu;
    private double costGeneralRoom;
    private double costAcRoom;
    private double costNonAcRoom;
    private double costIcu;
    
    
	public Department() {
		super();
		// TODO Auto-generated constructor stub
	}

	public Department(String departmentName, String departmentDescription, int noOfDoctors, int generalRooms,
			int acRooms, int nonAcRooms, int icu, double costGeneralRoom, double costAcRoom, double costNonAcRoom,
			double costIcu) {
		super();
		this.departmentName = departmentName;
		this.departmentDescription = departmentDescription;
		this.noOfDoctors = noOfDoctors;
		this.generalRooms = generalRooms;
		this.acRooms = acRooms;
		this.nonAcRooms = nonAcRooms;
		this.icu = icu;
		this.costGeneralRoom = costGeneralRoom;
		this.costAcRoom = costAcRoom;
		this.costNonAcRoom = costNonAcRoom;
		this.costIcu = costIcu;
	}
	
	public String getDepartmentName() {
		return departmentName;
	}
	public void setDepartmentName(String departmentName) {
		this.departmentName = departmentName;
	}
	public String getDepartmentDescription() {
		return departmentDescription;
	}
	public void setDepartmentDescription(String departmentDescription) {
		this.departmentDescription = departmentDescription;
	}
	public int getNoOfDoctors() {
		return noOfDoctors;
	}
	public void setNoOfDoctors(int noOfDoctors) {
		this.noOfDoctors = noOfDoctors;
	}
	public int getGeneralRooms() {
		return generalRooms;
	}
	public void setGeneralRooms(int generalRooms) {
		this.generalRooms = generalRooms;
	}
	public int getAcRooms() {
		return acRooms;
	}
	public void setAcRooms(int acRooms) {
		this.acRooms = acRooms;
	}
	public int getNonAcRooms() {
		return nonAcRooms;
	}
	public void setNonAcRooms(int nonAcRooms) {
		this.nonAcRooms = nonAcRooms;
	}
	public int getIcu() {
		return icu;
	}
	public void setIcu(int icu) {
		this.icu = icu;
	}
	public double getCostGeneralRoom() {
		return costGeneralRoom;
	}
	public void setCostGeneralRoom(double costGeneralRoom) {
		this.costGeneralRoom = costGeneralRoom;
	}
	public double getCostAcRoom() {
		return costAcRoom;
	}
	public void setCostAcRoom(double costAcRoom) {
		this.costAcRoom = costAcRoom;
	}
	public double getCostNonAcRoom() {
		return costNonAcRoom;
	}
	public void setCostNonAcRoom(double costNonAcRoom) {
		this.costNonAcRoom = costNonAcRoom;
	}
	public double getCostIcu() {
		return costIcu;
	}
	public void setCostIcu(double costIcu) {
		this.costIcu = costIcu;
	}
}

