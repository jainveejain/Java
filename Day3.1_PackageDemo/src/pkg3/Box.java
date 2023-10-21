package pkg3;

public class Box {
	// data members
	private int height;// instance variable:accessible by using object of class
	private int width;// instance variable
	private int breadth;// instance variable

	// to initialize/assign or to read/get values of private datamembers
	// write methods
	public void assignData(int h, int w, int b) {
		System.out.println("------inside assignData--------");
		height = h;
		width = w;
		breadth = b;
	}
	public void displaData() {
		System.out.println("----Box Details----");
		System.out.println("Height:"+height);
		System.out.println("Width:"+width);
		System.out.println("Breadth:"+breadth);
	}
	
	

}
