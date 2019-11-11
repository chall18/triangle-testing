import java.lang.Math;

public class Point{

    //each point is a set of two numbers
    //maybe let's do two integers, x and y, and these are the data in an object of class Point
    //Then we can have arrays of Point objects to hold the three points
    double x, y;
    Point points[] = new Point[3];

    Point(){}

    Point(double a, double b){
        this.x = a;
        this.y = b;
    }

    double []makeTheSides(Point []p){
        double newSides[] = new double[3];
        newSides[0] = findSideLength(p[0], p[1]);
        newSides[1] = findSideLength(p[0], p[2]);
        newSides[2] = findSideLength(p[1], p[2]);
        return newSides;
    }

    double findSideLength(Point a, Point b){ //returns distance b/t two Point objects
        double eqn = Math.pow((b.x - a.x),2) + Math.pow((b.y - a.y),2);
        double d = Math.sqrt(eqn);
        return d;
    }

    boolean checkIfValidPoints(Point a, Point b, Point c){
        boolean isValid = true;
        if((a.x == b.x && b.x == c.x) || (a.y == b.y && b.y == c.y)){
            isValid = false;
        }
        return isValid;
    }
}