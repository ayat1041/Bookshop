
public class seller extends person{
	
	private String sid;
	private double discount;
	//public void discount()
	//public void recievebill()
	//overload
	public seller()
	{
		
	}
	//overload
	public seller(String name, String email, String password, String phone,String s,double d)
	{
		super(name, email, password, phone);
		this.sid = s;
		this.discount = d;
	}
	public String getsid()
	{
		return sid;
	}
	public double getdiscount()
	{
		return discount;
	}
	public void setsid(String s)
	{
		sid = s;
	}
	public void setdiscount(double d)
	{
		discount = d;
	}	
	@Override
	public void display()
	{
		System.out.println("Seller ID :" + this.sid + "\nDiscount :" + this.discount + "%");
	}

}
