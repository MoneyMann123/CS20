/*
	Program: DistancePart2of2.java          Date: September 14, 2022
	Author: Money Mann 
	School: CHHS
	Course: Computer Science 20
*/
package SkillBuilding;


import java.util.Scanner;

public class DistancePart2of2 
{

	public static void main(String[] args) 
	{
		Scanner input = new Scanner(System.in);
		
		double seg1;
		double seg2;
		double seg3;
		double total;
		
		System.out.println("Enter the distance for segment 1: ");
		seg1 = input.nextDouble();
		
		System.out.println("Enter the distance for segment 2: ");
		seg2 = input.nextDouble();
		
		System.out.println("Enter the distance for segment 3: ");
		seg3 = input.nextDouble();
		
		total = seg1 + seg2 + seg3;
		System.out.println("Total distance of the race is " + total + " km.");

	}

}
/* Screen Dump
Enter the distance for segment 1: 
2
Enter the distance for segment 2: 
4
Enter the distance for segment 3: 
6
Total distance of the race is 12.0 km.

*/