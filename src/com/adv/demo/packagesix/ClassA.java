package com.adv.demo.packagesix;

public class ClassA {

	private ClassB classBObj;

	private String name = "Guru";

	/*public ClassA(ClassB b) {
		this.classBObj = b;
	}*/

	public void setName(String name) {
		this.name = name;
	}

	public String getName() {
		return name;
	}

	public void setClassBObj(ClassB cb) {
		this.classBObj = cb;
	}

	public ClassB getClassBObj() {
		return classBObj;
	}

	public void m1() {
		System.out.println("inside class A m1");
	}
}
