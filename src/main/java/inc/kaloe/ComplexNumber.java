package inc.kaloe;

public class ComplexNumber {

    private double real;
    private double imaginary;

    public double getReal() {
        return real;
    }

    public double getImaginary() {
        return imaginary;
    }

    public ComplexNumber(double real, double imaginary) {
        this.real = real;
        this.imaginary = imaginary;
    }

    public double add(double real, double imaginary) {
        double sum = real + imaginary;
//        System.out.println("add is: " + sum);
        return sum;
    }

    public double add (ComplexNumber complexNumber) {
        double sum = complexNumber.getReal() + complexNumber.getImaginary();
//        System.out.println("ComplexNumber's add is: " + sum);
        return sum;
    }

    public double substract (double real, double imaginary) {
        double diff = real - imaginary;
//        System.out.println("Diff is: " + diff);
        return diff;
    }

    public double substract (ComplexNumber complexNumber) {
        double diff = complexNumber.getReal() - complexNumber.getImaginary();
//        System.out.println("CompleNumber's Diff is: " + diff);
        return diff;
    }
}
