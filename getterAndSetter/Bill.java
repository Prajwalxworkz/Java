public class Bill{
	private int billId;
	private double billAmount;
	private String billAddress;
	private String billName;
	private boolean isBillPaid;
	
	public Bill(){
		System.out.println("default construcctor");
	}
	
	public void setBillId(int billId){
		this.billId=billId;
	}
	
	public void setBillAmount(double billAmount){
		this.billAmount=billAmount;
	}
	public void setBillAddress(String billAddress){
		this.billAddress=billAddress;
	}
	public void setBillName(String billName){
		this.billName=billName;
	}
	
	public void setBillPaid(){
		this.isBillPaid=isBillPaid;
	}
	
	public int getBillId(){
		return billId;
	}
	
	public double getBillAmount(){
		return billAmount;
	}
	public String getBillAddress(){
		return billAddress;
	}
	public String getBillName(){
		return billName;
	}
	
	public boolean isBillPaid(){
		return isBillPaid;
	} 
	
}