
public class Fourthtask4 {

	public static void main(String[] args) {
													//Create four instances of type Product
		Product prod1 = new Product("Egg",9,15);
		Product prod2 = new Product("Milk",20,30);
		Product prod3 = new Product("Bread",15,4);
		Product prod4 = new Product("Sugar",25,10);
													//Display the name and quantity of the most expensive item
		
		if (prod1.getPrice()>prod2.getPrice()& prod1.getPrice()>prod3.getPrice()& prod1.getPrice()>prod4.getPrice())
			System.out.println("The name of most instances product - Egg &"+ " Quality is 5");
		if(prod2.getPrice()>prod1.getPrice()& prod2.getPrice()>prod3.getPrice()& prod2.getPrice()>prod4.getPrice())
			System.out.println("The name of most instances product - Milk &"+ " Quality is 3");
		if(prod3.getPrice()>prod1.getPrice()& prod3.getPrice()>prod2.getPrice()& prod3.getPrice()>prod4.getPrice())
			System.out.println("The name of most instances product - Bread &"+ " Quality is 4");
		if(prod4.getPrice()>prod1.getPrice()& prod4.getPrice()>prod2.getPrice()& prod4.getPrice()>prod3.getPrice())
			System.out.println("The name of most instances product - Sugar &"+ " Quality is 15");
		
													//Display the name of the items, which has the biggest quantity
		if (prod1.getQualytity()>prod2.getQualytity()& prod1.getQualytity()>prod3.getQualytity()& prod1.getQualytity()>prod4.getQualytity())
			System.out.println("The biggest qualitity has Egg");
		if (prod2.getQualytity()>prod1.getQualytity()& prod2.getQualytity()>prod3.getQualytity()& prod2.getQualytity()>prod4.getQualytity())
			System.out.println("The biggest qualitity has Milk");
		if (prod3.getQualytity()>prod1.getQualytity()& prod3.getQualytity()>prod2.getQualytity()& prod3.getQualytity()>prod4.getQualytity())
				System.out.println("The biggest qualitity has Bread");
		if (prod4.getQualytity()>prod1.getQualytity()& prod4.getQualytity()>prod2.getQualytity()& prod4.getQualytity()>prod3.getQualytity())
			System.out.println("The biggest qualitity has Sugar");
	}

}
