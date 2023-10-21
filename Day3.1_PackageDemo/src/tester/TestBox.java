package tester;
import pkg3.Box;
public class TestBox {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
         int a=10,b=20,c=30;
		//create an object of Box Type
         Box obj1;//obj1 is created on stack
         //instatiate obj1
         //allocate memory on heap for storing height,width,breadth value
		//How?using new keyword
         
         obj1=new Box();//memory get allocated on heap
         obj1.assignData(a, b, c);//methods need to be called explicitly                 
         obj1.displaData();//
          
         
         //create one more obj
         Box obj2;
         obj2=new Box();//allocate memory  on heap and return ref of heap memory 
                        //get stored in obj2 on stack
          
          obj2.displaData();//
		System.out.println("---main method ends here----");
	}

}
