class Library{
	int libraryId;
	String address;
	String type;
	String libraryOwnerName;	
	
	Library(int id, String adrs, String typ, String owner){
		libraryId=id;
		address= adrs;
		type=typ;
		libraryOwnerName=owner;
	}
	public void Book(){
	  System.out.println("The library Id is : "+libraryId);
	  System.out.println("The library address is : "+address);
	  System.out.println("The library type is : "+type);
	  System.out.println("The library library Owner Name is : "+libraryOwnerName);
	  System.out.println("---------------------------");
	  
	  
		
	}
}