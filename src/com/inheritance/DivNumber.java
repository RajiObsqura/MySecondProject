package com.inheritance;
public class DivNumber extends AddNumbers{
	double val=0;
	
	public void tenDiv()
	{
		int result=super.getnumbers();
		val=result %10;
	if((val)==0)
	    {
		System.out.println("The number is divisible by ten");
	    }
		else 
		{
		System.out.println("The numbers  not divisible by ten");
		}
	}
	public static void main(String[] args)
	{
     DivNumber d1=new DivNumber();
     //int result=d1.getnumbers();
      d1.tenDiv();
     System.out.println("The entered numbers are :" +d1.num1 + " " +d1.num2);
     
	}

}
