package com.demo.inheritance;

public class Application {

	public static void main(String[] args) {
	
		
		Employee ram = new Employee(101,"Ash", "dev", 50000);
		
		String[] skills = {"java","c","c++","python"};
		Manager mgr = new Manager(102,"Suresh", "Manager", 75000,skills);
		
		System.out.println(ram);
		
		for(String i:mgr.getSkillSet()) {
		System.out.println(i);
		}
		
		Employee[] emp = new Employee[3];
		Employee e1= new Employee(100, "ram", "tester", 8000);
		Employee e2 = new Employee(101, " suresh","Hr",5000);
		Employee e3 = new Employee(102, "anu"," manager",7000);
		emp[0]=e1;
		emp[1]=e2;
		emp[2]=e3;
		
		EmployeeService service = new EmployeeService();
		service.printEmployees(emp);
		}
	    
		}

	


