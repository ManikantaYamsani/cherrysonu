package com.example.dao;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.example.model.Employee;

@Repository
public interface EmpRepository extends JpaRepository<Employee, Long> {



	
}
