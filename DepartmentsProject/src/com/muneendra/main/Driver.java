package com.muneendra.main;

import com.muneendra.service.AdminDepartment; 
import com.muneendra.service.HrDepartment;
import com.muneendra.service.TechDepartment;

public class Driver {

	public static void main(String[] args) {
		/*here we are creating the objects of 3 departments and using those objects
		 * we are going to display all their functionalities 
		 */
		

		HrDepartment hrdepartment= new HrDepartment();
		TechDepartment techdepartment= new TechDepartment();
		AdminDepartment admindepartment= new AdminDepartment();
		
		System.out.println("Welcome to"+" "+admindepartment.departmentName());
		System.out.println(admindepartment.getTodaysWork());
		System.out.println(admindepartment.getWorkDeadline());
		System.out.println(admindepartment.isTodayAHoliday());
		
		System.out.println("\n");
		
		System.out.println("Welcome to"+" "+hrdepartment.departmentName());
		System.out.println(hrdepartment.doActivity());
		System.out.println(hrdepartment.getTodaysWork());
		System.out.println(hrdepartment.getWorkDeadline());
		System.out.println(hrdepartment.isTodayAHoliday());
		
		System.out.println("\n");
		
		System.out.println("Welcome to"+" "+techdepartment.departmentName());
		System.out.println(techdepartment.getTodaysWork());
		System.out.println(techdepartment.getWorkDeadline());
		System.out.println(techdepartment.getTechStackInformation());
		System.out.println(techdepartment.isTodayAHoliday());
		
		
	}

}
