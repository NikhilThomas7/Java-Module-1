package userdefinedobjects;

import java.util.ArrayList;
import java.util.HashSet;

//import oopsday4.inheritance.Employee;

public class TestEmpHashSet {
	
	public static void main(String[] args) {
		
		
		
		HashSet<Employee> empSet = new HashSet<Employee>();
		
		Employee emp1 = new Employee("john doe", "male",22,101,"research",30000);
		
		Employee emp2 = new Employee("johny doe", "male",32,101,"hr",25555);
		
		Employee emp3 = new Employee("johns doe", "male",52,101,"recruiting",50000);
		
		Employee emp4 = new Employee("jo doe", "female",62,101,"research",100000);
		
		Employee emp5 = new Employee("john doe", "male",22,101,"research",30000);
		
		empSet.add(emp1);
		empSet.add(emp2);
		empSet.add(emp3);
		empSet.add(emp4);
		empSet.add(emp5);
		
		System.out.println(empSet.size());
		

	}

}
