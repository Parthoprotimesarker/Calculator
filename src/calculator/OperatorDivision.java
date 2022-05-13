package calculator;

public class OperatorDivision implements Operator {
    public String calculate(int number1, int number2) {
        if (number2 == 0) {
            return "Divisor cannot be 0";
        } else {
            return String.valueOf(number1 / number2);
        }
    }
}
