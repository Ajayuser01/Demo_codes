package com.adv.demo.sample.one;

public class SampleClassC extends SampleClassB {

	public int addValues() {
		int result = add(a, b);
		System.out.println("Addition of " + a + " and " + b + " is :" + result);
		return result;
	}
	
	/*public SampleClassC() {
		System.out.println("Default constructor in class C");
	}
	
public void m3() {
	System.out.println("Inside Class d m3 method");
}*/
}
