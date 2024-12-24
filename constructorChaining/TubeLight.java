class TubeLight{
	double price;
	int id;
	String brand;
	String voltage;
	
	public TubeLight(){
		this(250.00,105);
		System.out.println("default constructor");
	}
	
	public TubeLight(double price,int id){
		this("Philips","120V");
		System.out.println("parameterised constructor1");
		this.price=price;
		this.id=id;
	}
	public TubeLight(String brand,String voltage){
		System.out.println("parameterised constructor2");		
		this.brand=brand;
		this.voltage=voltage;
	}
	
	public  void display(){
		System.out.println("id :"+id);
		System.out.println("brand :"+brand);
		System.out.println("voltage :"+voltage);
		System.out.println("price :"+price);
		
	
		
	}

}
