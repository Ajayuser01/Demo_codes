package com.adv.demo.packagefive;

public class TestCollege {
	public static void main(String[] args) {

		College clg = new College();
//		College clg = new College(1,"ABC College",1990,"guru","arun",10);
		int code = clg.getCollegeCode();
		System.out.println(code);
		String clgName = clg.getCollegeName();
		System.out.println(clgName);
		int founYear = clg.getFoundedYear();
		System.out.println(founYear);
		String founName = clg.getFounderName();
		System.out.println(founName);
		String principalName = clg.getPrincipalName();
		System.out.println(principalName);
		int buses = clg.getNoOfBuses();
		System.out.println(buses);
	}

}
