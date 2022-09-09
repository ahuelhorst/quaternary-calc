import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.Assertions;

public class Tests {

    Convertor converter = new Convertor();
    Calculator calculator = new Calculator();
    Main main = new Main();

    //Convertor methods
    @Test
    public void convertTest(){
        int decimal = converter.convert("123");
        Assertions.assertEquals(decimal,27);
    }

    @Test
    public void revertTest(){
        int base4 = converter.revert(27);
        Assertions.assertEquals(base4,123);
    }

    //Calculator methods
    @Test
    public void squareTest(){
        int sqa = calculator.square("12");
        Assertions.assertEquals(210,sqa);
    }

    @Test
    public void addTest(){
        int sum = calculator.add("2","2");
        Assertions.assertEquals(10,sum);
    }

    @Test
    public void divideTest(){
        int ans = calculator.divide("210","12");
        Assertions.assertEquals(12,ans);
    }

    @Test
    public void subtractTest(){
        int ans = calculator.subtract("12","3");
        Assertions.assertEquals(3,ans);
    }

    @Test
    public void multiplyTest(){
        int ans = calculator.multiply("3","5");
        Assertions.assertEquals(33,ans);
    }

//    @Test
//    public void squareRootTest(){
//        int sqrt = calculator.squareRoot("21");
//        Assertions.assertEquals(3,sqrt);
//    }

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
