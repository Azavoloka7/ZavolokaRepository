package fullJava;

public class MathOperations {
    
    // Method to add two integers
    public int add(int a, int b) {
        return a + b;
    }

    // Method to add three integers
    public int add(int a, int b, int c) {
        return a + b + c;
    }

    // Method to add two doubles
    public double add(double a, double b) {
        return a + b;
    }

    // Method to multiply two integers
    public int multiply(int a, int b) {
        return a * b;
    }

    // Method to multiply two doubles
    public double multiply(double a, double b) {
        return a * b;
    }

    public static void main(String[] args) {
        MathOperations math = new MathOperations();

        // Calling the add methods with different parameter lists
        System.out.println("Sum of two integers: " + math.add(5, 10));
        System.out.println("Sum of three integers: " + math.add(5, 10, 15));
        System.out.println("Sum of two doubles: " + math.add(2.5, 3.5));

        // Calling the multiply methods with different parameter lists
        System.out.println("Product of two integers: " + math.multiply(4, 6));
        System.out.println("Product of two doubles: " + math.multiply(2.5, 3.5));
    }
}
