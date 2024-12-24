class OperatingSystems{
	String name;
	String version;
	
	public OperatingSystems(){
		this("Windows","V11");
		System.out.println("default constructor");
	}
	
	public OperatingSystems(String version,String name){
		System.out.println("parameterised constructor1");		
		this.name=name;
		this.version=version; //doubt
	}
	
	public  void display(){
		System.out.println("name :"+name);
		System.out.println("version :"+version);
	}

}
