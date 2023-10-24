package com.code;
@FunctionalInterface
public interface MyInterface3 {

	String changeCase(String value);
	
	default void test() {
		System.out.println("---implemented in i/f ");
	}
}
