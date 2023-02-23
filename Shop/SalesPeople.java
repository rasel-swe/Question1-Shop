package Shop;

public class SalesPeople {
	
	private String Sname;
	private String NIDnumber;
	private String address;
	
	public SalesPeople(String s, String NI, String add)
	{
		Sname = s;
		NIDnumber = NI;
		address = add;
	}
	
	public void showInfo()
	{
		System.out.println("Sales Man Information.");
		System.out.println("Sales man name : "+Sname);
		System.out.println("NID Number : "+NIDnumber);
		System.out.println("Address : "+address);
		System.out.println();
	}
	
}
