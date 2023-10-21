package pkg3;

public class Tank {
	// data members
	// 100% abstraction:all data memebrs must be private

	private int level;
	private int capacity;
	// constructor
	// a special method
	// constr name is same as class name
	// no return type not even void
	// when get called /invoked?
	// as soon as object get created using new keyword
	// implicitly

	// lab task:can we write private,default,protected public constr
	// Types of Constr
	// 1:Default const(arg less const,no parameter),not accepting any arguments
	public Tank() {
		System.out.println("----default constr get invoked-----");
		System.out.println("---tank get created with default capacity------");
		capacity = 50;
	}

	// to read/write individual data members
	// use getters/setters
	// getters:methods which return individual data member value
	// setter:methods which are used to assign value to individual data member

	// getters
	// accessSpecifire RetuntType getDataMemberName(){return dataMember;}

	public int getLevel() {
		return level;
	}

	//
	public int getCapacity() {
		return capacity;
	}

	// setters
	public void setLevel(int newLevel) {
		level = newLevel;

	}

	// to read/write private data members create methods
	public void displayDetails() {
		System.out.println("---Tank Details-----");
		System.out.println("Capacity =" + capacity + "  Tank Level=" + level);
	}

}
