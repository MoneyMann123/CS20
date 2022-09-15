/*
	Program: GradeAvgPart1.java          Date: September 15, 2022
	Author: Money Mann 
	School: CHHS
	Course: Computer Science 20
*/
package SkillBuilding;

import java.util.Scanner;

public class GradeAvgPart1 
{

	public static void main(String[] args) 
	{
		Scanner input = new Scanner(System.in);
		
		System.out.println("Enter the first grade: ");
		int grd1 = input.nextInt();
		
		System.out.println("Enter the second grade: ");
		int grd2 = input.nextInt();
		
		System.out.println("Enter the third grade: ");
		int grd3 = input.nextInt();
		
		System.out.println("Enter the fourth grade: ");
		int grd4 = input.nextInt();
		
		System.out.println("Enter the fifth grade: ");
		int grd5 = input.nextInt();
		
		int avg = (grd1 + grd2 + grd3 + grd4 + grd5)/5;
		
		System.out.println("The average mark is " + avg + "%.");
		
			
	}

}
/* Screen Dump
Enter the first grade: 
60
Enter the second grade: 
70
Enter the third grade: 
80
Enter the fourth grade: 
90
Enter the fifth grade: 
100
The average mark is 80%.

*/
