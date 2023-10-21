package experiment_practiceDay_5;

public class Box {

	private int height, width, length;

	public Box(int height, int width, int length) {
		System.out.println("----Paraameter Box--Box(int,int,int---");
		this.height = height;
		this.width = width;
		this.length = length;
	}

	public Box(int side) {

		
		this(side,side,side);
		System.out.println("---Paramiterized box---");
//		this.height = side;
//		this.length = side;
//		this.width = side;
	}

	public Box() {
		System.out.println("---default Box--");
		this.height = 10;
		this.width = 10;
		this.length = 10;
	}

	public int getHeight() {
		return height;
	}

	public void setHeight(int height) {
		this.height = height;
	}

	public int getWidth() {
		return width;
	}

	public void setWidth(int width) {
		this.width = width;
	}

	public int getLength() {
		return length;
	}

	public void setLength(int length) {
		this.length = length;
	}

	public String toString() {
		return "Box height=" + height + ", width= " + width + ", length= " + length;
	}

public boolean isSame(Box boxObj) {
if(this.height == boxObj.height && this.width == boxObj.width && this.length == boxObj.length);
{
return true;
}

}
}
