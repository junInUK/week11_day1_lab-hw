import org.junit.Test;
import org.junit.Before;

import static org.junit.Assert.assertEquals;

public class WaterBottleTest {
    WaterBottle waterBottle;

    @Before
    public void before(){
        waterBottle = new WaterBottle();
    }

    @Test
    public void drink(){
        waterBottle.drink();
        assertEquals(90,waterBottle.getVolume());
    }

    @Test
    public void empty(){
        waterBottle.empty();
        assertEquals(0,waterBottle.getVolume());
    }

    @Test
    public void fill(){
        waterBottle.fill();
        assertEquals(100,waterBottle.getVolume());
    }

}
