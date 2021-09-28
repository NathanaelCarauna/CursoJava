package application.entities;

public class ImportedProduct extends Product {

	private double fee;

	public ImportedProduct(String name, double price, double fee) {
		super(name, price);
		this.fee = fee;
	}

	public ImportedProduct(double fee) {
		this.fee = fee;
	}

	private double totalPrice() {
		return price + fee;
	}
	
	public double getFee() {
		return fee;
	}

	public void setFee(double fee) {
		this.fee = fee;
	}

	@Override
	public double getPrice() {	
		return totalPrice();
	}
	
	@Override
	public String priceTag() {
		return super.priceTag() + " (Customs fee: $" + String.format("%.2f", getFee()) + ")";
	}

}
