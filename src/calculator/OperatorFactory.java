package calculator;

public class OperatorFactory {
    public static Operator createOperator(String operate) {
        switch (operate) {
            case "+":
                return new OperatorAdd();
            case "-":
                return new OperatorSubtraction();
            case "*":
                return new OperatorMultiplication();
            case "/":
                return new OperatorDivision();
            default:
                throw new UnsupportedOperationException(String.format("Unsupported operation type:%s", operate));
        }
    }
}