package com.sharedpro.second.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Sort;
import org.springframework.stereotype.Service;

import com.sharedpro.second.entity.DepartmentModel;
import com.sharedpro.second.entity.EmployeeModel;
import com.sharedpro.second.entity.ProfessorModel;
import com.sharedpro.second.repository.DepartmentModelRepository;
import com.sharedpro.second.repository.EmployeeModelRepository;
import com.sharedpro.second.repository.ProfessorModelRepository;

@Service
public class SharedProService {
	
	@Autowired
	private DepartmentModelRepository departmentModelRepository;
	@Autowired
	private ProfessorModelRepository professorModelRepository;
	@Autowired
	private EmployeeModelRepository employeeModelRepository;
	
	public EmployeeModel addEmployee(EmployeeModel employeeModel) {
		return employeeModelRepository.save(employeeModel);
	}
	
	public List<EmployeeModel> getEmployees() {
        return employeeModelRepository.findAll();
     }
	
	 public List<EmployeeModel> sortingEmployeeModel(String field){
		 return employeeModelRepository.findAll(Sort.by(field));
	 }
	 
	 public ProfessorModel addProfessor(ProfessorModel professorModel) {
			return professorModelRepository.save(professorModel);
     }
	 
	 public List<ProfessorModel> getProfessors(){
		 return professorModelRepository.findAll();
	 }
	 public List<ProfessorModel> sortingProfessorModel(String fields){
		 return professorModelRepository.findAll(Sort.by(fields));
	
	 }
	public List<DepartmentModel> sortingDepartmentModel(String field){
		return departmentModelRepository.findAll(Sort.by(field));
	}

	public List<EmployeeModel> getEmployeeByDepartmentId(DepartmentModel id) {
	  
		return employeeModelRepository.findByDepartmentModelId(id);
	}

	public List<ProfessorModel> getProfessorByDepartmentId(DepartmentModel id) {
		
		return professorModelRepository.findByDepartmentModelId(id);
	}

}

	
