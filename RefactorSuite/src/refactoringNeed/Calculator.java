package refactoringNeed;

public class Calculator {
    public int a, b;

    public Calculator(int num1, int num2) {
        a = num1;
        b = num2;
    }

    public int add() {
        return a + b;
    }

    public int subtract() {
        return a - b;
    }

    public int multiply() {
        return a * b;
    }

    public int divide() {
        if (b != 0) {
            return a / b;
        } else {
            System.out.println("Error: Division by zero.");
            return 0;
        }
    }



}
