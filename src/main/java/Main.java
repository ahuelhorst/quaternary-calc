public class Main {
    Calculator calculator = new Calculator();

    //takes math expression(String) as param and returns answer(int)
    public int calculateExpression(String num1, String operator, String num2) {
        Integer answer = 0;
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
        return answer;
    }

    public int square(String num1, String operator){
        int answer = 0;
        if (operator == "square"){
            answer = calculator.square(num1);
        }
        return answer;
    }

}



