package com.Day2;

public class Employee   {
    public void empName() {
		System.out.println("Vetriselvan");
	}
    public static void main(String[] args) {
    	Employee e = new Employee();
    	e.empName();
		Company c = new Company();
		c.companyName();
		Client cl = new Client();
		cl.clientName();
		Project p = new Project();
		p.projectName();
		
		
		
	} 
}

