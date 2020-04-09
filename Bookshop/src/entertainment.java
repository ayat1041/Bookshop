
public class entertainment extends book{
	
		public String category;
		
		public entertainment()
		{
			
		}
		public entertainment(String name,String genre,double price,String author,String c)
		{
			super(name, genre, price, author);
			this.category = c;
		}
}
