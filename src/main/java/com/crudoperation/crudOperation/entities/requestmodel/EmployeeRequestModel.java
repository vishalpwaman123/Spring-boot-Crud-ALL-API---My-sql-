package com.crudoperation.crudOperation.entities.requestmodel;

import javax.persistence.Entity;
import javax.persistence.Id;

@Entity
public class EmployeeRequestModel {
	
	
	@Id
	private long id;
	private String employee_Name;
	private String employee_Designation;
	private String employee_Address;
	private String employee_Salary;
	
	public EmployeeRequestModel(int id, String employee_Name, String employee_Designation, String employee_Address,
			String employee_Salary) {
//		super();
		this.id = id;
		this.employee_Name = employee_Name;
		this.employee_Designation = employee_Designation;
		this.employee_Address = employee_Address;
		this.employee_Salary = employee_Salary;
	}
	
	public EmployeeRequestModel() {
		super();
		// TODO Auto-generated constructor stub
	}
	
	
	public long getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public String getEmployee_Name() {
		return employee_Name;
	}
	public void setEmployee_Name(String employee_Name) {
		this.employee_Name = employee_Name;
	}
	public String getEmployee_Designation() {
		return employee_Designation;
	}
	public void setEmployee_Designation(String employee_Designation) {
		this.employee_Designation = employee_Designation;
	}
	public String getEmployee_Address() {
		return employee_Address;
	}
	public void setEmployee_Address(String employee_Address) {
		this.employee_Address = employee_Address;
	}
	public String getEmployee_Salary() {
		return employee_Salary;
	}
	public void setEmployee_Salary(String employee_Salary) {
		this.employee_Salary = employee_Salary;
	}

}
