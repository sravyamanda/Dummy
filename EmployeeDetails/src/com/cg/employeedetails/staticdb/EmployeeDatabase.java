package com.cg.employeedetails.staticdb;


import java.util.ArrayList;


import com.cg.employeedetails.dto.EmployeeDto;

public class EmployeeDatabase{

	public static ArrayList<EmployeeDto> details=null;
	
	static {
		details = new ArrayList<>();
	}
	public static ArrayList<EmployeeDto> getdetails() {
	EmployeeDto emp=new EmployeeDto();
	EmployeeDto emp1=new EmployeeDto();
	EmployeeDto emp2=new EmployeeDto();
	EmployeeDto emp3=new EmployeeDto();

	emp.setEmpId(1001);
	emp1.setEmpId(1002);
	emp2.setEmpId(1003);
	emp3.setEmpId(1004);
	emp.setEmpName("qqqq");
	emp1.setEmpName("wwww");
	emp2.setEmpName("eeee");
	emp3.setEmpName("rrrr");
	emp.setEmpSalary(2345);
	emp1.setEmpSalary(23426);
	emp2.setEmpSalary(23447);
	emp3.setEmpSalary(23478);
	emp.setEmpDesignation("sdfvd");
	emp1.setEmpDesignation("sdgsf");
	emp2.setEmpDesignation("clerk");
	emp3.setEmpDesignation("manager");
	
	details.add(emp);
	details.add(emp1);
	details.add(emp2);
	details.add(emp3);
	
	return details;
			
	}
}
	
	
	
	
	
	
