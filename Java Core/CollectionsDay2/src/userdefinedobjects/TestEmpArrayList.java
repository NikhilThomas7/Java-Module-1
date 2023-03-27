package userdefinedobjects;

import java.util.ArrayList;

//import oopsday4.inheritance.Employee;

public class TestEmpArrayList {
	
	public static void main(String[] args) {
		
		
		
		ArrayList<Employee> empList = new ArrayList<Employee>();
		
		Employee emp1 = new Employee("john doe", "male",22,101,"research",30000);
		
		Employee emp2 = new Employee("johny doe", "male",32,101,"hr",25555);
		
		Employee emp3 = new Employee("johns doe", "male",52,101,"recruiting",50000);
		
		Employee emp4 = new Employee("jo doe", "female",62,101,"research",100000);
		
		Employee emp5 = new Employee("jon doe", "female",32,101,"finance",49999);
		
		empList.add(emp1);
		empList.add(emp2);
		empList.add(emp3);
		empList.add(emp4);
		empList.add(emp5);
		
		System.out.println(empList);
		

	}

}
