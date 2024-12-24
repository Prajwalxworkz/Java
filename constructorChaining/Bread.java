class Bread{
	String brandName;
	int numOfSlices;
	String type;
	
	public Bread(){
		this("Britania",20);
		System.out.println("default constructor");
	}
	
	public Bread(String brandName,int numOfSlices){
		this("Brown");
		System.out.println("parameterised constructor1");
		this.brandName=brandName;
		this.numOfSlices=numOfSlices;
	}
	public Bread(String type){
		System.out.println("parameterised constructor2");		
		this.type=type;
	}
	
	public  void display(){
		System.out.println("brandName :"+brandName);
		System.out.println("numOfSlices :"+numOfSlices);
		System.out.println("type :"+type);
	}

}

