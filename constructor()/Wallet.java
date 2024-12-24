class Wallet {
    int id;
    String brand;
    int noOfCompartments;
    String color;
	
	Wallet(int Id,String bName,int cNum, String clr){
		id=Id;
		brand=bName;
		noOfCompartments=cNum;
		color=clr;
	}
	
	public void MoneyBank(){
		System.out.println("-----------------------");
		System.out.println("The Wallet Id is"+id);
		System.out.println("The Wallet brand is"+brand);
		System.out.println("The Wallet noOfCompartments is"+noOfCompartments);
		System.out.println("The Wallet color is"+color);
		System.out.println("-----------------------");
	}
}


