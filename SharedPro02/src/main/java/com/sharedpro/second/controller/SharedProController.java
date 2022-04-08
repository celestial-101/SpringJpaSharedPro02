package com.sharedpro.second.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.sharedpro.second.entity.DepartmentModel;
import com.sharedpro.second.entity.EmployeeModel;
import com.sharedpro.second.entity.ProfessorModel;
import com.sharedpro.second.service.SharedProService;

@RestController
public class SharedProController {
	
	@Autowired
	private SharedProService sharedProService;
	   
	@PostMapping("/addEmployee")
	   public EmployeeModel addEmodel(@RequestBody EmployeeModel eModel) {
		   return sharedProService.addEmployee(eModel);
	}
	@PostMapping("/addprofessor")
	   public ProfessorModel addProfessor(@RequestBody ProfessorModel pModel) {
		return sharedProService.addProfessor(pModel);
	}
	
	@GetMapping("/findemployee")
	   public List<EmployeeModel> findAllEmployee(){
		   return sharedProService.getEmployees();
    }
	
	@GetMapping("/findprofessor")
	   public List<ProfessorModel> findAllProfessor(){
		return sharedProService.getProfessors();
	}
	
	@GetMapping("/{field}")
	   public List<EmployeeModel> findAllEmployeeWithSorting(@PathVariable String field){
	    return sharedProService.sortingEmployeeModel(field);
    }
	
	@GetMapping("sort/{fields}")
	   public List<ProfessorModel> findAllProfessorWithSorting(@PathVariable String fields){
		   return sharedProService.sortingProfessorModel(fields);
	   }

	@GetMapping("sorting/{field}")
	   public List<DepartmentModel> findAllDepartmentWithSorting(@PathVariable String field){
		   return sharedProService.sortingDepartmentModel(field);
	   }
	@GetMapping("/employee/department/{id}")
	   public List<EmployeeModel> findEmployeeByDepartmentId(@PathVariable DepartmentModel id){
		return sharedProService.getEmployeeByDepartmentId(id);
	}
	@GetMapping("/professor/department/{id}")
	   public List<ProfessorModel> findProfessorByDepartmentId(@PathVariable DepartmentModel id){
		return sharedProService.getProfessorByDepartmentId(id);
	}
	   
}
