package MathApp;

import Math.Math;

public class mathApp {
    public static void main(String[] args) {
        int a = 5;
        int b = 3;
        System.out.println(a + " + " + b + " = " +
                Math.add(a, b));
        System.out.println(a + " - " + b + " = " +
                Math.subtract(a, b));
        System.out.println(a+ " * " + b + " = " +
                Math.multiply(a, b));
        System.out.println(a + " / " + b + " = " +
                Math.divide(a, b));

        double x = 5.0;
        double y = 3.0;
        System.out.println(x + " + " + y + " = " +
                Math.add(x, y));
        System.out.println(x + " - " + y + " = " +
                Math.subtract(x, y));
        System.out.println(x + " * " + y + " = " +
                Math.multiply(x, y));
        System.out.println(x + " / " + y + " = " +
                Math.divide(x, y));
    }

}
