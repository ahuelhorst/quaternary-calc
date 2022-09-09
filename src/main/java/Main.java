public class Main {
    Convertor convertor = new Convertor();
    Calculator calculator = new Calculator();
    public int calculate(String input) {
        String[] arr = input.split("[\s+-]|[\s*]|/");
        String num1 = arr[0];
        String num2 = arr[1];
        int answer = 0;
        char[] chars = input.toCharArray();
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



