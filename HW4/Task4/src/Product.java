								//Create class Product with fields name, price and quantity.

public class Product {
	private String name;
	private int price;
	private int qualytity;
	
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public int getPrice() {
		return price;
	}
	public void setPrice(int price) {
		this.price = price;
	}
	public int getQualytity() {
		return qualytity;
	}
	public void setQualytity(int qualytity) {
		this.qualytity = qualytity;
	}
	
	public Product() {
		
	}

	 public Product (String name, int price, int qualytity) {
		this.name = name;
		this.price = price;
		this.qualytity = qualytity;
	}
	 public void print() {
		 
	 }
}
