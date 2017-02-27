package com.renz.calculateShipping;
/*
 * @author Renz Mallari
 */

import java.util.Scanner;
public class CalculateShipping {
	
	
	public static void main(String[] args){
		double totalSale = 0;
		Scanner in = new Scanner(System.in);
		
		System.out.println("Enter the total sale:");
		totalSale = in.nextDouble();
		
		if(totalSale < 25){
			totalSale += 15;
		}
		else if(totalSale < 50){
			totalSale += 10;
		}
		else if(totalSale <= 75){
			totalSale +=5;
		}
		
		System.out.println("Your total cost is: "+ totalSale);
		
	}
}
