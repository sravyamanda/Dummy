package com.cg.employeedetails.dao;

import java.util.List;

import com.cg.employeedetails.dto.EmployeeDto;


public interface IEmployeeDao {

	public List<EmployeeDto>showDetails();
	public EmployeeDto searchEmployee(int empid);
	public void  addEmployeeDeoImpl(EmployeeDto empl);
	public EmployeeDto editSalary(int id);
	
}
