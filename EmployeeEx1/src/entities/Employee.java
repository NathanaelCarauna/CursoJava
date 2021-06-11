package entities;

public class Employee {
	String name;
	double grossSalary;
	double tax;
	
	public double netSalary() {
		return grossSalary - tax;
	}
	
	public void increaseSalary(double percentage) {
		this.grossSalary *= 1+(percentage/100);
	}

	/**
	 * @param name
	 * @param grossSalary
	 * @param tax
	 */
	public Employee(String name, double grossSalary, double tax) {
		super();
		this.name = name;
		this.grossSalary = grossSalary;
		this.tax = tax;
	}
	
	public String toString() {
		return String.format("Employee: %s, $ %.2f\n", name, netSalary());
	}
	
}
