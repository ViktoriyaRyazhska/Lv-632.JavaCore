package lesson004d;

import java.util.ArrayList;
import java.util.List;

public class Appl {

	public static void main(String[] args) {

		Product coffee01 = new Product("Jacobs Brazil Instant Coffee", 120.50, 802);
		Product coffee02 = new Product("Chorna Karta Espresso Coffee Beans", 202.40, 515);
		Product coffee03 = new Product("Dallmayr Via Verde Espresso Coffee beans", 579.90, 180);
		Product coffee04 = new Product("Trablit Coffee Extract", 1699.90, 60);

		List<Product> arrProduct = new ArrayList<Product>();
		arrProduct.add(coffee01);
		arrProduct.add(coffee02);
		arrProduct.add(coffee03);
		arrProduct.add(coffee04);

		Product mostExp = null;
		Product biggestQuantity = null;
		for (Product m : arrProduct) {
			if (mostExp != null || biggestQuantity != null) {
				mostExp = Product.mostExpProd(m, mostExp);
				biggestQuantity = Product.biggestQuantityProd(m, biggestQuantity);
			} else {
				mostExp = m;
				biggestQuantity = m;
			}
		}
		System.out.println("Name of the most expensive of product:=> " + mostExp.getName());
		System.out.println("Quantity: " + mostExp.getQuantity() + " packs of coffee\n");
		System.out.println("Name of biggest quantity of product:=> " + biggestQuantity.getName());
		System.out.println("Quantity: " + biggestQuantity.getQuantity() + " packs of coffee");
	}
}