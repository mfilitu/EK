public class Bmi {
    private int weight;
    private double height;

    public Bmi(int weight, double height) {
        this.weight = weight;
        this.height = height;
    }

    public double calculate() {
        return weight / (height * height);
    }

    public boolean isUnderWeight() {
        return calculate() < 18.5;
    }

    public boolean isOverweight() {
        return calculate() > 25;
    }

    public boolean isNormalWeight() {
        return  calculate() > 18.5 && calculate() < 25;
    }
}
