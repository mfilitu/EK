public class Bil {
    private Trailer trailer;
    private int weight;

    public Bil(int weight) {
        this.weight = weight;
    }

    public void addTrailer(Trailer trailer) {
        if (this.weight + trailer.getWeight() < 3500) {
            this.trailer = trailer;
            System.out.println("Trailer added!");
        } else System.out.println("Weight exceeds 3500kg!");
    }

    public int totalWeight() {
        if (!(trailer == null)){
            return this.weight + trailer.getWeight();
        }
        else return this.weight;
    }
}
