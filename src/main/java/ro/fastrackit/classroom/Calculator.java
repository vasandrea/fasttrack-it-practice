package ro.fastrackit.classroom;

public class Calculator {

    enum OperationType {
        ADD,
        SUBTRACT,
        MULTIPLY,
        DIVIDE
    }

    public void doOperation(double operator1, double operator2, OperationType operationType) {
        switch (operationType) {
            case ADD:
                System.out.println(operator1 + " + " + operator2 + " = " + (operator1 + operator2));
                break;
            case SUBTRACT:
                System.out.println(operator1 + " - " + operator2 + " = " + (operator1 - operator2));
                break;
            case MULTIPLY:
                System.out.println(operator1 + " * " + operator2 + " = " + (operator1 * operator2));
                break;
            case DIVIDE:
                System.out.println(operator1 + " / " + operator2 + " = " + (operator1 / operator2));
                break;
        }
    }

    public static void main(String[] args) {
        Calculator calculator = new Calculator();
        calculator.doOperation(1, 1, OperationType.ADD);
        calculator.doOperation(2, 1, OperationType.SUBTRACT);
        calculator.doOperation(2, 2, OperationType.MULTIPLY);
        calculator.doOperation(8, 4, OperationType.DIVIDE);
    }
}
