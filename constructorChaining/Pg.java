class Pg{
	double rent;
	int noOfFloors;
	String pgAddress;
	String pgOwner;
	
	public Pg(){
		this(6000.00,5);
		System.out.println("default constructor");
	}
	
	public Pg(double rent,int noOfFloors){
		this("Rajajinagar, Bengaluru","Shiv Reddy");
		System.out.println("parameterised constructor1");
		this.rent=rent;
		this.noOfFloors=noOfFloors;
	}
	public Pg(String pgAddress,String pgOwner){
		System.out.println("parameterised constructor2");		
		this.pgAddress=pgAddress;
		this.pgOwner=pgOwner;
	}
	
	public  void display(){
		System.out.println("pgOwner :"+pgOwner);
			System.out.println("pgAddress :"+pgAddress);
		System.out.println("rent :"+rent);
		System.out.println("noOfFloors :"+noOfFloors);
	
		
	}

}
