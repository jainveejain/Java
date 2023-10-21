package experiment_practice;

public class Employee {

	private int empid;
	private String name;
	private double salary;
	
	public Employee() {
		System.out.println("--Default onstructor---");
	}
	public Employee(int empid,String name,double salary) {
		
		System.out.println("--Three parameterized constructor---");
		this.empid = empid;
		this.name = name;
		this.salary = salary;
	}
	
	public int getEmpid() {
		return empid;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public double getSalary() {
		return salary;
	}
	public void setSalary(double salary) {
		this.salary = salary;
	}
	
	public void display() {
		System.out.println("empid= "+empid+" name= "+name+" salary= "+salary);
	}
	public String toString() {
		//return ;
		return "empid= "+empid+" name= "+name+"salary= "+salary;
	}
	
}
