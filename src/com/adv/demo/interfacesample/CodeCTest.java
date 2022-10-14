package com.adv.demo.interfacesample;

public class CodeCTest {

	public static void main(String[] args) {

		InterfaceCodeA codeC = new CodeC();
		String name = codeC.printName("Guru");
		System.out.println(name);
		int result = InterfaceCodeA.add(10, 20);
		System.out.println(result);
	}
}
