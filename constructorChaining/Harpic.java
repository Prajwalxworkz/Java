class Harpic{
	int id;
	int quantity;
	double price;
	String color;
	
	public Harpic(){
		this(001,250);
		System.out.println("default constructor");
	}
	
	public Harpic(int id,int quantity){
		this(96.00,"Blue");
		System.out.println("parameterised constructor1");
		this.id=id;
		this.quantity=quantity;
	}
	public Harpic(double price,String color){
		System.out.println("parameterised constructor2");		
		this.price=price;
		this.color=color;
	}
	
	public  void display(){
		System.out.println("id :"+id);
		System.out.println("quantity :"+quantity+"ml");
		System.out.println("price :"+price);
		System.out.println("color :"+color);
	}

}
