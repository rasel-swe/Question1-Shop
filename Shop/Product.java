package Shop;

public class Product {
	  
	private int Pid;
	private String Pname;
	private int price;
	private String availability;
	
	public Product(int Pid,String Pname, int price, String availability)
	{
		this.Pid = Pid;
		this.Pname = Pname;
		this.price = price;
		this.availability = availability;
	}
	public void showInfo()
	{
		System.out.println("Product Information : ");
		System.out.println("Product ID : "+Pid);
		System.out.println("Product Name : "+Pname);
		System.out.println("Product Price : "+price);
		System.out.println("Product Availability : "+availability);
		System.out.println();
	}
}
