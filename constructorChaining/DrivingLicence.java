class DrivingLicence{

	String dlNo;
	String name;
	String dob;
	String validTill;
	String bloodGroup;
	String fatherName;
	String rtoOfficeNumber;
	
	public DrivingLicence(){
		this("KA0419920009646","Revanth","12/10/2002");
		System.out.println("default constructor");
	}
	
	public DrivingLicence(String dlNo,String name,String dob){
		this("21/05/2041","O+","Rajendra","KA04");
		System.out.println("parameterised constructor1");
		this.dlNo=dlNo;
		this.name=name;
		this.dob=dob;
	}
	public DrivingLicence(String validTill,String bloodGroup,String fatherName,String rtoOfficeNumber){
		System.out.println("parameterised constructor2");				
		this.validTill=validTill;
		this.bloodGroup=bloodGroup;
		this.fatherName=fatherName;
		this.rtoOfficeNumber=rtoOfficeNumber;
	}
	
	public  void display(){
		System.out.println("dlNo :"+dlNo);
		System.out.println("name :"+name);
		System.out.println("dob :"+dob);
		System.out.println("validTill :"+validTill);
		System.out.println("bloodGroup :"+bloodGroup);
		System.out.println("fatherName :"+fatherName);
		System.out.println("rtoOfficeNumber :"+rtoOfficeNumber);
	}

}
