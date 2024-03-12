package com.inheritance;

public class Item {
	int quantity;
	Product p1;
public Item(int quantity, Product p1) {
		super();
		this.quantity = quantity;
		this.p1 = p1;
	}
	void display()
	{
		System.out.println(quantity);
		System.out.println(p1.id +" " +p1.name);
		
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Product p=new Product(123, "heee", "TOM");
		Item i1=new Item(34, p);
          i1.display();
	}

}
