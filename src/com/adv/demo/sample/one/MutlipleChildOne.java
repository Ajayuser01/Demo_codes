package com.adv.demo.sample.one;

import java.util.Scanner;

public class MutlipleChildOne /* extends MultipleParentOne */ {

	public static String name;
	
	

/*	public String s1(String name) {
		this.name = name;
		return name;
	}*/
	
	
	public void managae() {
		// TODO Auto-generated method stub

		        Scanner scanner = new Scanner(System.in);
		        int N = scanner.nextInt();
		        scanner.close();
		        
		        if (N%2!=0){
		            System.out.println("Wierd");
		        }
		    if(N>=2 && N<=5){
		        if(N%2==0){
		            System.out.println("Not Wierd");
		        }
		    }
		    if(N%2==0){
		          if(N>=2 && N<=5){
		            System.out.println("Not Wierd");
		        }else if(N>=6 && N<=20){
		            System.out.println("Wierd");
		        }else if(N>20){
		            System.out.println("Not Wierd");
		        }
		    }
		        


	}

}
