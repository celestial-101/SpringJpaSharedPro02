package com.sharedpro.second.entity;

import java.time.LocalDateTime;
import java.util.Objects;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;

@Entity
public class DepartmentModel {
	
	@Id
	@Column(name="department_id")
	public String departmentId;
	
	public String departmentName;
	
	public LocalDateTime createdOn;

	public String getDepartmentId() {
		return departmentId;
	}

	public void setDepartmentId(String departmentId) {
		this.departmentId = departmentId;
	}

	public String getDepartmentName() {
		return departmentName;
	}

	public void setDepartmentName(String departmentName) {
		this.departmentName = departmentName;
	}

	public LocalDateTime getCreatedOn() {
		return createdOn;
	}

	public void setCreatedOn(LocalDateTime createdOn) {
		this.createdOn = createdOn;
	}

	@Override
	public String toString() {
		return "DepartmentModel [departmentId=" + departmentId + ", departmentName=" + departmentName + ", createdOn="
				+ createdOn + "]";
	}

	@Override
	public int hashCode() {
		return Objects.hash(createdOn, departmentId, departmentName);
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		DepartmentModel other = (DepartmentModel) obj;
		return Objects.equals(createdOn, other.createdOn) && Objects.equals(departmentId, other.departmentId)
				&& Objects.equals(departmentName, other.departmentName);
	}
	
	
}
