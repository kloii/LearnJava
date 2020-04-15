package inc.kaloe;

public class TestLearnInheritance {
    public static void main(String[] args) {

/*        Circle circle = new Circle(3.75);
        System.out.println("Circle's radius is: " + circle.getRadius());
        System.out.println("Circle's area is: " + circle.getArea());

        Cylinder cylinder = new Cylinder(5.55, 7.25);
        System.out.println("Cylinder's radius is: " + cylinder.getRadius());
        System.out.println("Cylinder's height is: " + cylinder.getHeight());
        System.out.println("Cylinder's area is: " + cylinder.getArea());
        System.out.println("Cylinder's volume is: " + cylinder.getVolume());*/

        Rectangle rectangle = new Rectangle(5, 10);
        System.out.println("rectangle.width= " + rectangle.getWidth());
        System.out.println("rectangle.length= " + rectangle.getLength());
        System.out.println("rectangle.area= " + rectangle.getArea());
        Cuboid cuboid = new Cuboid(5,10,5);
        System.out.println("cuboid.width= " + cuboid.getWidth());
        System.out.println("cuboid.length= " + cuboid.getLength());
        System.out.println("cuboid.area= " + cuboid.getArea());
        System.out.println("cuboid.height= " + cuboid.getHeight());
        System.out.println("cuboid.volume= " + cuboid.getVolume());

    }
}
