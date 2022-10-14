package com.adv.demo.packagefive;

public class TestConstructorOne {
	public static void main(String[] args) {
//		ConstructorOne co = new ConstructorOne();
		ConstructorOne co = new ConstructorOne(102, "Bala", "Msc maths", "Maths");
//		ConstructorOne co = ConstructorOne.getInstance();
		String name = co.getName();
		int regNo = co.getRegNo();
		String course = co.getCourse();
		String dept = co.getDept();
		System.out.println(" RegNo:: " + regNo + " Name:: " + name + " Course:: " + course + " Dept:: " + dept);
	}
	
}
