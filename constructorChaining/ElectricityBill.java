class ElectricityBill{

	int rrNo;
	int accountId;
	String address;
	
	public ElectricityBill(){
		this(1);
		System.out.println("default constructor");
	}
	
	public ElectricityBill(int rrNo){
		this(11,"Kasturi nagar, Bengaluru");
		System.out.println("parameterised constructor1");
		this.rrNo=rrNo;
	}
	public ElectricityBill(int accountId, String address){
		System.out.println("parameterised constructor2");
		this.accountId=accountId;
		this.address=address;
	}
	
	public  void display(){
		System.out.println("rrNo :"+rrNo);
		System.out.println("accountId :"+accountId);
		System.out.println("address :"+address);
	}

}
