package application;

import java.util.Scanner;

import application.entities.Employee;
import application.service.EmployeeService;

public class Program {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		EmployeeService employeeService = new EmployeeService();
		int employeesNumber, percentage, id;
		String name;
		Double salary;
		System.out.print("How many employees will be registered? ");
		employeesNumber = sc.nextInt();

		for (int i = 0; i < employeesNumber; i++) {
			sc.nextLine();
			System.out.printf("Employee #%d:%n", i + 1);
			System.out.print("Id: ");
			id = sc.nextInt();
			sc.nextLine();
			System.out.print("Name: ");
			name = sc.nextLine();
			System.out.print("Salary: $ ");
			salary = sc.nextDouble();			
			System.out.println();
			try {
				employeeService.addEmployee(new Employee(id, name, salary));
			} catch (Exception e) {			
				e.printStackTrace();
			}
		}
		
		System.out.print("Enter the employee id thaw will have salary increased: ");
		id = sc.nextInt();
		Employee retrieveEmployee = employeeService.retrieveEmployee(id);
		if(retrieveEmployee == null) {
			System.out.println("This id does not exists");
		}else {
			System.out.print("Enter the percentage: ");
			percentage = sc.nextInt();
			employeeService.increaseSalary(retrieveEmployee, percentage);
		}
		employeeService.Print();
		sc.close();
	}
}
