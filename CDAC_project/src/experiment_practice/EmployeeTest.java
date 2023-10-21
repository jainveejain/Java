package experiment_practice;

public class EmployeeTest {
	
public static void main(String[] args) {
	Employee emp1= new Employee();

	Employee emp2= new Employee(1,"Ramesh",10000);
	Object emp3= new Employee(2,"Ram",200);
	
//	emp1.display();
//	emp2.display();	
	
	
	
	System.out.println(emp1);
	System.out.println(emp1.toString());
//	System.out.println(emp2);
//	System.out.println(emp3);
}


}
