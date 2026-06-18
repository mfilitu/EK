import java.util.ArrayList;

public class Main {
    public static void main(String[] args) {
        ArrayList<Drawable> drawables = new ArrayList<>();

        Square square = new Square(5);
        Square square1 = new Square(6);
        Square square2 = new Square(12);
        Circle circle = new Circle(2.2);
        Circle circle1 = new Circle(3.2);
        Circle circle2 = new Circle(1.2);

        drawables.add(square);
        drawables.add(square1);
        drawables.add(square2);
        drawables.add(circle);
        drawables.add(circle1);
        drawables.add(circle2);

        for (Drawable item : drawables) {
            System.out.println(item.draw());
        }


    }
}
