package com.inheritance;

public class Book {
	String bname;
	int price;
	Author a2;
		public Book(String bname, int price, Author a2) {
		super();
		this.bname = bname;
		this.price = price;
		this.a2 = a2;
	}
	public void display1()
	{  System.out.println("Book Details ");
		System.out.println("Book Name: " +bname);
		System.out.println("Book Price: " +price);
		System.out.println("Book Author: "+ a2.aname + " Author Place:  " +a2.place  +" Author Age : " +a2.age);
	}


	public static void main(String[] args) {
		// TODO Auto-generated method stub
 
		Author autho1=new Author ("Raja ravi varma","kottayam",56);
		Book b1=new Book("My First book",670,autho1);
		b1.display1();
		
	}

}
