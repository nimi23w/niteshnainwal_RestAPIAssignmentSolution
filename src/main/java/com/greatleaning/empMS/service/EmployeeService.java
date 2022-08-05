package com.greatlearning.empMS.service;

import java.util.*;

import com.greatlearning.empMS.entity.*;

public interface EmployeeService {

	public List<Employee> findAll();
	
	public Employee findById(int theId);
	
	public void save(Employee theEmployee);
	
	public void deleteById(int theId);
	
	public List<Employee> searchByFirstName(String firstName);
	
	public List<Employee> sortByFirstName(String order);
	
	public User saveUser(User user);
	
	public Role saveRole(Role role);
	
	public Employee findEmployeeById(int theId);

}