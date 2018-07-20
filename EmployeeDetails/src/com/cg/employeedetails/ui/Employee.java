package com.cg.employeedetails.ui;

import java.util.List;

import java.util.Scanner;

import com.cg.employeedetails.dto.EmployeeDto;
import com.cg.employeedetails.service.EmployeeServiceImpl;
import com.cg.employeedetails.service.IEmployeeService;
public class Employee {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scanner= new Scanner(System.in);
		IEmployeeService service = new EmployeeServiceImpl();
		
		System.out.println("Enter your choice..");
		System.out.println("1. Get all employee details..");
		System.out.println("2. Get one employee details..");
		System.out.println("3. Add employee..");
		System.out.println("4. Edit salary..");
		System.out.println("5. Exit..");
		
		int choice = 0;
		do {
			System.out.println("Enter your choice..");
			choice = scanner.nextInt();
		switch(choice) {	
		case 1 :
			List<EmployeeDto> emplist = service.ShowDetails();
			for (EmployeeDto employeeDto : emplist) {
				System.out.println(employeeDto.getEmpId());
				System.out.println(employeeDto.getEmpName());
				System.out.println(employeeDto.getEmpSalary());
				System.out.println(employeeDto.getEmpDesignation());
				
			}
			break;
		case 2 :
				System.out.println("Enter employee Id..");
				int employeeId = scanner.nextInt();
				EmployeeDto detailssearch = service.searchEmployee(employeeId);
				if (detailssearch == null) {
					System.out.println("Enter correct Id..");
				}else {
					System.out.println(detailssearch.getEmpName());
					System.out.println(detailssearch.getEmpSalary());
					System.out.println(detailssearch.getEmpDesignation());
				}
				break;
		case 3 :
				System.out.println("Enter Id");
		    	 int empid=scanner.nextInt();
		    	 System.out.println("Enter Name");
		    	 String empname=scanner.next();
		    	 System.out.println("Enter Salary");
		    	 double empsal=scanner.nextDouble();
		    	 System.out.println("Enter Designation");
		    	 String empdesig=scanner.next();
		    	 
		    	 EmployeeDto emp=new EmployeeDto();
		    	 emp.setEmpId(empid);
		    	 emp.setEmpName(empname);
		    	 emp.setEmpSalary(empsal);
		    	 emp.setEmpDesignation(empdesig);
		    	 
		    	 service.addEmployee(emp);
			
		break;
		case 4 :
			System.out.println("Editing Details..");
			System.out.println("enter id");
			int idOne = scanner.nextInt();
			EmployeeDto salChange = service.editSalary(idOne);
			if (salChange == null) {
				System.out.println("no data found");
				
			} else {
				System.out.println(salChange.getEmpId());
				System.out.println(salChange.getEmpName());
				System.out.println(salChange.getEmpSalary());
				System.out.println(salChange.getEmpDesignation());
			}
		case 5 :
			System.exit(0);
			break;
		
		}	
		}while(choice<=4);
		scanner.close();
	}
}