package userdefinedobjects;

import java.util.ArrayList;
import java.util.Collection;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;
import java.util.TreeSet;

public class TestHashMap {
		public static void main(String[] args) {
			
		
	Employee emp1 = new Employee("john doe", "male",22,101,"research",30000);
	
	Employee emp2 = new Employee("johny doe", "male",32,103,"hr",25555);
	
	Employee emp3 = new Employee("johns doe", "male",52,104,"recruiting",50000);
	
	Employee emp4 = new Employee("jo doe", "female",62,105,"research",100000);
	
	Employee emp5 = new Employee("john doe", "male",22,102,"research",30000);
	
	ArrayList<Employee> empList = new ArrayList<Employee>();
	empList.add(emp1);
	empList.add(emp2);
	empList.add(emp3);
	empList.add(emp4);
	empList.add(emp5);
	
	HashSet<Employee> empSet1 = new HashSet<Employee>();
	empSet1.add(emp1);
	empSet1.add(emp2);
	empSet1.add(emp3);
	empSet1.add(emp4);
	empSet1.add(emp5);
	
	
	
	TreeSet<Employee> empSet = new TreeSet<Employee>();
	empSet.add(emp1);
	empSet.add(emp2);
	empSet.add(emp3);
	empSet.add(emp4);
	empSet.add(emp5);
	
	HashMap<String,Collection> dataMap = new HashMap<>();
	
	dataMap.put("empList", empList);
	dataMap.put("empSet", empSet);
	dataMap.put("empSet1", empSet1);
	System.out.println(dataMap);
	
	Collection<Employee> list = dataMap.get("empList");
	Iterator <Employee> iter = list.iterator();
	while(iter.hasNext()) {
		System.out.println(iter.next());
	}
	
	Collection<Employee> set = dataMap.get("empSet1");
	iter = set.iterator();
	while(iter.hasNext()) {
		System.out.println(iter.next());
	}
	
	Collection<Employee> tree = dataMap.get("empSet");
	iter = tree.iterator();
	while(iter.hasNext()) {
		System.out.println(iter.next());
	}
	

}
}