package com.adv.demo.sample.one;

public class TestMultiple {

	public static void main(String[] args) {
//		MutlipleChildOne.name="ajay";
		MutlipleChildOne mutlipleChildOne = new MutlipleChildOne();
		mutlipleChildOne.name = "fox";
		MutlipleChildOne mutlipleChildOne2 = new MutlipleChildOne();
		MutlipleChildOne mutlipleChildOne3 = new MutlipleChildOne();
		MutlipleChildOne mutlipleChildOne4 = new MutlipleChildOne();
		MutlipleChildOne mutlipleChildOne5 = new MutlipleChildOne();
		MutlipleChildOne mutlipleChildOne6 = new MutlipleChildOne();
		String name1 = mutlipleChildOne.name;
		String name2 = mutlipleChildOne2.name;
		String name3 = mutlipleChildOne3.name;
		String name4 = mutlipleChildOne4.name;
		String name5 = mutlipleChildOne5.name;
		String name6 = mutlipleChildOne6.name;
		printvalue(name1, name2, name3, name4, name5, name6);
		mutlipleChildOne.managae();
	}
	
	

	public static void printvalue(String name1, String name2, String name3, String name4, String name5, String name6) {
		System.out.println(name1);
		System.out.println(name2);
		System.out.println(name3);
		System.out.println(name4);
		System.out.println(name5);
		System.out.println(name6);
	}

}
