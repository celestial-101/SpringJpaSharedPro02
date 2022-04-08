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
public class ProfessorModel {
	
	@Id
	@Column(name="professor_id")
	private int professorId;
	
	@NotNull
	private String professorName;
	
	private String professorSubject;
	
	@ManyToOne(cascade = CascadeType.ALL)
	@JoinColumn(name="department_id", referencedColumnName = "department_id")
	private DepartmentModel departmentModelId;
	
	@Email
	private String professorEmail;
	
	private String professorCity;
	
	@Size(min = 10, max = 10)
	@Pattern(regexp="(^$|[0-9]{10})")
	private String professorContact;
	
	private LocalDateTime createdOn;

	public int getProfessorId() {
		return professorId;
	}

	public void setProfessorId(int professorId) {
		this.professorId = professorId;
	}

	public String getProfessorName() {
		return professorName;
	}

	public void setProfessorName(String professorName) {
		this.professorName = professorName;
	}

	public String getProfessorSubject() {
		return professorSubject;
	}

	public void setProfessorSubject(String professorSubject) {
		this.professorSubject = professorSubject;
	}

	public DepartmentModel getDepartmentModel() {
		return departmentModelId;
	}

	public void setDepartmentModel(DepartmentModel departmentModel) {
		this.departmentModelId = departmentModel;
	}

	public String getProfessorEmail() {
		return professorEmail;
	}

	public void setProfessorEmail(String professorEmail) {
		this.professorEmail = professorEmail;
	}

	public String getProfessorCity() {
		return professorCity;
	}

	public void setProfessorCity(String professorCity) {
		this.professorCity = professorCity;
	}

	public String getProfessorContact() {
		return professorContact;
	}

	public void setProfessorContact(String professorContact) {
		this.professorContact = professorContact;
	}

	public LocalDateTime getCreatedOn() {
		return createdOn;
	}

	public void setCreatedOn(LocalDateTime createdOn) {
		this.createdOn = createdOn;
	}

	@Override
	public String toString() {
		return "ProfessorModel [professorId=" + professorId + ", professorName=" + professorName + ", professorSubject="
				+ professorSubject + ", departmentModel=" + departmentModelId + ", professorEmail=" + professorEmail
				+ ", professorCity=" + professorCity + ", professorContact=" + professorContact + ", createdOn="
				+ createdOn + "]";
	}

	@Override
	public int hashCode() {
		return Objects.hash(createdOn, departmentModelId, professorCity, professorContact, professorEmail, professorId,
				professorName, professorSubject);
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		ProfessorModel other = (ProfessorModel) obj;
		return Objects.equals(createdOn, other.createdOn) && Objects.equals(departmentModelId, other.departmentModelId)
				&& Objects.equals(professorCity, other.professorCity)
				&& Objects.equals(professorContact, other.professorContact)
				&& Objects.equals(professorEmail, other.professorEmail) && professorId == other.professorId
				&& Objects.equals(professorName, other.professorName)
				&& Objects.equals(professorSubject, other.professorSubject);
	}
	
	

}
