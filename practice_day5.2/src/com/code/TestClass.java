package com.code;

public class TestClass {
int arr[];
public TestClass(int []marks) {
	this.arr = new int [marks.length];
}
public static void main(String[] args) {
	int []marks = {12,45,678,9890,234};
	TestClass tObj = new TestClass(marks);
}
}
