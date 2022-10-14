package com.adv.demo.encapsulation.pkgone;

public class EncapsulationB {

	public static void main(String[] args) {
		EncapsulationA encapsulationA = new EncapsulationA();
		String dept = encapsulationA.dept;
		System.out.println(dept);
		String name = encapsulationA.name;
		System.out.println(name);
		float height = encapsulationA.height;
		System.out.println(height);
		encapsulationA.publicDept("Maths");
		encapsulationA.defaultHeight(120);
		encapsulationA.protectedName("mano");
	}
}
