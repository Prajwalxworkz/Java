class BillRunner{
	
	public static void main(String a[]){
		
		Bill bill = new Bill();
		bill.setBillId(01);
		bill.setBillAmount(789.00);
		bill.setBillName("Prajwal");
		bill.setBillAddress("Kasturi nagar, Bengaluru");
		
		int billId=bill.getBillId();
		double billAmount=bill.getBillAmount();
		String billAddress=bill.getBillAddress();
		String billName=bill.getBillName();
		
		System.out.println("The bill  id is "+billId);
		System.out.println("The bill  amount is "+billAmount);
		System.out.println("The bill  name is "+billName);
		System.out.println("The bill  address is"+billAddress);
	}
}