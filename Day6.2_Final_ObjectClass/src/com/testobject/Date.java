package com.testobject;

public class Date {
	private String name;
	private int day, month, year;

	public Date(int day, int month, int year) {
		super();
		this.day = day;
		this.month = month;
		this.year = year;
	}

	@Override
	public String toString() {
		return "Date [day=" + day + ", month=" + month + ", year=" + year + "]";
	}

	// dob1.equals(dob2) dob2:Date child class of Objcet
	@Override
	public boolean equals(Object obj) {
		if (obj instanceof Date) {
			// downcast obj to Date class object
			System.out.println("---Date Class equals Method---");
			Date dObj = (Date) obj;// DownCasting
			if (this.day == dObj.day && this.month == dObj.month && this.year == dObj.year) {
				return true;
			} else
				return false;
			// or
		} else
			return false;
		// return (this.day==dObj.day && this.month==dObj.month &&
		// this.year==dObj.year);

	}

}
