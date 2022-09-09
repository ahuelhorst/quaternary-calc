import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.Assertions;

public class Tests {

    Convertor converter = new Convertor();
    Calculator calculator = new Calculator();

    @Test
    public void covertTest(){
        int decimal = converter.convert("123");
        Assertions.assertEquals(decimal,27);
    }

    @Test
    public void revertTest(){
        int base4 = converter.revert(27);
        Assertions.assertEquals(base4, 123);
    }

}
