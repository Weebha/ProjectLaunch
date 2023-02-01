package org.emp;

import org.client.Client;
import org.company.Company;
import org.project.Project;

public class Employee {
	
	public void empName() {
		System.out.println("The employee name is");

	}
	
		public static void main(String[] args) {
			Employee e = new Employee();
			e.empName();
			
			Company c = new Company();
			c.companyName();
			
			Client l = new Client();
			l.clientName();
			
			Project p = new Project();
			p.projectName();
		}
		
		
		
		
		
		
		
		
		
		
		
		
		
	}
	

