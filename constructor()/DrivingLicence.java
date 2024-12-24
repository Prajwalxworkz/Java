class DrivingLicence{
	String dlNo;
	String name;
	String dob;
	String validTill;
	String bloodGroup;
	String fatherName;
	String rtoOfficeNumber;
	
	DrivingLicence(String dNum,String nme,String birth,String valid,String bloodgrp,String father,String num){
		 dlNo=dNum;
	 name =nme;
	 dob=birth;
	 validTill=valid;
	 bloodGroup=bloodgrp;
	 fatherName=father;
	 rtoOfficeNumber=num;
	}
	
	public void DrivingDetails(){
		System.out.println("--------------------------------");
		System.out.println("The Dl number is:"+dlNo);
		System.out.println("The Dl Name is:"+name);
		System.out.println("The Dl Date of Birth is:"+dob);
		System.out.println("The Dl Valid Till is:"+validTill);
		System.out.println("The Dl Blood Group is:"+bloodGroup);
		System.out.println("The Dl Father Name is:"+fatherName);
		System.out.println("The Dl RTO Office Number is:"+rtoOfficeNumber);
		System.out.println("--------------------------------");
		
		
	}
}