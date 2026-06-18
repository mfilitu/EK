public class Circle implements Drawable{
    private double radius;

    public Circle(double radius){
        this.radius = radius;
    }

    public String draw(){
        return String.format("Drawing circle with %s radius", radius);
    }
}
