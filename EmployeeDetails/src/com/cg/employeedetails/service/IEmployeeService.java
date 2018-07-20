package com.cg.employeedetails.service;

import java.util.List;

import com.cg.employeedetails.dto.EmployeeDto;

public interface IEmployeeService {
	public List<EmployeeDto>ShowDetails();
	public EmployeeDto searchEmployee(int empid);
	public void addEmployee(EmployeeDto Empl);
	public EmployeeDto editSalary(int id);
	

}
