package application.service;

import java.util.ArrayList;
import java.util.List;

import application.entities.Employee;

public class EmployeeService {
	private List<Employee> employees;

	public EmployeeService() {
		this.employees = new ArrayList<>();
	}

	public void Print() {
		System.out.println("List of employees:");
		for (Employee e : employees) {
			System.out.println(e);
		}
	}

	public void addEmployee(Employee employee) throws Exception {
//		System.out.println(retrieveEmployee(employee.getId()));
		if (retrieveEmployee(employee.getId()) == null) {
			employees.add(employee);
		} else {
			throw new Exception(String.format("The id %d already exists", employee.getId()));
		}
	}

	public Employee retrieveEmployee(int id) {
		Employee employeeOnList = employees.stream().filter(x -> x.getId() == id).findFirst()
				.orElse(null);
		return employeeOnList;
	}

	public void increaseSalary(Employee employee, int percentage) {
		employee.increaseSalary(percentage);
//		employees.set(employees.indexOf(employee), employee);
	}
}
