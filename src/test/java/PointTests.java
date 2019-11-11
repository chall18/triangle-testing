import org.junit.Test;

import static junit.framework.Assert.assertEquals;
import static junit.framework.Assert.assertTrue;
import static org.junit.Assert.*;

public class PointTests {

    private Point negativeA = new Point(-1,-10);
    private Point negativeB = new Point(-7,-78);

    private Point halfA = new Point(-1,10);
    private Point halfB = new Point(-7,78);
    private Point halfC = new Point(1,-10);
    private Point halfD = new Point(7,-78);

    private Point positiveA = new Point(1,10);
    private Point positiveB = new Point(7,78);

    @Test
    public void testCheckIfValidPoints(){
        Point equalxA = new Point(0,0);
        Point equalxB = new Point(0,1);
        Point equalxC = new Point(0, 40);
        Point equalyA = new Point(5,5);
        Point equalyB = new Point(10, 5);
        Point equalyC = new Point(15,5);

        Point validA = new Point(0,5);
        Point validB = new Point(10,12);
        Point validC = new Point(4,23);

        Point p = new Point();
        assertFalse(p.checkIfValidPoints(equalxA, equalxB, equalxC));
        assertFalse(p.checkIfValidPoints(equalyA, equalyB, equalyC));
        assertTrue(p.checkIfValidPoints(validA, validB, validC));
    }

    @Test
    public void testFindSideLength(){

        Point p = new Point();
        assertEquals(p.findSideLength(negativeA, negativeB), 68.2642, 4);
        assertEquals(p.findSideLength(halfA, halfB), 68.2642, 4);
        assertEquals(p.findSideLength(halfA, halfD), 88.3629, 4);
        assertEquals(p.findSideLength(halfC, halfB), 88.3629, 4);
        assertEquals(p.findSideLength(positiveA, positiveB), 68.2642, 4);
        assertEquals(p.findSideLength(positiveA, negativeB), 88.3629, 4);
        assertEquals(p.findSideLength(negativeA, positiveB), 88.3629, 4);
        assertEquals(p.findSideLength(positiveA, halfB), 68.469, 3);
        assertEquals(p.findSideLength(negativeA, halfB), 88.2043, 4);
    }

    @Test
    public void testPointWithPoints(){
        Point p = new Point(0,0);
        assertEquals(p.x, 0, 0);
        assertEquals(p.y, 0,0);
    }

    @Test
    public void testPointWithoutPoints(){
        Point p = new Point();
        assertTrue(p instanceof Point);
    }

    @Test
    public void testMakeTheSides(){
        Point []points = {negativeA, negativeB, positiveA};
        //0 to 1 = 68.2642
        //0 to 2 = 88.3629
        //1 to 2 = 88.3629
        Point p = new Point();
        double []result = {68.2642, 20.0998, 88.3629};
        assertEquals(p.makeTheSides(points)[0], result[0],4);
        assertEquals(p.makeTheSides(points)[1], result[1],4);
        assertEquals(p.makeTheSides(points)[2], result[2],4);
    }



}
