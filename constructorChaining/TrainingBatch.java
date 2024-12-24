class TrainingBatch{
	String batchName;
	int noOfTrinees;
	String TrainerName;
	String instituteName;
	
	public TrainingBatch(){
		this("Rajajinagar",27);
		System.out.println("default constructor");
	}
	
	public TrainingBatch(String batchName,int noOfTrinees){
		this("Dev","X-workz");
		System.out.println("parameterised constructor1");
		this.batchName=batchName;
		this.noOfTrinees=noOfTrinees;
	}
	public TrainingBatch(String TrainerName,String instituteName){
		System.out.println("parameterised constructor2");		
		this.TrainerName=TrainerName;
		this.instituteName=instituteName;
	}
	
	public  void display(){
		System.out.println("batchinstituteName :"+batchName);
		System.out.println("noOfTrinees :"+noOfTrinees);
		System.out.println("TrainerinstituteName :"+TrainerName);
		System.out.println("instituteName :"+instituteName);
	}

}
