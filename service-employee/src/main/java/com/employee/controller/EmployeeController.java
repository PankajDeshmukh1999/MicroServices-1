package com.employee.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.employee.dao.ResponseTemplateVO;
import com.employee.entity.Employee;
import com.employee.service.EmployeeService;

@RestController
@RequestMapping("/employee")
public class EmployeeController {
	
	@Autowired
	private EmployeeService service;
	
	@PostMapping("/")
	public Employee getEmployee(@RequestBody Employee employee) {
		return service.saveEmployee(employee);
	}
	
	@GetMapping("/{id}")
	public ResponseTemplateVO getEmployeeWithDepartment(@PathVariable("id") Long employeeId) {
		return service.getEmployeeWithDepartment(employeeId);
	}
	
	
	@GetMapping("/asc/{feild}")
	public List<Employee> getSortAsc(@PathVariable("feild") String  feild){
		List<Employee> employee = service.sortAsc(feild);
		return  employee;
	}
	
	@GetMapping("/desc/{feild}")
	public List<Employee> getSortDesc(@PathVariable ("feild") String  feild){
		List<Employee> employee = service.sortDesc(feild);
		return  employee;
	}
	

}
