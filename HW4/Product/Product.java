
public class Product {
	private String name;
	private double price;
	private int quantity;

	public void mostExp(double b, double c) {
		if ((this.price > b) && (this.price > c)) {
			System.out.println(this.name + " is most expensive item in store and its quantity = " + this.quantity);
		} else {
			System.out.println("Yor item is not most expensive, try to chose other product.");
		}
	}
	
	public void bigQuant(int b, int c) {
		if((this.quantity>b)&&(this.quantity>c)) {System.out.println(this.name +" has bigest quantity = "+this.quantity+" and his price is = "+this.price);}
		else {System.out.println("Your product has less quantity. Chose another.");}
	}

	public Product() {
	}

	public Product(String name) {
		super();
		this.name = name;
	}

	public Product(String name, double price) {
		super();
		this.name = name;
		this.price = price;
	}

	public Product(String name, double price, int quantity) {
		super();
		this.name = name;
		this.price = price;
		this.quantity = quantity;
	}

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

	@Override
	public String toString() {
		return "Product [name=" + name + ", price=" + price + ", quantity=" + quantity + "]";
	}

}
