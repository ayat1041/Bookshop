
public abstract class person {
	
	private String name, email, password, phone;
	public person()
	{
		
	}
	public person(String n,String e, String p, String ph)
	{
		
		this.name = n;
		this.email = e;
		this.password = p;
		this.phone = ph;
	}
	public String getname()
	{
		return name;
	}
	public String getemail()
	{
		return email;
	}	
	public String getpassword()
	{
		return password;
	}
	public String getphone()
	{
		return phone;
	}	
	public void setname(String n)
	{
		name = n;
	}
	public void setemail(String e)
	{
		email = e;
	}
	public void setpassword(String p)
	{
		password = p;
	}
	public void setphone(String ph)
	{
		phone = ph;
	}
	//login method missing

	public abstract void display();

}
