public class Product {
    String name;
    double price;
    int quantity;

    /**
     * @param name
     * @param price
     * @param quantity
     */
    public Product(String name, double price, int quantity) {
        this.name = name;
        this.price = price;
        this.quantity = quantity;
    }

    public double total(){
        return price * quantity;
    }

    /**
     * @return the name
     */
    public String getName() {
        return name;
    }
    

}
