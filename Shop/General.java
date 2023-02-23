package Shop;

public class General extends Customer {
	//public int v;
  @Override
  public void total(int a, int b)
  {
	  
	  total = a+b;

  }
  
  public void vat()
  {
	  v = (5*total)/100; 
  }
 
  public void showInfo()
  {
	  System.out.println("Customer Information : ");
	  System.out.println("Cost : "+ total);
	  System.out.println("Total Cost including 5% vat : "+ (v+total));
	  System.out.println();
  }
}