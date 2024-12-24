class Glass{
	String glassId;
	String type;
	
	public Glass(){
		this("Translucent","A01K2");
		System.out.println("default constructor");
	}
	
	public Glass(String type,String glassId){
		System.out.println("parameterised constructor1");	
		this.type=type;		
		this.glassId=glassId;		 
	}
	
	public  void display(){
		System.out.println("glassId :"+this.glassId);
		System.out.println("type :"+this.type);
	}


}
