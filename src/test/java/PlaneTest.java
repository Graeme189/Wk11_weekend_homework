import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class PlaneTest {

    private Plane plane;

    @Before
    public void setUp(){
        plane = new Plane(PlaneType.CONCORDE);
    }

    @Test
    public void planeHasType(){
        assertEquals(PlaneType.CONCORDE, plane.getType());
    }

    @Test
    public void planeHasCapacity(){
        assertEquals(100, plane.getCapacityFromEnum());
    }

    @Test
    public void planeHasWeight(){
        assertEquals(3000, plane.getWeightFromEnum());
    }

}
