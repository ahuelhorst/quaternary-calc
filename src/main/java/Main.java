import java.lang.constant.Constable;

public class Main {
    Calculator calculator = new Calculator();

    //takes math expression(String) as param and returns answer(int)
    public int calculateExpression(String num1, String operator, String num2) {
        int answer = 0;
        if (operator.equals("+")) {
            answer = calculator.add(num1, num2);
        }
        if (operator.equals("-")) {
            answer = calculator.subtract(num1, num2);
        }
        if (operator.equals("*")) {
            answer = calculator.multiply(num1, num2);
        }
        if (operator.equals("/")) {
            answer = calculator.divide(num1, num2);
        }
        if (operator.equals("X\u00B2")) {
            answer = calculator.square(num1);
        }
        /*if (operator.equals("\u221A")) {
            answer = calculator.squareRoot(num1);
        }*/
        return answer;
    }

}



