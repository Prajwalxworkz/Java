class Library{
	String libraryOwnerName;
	int libraryId;
	String type;
	String address;
	
	public Library(){
		this("Ravi Shankar",001);
		System.out.println("default constructor");
	}
	
	public Library(String libraryOwnerName,int libraryId){
		this("Public","Rajajinagar, Bengaluru");
		System.out.println("parameterised constructor1");
		this.libraryOwnerName=libraryOwnerName;
		this.libraryId=libraryId;
	}
	public Library(String type,String address){
		System.out.println("parameterised constructor2");		
		this.type=type;
		this.address=address;
	}
	
	public  void display(){
		System.out.println("batchaddress :"+libraryOwnerName);
		System.out.println("libraryId :"+libraryId);
		System.out.println("Traineraddress :"+type);
		System.out.println("address :"+address);
	}

}

