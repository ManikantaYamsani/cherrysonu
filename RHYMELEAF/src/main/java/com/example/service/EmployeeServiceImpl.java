package com.example.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.dao.EmpRepository;
import com.example.model.Employee;

@Service
public class EmployeeServiceImpl implements EmployeeService {

	@Autowired
	private EmpRepository emprepository;

	@Override
	public List<Employee> findAll() {

		return emprepository.findAll();
	}

	public void save(Employee theEmployee) {
		emprepository.save(theEmployee);

	}

	@Override
	public void deleteById(long theId) {
		emprepository.deleteById(theId);
	}

}
