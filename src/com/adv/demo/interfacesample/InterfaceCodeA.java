package com.adv.demo.interfacesample;

public interface InterfaceCodeA {

	public final int NUM = 20;
	
	public String printName(String name);

	public static int add(int a, int b) {
		return a + b;
	}

	default String printColor(String color) {
		System.out.println("Color method on CodeA :" + color);
		return color;
	}
}
