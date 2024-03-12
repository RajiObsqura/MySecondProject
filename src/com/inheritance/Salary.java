package com.inheritance;

public class Salary extends Calculate{
	
   	public void totSal()
	{
   		super.details();
   		double hra=super.empHra();
   		double empPF=super.pf();
   		double total=basic+hra-empPF-ded+bon;
   		System.out.println("Salary Slip:");
		System.out.println("Basic Pay:" +basic);
		System.out.println("Deduction:" +ded);
		System.out.println("HRA:" + hra);
		System.out.println("Provident Fund:" + empPF);
		System.out.println("Bonus:" +bon);
		System.out.println("Total Salary:" +total);
	}
	public static void main(String args[])
	{
		Salary s1=new Salary();
		s1.totSal();
	}

}
