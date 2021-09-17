package application;

import java.util.Scanner;

import application.model.Client;
import application.model.Hotel;

public class Program {
	public static void main(String[] args) {
		int roomsQte, roomNumber;
		String name, email;
		Scanner sc = new Scanner(System.in);
		Hotel hotel = new Hotel(10);
		
		System.out.print("How many rooms will be rented? ");
		roomsQte = sc.nextInt();
		for(int i = 0; i< roomsQte; i++) {
			sc.nextLine();
			System.out.printf("Rent #%d: \n", (i+1));
			System.out.print("Name: ");
			name = sc.nextLine();
			System.out.print("Email: ");
			email = sc.nextLine();
			System.out.print("Room: ");
			roomNumber = sc.nextInt();
			Client client = new Client(name, email);
			try {
				hotel.Rent(roomNumber, client);
			} catch (Exception e) {
				e.printStackTrace();
			}
			System.out.println();
		}		
		hotel.Print();
		sc.close();
	}
}
