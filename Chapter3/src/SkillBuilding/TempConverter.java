/*
	Program: TempConverter.java          Date: September 16, 2022
	Author: Money Mann 
	School: CHHS
	Course: Computer Science 20
*/
package SkillBuilding;

import java.util.Scanner;

public class TempConverter 
{

	public static void main(String[] args) 
	{
		System.out.println("\nHello and thank you for using our application. This application only converts Farenheit temperature to the "
				+ "corresponding Celsius temperature.\n");
		
		Scanner input = new Scanner(System.in);
		
		System.out.println("Please enter a Fahrenheit temperature: ");
		double frh = input.nextInt();
		
		double cel = (5/9) * (frh - 32);
				
		System.out.println("The temperature in Celsius is " + cel + ".");

	}

}
/* Screen Dump

*/