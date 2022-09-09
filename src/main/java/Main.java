public class Main {
    Calculator calculator = new Calculator();

    //takes math expression(String) as param and returns answer(int)
    public int calculateExpression(String input) {
        String[] arr = input.split("[-|+|*|/]"); //split input into the two numbers b/w operator
        String num1 = arr[0];
        String num2 = arr[1];
        int answer = 0; //initialize answer
        char[] chars = input.toCharArray(); //make string input a char array to get operator
        for (char ch : chars) {
            if (ch == '+') {
                answer = calculator.add(num1, num2);
            }
            if (ch == '-') {
                answer = calculator.subtract(num1, num2);
            }
            if (ch == '*') {
                answer = calculator.multiply(num1, num2);
            }
            if (ch == '/') {
                answer = calculator.divide(num1, num2);
            }
        }
        return answer;
    }

}



