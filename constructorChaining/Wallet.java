class Wallet{
	int id;
	int noOfCompartments;
	String brand;
	String color;
	
	public Wallet(){
		this(101,3);
		System.out.println("default constructor");
	}
	
	public Wallet(int id,int noOfCompartments){
		this("Woodland","Brown");
		System.out.println("parameterised constructor1");
		this.id=id;
		this.noOfCompartments=noOfCompartments;
	}
	public Wallet(String brand,String color){
		System.out.println("parameterised constructor2");		
		this.brand=brand;
		this.color=color;
	}
	
	public  void display(){
		System.out.println("id :"+id);
		System.out.println("brand :"+brand);
		System.out.println("color :"+color);
		System.out.println("noOfCompartments :"+noOfCompartments);	
	}

}
