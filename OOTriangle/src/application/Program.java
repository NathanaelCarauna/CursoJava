package application;

import java.util.Locale;
import java.util.Scanner;

import entities.Rectangle;

public class Program {

	public static void main(String[] args) {
		Rectangle rec;
		Scanner sc = new Scanner(System.in);
		Locale.setDefault(Locale.US);
		
		System.out.println("Enter rectangle width and height");
		double width = sc.nextDouble();
		double heigth = sc.nextDouble();
		rec = new Rectangle(width, heigth);
		
		System.out.printf("AREA = %.2f\n", rec.area());
		System.out.printf("PERIMETER = %.2f\n", rec.perimeter());
		System.out.printf("DIAGONAL = %.2f\n", rec.diagonal());
		sc.close();
	}

}
