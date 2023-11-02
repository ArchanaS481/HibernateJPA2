package com.deeptech.hibernate.work.dto;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name="employee")
public class Employee {

	@Id
	@Column(name="empid")
	@GeneratedValue(strategy=GenerationType.SEQUENCE)
	private int empid;
	@Column(name="EmpName")
	private String EmpName;
	@Column(name="Designation")
	private String designation;
	@Column(name="salary")
	private Double salary;
	
   //Generate getter and setter method
	public String getEmpName() {
		return EmpName;
	}
	public void setEmpName(String empName) {
		EmpName = empName;
	}
	public String getDesignation() {
		return designation;
	}
	public void setDesignation(String designation) {
		this.designation = designation;
	}
	public Double getSalary() {
		return salary;
	}
	public void setSalary(Double salary) {
		this.salary = salary;
	}
}

