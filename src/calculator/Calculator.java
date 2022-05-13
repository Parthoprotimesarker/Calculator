package calculator;

public class Calculator {
    public static void main(String[] args) {
        int number1 = 2;
        int number2 = 5;
        int number3 = 10;
        Operator operator = OperatorFactory.createOperator("+");
        System.out.println(operator.calculate(number1, number2));
        Operator operator1 = OperatorFactory.createOperator("-");
        System.out.println(operator1.calculate(number1, number2));
        Operator operator2 = OperatorFactory.createOperator("*");
        System.out.println(operator2.calculate(number1, number2));
        Operator operator3 = OperatorFactory.createOperator("/");
        System.out.println(operator3.calculate(number1, number2));
        Operator operator4 = OperatorFactory.createOperator("%");
        System.out.println(operator4.calculate(number1, number2));
    }
}