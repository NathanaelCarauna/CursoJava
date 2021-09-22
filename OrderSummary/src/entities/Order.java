package entities;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;

import entities.enums.OrderStatus;

public class Order {
	private Date moment;
	private OrderStatus status;
	private List<OrderItem> items = new ArrayList<OrderItem>();
	private Client client;
	
	private static SimpleDateFormat sdf = new SimpleDateFormat("dd/MM/yyyy HH:mm:ss");

	public Order() {

	}

	public Order(Client client, OrderStatus status) throws ParseException {
		this.moment = new Date();
		this.status = status;
		this.client = client;
	}

	public Date getMoment() {
		return moment;
	}

	public void setMoment(Date moment) {
		this.moment = moment;
	}

	public OrderStatus getStatus() {
		return status;
	}

	public void setStatus(OrderStatus status) {
		this.status = status;
	}

	public List<OrderItem> getItems() {
		return items;
	}

	public void addItem(OrderItem item) {
		this.items.add(item);
	}

	public void removeItem(OrderItem item) {
		this.items.remove(item);
	}

	public double total() {
		double total = 0;
		for (OrderItem item : items) {
			total += item.subtotal();
		}
		return total;
	}
	
	public String toString() {
		StringBuilder sb = new StringBuilder();
		sb.append("Order moment:" + sdf.format(moment));
		sb.append("\nOrder status: " + status);
		sb.append("\n" + client);
		for(OrderItem item : items) {
			sb.append("\n" + item);
		}
		sb.append("\nTotal price: $ " + String.format("%.2f", total()));
		return sb.toString();
	}
}
