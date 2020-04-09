
public class Main {
	
	public static void main(String[] args) {
		 person p1 = new customer("Rahat","rahat@gmail.com","12345a","+88019999999",1001,"Rahat123","Uttara, Dhaka");
		 person p2 = new seller ("Kashem","kashem@gmail.com","1234","+880183122222","1000",15);
		 purchase p3 = new purchase(2,560);
		 p1.display();
		 System.out.println("\n------------------");
		 p2.display();
		 System.out.println("\n------------------");		 
		 p3.display();
		 
		 //System.out.println("customers name: " + p1.getname());
	}

}
