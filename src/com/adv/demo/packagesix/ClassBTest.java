package com.adv.demo.packagesix;

public class ClassBTest {

	public static void main(String[] args) {
		
		ClassB b = new ClassB();
		ClassA a = new ClassA(b);
		a.setclassB(b);
	}
}
