class PanCard{

	String panNumber;
	String name;
	String fatherName;
	String dob;
	
	public PanCard(){
		this("GPOT5NPT","Revanth","Rajendra");
		System.out.println("default constructor");
	}
	
	public PanCard(String panNumber,String name,String fatherName){
		this("12/10/2002");
		System.out.println("parameterised constructor1");
		this.panNumber=panNumber;
		this.name=name;
		this.fatherName=fatherName;
	}
	public PanCard(String dob){
		System.out.println("parameterised constructor2");				
		this.dob=dob;
	}
	
	public  void display(){
		System.out.println("batchdob :"+panNumber);
		System.out.println("name :"+name);
		System.out.println("Trainerdob :"+fatherName);
		System.out.println("dob :"+dob);
	}

}
