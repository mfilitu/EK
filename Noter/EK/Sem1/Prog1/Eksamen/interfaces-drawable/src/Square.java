public class Square implements Drawable{
    private int sideLength;

    public Square(int sideLength){
        this.sideLength = sideLength;
    }

    public String draw(){
        return String.format("Drawing square with side %s", sideLength);
    }
}
