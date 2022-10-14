package com.adv.demo.sample.one;

public class SampleClassG {

	public String name = "parent";

	public int add(int a, int b) {
		int result = a + b;
		System.out.println(result);
		return result;
	}

	public int add(int a, int b, int c) {
		int result = a + b + c;
		System.out.println(result);
		return result;
	}

	public void m2() {

		System.out.println("m2");
	}
}
