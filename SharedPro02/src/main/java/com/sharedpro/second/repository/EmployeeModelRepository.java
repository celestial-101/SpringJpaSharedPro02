package com.sharedpro.second.repository;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;

import com.sharedpro.second.entity.DepartmentModel;
import com.sharedpro.second.entity.EmployeeModel;

public interface EmployeeModelRepository extends JpaRepository<EmployeeModel, Integer> {

	List<EmployeeModel> findByDepartmentModelId(DepartmentModel departmentModelId);

	
	
}
