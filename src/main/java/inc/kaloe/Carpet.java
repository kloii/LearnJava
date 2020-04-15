package inc.kaloe;

public class Carpet {
    private double cost;

    public Carpet(double cost) {
        if (cost < 0) {
            this.cost = 0;
        } else {
            this.cost = cost;
        }
    }

    public double getCost() {
        System.out.println("The cost of per square carpet is: " + cost);
        return cost;
    }
}
