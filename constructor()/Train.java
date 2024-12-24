class Train{

long trainNo;
String noOfCoaches;
String trainName;

public Train( long railtrainNo, String railnoOfCoaches, String railtrainName){
trainNo = railtrainNo;
noOfCoaches = railnoOfCoaches;
trainName = railtrainName;
}

public void TrainDetails(){
	System.out.println("The Train number is :"+trainNo);
	System.out.println("The Train Name is :"+trainName);
	System.out.println("The Train Number of coaches are:"+noOfCoaches );
	System.out.println("---------------------------------" );
}
}