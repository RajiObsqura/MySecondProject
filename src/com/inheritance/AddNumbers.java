package com.inheritance;
import java.util.Scanner;
//Scanner sc=new Scanner (System.in);
public class AddNumbers {
	int num1,num2;
	int sum=0;
	Scanner sc=new Scanner (System.in);
	public int getnumbers()
	{
		Scanner sc=new Scanner (System.in);
		System.out.println("Enter first  number: ");
		num1=Integer.parseInt(sc.nextLine());
		System.out.println("Enter second   number: ");
		num2=Integer.parseInt(sc.nextLine());
		sum =num1+num2;
		return sum;
	}
	}
