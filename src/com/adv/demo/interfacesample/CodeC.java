package com.adv.demo.interfacesample;

public class CodeC implements InterfaceCodeA, InterfaceCodeB {

	public String printName(String name) {
		System.out.println(name);
		return name;
	}

	@Override
	public String printColor(String color) {
		return InterfaceCodeA.super.printColor(color);
	}

}
