package oopsday4.composition;

public class CompanyHr {

	public static void main(String[] args) {
		
		Address resAdd= new Address("31","mannath","worli","mumbai",4000);
		
		Address comAdd= new Address("31","mannath","worli","mumbai",4000);
		
		
		
		
		
		Employee emp1 = new Employee("john doe", "male",22,101,"research",30000,resAdd,comAdd);
		System.out.println(emp1);
		Employee emp2 = new Employee("johny doe", "male",32,101,"hr",25555,resAdd,comAdd);
		System.out.println(emp2);
		Employee emp3 = new Employee("johns doe", "male",52,101,"recruiting",50000,resAdd,comAdd);
		System.out.println(emp3);
		Employee emp4 = new Employee("jo doe", "female",62,101,"research",100000,resAdd,comAdd);
		System.out.println(emp4);
		Employee emp5 = new Employee("jon doe", "female",32,101,"finance",49999,resAdd,comAdd);

		System.out.println(emp5);
		// TODO Auto-generated method stub
		 //C c = new C();
		
		
		
	}

}
