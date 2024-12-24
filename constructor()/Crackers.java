class Crackers{
	
	int crackerId;
	String crackerName;
	double price;
	String crackerType;
	public Crackers(){
		this(1,"flowerPot");
		System.out.println("no arguments passed ");
	}
	
	public Crackers(int crackerId, String crackerName){
		this(1000.00,"sparkling");
		System.out.println("2 arguments (int, string) passed ");
		this.crackerId=crackerId;
		this.crackerName=crackerName;
	}
	public Crackers( double price, String crackerType){
		System.out.println("2 arguments(double, string) passed ");
		this.price=price;
		this.crackerType=crackerType;
	}
	public void spark(){
		
	}
	public void getCrackersInfo(){
		System.out.println("The cracker id is "+crackerId);
		System.out.println("The cracker name is "+crackerName);
		System.out.println("The cracker price is "+price);
		System.out.println("The cracker type is "+crackerType);
	}
}