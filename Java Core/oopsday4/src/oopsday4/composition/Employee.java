package oopsday4.composition;

import java.util.Objects;

public class Employee extends Person{
	
	private long empId;
	private String dept;
	private double salary;
	private Address residenceAddress; //has - a
	private Address correspondenceAddress; //has -a
	
	public Employee() {
		// TODO Auto-generated constructor stub
		System.out.println("emp super");
	}

//	public Employee(long empId, String dept, double salary) {
//		super();
//		this.empId = empId;
//		this.dept = dept;
//		this.salary = salary;
//	}

	public long getEmpId() {
		return empId;
	}

	

	public Address getResidenceAddress() {
		return residenceAddress;
	}

	public void setResidenceAddress(Address residenceAddress) {
		this.residenceAddress = residenceAddress;
	}

	public Address getCorrespondenceAddress() {
		return correspondenceAddress;
	}

	public void setCorrespondenceAddress(Address correspondenceAddress) {
		this.correspondenceAddress = correspondenceAddress;
	}

	public Employee(String name, String gender, int age,long empId, String dept, double salary, Address residenceAddress, Address correspondenceAddress) {
	super(name, gender,age);
	this.empId = empId;
	this.dept = dept;
	this.salary = salary;
	this.residenceAddress = residenceAddress;
	this.correspondenceAddress = correspondenceAddress;
}

	public void setEmpId(long empId) {
		this.empId = empId;
	}

	public String getDept() {
		return dept;
	}

	public void setDept(String dept) {
		this.dept = dept;
	}

	public double getSalary() {
		return salary;
	}

	public void setSalary(double salary) {
		this.salary = salary;
	}

	@Override
	public String toString() {
		return "Employee [empId=" + empId + ", dept=" + dept + ", salary=" + salary + ", getName()=" + getName()
				+ ", getGender()=" + getGender() + ", getAge()=" + getAge() + "]";
	}
//	@Override
//	public boolean equals(Object obj) {
//		
//		Employee ref = null;
//		if (obj !=null) {
//			ref = (Employee)obj;
//		} 
//		if ((this.getName()).equals(ref.getName()) && this.empId == (ref.empId)
//				&&
//				this.dept == (ref.dept)) {
//			
//		}
//		// TODO Auto-generated method stub
//		return true;
//	}

	@Override
	public int hashCode() {
		return Objects.hash(dept, empId, salary);
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Employee other = (Employee) obj;
		return Objects.equals(dept, other.dept) && empId == other.empId
				&& Double.doubleToLongBits(salary) == Double.doubleToLongBits(other.salary);
	}
	
	

}
