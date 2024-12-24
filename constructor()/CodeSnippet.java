class CodeSnippet{
	
	// public static void m(){
		// System.out.println("m started");
		// String a[]={"hi","bye"};
		// main(a);
		// System.out.println("m ended");
		
	// }
	
	public static void main(String code[]){
		
		System.out.println("main started");
		// m();
		for(String str: code) 		System.out.println(str);
		
		System.out.println("main ended");
		
	}
}