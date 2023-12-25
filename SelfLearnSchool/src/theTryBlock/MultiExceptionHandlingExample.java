package theTryBlock;

public class MultiExceptionHandlingExample {

    public static void main(String[] args) {
        try {
            // Some code that may throw an exception
            int result = divide(10, -0);
            System.out.println("Result: " + result);
        } catch (ArithmeticException e) {
            // Handle ArithmeticException
            System.out.println("ArithmeticException caught: " + e.getMessage());
        } catch (NullPointerException e) {
            // Handle NullPointerException
            System.out.println("NullPointerException caught: " + e.getMessage());
        } catch (Exception e) {
            // Handle any other type of exception
            System.out.println("Generic Exception caught: " + e.getMessage());
        } finally {
            // Code in this block will always be executed, regardless of whether an exception occurred or not
            System.out.println("Finally block executed");
        }
    }

    // A method that may throw an exception
    private static int divide(int numerator, int denominator) {
        // Simulating a NullPointerException
        String str = null;
        str.length(); // This will throw a NullPointerException
        return numerator / denominator;
    }
}
