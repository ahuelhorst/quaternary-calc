import java.lang.constant.Constable;

public class Calculator {
    Convertor convertor = new Convertor();

    public int add(String num1, String num2){
        int newNum1 = convertor.convert(num1);
        int newNum2 = convertor.convert(num2);
        return convertor.revert(newNum1 + newNum2);
    }
    public int divide(String num1, String num2){
        int newNum1 = convertor.convert(num1);
        int newNum2 = convertor.convert(num2);
        return convertor.revert(newNum1/newNum2);
    }
    public int subtract(String num1, String num2){
        int newNum1 = convertor.convert(num1);
        int newNum2 = convertor.convert(num2);
        return convertor.revert(newNum1 - newNum2);
    }
    public int multiply(String num1, String num2){
        int newNum1 = convertor.convert(num1);
        int newNum2 = convertor.convert(num2);
        return convertor.revert(newNum1 * newNum2);
    }

    public int square(String num1){
        int newNum1 = convertor.convert(num1);
        return convertor.revert(newNum1*newNum1);
    }

    public Constable squareRoot(String num1){
        int newNum1 = convertor.convert(num1);
        double sqrtRaw = Math.sqrt(newNum1);
        int tst = (int)(sqrtRaw + 0.5);
        if (tst*tst == newNum1){
            return convertor.revert(tst);
        }
        else{
            return null;
        }
    }
}
