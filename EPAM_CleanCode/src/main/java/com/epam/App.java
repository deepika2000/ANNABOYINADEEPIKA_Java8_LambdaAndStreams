package com.epam;

import java.util.Scanner;

public class App {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		boolean b = true;
		System.out.println("Enter the total area of house(in feets):");
		int area = sc.nextInt();
		System.out.println("Select the material standard from the below list");
		System.out.println("1.Standard Material");
		System.out.println("2.Above Standard Material");
		System.out.println("3.High Standard Material");
		System.out.println("4.High Standard Material and Fully Automated House");
		char ch = sc.next().charAt(0);;
		int result;
		ConstructionCost cost = new ConstructionCost();
		switch(ch) {
				case '1':
					result = cost.stdmaterial(area);
					System.out.println("The cost of the house would be: Rs." +result);
					break;
				case '2':
					result = cost.abstdmaterial(area);
					System.out.println("The cost of the house would be: Rs." +result);
					break;
				case '3':
					result = cost.hstdmaterial(area);
					System.out.println("The cost of the house would be: Rs." +result);
					break;
				case '4':
					result = cost.fullauto(area);
					System.out.println("The cost of the house would be: Rs." +result);
					break;
				default:						
					break;		
		}	
	}
}