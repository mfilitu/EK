public class Bmi {
    public static double calculate(double h, double w) throws InvalidHeightException {
        if (h <= 0){
            throw new InvalidHeightException("Højde skal være større end 0 m.");
        }
        System.out.println("calculateBmi weight: " + w +" and height: " + h);
        double bmi = w / (h * h);
        System.out.println("Calculated BMI: " + bmi);
        return bmi;
    }
}
