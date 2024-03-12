package com.inheritance;

public class Emp2 {
	String empname;
	int empid;
	Car c1;
		public Emp2(String empname, int empid, Car c1) {
		super();
		this.empname = empname;
		this.empid = empid;
		this.c1 = c1;
	}
		public void display()
		{
			System.out.println("Employee Details ");
			System.out.println("~~~~~~~~~~~~~~~~~~");
			
			
			System.out.println("employee  Name: " +empname);
			System.out.println("Emp Id: " +empid );
			System.out.println("Employee car: "+ c1.carname +" Car color  :  " +c1.carcolor  +" car regno: " +c1.regno);
		}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Car c3 = new Car("Honda", "white", 12345);
        Emp2 e1=new Emp2("Priya", 3456,c3);
        e1.display();
        	}
}
