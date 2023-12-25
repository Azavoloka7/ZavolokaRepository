package chatGPT;

public class ExceptionHandlingExample {

    public static void main(String[] args) {
        ExceptionHandlingExample example = new ExceptionHandlingExample();
        example.divideNumbers(10, 0); // Division by zero, will throw an ArithmeticException
        example.handleArrayIndexOutOfBounds(); // Accessing an array out of bounds, will throw an ArrayIndexOutOfBoundsException
    }

    public void divideNumbers(int numerator, int denominator) {
        try {
            int result = numerator / denominator;
            System.out.println("Result of division: " + result);
        } catch (ArithmeticException e) {
            System.err.println("Error: Division by zero is not allowed.");
            e.printStackTrace();
        }
    }

    public void handleArrayIndexOutOfBounds() {
        try {
            int[] numbers = {1, 2, 3};
            int value = numbers[5]; // Accessing an element beyond the array size
            System.out.println("Value: " + value);
        } catch (ArrayIndexOutOfBoundsException e) {
            System.err.println("Error: Array index out of bounds.");
            e.printStackTrace();
        }
    }
}
