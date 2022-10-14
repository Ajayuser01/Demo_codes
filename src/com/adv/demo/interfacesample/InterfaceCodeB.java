package com.adv.demo.interfacesample;

public interface InterfaceCodeB {

	public final int NUM = 10;

	public String printName(String name);

	default String printColor(String color) {
		System.out.println("Color method on CodeB :" + color);
		return color;
	}
}
