import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.util.ArrayList;

public class App {
    public static void main(String[] args) throws Exception {
        try (
                BufferedReader bufferedReader = new BufferedReader(new FileReader("./resource/in/source.csv"));
                BufferedWriter bufferedWriter = new BufferedWriter(new FileWriter("./resource/out/summary.csv"));) {

            ArrayList<Product> productList = new ArrayList<>();
            String line = bufferedReader.readLine();
            while (line != null) {
                String[] fields = line.split(",");
                String name = fields[0];
                double price = Double.parseDouble(fields[1]);
                int quantity = Integer.parseInt(fields[2]);
                productList.add(new Product(name, price, quantity));
                line = bufferedReader.readLine();
            }
            productList.forEach(
                    product -> {
                        try {
                            bufferedWriter.write(String.format("%s,%.2f\n", product.name, product.total()));
                        } catch (IOException e) {
                            e.printStackTrace();
                        }
                    });

        } catch (IOException e) {
            System.out.println("Error: " + e.getMessage());
        } catch (Exception e) {
            System.out.println("Unknown error: " + e.getMessage());
        }
    }
}
