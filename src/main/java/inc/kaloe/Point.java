package inc.kaloe;

public class Point {
    private int x;
    private int y;

    public Point() {
    }

    public Point(int x, int y) {
        this.x = x;
        this.y = y;
    }

    public int getX() {
        return x;
    }

    public int getY() {
        return y;
    }

    public void setX(int x) {
        this.x = x;
    }

    public void setY(int y) {
        this.y = y;
    }

    public double distance () {
        double distance = 0D;
        distance = Math.sqrt((this.x-0) * (this.x-0) + (this.y-0) * (this.y-0));
        System.out.println("Distance between (0, 0) and (" + x + ", " + y + ") is: " + distance);
       return distance;
    }

    public double distance (int x, int y) {
        double distance = 0D;
        distance = Math.sqrt((this.x-x) * (this.x-x) + (this.y-y) * (this.y-y));
        String pointA = "(" + this.x + ", " + this.y + ")";
        String pointB = "(" + x + ", " + y + ")";
        System.out.println("Distance between " + pointA + " and " + pointB + " is: " + distance);
        return distance;
    }

    public double distance (Point point) {
        double distance = 0D;
        distance = Math.sqrt((this.x-point.x) * (this.x-point.x) + (this.y-point.y) * (this.y-point.y));
        String pointA = "(" + this.x + ", " + this.y + ")";
        String pointB = "(" + point.x + ", " + point.y + ")";
        System.out.println("Distance between " + pointA + " and " + pointB + " is: " + distance);
        return distance;
    }

}
