
public class education extends book{
						
	public String subject;
	
	public education()
	{
		
	}
	public education(String name,String genre,double price,String author,String s)
	{
		super(name,genre,price,author); 
		this.subject = s;
	}
}
