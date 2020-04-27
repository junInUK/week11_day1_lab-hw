import org.junit.Test;
import org.junit.Before;

import static org.junit.Assert.assertEquals;

public class CalculatorTest {
    Calculator calculator;

    @Before
    public void before(){
        calculator = new Calculator();
    }

    @Test
    public void add(){
        int result = calculator.add(1,3);
        assertEquals(4,result);
    }

    @Test
    public void subtract(){
        int result = calculator.subtract(4,2);
        assertEquals(2,result);
    }

    @Test
    public void multiply(){
        int result = calculator.multiply(2,3);
        assertEquals(6,result);
    }

    @Test
    public void divide(){
        int result = calculator.divide(6,2);
        assertEquals(3,result);
    }
}
