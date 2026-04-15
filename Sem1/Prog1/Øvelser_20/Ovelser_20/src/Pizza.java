public class Pizza {
    private String name;
    private double price;
    private String ingredients;

    public Pizza(String name, double price, String ingredients) {
        this.name = name;
        this.price = price;
        this.ingredients = ingredients;
    }

    public double getPrice() {
        return price;
    }

    public String getIngredients() {
        return ingredients;
    }

    public String getName() {
        return name;
    }

    public void setIngredients(String ingredients) {
        this.ingredients = ingredients;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setPrice(double price) {
        this.price = price;
    }

    @Override
    public String toString() {
        return String.format("Pizza: %s %s %s", getName(), getPrice(), getIngredients());
    }
}