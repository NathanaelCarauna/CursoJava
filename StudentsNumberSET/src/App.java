import java.util.HashSet;
import java.util.Scanner;
import java.util.Set;

public class App {
    public static void main(String[] args) throws Exception {
        Scanner sc = new Scanner(System.in);
        int qtStudent;
        
        Set<Student> courseA = new HashSet<>();
        Set<Student> courseB = new HashSet<>();
        Set<Student> courseC = new HashSet<>();
        System.out.print("How many students for course A? ");
        qtStudent = sc.nextInt();
        for (int i = 0; i < qtStudent; i++) {
            courseA.add(new Student(sc.nextInt()));
        }
        System.out.print("How many students for course B? ");
        qtStudent = sc.nextInt();
        for (int i = 0; i < qtStudent; i++) {
            courseB.add(new Student(sc.nextInt()));
        }
        System.out.print("How many students for course C? ");
        qtStudent = sc.nextInt();
        for (int i = 0; i < qtStudent; i++) {
            courseC.add(new Student(sc.nextInt()));
        }
        courseB.addAll(courseC);
        courseA.addAll(courseB) ;
        System.out.println("Total students: " + courseA.size());
    }
}
