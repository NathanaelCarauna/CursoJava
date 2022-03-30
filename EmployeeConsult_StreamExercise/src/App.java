import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.File;
import java.io.FileReader;
import java.io.FileWriter;
import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;
import java.util.Scanner;

import javax.swing.filechooser.FileSystemView;

public class App {
    public static void main(String[] args) throws Exception {

        String fileStr = FileSystemView.getFileSystemView().getDefaultDirectory().getPath() + "\\in.txt";
        File file = new File(fileStr);
        file.createNewFile();
        Scanner sc = new Scanner(System.in);
        double salary;
        List<Employee> employeeList = new ArrayList<>();

        try (BufferedWriter bw = new BufferedWriter(new FileWriter(file));) {

            bw.write("Maria,maria@gmail.com,3200.00\n");
            bw.write("Alex,alex@gmail.com,1900.00\n");
            bw.write("Marco,marco@gmail.com,1700.00\n");
            bw.write("Bob,bob@gmail.com,3500.00\n");
            bw.write("Anna,anna@gmail.com,2800.00\n");

        } catch (Exception e) {
            System.out.println("Error: " + e);
        }
        try (BufferedReader br = new BufferedReader(new FileReader(fileStr));) {
            var line = br.readLine();
            while (line != null) {
                var entry = line.split(",");
                employeeList.add(new Employee(entry[0], entry[1], Double.parseDouble(entry[2])));
                line = br.readLine();
            }

            System.out.print("Enter salary: ");
            salary = sc.nextDouble();
            Comparator<String> comparator = (email1, email2) -> email1.compareTo(email2);
            List<String> filteredListBySalary = employeeList.stream()
                    .filter(emp -> emp.getSalary() > salary)
                    .map(emp -> emp.getEmail())
                    .sorted(comparator.reversed())
                    .toList();
            
            System.out.println("Email of people whose salary is more than " + salary);
            filteredListBySalary.forEach(System.out::println);
            
            double salarySum = employeeList.stream()
            .filter(emp -> emp.getName().toUpperCase().charAt(0) == 'M')
            .map(obj -> obj.getSalary())
            .reduce(0.0, (s1, s2) -> s1 + s2);
            System.out.println("Sum of salary of people whose name starts with 'M': " + String.format("%.2f",salarySum));
            
        } catch (Exception e) {
            System.out.println(e);
        }

    }
}
