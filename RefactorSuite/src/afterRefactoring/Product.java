package afterRefactoring;

import java.util.Objects;

public class Product {

    private String name;
    private double price;
    private final int quantity;

    public Product(String name, double price, int quantity) {
        this.name = name;
        this.price = price;
        this.quantity = quantity;
    }

    public void display() {
        System.out.println("Product: " + name);
        System.out.println("Price: $" + price);
        System.out.println("Quantity: " + quantity);
    }

    public double calculateTotal()
    {
        return price * quantity;
    }
    public String toString()
    {
        return "name="+name+"\nprice="+price+"\nquantity = "+quantity;
    }

    public boolean equals(Product product)
    {
        if (this.name.equals(product.name)&&this.price == product.price && this.quantity == product.quantity)
            return true;
        else
            return false;
    }

    public int hashCode()
    {

            return Objects.hash(name, price, quantity);
    }



    }


