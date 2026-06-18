public class Box implements Measurable{
    private double width;
    private double height;
    private double depth;

    public Box(double width, double height, double depth){
        this.width = width;
        this.height = height;
        this.depth = depth;
    }

    public double getMeasure(){
        return width * height * depth;
    }

    public String toString(){
        return String.format("box: %s %s %s measures: %s", width, height, depth, getMeasure());
    }
}
