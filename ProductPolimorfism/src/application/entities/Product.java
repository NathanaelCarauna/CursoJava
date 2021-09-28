package application.entities;

public class Product {

	protected double price;
	protected String name;

	public Product() {
	}

	public Product(String name, double price) {
		this.name = name;
		this.price = price;
	}

	public double getPrice() {
		return price;
	}

	public void setPrice(double price) {
		this.price = price;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}
	
	public String priceTag() {
		return name + ", $ " + String.format("%.2f", getPrice());
	}
}
