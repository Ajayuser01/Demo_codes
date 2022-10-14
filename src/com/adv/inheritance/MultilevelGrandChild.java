package com.adv.inheritance;

public class MultilevelGrandChild extends MultilevelParent {

	public int addValues() {
		int valOne=getA();
		int valTwo=getB();
		int result = add(valOne, valTwo);
		System.out.println("Addition of " + valOne + " and " + valTwo + " is :" + result);
		return result;
	}

}
