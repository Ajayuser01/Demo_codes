package com.adv.demo.packagesix;

public class ClassBTest {

	public static void main(String[] args) {

		CompositionDemo comDemo = new CompositionDemo();
		comDemo.m3();
		ClassB objB=comDemo.getClassBObj();
		objB.m2();
		comDemo= null;
		comDemo.m3();
//		comDemo.showColorClassB("green");
		
//		CompositionDemo comDemo = new CompositionDemo();
//		comDemo.printNameOne("bala");
//		comDemo = null;
//		comDemo.printNameOne("bala");
//		ClassB b = new ClassB();
//		ClassA a = new ClassA(b);
//		a.getName();
//		a.setClassBObj(b);
//		ClassB cb=a.getClassBObj();
//		cb.m2();
	}
}
