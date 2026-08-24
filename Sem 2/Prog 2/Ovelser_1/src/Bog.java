public class Bog {
    private int ISBN;
    private String titel;
    private int udgivelsesår;

    public Bog(int ISBN, String titel, int udgivelsesår){
        this.ISBN = ISBN;
        this.titel = titel;
        this.udgivelsesår = udgivelsesår;
    }

    public int getISBN(){
        return ISBN;
    }

    public String getTitel(){
        return titel;
    }

    public int getUdgivelsesår(){
        return udgivelsesår;
    }

    public void setTitel(String newTitel){
        this.titel = newTitel;
    }

    public static void addBook(){

    }

    public String toString(){
        return String.format("ISBN: %s, titel: %s, udgivelsesår: %s", getISBN(), getTitel(), getUdgivelsesår());
    }
}
