public class BMICalculator {
    public static void main(String[] args) {
        System.out.println("BMI: " + calculateBMI(86, 1.80));
        System.out.println("Under normalvægt: " + isUnderNormalWeigh(calculateBMI(86, 1.80)));
        System.out.println("Normalvægt: " + isNormalWeight(calculateBMI(86, 1.80)));
        System.out.println("Overvægt: " + isOverweight(calculateBMI(86, 1.80)));
    }

    public static double calculateBMI(int kg, double height) {
        return kg / (height * height);
    }

    public static boolean isUnderNormalWeigh(double bmi) {
        return bmi < 18.5;
    }

    public static boolean isNormalWeight(double bmi) {
        return bmi >= 18.5 && bmi < 25;
    }

    public static boolean isOverweight(double bmi) {
        return bmi > 25;
    }
}