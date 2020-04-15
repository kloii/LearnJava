package inc.kaloe;

import sun.jvm.hotspot.types.PointerType;

public class TestClass {
    public static void main(String[] args) {
//        Wall myWall = new Wall(5, 4);
//        System.out.println("Area is: " + myWall.getArea());
//
//        Wall myWall1 = new Wall(-1.25, -4);
//        System.out.println("Area is: " + myWall1.getArea());
//
//        myWall.setHeight(-1.5);
//        System.out.println("Width is: " + myWall.getWidth());
//        System.out.println("Height is: " + myWall.getHeight());
//        System.out.println("Are is: " + myWall.getArea());


//        Point myPoint1 = new Point(1, 2);
//        myPoint1.distance();
//
//        Point first = new Point(6, 5);
//        Point second = new Point (3, 1);
//
//        first.distance();
//        first.distance(second);
//        first.distance(2, 2);

//        Carpet carpet = new Carpet(3.5);
//        Floor floor = new Floor(2.75, 4.0);
//        Calculator calculator = new Calculator(floor, carpet);
//        calculator.getTotalCost();
//
//        carpet = new Carpet(1.5);
//        floor = new Floor(5.4, 4.5);
//        calculator = new Calculator(floor, carpet);
//        calculator.getTotalCost();

        ComplexNumber one = new ComplexNumber(1.0, 1.0);
        ComplexNumber number = new ComplexNumber(2.5, -1.5);

        one.add(1, 1);
        System.out.println("one.real = " + one.getReal());
        System.out.println("one.imaginary = " + one.getImaginary());

        one.substract(number);
        System.out.println("one.real = " + one.getReal());
        System.out.println("one.imaginary = " + one.getImaginary());

        number.substract(one);
        System.out.println("number.real = " + number.getReal());
        System.out.println("number.imaginary = " + number.getImaginary());


    }
}
