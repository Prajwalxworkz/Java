package com.xworkz.java.logic;

public class IceCream {
    int id;
    String brand;
    String flavors;
    String type;
    int quantity;
	
	public IceCream(int iceId, String icebrand, String iceflavors,String icetype, int icequantity){
		id = iceId;
		brand = icebrand;
		flavors = iceflavors;
		type = icetype;
		quantity = icequantity;
		
	}
	
	
	public void Display(){
	System.out.println("The Pen Brand Name is:"+ id);
	System.out.println("The Pen Brand Name is:"+ brand);
	System.out.println("The Pen Price is:"+flavors);
	System.out.println("The Pen Color is:"+type);
	System.out.println("The Type ofthe pen is:"+quantity);
	System.out.println("--------------------");
}
}

