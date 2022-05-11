package calculator;

public class OperatorMultiplication implements Operator {
    public String calculate(int number1, int number2) {
        return String.valueOf(number1 * number2);
    }
}