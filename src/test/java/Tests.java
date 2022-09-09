import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.Assertions;

import java.io.IOException;

public class Tests {

    Convertor converter = new Convertor();

    @Test
    public void covertTest() throws IOException {
        int decimal = converter.convert("123");
        Assertions.assertEquals(decimal,27);
    }
}
