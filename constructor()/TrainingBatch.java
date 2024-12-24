class TrainingBatch{
	
String batchName;
int noOfTrinees;
String TrainerName;
String instituteName;

TrainingBatch(String bName,int num, String tName, String iName){
	batchName=bName;
	noOfTrinees=num;
	TrainerName=tName;
	instituteName=iName;
}

public void Training(){
	System.out.println("----------------------------");
	System.out.println("The Batch Name is :"+batchName);
	System.out.println("The No od Trainees  is :"+noOfTrinees);
	System.out.println("The Trainee name is :"+TrainerName);
	System.out.println("The Institute Name  is :"+instituteName);
	System.out.println("----------------------------");
}

}