package com.adv.inheritance;

public class SingleDerived extends SingleBase {

	public String name(String nameVal) {
		setName(nameVal);
		String name = getName();
		System.out.println(name);
		return name;
	}
}
