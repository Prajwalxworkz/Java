class Bread {
	String brandName;
	int noOfSlices;
	String type;
	
	Bread(String brandName, int noOfSlices, String type){
		 this.brandName=brandName;
		 this.noOfSlices=noOfSlices;
		 this.type=type;
	}
	public void display(){
		System.out.println("Brand name is "+brandName);
		System.out.println("Number of slices are "+noOfSlices);
		System.out.println("The type of bread is "+type);
	}
}