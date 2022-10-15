package com.adv.demo.packagesix;

public class ClassA {

	private ClassB classBObj;
	
	public ClassA(ClassB b) {
		this.classBObj=b;
	}
	
	public void setclassB(ClassB cb) {
		this.classBObj = cb;
	}

	public ClassB getClassB() {
		return classBObj;
	}
	
	
	public void m1() {
		System.out.println("inside class A m1");
	}
}
