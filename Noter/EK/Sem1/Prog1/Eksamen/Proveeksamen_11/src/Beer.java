public class Beer {
    private String name;
    private double alcoholPercentage;
    private double price;

    public Beer(String name, Double alcoholPercentage, double price) {
        this.name = name;
        this.alcoholPercentage = alcoholPercentage;
        this.price = price;
    }

    public void setAlcoholPercentage(double percentage) throws Exception {
        if (percentage < 0 || percentage > 100) {
            throw new Exception();
        } else this.alcoholPercentage = percentage;
    }

    public void setPrice(double newPrice) throws Exception {
        if (newPrice < 0) {
            throw new Exception();
        } else this.price = newPrice;
    }

    public double getAlcoholPercentage() {
        return alcoholPercentage;
    }

    public double getPrice() {
        return price;
    }

    public String toString() {
        return String.format("Name: %s Percentage: %s Price: %s", name, getAlcoholPercentage(), getPrice());
    }

}
