import java.lang.constant.Constable;

public class Main {
    Calculator calculator = new Calculator();

    //takes math expression(String) as param and returns answer(int)
    public Constable calculateExpression(String num1, String operator, String num2) {
        Constable answer = 0;
        if (operator == "+") {
            answer = calculator.add(num1, num2);
        }
        if (operator == "-") {
            answer = calculator.subtract(num1, num2);
        }
        if (operator == "*") {
            answer = calculator.multiply(num1, num2);
        }
        if (operator == "/") {
            answer = calculator.divide(num1, num2);
        }
        if (operator == "X\u00B2") {
            answer = calculator.square(num1);
        }
        if (operator == "\u221A") {
            answer = calculator.squareRoot(num1);
        }
        return answer;
    }

}



