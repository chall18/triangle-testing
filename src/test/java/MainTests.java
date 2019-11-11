import org.junit.Test;

import static junit.framework.Assert.assertEquals;

public class MainTests {

    Main m = new Main();
    @Test
    public void testIfSidesGiven(){
        assertEquals(m.ifSidesGiven(0,0,0), "Triangle type is: invalid");
        assertEquals(m.ifSidesGiven(-1,5,10), "Triangle type is: invalid");
        assertEquals(m.ifSidesGiven(3,4,5), "Triangle type is: scalene right");
        assertEquals(m.ifSidesGiven(10,20,20), "Triangle type is: isoceles");
        assertEquals(m.ifSidesGiven(0,0,0), "Triangle type is: invalid");
        assertEquals(m.ifSidesGiven(5,5,5), "Triangle type is: equilateral");
    }

    @Test
    public void testIfPointsGiven(){

        Point negativeA = new Point(-1,-10);
        Point negativeB = new Point(-7,-78);
        Point halfA = new Point(-1,10);

        assertEquals(m.ifPointsGiven(negativeA, negativeB, halfA), "Triangle type is: scalene");
        assertEquals(m.ifPointsGiven(negativeA, negativeA, negativeA), "Triangle type is: invalid");
    }

    @Test
    public void testMain(){
        Main m = new Main();
        m.main(null);
    }
}
