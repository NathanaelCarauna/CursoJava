package application;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

import application.entities.ImportedProduct;
import application.entities.Product;
import application.entities.UsedProduct;

public class Program {
	public static void main(String[] args) throws ParseException {
		Scanner sc = new Scanner(System.in);
		int productsQty;
		double price, fee;
		String name, manufactureDate;
		char type;
		List<Product> productList = new ArrayList<Product>();
		SimpleDateFormat sdf = new SimpleDateFormat("dd/MM/yyyy");

		System.out.print("Enter the number of products: ");
		productsQty = sc.nextInt();
		for (int i = 0; i < productsQty; i++) {
			System.out.println("Product #" + (i + 1) + " data:");
			System.out.print("Common, used or imported (c,u,i): ");
			type = sc.next().charAt(0);
			System.out.print("Name: ");
			name = sc.next();
			System.out.print("Price: $ ");
			price = sc.nextDouble();
			Product product;
			if(type == 'u') {
				System.out.print("Manucture date (DD/MM/YYYY): ");
				manufactureDate = sc.next();
				product = new UsedProduct(name, price, sdf.parse(manufactureDate));
			}
			else if (type == 'i') {
				System.out.print("Customs fee: $ ");
				fee = sc.nextDouble();
				product = new ImportedProduct(name, price, fee);
			} else {
				product = new Product(name, price);				
			}
			productList.add(product);			
			System.out.println();
		}
		System.out.println("PRICE TAGS:");
		for(var p : productList) {
			System.out.println(p.priceTag());
		}
		sc.close();
	}
}
