package Shop;

public class Bikash extends Payment {

	 public void showInfo()
		{
		 System.out.println("Payment Information : ");
		 if(cash > 1500)
		 {
			 System.out.println("You are getting 100 tk cash back.");
		 }
			System.out.println(cash-100+" Taka Paid,");
			System.out.println("Payment completed by Bkash.");
			System.out.println();
		}
	}
