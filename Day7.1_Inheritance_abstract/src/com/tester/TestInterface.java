package com.tester;

import com.code.Date;
import com.code.Mango;
import com.code.Orange;
import com.code.Printable;
import com.code.Student;

public class TestInterface {

	public static void testPrintable(Printable prnt) {
		prnt.saveData();
		
	}
	
	public static void main(String[] args) {
	
		Student std=new Student();
		std.saveData();
			
		Date dtObj=new Date();
		dtObj.saveData();
		Orange orgObj=new Orange("Orange", "OrangeColor", 235, 50);
		orgObj.saveData();
		orgObj.taste();
		
		testPrintable(std);
		testPrintable(dtObj);
		testPrintable(orgObj);
		
		Printable prntObj=new Date();//
		 
		
		
		

	}

}
