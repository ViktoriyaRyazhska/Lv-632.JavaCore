package lesson3;

public class App {
	

	public static void main (String[] args) {
	
		Product p = new Product("Pen", 2, 360);
		Product p2= new Product("Ruler", 44, 170);
		Product p3= new Product("Notebook", 12, 400);
		Product p4= new Product("Backpack", 100, 70);
	
	
		// Display the name and quantity of the most expensive item
		
		if(p.getPrice()>p2.getPrice()&&p.getPrice()>p3.getPrice()&&p.getPrice()>p4.getPrice())
			System.out.println("The most expensive item - " + p.getName()+ " , its quantity "+p.getQuantity());
			else if (p2.getPrice()>p.getPrice()&&p2.getPrice()>p3.getPrice()&&p2.getPrice()>p4.getPrice()) 
				System.out.println("The most expensive item - " + p2.getName()+ " , its quantity "+p2.getQuantity());
			else if (p3.getPrice()>p.getPrice()&&p3.getPrice()>p2.getPrice()&&p3.getPrice()>p4.getPrice())
				System.out.println("The most expensive item - " + p3.getName()+ " , its quantity "+p3.getQuantity());
			else if (p4.getPrice()>p.getPrice()&&p4.getPrice()>p2.getPrice()&&p4.getPrice()>p3.getPrice())
				System.out.println("The most expensive item - " + p4.getName()+ " , its quantity "+p4.getQuantity());
		
		//Display the name of the items, which has the biggest quantity
		if (p.getQuantity()>p2.getQuantity()&&p.getQuantity()>p3.getQuantity()&&p.getQuantity()>p4.getQuantity())
			System.out.println(p.getName()+" has the biggest quantity");
			else if(p2.getQuantity()>p.getQuantity()&&p2.getQuantity()>p3.getQuantity()&&p2.getQuantity()>p4.getQuantity())
				System.out.println(p2.getName()+" has the biggest quantity");
			else if (p3.getQuantity()>p.getQuantity()&&p3.getQuantity()>p2.getQuantity()&&p3.getQuantity()>p4.getQuantity())
				System.out.println(p3.getName()+" has the biggest quantity");
		
			else if(p4.getQuantity()>p.getQuantity()&&p4.getQuantity()>p2.getQuantity()&&p4.getQuantity()>p3.getQuantity())
				System.out.println(p4.getName()+" has the biggest quantity");
				
		
		
	}
	
	
	
}
