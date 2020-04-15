package inc.kaloe;

public class LearnOverloadingMethod {

    private static final double INVALID_VALUE = -1.0;
    private static final String INVALID_MSG = "Invalid inputs for calculating area";

    public static double area (double radius) {

        if (radius<0){
            System.out.println(INVALID_MSG);
            return INVALID_VALUE;
        }
        System.out.println("The area of circle with radius = " + radius + " is: " + radius * radius * Math.PI);
        return radius * radius * Math.PI;
    }

    public static double area (double x, double y){
        if ((x<0) || (y<0)){
            System.out.println(INVALID_MSG);
            return INVALID_VALUE;
        }
        System.out.println("The area of rectangle with x=" + x + " y=" + y + " is: " + x*y);
        return x*y;
    }

}
