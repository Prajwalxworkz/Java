class TubeLight {
    int id;
    String brand;
    double price;
    int voltage;
	TubeLight(int Id, String bName, double pr,int volt){
		id=Id;
		brand=bName;
		price=pr;
		voltage=volt;
	}
	
	public void Flash(){
		System.out.println("----------------------");
		System.out.println("TubeLight ID is:"+id);
		System.out.println("TubeLight brand is:"+brand);
		System.out.println("TubeLight price is:"+price);
		System.out.println("TubeLight voltage is:"+voltage);
		System.out.println("----------------------");
	}
}


