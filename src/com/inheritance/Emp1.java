package com.inheritance;

import java.util.Scanner;


public class Emp1 {
	double  ded=0,bon=0;
	double basic;
	Scanner sc=new Scanner(System.in );
		
		public void details()
		{
		System.out.println("Enter the Basic Pay: ");
		 basic=sc.nextDouble();
		System.out.println("Enter the Deductions:");
	     ded=sc.nextDouble();
		System.out.println("Enter the bonus:");
	     bon=sc.nextDouble();
		//System.out.println("Basic Pay:" +basic +"deduction: " +ded +"Bonus: " +bon);
		}
}
