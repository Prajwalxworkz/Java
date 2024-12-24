class Pg{
	 String pgOwner;
	 int rent;
	 int noOfFloors;
	 String pgAddress;
	 
	 Pg(String owner,int rental, int floorNum,String address){
		 pgOwner=owner;
		 rent=rental;
		 noOfFloors=floorNum;
		 pgAddress=address;
	 }
	 public void Details(){
		 System.out.println("---------------------");
		System.out.println("Name of the PgOwner:"+pgOwner);
		System.out.println("Rent Of PG:"+rent);
		System.out.println("No of Floors :"+noOfFloors);
		System.out.println("PG Address is:"+pgAddress);
		System.out.println("---------------------");
	 }
}