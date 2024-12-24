class Harpic {
    int id;
    int quantity;
    double price;
    String color;
	
	Harpic(int Id,int qnt,double prc){
		id=Id;
		quantity=qnt;
		price=prc;
		color="blue";
	}
	
	public void  View(){
		System.out.println("---------------------");
		System.out.println("Id of Harpic:"+id);
		System.out.println("Quantity of Harpic:"+quantity);
		System.out.println("Price of Harpic:"+price);
		System.out.println("Color of Harpic:"+color);
		System.out.println("---------------------");
	}
}

