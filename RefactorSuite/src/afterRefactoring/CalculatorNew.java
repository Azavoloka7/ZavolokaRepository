package afterRefactoring;

public class CalculatorNew {

    private final int operand1;
    private final int operand2;

    public CalculatorNew(int operand1, int operand2) {
        this.operand1 = operand1;
        this.operand2 = operand2;
    }

    public String toString() {
        return "CalculatorNew{" +
                "operand1=" + operand1 +
                ", operand2=" + operand2 +
                '}';
    }
    public int add() {
        return operand1 + operand2;
    }

    public int subtract() {
        return operand1 - operand2;
    }

    public int multiply() {
        return operand1 * operand2;
    }

    public double divide() {
        if (operand2 != 0) {
            return (double) operand1 / operand2;
        } else {
            System.out.println("Error: Division by zero.");
            return 0;
        }
    }

}
