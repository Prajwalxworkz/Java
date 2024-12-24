class IceCream{
	int id;
	int quantity;
	String brand;
	String flavors;
	
	public IceCream(){
		this(101,200);
		System.out.println("default constructor");
	}
	
	public IceCream(int id,int quantity){
		this("Naturals","Butterscotch");
		System.out.println("parameterised constructor1");
		this.id=id;
		this.quantity=quantity;
	}
	public IceCream(String brand,String flavors){
		System.out.println("parameterised constructor2");		
		this.brand=brand;
		this.flavors=flavors;
	}
	
	public  void display(){
		System.out.println("id :"+id);
		System.out.println("brand :"+brand);
		System.out.println("flavors :"+flavors);
		System.out.println("quantity :"+quantity+"ml");
		
		
	}

}
