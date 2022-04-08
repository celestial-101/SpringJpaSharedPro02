package com.sharedpro.second.repository;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;

import com.sharedpro.second.entity.DepartmentModel;
import com.sharedpro.second.entity.ProfessorModel;

public interface ProfessorModelRepository extends JpaRepository<ProfessorModel, Integer> {

	List<ProfessorModel> findByDepartmentModelId(DepartmentModel id);

	
}
