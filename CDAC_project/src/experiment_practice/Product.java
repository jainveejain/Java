package experiment_practice;

//Object Is Parent
public class Product {
	// data members
	private int prdId;// instance variable copy get created per object
	private String pname;
	private double price;
	private double discount;

	public Product(int prdId, String pname, double price) {
		// super();
		this.prdId = prdId;// this always hold reference of object which is invoking method
		this.pname = pname;
		this.price = price;
	}

	public Product() {
		// super();
	}

	public String getPname() {
		return pname;
	}

	public void setPname(String pname) {
		this.pname = pname;
	}

	public double getPrice() {
		return price;
	}

	public void setPrice(double price) {
		this.price = price;
	}

	public int getPrdId() {
		return prdId;
	}

	// override toString()
	// sysout(p1)--->will give call to p1.toString() implicitly
	// no need to call p1.toString()
	public String toString() {

		System.out.println("----This is Product Class toString()");
		return prdId + "    " + pname + "    " + price;
	}

	//

}