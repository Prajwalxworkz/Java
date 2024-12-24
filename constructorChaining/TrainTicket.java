class TrainTicket{
	long pnr;
	int age;
	String gender;
	String name;
	
	public TrainTicket(){
		this(8602158775l,23);
		System.out.println("default constructor");
	}
	
	public TrainTicket(long pnr,int age){
		this("male","Raju");
		System.out.println("parameterised constructor1");
		this.pnr=pnr;
		this.age=age;
	}
	public TrainTicket(String gender,String name){
		System.out.println("parameterised constructor2");		
		this.gender=gender;
		this.name=name;
	}
	
	public  void display(){
		System.out.println("pnr :"+pnr);
		System.out.println("age :"+age);
		System.out.println("gender :"+gender);
		System.out.println("name :"+name);
	}

}
