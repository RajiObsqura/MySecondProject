package com.inheritance;

public class Student1 {
	int rollno;
	String name;
	Address2 add1;
	

	public Student1(int rollno, String name, Address2 add1) {
		super();
		this.rollno = rollno;
		this.name = name;
		this.add1 = add1;
	}
	void display()
	{
		System.out.println(" "+name);
		System.out.println(" "+rollno);
		System.out.println(" "+add1.city +" " +add1.Hno + " " +add1.Hname);
					
	}


	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Address2 a1=new  Address2("Coimbatore","love_dale",123);
		Student1 s1=new Student1(111,"RAJI",a1);
		s1.display();
	}

}
