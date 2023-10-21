package pkg1;
//package level default access specifier is :default
//Try In Lab:private and protected for class 
public class ClassA {
	
	//in class by default is default
	//default is visible inside  package only(inside class as well as out side class but not outside package)
	//outside package default are not accessible
	void defaultMethod() {
		System.out.println("----This is default method in ClassA");
		
	}
	//private:inside class only
	private void privateMethod() {
		System.out.println("----This is Private Method in ClassA");
	}
	//protected:in derived classes
	protected  void protectedMethod() {
		System.out.println("---This is Protected Method in ClassA");
	}
	//public:everywhere
	public void publicMethod()
	{
		System.out.println("---This is public method in ClassA");
	}
	
	 
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	

}
