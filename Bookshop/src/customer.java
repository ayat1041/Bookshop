
public class customer extends person{
	
	private int cid;
	private String shipname,shipaddress;
	//overload	
	public customer()
	{
		
	}
	//overload	
	public customer(String name, String email, String password, String phone,int c,String sn,String sa)
	{
		super(name, email, password, phone);		
		this.cid = c;
		this.shipname = sn;
		this.shipaddress = sa;
		
	}
	public int getcid()
	{
		return cid;
	}
	public String getshipname()
	{
		return shipname;
	}	
	public String getshipaddress()
	{
		return shipaddress;
	}
	public void setcid(int c)
	{
		cid = c;
	}
	public void setshipname(String sn)
	{
		shipname = sn;
	}
	public void setshipaddress(String sa)
	{
		shipaddress = sa;
	}
	//public void registration();
	//public void pay();
	
	@Override
	public void display()
	{
		System.out.println("Customer name :"+this.getname()+"\nCustomer ID :"+ this.cid + "\nShipname :"+this.shipname + "\nShipping address:" +this.shipaddress);
	}

}
