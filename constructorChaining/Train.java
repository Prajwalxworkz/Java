class Train{
	int trainNo;
	int noOfCoaches;
	String trainName;
	
	public Train(){
		this(1);
		System.out.println("default constructor");
	}
	
	public Train(int trainNo){
		this(11,"Vande Bharath");
		System.out.println("parameterised constructor1");
		this.trainNo=trainNo;
	}
	public Train(int noOfCoaches, String trainName){
		System.out.println("parameterised constructor2");
		this.noOfCoaches=noOfCoaches;
		this.trainName=trainName;
	}
	
	public  void display(){
		System.out.println("trainNo :"+trainNo);
		System.out.println("noOfCoaches :"+noOfCoaches);
		System.out.println("trainName :"+trainName);
	}

}
