package com.adv.demo.encapsulation.pkgone;

public class EncapsulationA {

	private int regNo;

	protected String name;

	int height;

	public String dept;

	private int privateRegno(int regNo) {
		System.out.println("Private method m1");
		System.out.println("reg no= " + regNo);
		this.regNo = regNo;
		return regNo;
	}

	protected String protectedName(String name) {
//		privateRegno(101);
		System.out.println("Protected method m2");
		this.name = name;
		System.out.println("The name is : " + name);
		return name;
	}

	int defaultHeight(int height) {
		System.out.println("default method m4");
		this.height = height;
		System.out.println("Height is + " + height);
		return height;
	}

	public String publicDept(String dept) {
		System.out.println("Public method m3");
		this.dept = dept;
		System.out.println("The dept is : " + dept);
		return dept;
	}

	public static void m5() {
		System.out.println("Static m5");
	}
}
