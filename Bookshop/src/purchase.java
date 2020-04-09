
public class purchase {
	
	private int quantity;
	private double price;

public purchase()
{
	
}
public purchase(int q,double p)
{
	this.quantity = q;
	this.price = p;
}
public int getquantity()
{
	return quantity;
}
public double getprice()
{
	return price;
}

public void setquantity(int q)
{
	quantity = q;
}
public void setprice(double p)
{
	price = p;
}	
 public void display()
 {
	 System.out.println("Total quantity :"+ this.quantity + "\nTotal price :"+ this.price);
 }
}
