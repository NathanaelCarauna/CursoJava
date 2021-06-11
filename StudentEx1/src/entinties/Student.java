package entinties;

public class Student {
	double nota1;
	double nota2;
	double nota3;

	public Student(double nota1, double nota2, double nota3) {
		this.nota1 = nota1;
		this.nota2 = nota2;
		this.nota3 = nota3;
	}

	public double finalGrade() {
		return nota1 + nota2 + nota3;
	}	
}
