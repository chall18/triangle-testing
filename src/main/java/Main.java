import java.util.Scanner;

public class Main {

    public String ifSidesGiven(double side1, double side2, double side3){

        Triangle myTriangle = new Triangle();
        myTriangle.arr[0] = side1;
        myTriangle.arr[1] = side2;
        myTriangle.arr[2] = side3;
        return myTriangle.triangleType(myTriangle.arr);
        //System.out.println(myTriangle.triangleType(myTriangle.arr));
    }

    public String ifPointsGiven(Point p1, Point p2, Point p3){

        Point myPoint = new Point();
        Triangle myTriangle = new Triangle();

        if(myPoint.checkIfValidPoints(p1, p2, p3)){
            myPoint.points[0] = p1;
            myPoint.points[1] = p2;
            myPoint.points[2] = p3;
//                for(int i = 0; i < 3; i++)
//                {
//                    System.out.println(myPoint.points[i].x + " " + myPoint.points[i].y);
//                }
            myTriangle.arr = myPoint.makeTheSides(myPoint.points);
        }
        else{
            System.out.println("Invalid coordinates given.");
        }
        return myTriangle.triangleType(myTriangle.arr);
    }


    public static void main(String[] args)
    {
        Main m = new Main();

//        m.ifPointsGiven();//can test through either of these methods. Must make new Point objects if using Points
//        m.ifSidesGiven();

    }

}