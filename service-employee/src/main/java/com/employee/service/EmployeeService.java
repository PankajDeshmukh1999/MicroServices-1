package com.employee.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Sort;
import org.springframework.stereotype.Service;
import org.springframework.web.client.RestTemplate;

import com.employee.dao.Department;
import com.employee.dao.ResponseTemplateVO;
import com.employee.entity.Employee;
import com.employee.repo.EmployeeRepository;

@Service
public class EmployeeService {

	@Autowired
	private EmployeeRepository repository;

	@Autowired
	private RestTemplate restTemplate;

	public Employee saveEmployee(Employee employee) {
		return repository.save(employee);
	}

	public ResponseTemplateVO getEmployeeWithDepartment(Long employeeId) {
		ResponseTemplateVO vo = new ResponseTemplateVO();
		Employee employee = repository.findByEmployeeId(employeeId);

		Department department = restTemplate
				.getForObject("http://localhost:8181/department/" + employee.getDepartmentName(), Department.class);
		vo.setEmployee(employee);
		vo.setDepartment(department);
		return vo;
	}
	
	
	public List<Employee> sortAsc(String feild){
		return repository.findAll(Sort.by(Sort.Direction.ASC,feild));
	}
	
	
	public List<Employee> sortDesc(String feild){
		return repository.findAll(Sort.by(Sort.Direction.DESC,feild));
	}
	
	
}
