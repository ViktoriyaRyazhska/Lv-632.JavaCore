package lesson004d;

public class Product {
	private String name;
	private double price;
	private int quantity;

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public double getPrice() {
		return price;
	}

	public void setPrice(double price) {
		this.price = price;
	}

	public int getQuantity() {
		return quantity;
	}

	public void setQuantity(int quantity) {
		this.quantity = quantity;
	}

	public Product(String name, double price, int quantity) {
		this.name = name;
		this.price = price;
		this.quantity = quantity;
	}

	public Product() {
	}

	@Override
	public String toString() {
		return "Product [name=" + name + ", price=" + price + ", quantity=" + quantity + "]";
	}

	public static Product mostExpProd(Product b, Product c) {
		if (b.getPrice() > c.getPrice()) {
			return b;
		}
		return c;
	}

	public static Product biggestQuantityProd(Product b, Product c) {
		if (b.getQuantity() > c.getQuantity()) {
			return b;
		}
		return c;
	}
}
