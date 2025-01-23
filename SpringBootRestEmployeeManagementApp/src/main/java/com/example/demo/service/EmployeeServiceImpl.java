package com.example.demo.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.demo.entity.Employee;
import com.example.demo.repo.EmployeeRepo;

@Service
public class EmployeeServiceImpl implements EmployeeService {

	@Autowired
	EmployeeRepo repo;

	@Override
	public String addEmployee(Employee employee) {
		Employee emp = repo.save(employee);
		if (emp != null) {
			return "Employee Saved Successfully";
		}else {
			return "Failed to Save Employee";
		}

	}

}
