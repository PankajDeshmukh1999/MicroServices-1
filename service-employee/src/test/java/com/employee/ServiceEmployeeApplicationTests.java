package com.employee;

import static org.junit.jupiter.api.Assertions.assertNotNull;

import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

import com.employee.entity.Employee;
import com.employee.repo.EmployeeRepository;

@SpringBootTest
class ServiceEmployeeApplicationTests {

	@Test
	void contextLoads() {
	}
	
//	@Autowired
//	private EmployeeRepository repository;
//	
//	@Test
//	public void saveEmployeeTtest() {
//		Employee emp = new Employee();
//		emp.setEmployeeId(1l);
//		emp.setName("Nitish");
//		emp.setAge(24);
//		emp.setGender("Male");
//		emp.setSalary(30000);
//		emp.setDepartmentId(4l);
//		repository.save(emp);
//		assertNotNull(repository.findById(1l).get());
//	}

}
