
public class ProductAppl {

	public static void main(String[] args) {

		Product nutella = new Product("Nutella", 20, 43);
		System.out.println(nutella.toString());
		Product snickers = new Product("Snickers", 15, 35);
		System.out.println(snickers.toString());
		Product raffaello = new Product("Raffaello", 30, 40);
		System.out.println(raffaello.toString());

		// Choosing the highest price of product.
		raffaello.mostExp(nutella.getPrice(), snickers.getPrice());
		nutella.mostExp(raffaello.getPrice(), snickers.getPrice());

		// Choosing the highest quantity of products.
		nutella.bigQuant(snickers.getQuantity(), raffaello.getQuantity());
		snickers.bigQuant(nutella.getQuantity(), raffaello.getQuantity());

	}

}
