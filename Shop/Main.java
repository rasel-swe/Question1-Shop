package Shop;

public class Main {

	public static void main(String[] args)
	{
		
		Product pro1 = new Product(101,"Watermelon",1000,"In Stock");
		pro1.showInfo();
		Product pro2 = new Product(102,"Date",1000,"In Stock");
		pro2.showInfo();
		
		SalesPeople SalesMan1 = new SalesPeople("Hasan","012454","Dhaka, bangladesh");
		SalesMan1.showInfo();
		
		Membercust cust1 = new Membercust("Karim","Dhaka","014782");
		cust1.total(1000,1000);
		cust1.showInfo();
		
		Bikash b = new Bikash();
		b.setCash(cust1.discount());
		b.showInfo();
	}
}
