import java.util.Random;

public class JuleGave {
    private boolean isSoft;
    private boolean isRectangular;
    private boolean doesRattle;

    public JuleGave(){
        Random random = new Random();
        this.isSoft = random.nextBoolean();
        this.isRectangular = random.nextBoolean();
        this.doesRattle = random.nextBoolean();
    }

    public boolean couldBeLEGO(){
        return isSoft && isRectangular && doesRattle;
    }

    public String toString(){
        return String.format("%s %s %s", isSoft, isRectangular, doesRattle);
    }
}
