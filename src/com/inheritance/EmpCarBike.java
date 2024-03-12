package com.inheritance;

public class EmpCarBike {

	String EmpName1;
	int Empno1;
	Car c1;
	Bike b1;
	public EmpCarBike(String EmpName1,int Empno1,Car c1,Bike b1)
	{
		super();
		this.EmpName1=EmpName1;
		this.Empno1=Empno1;
		this.c1=c1;
		this.b1=b1;
	}
	public void display()
	{
		System.out.println("Employee2 Details ");
		System.out.println("~~~~~~~~~~~~~~~~~~");
		System.out.println("employee  Name: " +EmpName1);
		System.out.println("Emp Id: " +Empno1);
		System.out.println("Employee car: "+ c1.carname +" Car color  :  " +c1.carcolor  +" car regno: " +c1.regno);
		System.out.println("Employee Bike :"+ b1.BikeName + " Bike Regno " + b1.RegnoBike);		
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Car c3 = new Car("Honda", "white", 12345);
		Bike b1 =new Bike("Royal Enfield",3510);
		EmpCarBike cb1=new EmpCarBike("Helen",2345,c3,b1 );
		cb1.display();
		}

}
