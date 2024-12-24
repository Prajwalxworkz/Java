class TrainTicket{

long PNR;
int Age;
String Gender;
String Name;

public TrainTicket( long TrainPNR, String TrainName, int TrainAge, String TrainGender){
PNR = TrainPNR;
Age = TrainAge;
Gender = TrainGender;
Name = TrainName;
	
}


public void TrainDetails(){
	System.out.println("The Passenger PNR number is :"+PNR);
	System.out.println("The Passenger Age is :"+Age);
	System.out.println("The Passenger Gender is :"+Gender);
	System.out.println("The Passenger Name is :"+Name);
	System.out.println("--------------------");
	
}


}