package refactoringNeed;

public class Product {

    private String name;
    private double price;
    private int quantity;

    public Product(String n, double p, int q) {
        name = n;
        price = p;
        quantity = q;
    }

    public void display() {
        System.out.println("Product: " + name);
        System.out.println("Price: $" + price);
        System.out.println("Quantity: " + quantity);
    }

    public double calculateTotal() {
        double total = price * quantity;
        return total;
    }

}
