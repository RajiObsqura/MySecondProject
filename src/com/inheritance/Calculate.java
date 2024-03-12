package com.inheritance;

public class Calculate extends Emp1 
	{
	double hra=0.0;
	double pf=0.0;
	
		public double empHra()
		{
		this.hra=.05*super.basic;
		    
		    return hra;
		   
		} 
		public double pf()
		{
			this.pf=.2*super.basic;	
			return pf;
		}
		
		/*
		 * public static void main(String args[]) { Calculate bp=new Calculate();
		 * bp.getBasic(); // System.out.println("HRA:" + hra +" PF: " +pf ); }
		 */
}
