package com.cg.employeedetails.service;

import java.util.List;

import com.cg.employeedetails.dao.EmployeeDeoImpl;
import com.cg.employeedetails.dao.IEmployeeDao;
import com.cg.employeedetails.dto.EmployeeDto;

public class EmployeeServiceImpl implements IEmployeeService {
private IEmployeeDao dao = null;
  public EmployeeServiceImpl() {
	  dao=new EmployeeDeoImpl();
  }
@Override
public List<EmployeeDto> ShowDetails() {
	// TODO Auto-generated method stub
	return dao.showDetails();
}
@Override
public EmployeeDto searchEmployee(int empid) {
	// TODO Auto-generated method stub
	return dao.searchEmployee(empid);
}
@Override
public void addEmployee(EmployeeDto Empl) {
	// TODO Auto-generated method stub
	dao.addEmployeeDeoImpl(Empl);
}
@Override
public EmployeeDto editSalary(int id) {
	// TODO Auto-generated method stub
	
	return dao.editSalary(id);
}


}
