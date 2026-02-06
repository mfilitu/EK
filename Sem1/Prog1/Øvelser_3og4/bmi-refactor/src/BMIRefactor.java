public class BMIRefactor {
    public static void main(String[] args){
        double weight = 86;
        double height = 1.80;
        double bmi = calculateBMI(weight, height);

        System.out.println("BMI: " + bmi);
        System.out.println("Under normalvægt: " + isIsUnderNormalWeight(bmi));
        System.out.println("Normalvægt: " + isIsNormalWeight(bmi));
        System.out.println("Overvægt: " + isIsOverWeight(bmi));
    }

    private static boolean isIsOverWeight(double bmi) {
        return bmi > 25;
    }

    private static boolean isIsNormalWeight(double bmi) {
        return bmi >= 18.5 && bmi < 25;
    }

    private static boolean isIsUnderNormalWeight(double bmi) {
        return bmi < 18.5;
    }

    private static double calculateBMI(double weight, double height) {
        return weight / (height * height);
    }
}
