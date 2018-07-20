package com.cg.employeedetails.dao;


import java.util.List;
import java.util.Scanner;

import com.cg.employeedetails.dto.EmployeeDto;
import com.cg.employeedetails.staticdb.EmployeeDatabase;

public class EmployeeDeoImpl implements IEmployeeDao {

	@Override
	public List<EmployeeDto> showDetails() {
		List<EmployeeDto> list = EmployeeDatabase.getdetails();
		return list;
	}

	@Override
	public EmployeeDto searchEmployee(int empid) {
		// TODO Auto-generated method stub
		EmployeeDto esearch = null;
		List<EmployeeDto> list = EmployeeDatabase.getdetails();
		for (EmployeeDto employee : list) {
			if(employee.getEmpId()==empid) {
				esearch = employee;
				break;
			}
		}
		return esearch;
	}


	@Override
	public void addEmployeeDeoImpl(EmployeeDto empl) {
		// TODO Auto-generated method stub
		List<EmployeeDto> list = EmployeeDatabase.getdetails();
		list.add(empl);
	}

	@Override
	public EmployeeDto editSalary(int id) {
		// TODO Auto-generated method stub
		List<EmployeeDto> list = EmployeeDatabase.getdetails();
		EmployeeDto sal = null;
		for (EmployeeDto employeeDto : list) {
			if (employeeDto.getEmpId()==id) {
				sal = employeeDto;
			}
		}
		System.out.println("enter value to be changed..");
		Scanner scanner = new Scanner(System.in);
		double salOne = scanner.nextDouble();
		for (EmployeeDto employeeDtoOne : list) {
			if(employeeDtoOne.getEmpId()==sal.getEmpId()) {
				employeeDtoOne.setEmpSalary(salOne);
				sal = employeeDtoOne;
			}
			scanner.close();
		}
		return sal;
	}

}
