package com.adv.demo.packagesix;


public class CompositionDemo {
	
	private ClassB classBObj;
	
	public CompositionDemo() {
		classBObj =new ClassB();
	}

	public ClassB getClassBObj() {
		return classBObj;
	}
	
	public String printNameOne(String name) {
		System.out.println("print name method from compsitionDemo :"+name);
		return name;
	}
	
	public void m3(){
		System.out.println("inside composition class");
	}
	
}
