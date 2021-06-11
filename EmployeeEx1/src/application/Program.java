package application;

import java.util.Scanner;

import entities.Employee;

public class Program {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		Employee emp;
		
		System.out.print("Name: ");
		String name = sc.next();
		System.out.print("Gross salary: ");
		double salary = sc.nextDouble();
		System.out.print("Tax: ");
		double tax = sc.nextDouble();
		emp = new Employee(name, salary, tax);
		
		System.out.println(emp);
		
		System.out.print("Which percentage to increase salary? ");
		double percentage = sc.nextDouble();
		emp.increaseSalary(percentage);
		System.out.println(emp);
		sc.close();
	}

}
