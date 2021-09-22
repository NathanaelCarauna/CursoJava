package entities;

public class OrderItem {
	private int quantity;
	private double price;
	private Product product;

	public OrderItem(int quantity, Product product) {
		this.quantity = quantity;
		this.price = product.getPrice();
		this.product = product;
	}

	public OrderItem() {

	}

	public int getQuantity() {
		return quantity;
	}

	public void setQuantity(int quantity) {
		this.quantity = quantity;
	}

	public double getPrice() {
		return price;
	}

	public void setPrice(int price) {
		this.price = price;
	}

	public Product getProduct() {
		return product;
	}

	public void setProduct(Product product) {
		this.product = product;
	}

	public double subtotal() {		
		return quantity * price;
	}

	@Override
	public String toString() {
		return product + ", Quantity:" + quantity + ", Subtotal: $ " + String.format("%.2f", subtotal());
	}
	
	
}
