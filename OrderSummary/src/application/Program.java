package application;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Scanner;

import entities.Client;
import entities.Order;
import entities.OrderItem;
import entities.Product;
import entities.enums.OrderStatus;

public class Program {
	public static void main(String[] args) throws ParseException {
		SimpleDateFormat sdf = new SimpleDateFormat("dd/MM/yyyy");
		Scanner sc = new Scanner(System.in);
		String nameProduct, nameClient, email, status;
		Date birthDate;
		int quantity, qtdItems;
		double price;
		Client client;
		Order order;

		System.out.println("Enter client data:");
		System.out.print("Name: ");
		nameClient = sc.nextLine();
		System.out.print("Email: ");
		email = sc.next();
		System.out.print("Birth date (dd/mm/yyyy): ");
		birthDate = sdf.parse(sc.next());
		client = new Client(nameClient, email, birthDate);
		
		System.out.println();
		System.out.println("Enter order data: ");
		System.out.print("Status: ");
		status = sc.next();
		order = new Order(client, OrderStatus.valueOf(status));
		
		System.out.print("How many items to this order? ");
		qtdItems = sc.nextInt();
		for (int i = 0; i < qtdItems; i++) {
			sc.nextLine();
			System.out.printf("Enter #%d item data: \n", i + 1);
			System.out.print("Product name: ");
			nameProduct = sc.nextLine();
			System.out.print("Product price: $");
			price = sc.nextDouble();
			System.out.print("Quantity:");
			quantity = sc.nextInt();
			Product product = new Product(nameProduct, price);
			OrderItem item = new OrderItem(quantity, product);
			order.addItem(item);
		}
		System.out.println();
		System.out.println("ORDER SUMMARY: ");
		System.out.println(order);

		sc.close();
	}
}
