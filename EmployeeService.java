package com.bhavana.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.bhavana.dao.EmployeeDao;
import com.bhavana.model.Employee;

@Service
public class EmployeeService {
	
	@Autowired
	EmployeeDao employeeDao;
	
    public List<Employee> getAllEmployee(){
    	return employeeDao.getAllEmployee();
    }
}