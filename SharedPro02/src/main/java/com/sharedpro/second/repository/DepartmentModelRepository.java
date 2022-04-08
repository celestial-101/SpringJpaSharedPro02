package com.sharedpro.second.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.sharedpro.second.entity.DepartmentModel;

public interface DepartmentModelRepository extends JpaRepository<DepartmentModel, String> {

	
}