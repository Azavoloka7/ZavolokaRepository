package theTryBlock;

public class ExceptionHandlingExample {

    public static void main(String[] args) {
        try {
            // Some code that may throw an exception
            int result = divide(100, 0);
            System.out.println("Result: " + result);
        } catch (ArithmeticException e) {
            // Handle the exception
            System.out.println("Exception caught: " + e.getMessage());
        } 
        finally {
            // Code in this block will always be executed, regardless of whether an exception occurred or not
            System.out.println("Finally block executed");
        }
    }

    // A method that may throw an exception
    private static int divide(int numerator, int denominator) {
        return numerator / denominator;
    }
}
