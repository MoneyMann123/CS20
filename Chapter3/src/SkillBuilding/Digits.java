/*
	Program: Digits.java          Date: September 15, 2022
	Author: Money Mann 
	School: CHHS
	Course: Computer Science 20
*/
package SkillBuilding;

import java.util.Scanner;

public class Digits 
{

	public static void main(String[] args) 
	{
		Scanner input = new Scanner(System.in);
		
		
		
		System.out.println("Enter a two-digit number: ");
		int dig = input.nextInt();
		
		int ones = dig%10;
		int tens = dig/10;
		
		System.out.println("Your two-digit number is " + dig + ".\n");
		
		System.out.println("The ones place digit is: " + ones);
		System.out.println("The tens place digit is: " + tens);
	}

}
/* Screen Dump
Enter a two-digit number: 
24
Your two-digit number is 24.

The ones place digit is: 4
The tens place digit is: 2

*/