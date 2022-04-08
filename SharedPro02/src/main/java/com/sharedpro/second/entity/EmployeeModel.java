package com.sharedpro.second.entity;

import java.time.LocalDateTime;
import java.util.Objects;

import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.validation.constraints.Email;
import javax.validation.constraints.NotNull;
import javax.validation.constraints.Pattern;
import javax.validation.constraints.Size;

@Entity
public class EmployeeModel {
	
	@Id
	@Column(name="employee_id")
	private int employeeId;
	
	@NotNull
	private String employeeName;
	
	@ManyToOne(cascade = CascadeType.ALL)
	@JoinColumn(name="department_id", referencedColumnName = "department_id")
	private DepartmentModel departmentModelId;
	
	private String employeeCity;
	
	@Email
	private String employeeEmail;
	

	@Size(min = 10, max = 10)
	@Pattern(regexp="(^$|[0-9]{10})")
	private String employeeContact;
	
	private LocalDateTime createdOn;

	public int getEmployeeId() {
		return employeeId;
	}

	public void setEmployeeId(int employeeId) {
		this.employeeId = employeeId;
	}

	public String getEmployeeName() {
		return employeeName;
	}

	public void setEmployeeName(String employeeName) {
		this.employeeName = employeeName;
	}

	public DepartmentModel getDepartmentModel() {
		return departmentModelId;
	}

	public void setDepartmentModel(DepartmentModel departmentModel) {
		this.departmentModelId = departmentModel;
	}

	public String getEmployeeEmail() {
		return employeeEmail;
	}

	public void setEmployeeEmail(String employeeEmail) {
		this.employeeEmail = employeeEmail;
	}

	public String getEmployeeContact() {
		return employeeContact;
	}

	public void setEmployeeContact(String employeeContact) {
		this.employeeContact = employeeContact;
	}

	public LocalDateTime getCreatedOn() {
		return createdOn;
	}

	public void setCreatedOn(LocalDateTime createdOn) {
		this.createdOn = createdOn;
	}

	public String getEmployeeCity() {
		return employeeCity;
	}

	public void setEmployeeCity(String employeeCity) {
		this.employeeCity = employeeCity;
	}

	@Override
	public String toString() {
		return "EmployeeModel [employeeId=" + employeeId + ", employeeName=" + employeeName + ", departmentModelId="
				+ departmentModelId + ", employeeCity=" + employeeCity + ", employeeEmail=" + employeeEmail
				+ ", employeeContact=" + employeeContact + ", createdOn=" + createdOn + "]";
	}

	@Override
	public int hashCode() {
		return Objects.hash(createdOn, departmentModelId, employeeCity, employeeContact, employeeEmail, employeeId,
				employeeName);
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		EmployeeModel other = (EmployeeModel) obj;
		return Objects.equals(createdOn, other.createdOn) && Objects.equals(departmentModelId, other.departmentModelId)
				&& Objects.equals(employeeCity, other.employeeCity)
				&& Objects.equals(employeeContact, other.employeeContact)
				&& Objects.equals(employeeEmail, other.employeeEmail) && employeeId == other.employeeId
				&& Objects.equals(employeeName, other.employeeName);
	}
	
	
	
}
