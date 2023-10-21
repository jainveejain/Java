package experiment_practiceDay_5;

public class TesterBoxEquality {

	public static void main(String[] args) {
//		
		Box box1 = new Box(30,30,30);
//		System.out.println(box1);
//		
	    Box box2 =new Box(50,40,60);
//		System.out.println(box2);
//		System.out.println(box2.hashCode());
//		
		Box box3 =new Box(50,40,60);
//		System.out.println(box3);
//		System.out.println(box3.hashCode());
//		
		if(box1==box2)
			System.out.println("box1==box2");
		if(box2 == box3) {
			System.out.println("box2==box3");
		}
		else {
			System.out.println("box2!=box3");
		}
		System.out.println("Box2---"+box2.hashCode()+
				"box3--"+box3.hashCode());
		boolean result = box2.isSame(box3);
		System.out.println(result);
		if(result == true)
			System.out.println("box2==box3");
		else
			System.out.println("box2!=box3");
	}
}
