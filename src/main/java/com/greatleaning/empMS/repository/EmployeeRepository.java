package com.greatlearning.empMS.repository;

import java.util.List;
import org.springframework.data.jpa.repository.JpaRepository;
import com.greatlearning.empMS.entity.Employee;

public interface EmployeeRepository extends JpaRepository<Employee, Integer> {

	List<Employee> findByFirstNameContainsAllIgnoreCase(String firstName);

	List<Employee> findAllByOrderByFirstNameAsc();
	
	List<Employee> findAllByOrderByFirstNameDesc();

}