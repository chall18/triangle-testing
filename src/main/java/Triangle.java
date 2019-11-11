import java.util.Arrays;

import static java.lang.Math.round;

class Triangle{

    double arr[] = new double [3];

    double []roundTheValues(double tri[], int precision){
        int scale = (int) Math.pow(10, precision);
        for(int i = 0; i < 3; i++){
            tri[i] = (double) round(tri[i]*scale)/scale;
        }
        return tri;
    }

    int howManyLikeSides(double []tri){
        int equalSides = 0;
        if(tri[0] == tri[1]){
            System.out.println(tri[0] + "=" + tri[1]);
            equalSides++;
        }
        if(tri[0] == tri[2]) {
            System.out.println(tri[0] + "=" + tri[2]);
            equalSides++;
        }
        if(tri[1] == tri[2]){
            System.out.println(tri[1] + "=" + tri[2]);
            equalSides++;
        }
        return equalSides;
    }

    boolean rightCheck(double []arr1){
        boolean valid = false;
        if(round(Math.pow(arr1[0],2)) + round(Math.pow(arr1[1],2)) == round(Math.pow(arr1[2],2))){
            //System.out.println(Math.pow(arr1[0],2) + Math.pow(arr1[1],2) + " = " + Math.pow(arr1[2],2));
            valid = true;
        }
        //System.out.println(Math.pow(arr1[0],2) + Math.pow(arr1[1],2) + " = " + Math.pow(arr1[2],2));
        return valid;
    }

    boolean validTriangleCheck(double []tri){
        boolean valid = true;
        for(int i = 0; i < 3; i++){
            if(tri[i] <= 0){
                System.out.println("Input contained a value <= 0. Invalid.");
                valid = false;
            }
        }
        if(tri[0] + tri[1] < tri[2]){
            System.out.println("Side 1 + Side 2 must be > Side 3. Invalid.");
            valid = false;
        }
        else if(tri[1] + tri[2] < tri[0]){
            System.out.println("Side 2 + Side 3 must be > Side 1. Invalid.");
            valid = false;
        }
        else if(tri[2] + tri[0] < tri[1]){
            System.out.println("Side 3 + Side 1 must be > Side 2. Invalid.");
            valid = false;
        }
        return valid;
    }
    String triangleType(double []tri){

        roundTheValues(tri, 1);
        Arrays.sort(tri);
        String begin = "Triangle type is: ";
        String type = "";
        int equalSides = howManyLikeSides(tri);
        if(!validTriangleCheck(tri)){
            type = "invalid";
        }
        else
        {
            if(equalSides == 3){
                type = "equilateral";
            }
            else if(equalSides == 1){
                type = "isoceles";
                //check if isoceles right;
                if(rightCheck(tri)){
                    type += " right";
                }
            }
            else if(equalSides == 0){
                type = "scalene";
                //check if scalene right
                if(rightCheck(tri)){
                    type += " right";
                }
            }
        }
        return (begin+type);
    }
}