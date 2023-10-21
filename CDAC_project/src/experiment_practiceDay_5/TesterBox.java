package experiment_practiceDay_5;

public class TesterBox {
     	public static void main(String[] args) {
     		
     		Box box1 = new Box();
     		System.out.println(box1);
     		
     		
     		Box box2 = new Box(45,56,80);
     		System.out.println(box2);
     		
     		System.out.println("----create cube---");
     		int side =60;
     		System.out.println();
     		
     		Box box3 = new Box(side);
     		System.out.println(box3);
	
     	}
}
