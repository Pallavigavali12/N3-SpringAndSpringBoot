package org.tnsif.placementmanagemententities;

import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.Table;

@Entity 
@Table(name="student")
public class Student {
	
	@Id
	private int ID ;
	private String name;
	private int roll;
	private String qualification;
	private String course;
	private int year;
	private int hallticket;
	public Student(int iD, String name, int roll, String qualification, String course, int year, int hallticket) {
		super();
		ID = iD;
		this.name = name;
		this.roll = roll;
		this.qualification = qualification;
		this.course = course;
		this.year = year;
		this.hallticket = hallticket;
	}
	public Student() {
		super();
	}
	@Override
	public String toString() {
		return "Student [ID=" + ID + ", name=" + name + ", roll=" + roll + ", qualification=" + qualification
				+ ", course=" + course + ", year=" + year + ", hallticket=" + hallticket + "]";
	}
	public int getID() {
		return ID;
	}
	public void setID(int iD) {
		ID = iD;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public int getRoll() {
		return roll;
	}
	public void setRoll(int roll) {
		this.roll = roll;
	}
	public String getQualification() {
		return qualification;
	}
	public void setQualification(String qualification) {
		this.qualification = qualification;
	}
	public String getCourse() {
		return course;
	}
	public void setCourse(String course) {
		this.course = course;
	}
	public int getYear() {
		return year;
	}
	public void setYear(int year) {
		this.year = year;
	}
	public int getHallticket() {
		return hallticket;
	}
	public void setHallticket(int hallticket) {
		this.hallticket = hallticket;
	}
	
	
	

}
