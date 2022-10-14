package com.adv.demo.packageone;


public abstract class DemoClassTwo extends DemoClassOne{

	public String oddEven(int x) {
		String result;
		if(x%2==0) {
			result="even";
		}else {
			result="odd";
		}
		System.out.println("The given number is : "+result);
		return result;
	}
	
	

}

class c2 extends DemoClassTwo{
	public void m2(){
		
	}
}
