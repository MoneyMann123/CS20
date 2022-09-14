/*
	Program: DistancePart1of2.java          Date: September 14, 2022
	Author: Money Mann 
	School: CHHS
	Course: Computer Science 20
*/
package SkillBuilding;

import java.text.DecimalFormat;

public class DistancePart1of2 
{

	public static void main(String[] args) 
	{
		DecimalFormat dc = new DecimalFormat("0.0");
		
		
		double seg1 = 12.2;
		double seg2 = 10.6;
		double seg3 = 5.8;
		double total = seg1 + seg2 + seg3;
		System.out.println("The total distance of this race is " + dc.format(total) + "km.");

	}

}
/* Screen Dump
The total distance of this race is 28.6km.

*/
