package Shop;

public class Membercust extends Customer {

	public int d;
	private String Cname;
	private String add;
	private String contact;
	
	public Membercust(String Cname, String add, String contact)
	{
		this.Cname = Cname;
		this.add = add;
		this.contact = contact;
	}
		
	@Override
	  public void total(int a, int b)
	  {
		  
		  total = a+b;

	  }
	
	public int vat()
	  {
		 return v =  total+(5*total)/100; 
	  }
	
	public int discount()
	{
			return d = (v-(total*10)/100);
	}
	public void showInfo()
	{
			System.out.println("Customer Information : ");
			System.out.println("Customer Name : "+Cname);
			System.out.println("Customer contact : "+contact);
			System.out.println("Customer Address : "+add);
			System.out.println("Cost : "+ total);
		    System.out.println("Total Cost including 5% vat : "+ vat());
		    System.out.println("Total Cost including 10% discount : "+ discount() );
		    System.out.println();	
		    }
	
}