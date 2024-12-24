class LibraryRunner{

	public static void main(String books[]){
		Library building1 = new Library(11,"Jayanagar,4th block,Bengaluru","Public","Ravi Kumar");		
		building1.Book();
		
		
		Library building2 = new Library(112,"MG Road, Bengaluru","Private","Suresh Bhat");      
		building2.Book();
		
        Library building3 = new Library(113,"Kuvempunagar, Mysuru","Public","Mohan Gowda");   
		building3.Book();
		

        Library building4 = new Library(114,"Vijayanagar, Bengaluru","Private","Shiva Reddy"); 
		building4.Book();
	
		
        Library building5 = new Library(115,"Hubli-Dharwad, Hubli","Public","Lakshmi Desai");     
		building5.Book();
		

        Library building6 = new Library(116,"Indiranagar, Bengaluru","Private","Anita Rao");      
		building6.Book();

        Library building7 = new Library(117,"Chikmagalur, Karnataka", "Public","Rajesh Shetty");     
		building7.Book();
		

        Library building8 = new Library(118, "Udupi, Karnataka","Private","Ganesh Acharya");     
		building8.Book();
		

        Library building9 = new Library(119,"Rajajinagar, Bengaluru","Public","Vikram Patil");
		building9.Book();
		
	}
}