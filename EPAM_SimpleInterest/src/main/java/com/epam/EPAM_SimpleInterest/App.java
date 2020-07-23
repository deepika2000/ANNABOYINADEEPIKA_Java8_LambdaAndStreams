package com.epam.EPAM_SimpleInterest;

import java.util.Scanner;

public class App {
	public static void main(String[] args) {
		double principle_amount,rate,time;
	    Scanner sc=new Scanner (System. in);
	    SimpleInterest sim = new SimpleInterest();
	    CompoundInterest cin = new CompoundInterest();
	    System.out.println("Calculation of Simple Interest and Compound Interest!!!");
	    System.out.println("Enter the principle amount:"); 
	    principle_amount=sc.nextDouble();
	    System.out.println("Enter the Time period:");
	    time=sc.nextDouble();
	    System.out.println("Enter the Rate of Interest");
	    rate=sc.nextDouble();
	    System.out.println("Simple Interest="+sim.simpleinterest(principle_amount,time,rate));
	    System.out.println("Compound Interest="+cin.compoundinterest(principle_amount,rate,time));
	}

}