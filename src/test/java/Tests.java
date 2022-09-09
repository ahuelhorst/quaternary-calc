import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.Assertions;

public class Tests {

    Convertor converter = new Convertor();
    Calculator calculator = new Calculator();
    Main main = new Main();

    //Convertor methods
    @Test
    public void convertTest(){
        int decimal = converter.convert("123"); // base4
        Assertions.assertEquals(decimal,27); // base10
    }

    @Test
    public void revertTest(){
        int base4 = converter.revert(27); // base10
        Assertions.assertEquals(base4,123); // base4
    }

    //Calculator methods
    @Test
    public void squareTest(){
        int sqa = calculator.square("12"); // 6 base10
        Assertions.assertEquals(210,sqa); // 36 base10
    }

    @Test
    public void addTest(){
        int sum = calculator.add("2","2"); // 2 base4
        Assertions.assertEquals(10,sum); // 4 base4
    }

    @Test
    public void divideTest(){
        int ans = calculator.divide("210","12"); // 36/6 base10
        Assertions.assertEquals(12,ans); // 6 base10
    }

    @Test
    public void subtractTest(){
        int ans = calculator.subtract("12","3"); // 6-3 base 10
        Assertions.assertEquals(3,ans); // 3 base 10
    }

    @Test
    public void multiplyTest(){
        int ans = calculator.multiply("3","11"); // 3 and 5 base4
        Assertions.assertEquals(33,ans); // 15 base10
    }

    @Test
    public void squareRootTest(){
        //sqrt of 9=3?
        int sqrt = (int) calculator.squareRoot("21"); // 21 base4 = 9 base10
        Assertions.assertEquals(3,sqrt);
    }

    @Test
    public void squareRootTest2(){
        //sqrt of 16=4?
        int sqrt = (int) calculator.squareRoot("100"); // 100 base4 = 16 base10
        Assertions.assertEquals(10,sqrt); // 10 base4 = 4 base10
    }

    //Main method
    @Test
    public void calcExpressionsAdditionTest(){
        int expected = 12;
        int actual = main.calculateExpression("10+2");
        Assertions.assertEquals(expected,actual);
    }

    @Test
    public void calcExpressionsSubtractTest(){
        int expected = 12;
        int actual = main.calculateExpression("20-2");
        Assertions.assertEquals(expected,actual);
    }

    @Test
    public void calcExpressionsMultiplyTest(){
        int expected = 12;
        int actual = main.calculateExpression("3*2");
        Assertions.assertEquals(expected,actual);
    }

    @Test
    public void calcExpressionsDivisionTest(){
        int expected = 3;
        int actual = main.calculateExpression("12/2");
        Assertions.assertEquals(expected,actual);
    }
}
