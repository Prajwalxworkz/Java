class ElectricityBill{
	
String rrNo;
long accountId;
String address;

public ElectricityBill( String billrrNo, long billaccountId, String billaddress){
rrNo = billrrNo ;
accountId = billaccountId;
address = billaddress;
}

public void LightBill(){
	System.out.println("The Electricity Bill RRno is " + rrNo);
	System.out.println("The Electricity Bill AccountID is " + accountId);
	System.out.println("The Electricity Bill Address is "+ address);
	System.out.println("----------------------------");
}

}