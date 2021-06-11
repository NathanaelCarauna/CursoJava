package application;

import java.util.Scanner;

import entinties.Student;

public class Program {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		Student student;
		
		System.out.println("Enter student name:");
		String name = sc.next();
		System.out.println("Nota1:");
		int nota1 = sc.nextInt();
		System.out.println("Nota2:");
		int nota2 = sc.nextInt();
		System.out.println("Nota3:");
		int nota3 = sc.nextInt();
		
		student = new Student(nota1, nota2, nota3);
		
		System.out.printf("FINAL GRADE %.2f\n", student.finalGrade());
		if(student.finalGrade() < 60) {
			System.out.println("FAILED");
			System.out.printf("MISSING %.2f POINTS", (60 - student.finalGrade()));
		}
		else {
			System.out.println("PASS");
		}
		sc.close();

	}

}
