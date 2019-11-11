import org.junit.Test;
import org.junit.*;

import static junit.framework.Assert.assertEquals;
import static org.junit.Assert.*;


public class TriangleTests {

    public double []makeTestValueArrays(double v1, double v2, double v3){
        double tri[] = {v1,v2,v3};
        return tri;
    }

    @Test
    public void testRoundTheValues(){
        Triangle t = new Triangle();
        TriangleTests test = new TriangleTests();
        double [] input = test.makeTestValueArrays(1.234,2.345,3.456);
        double []answer = {1.23,2.35,3.46};
        double [] output = t.roundTheValues(input, 2);
        assertEquals(output[0], answer[0], 0);
        assertEquals(output[1], answer[1], 0);
        assertEquals(output[2], answer[2], 0);
    }

    @Test
    public void testThreeLikeSides(){
        Triangle t = new Triangle();
        TriangleTests test = new TriangleTests();
        double [] input = test.makeTestValueArrays(0,0,0);
        int answer = 3;
        int output = t.howManyLikeSides(input);
        assertEquals(answer, output);
    }

    @Test
    public void testTwoLikeSides()
    {
        Triangle t = new Triangle();
        TriangleTests test = new TriangleTests();
        double [] input = test.makeTestValueArrays(1,2,2);
        int answer = 1;
        int output = t.howManyLikeSides(input);
        assertEquals(answer, output);
    }

    @Test
    public void testNoLikeSides(){
        Triangle t = new Triangle();
        TriangleTests test = new TriangleTests();
        double [] input = test.makeTestValueArrays(3,4,5);
        int answer = 0;
        int output = t.howManyLikeSides(input);
        assertEquals(answer, output);
    }

    @Test
    public void testRightCheck(){
        Triangle t = new Triangle();
        TriangleTests test = new TriangleTests();
        double [] goodInput = test.makeTestValueArrays(3,4,5);
        double [] badInput = test.makeTestValueArrays(3,6,9);
        assertTrue(t.rightCheck(goodInput));
        assertFalse(t.rightCheck(badInput));
    }

    @Test
    public void testValidTriangleCheck(){
        Triangle t = new Triangle();
        TriangleTests test = new TriangleTests();
        double [] negativeTest = test.makeTestValueArrays(-1,10,20);
        double [] tooSmall = test.makeTestValueArrays(1,2,4);
        double [] tooSmall2 = test.makeTestValueArrays(4,1,2);
        double [] tooSmall3 = test.makeTestValueArrays(1,4,2);
        double [] validTriangle = test.makeTestValueArrays(3,4,5);
        assertFalse(t.validTriangleCheck(negativeTest));
        assertFalse(t.validTriangleCheck(tooSmall));
        assertFalse(t.validTriangleCheck(tooSmall2));
        assertFalse(t.validTriangleCheck(tooSmall3));
        assertTrue(t.validTriangleCheck(validTriangle));
    }

    @Test
    public void testTriangleType(){
        Triangle t = new Triangle();
        TriangleTests test = new TriangleTests();
        double [] rightScalene = test.makeTestValueArrays(3,4,5);
        double [] isoceles = test.makeTestValueArrays(10,20,20);
        double [] equilateral = test.makeTestValueArrays(5,5,5);
        double [] invalid = test.makeTestValueArrays(0,0,0);
        double [] isocelesRight = test.makeTestValueArrays(1,1,Math.sqrt(2));

        assertEquals(t.triangleType(rightScalene), "Triangle type is: scalene right");
        assertEquals(t.triangleType(isoceles), "Triangle type is: isoceles");
        assertEquals(t.triangleType(equilateral), "Triangle type is: equilateral");
        assertEquals(t.triangleType(invalid), "Triangle type is: invalid");
        assertEquals(t.triangleType(isocelesRight), "Triangle type is: isoceles right");
    }


    //Test ideas:
        //Make sure you negative numbers don't work
        //Make sure 0 doesn't work
        //Make sure bad angles don't work
        //Make sure appropriate numbers do work

        //Would be cool to make a test that passes if the correct exception is thrown
            //Add something to actual code that will throw an exception if wrong data type is given

        //@Before and @After will occur before/after each test case method is called

        //@BeforeClass and @AfterClass  run once before/after the entire test class runs

        //Think about boundary cases (+/0/-), at the edge of an array or collection's size
        //Think about empty cases and error cases
        //Test behavior in combination
        //Make multiple calls
}
