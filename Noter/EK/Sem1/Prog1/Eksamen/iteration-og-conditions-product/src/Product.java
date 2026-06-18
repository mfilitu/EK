public class Product {
    private String name;
    private int price;
    private boolean inStock;

    public Product(String name, int price, boolean inStock){
        this.name = name;
        this.price = price;
        this.inStock = inStock;
    }

    public boolean isAffordable(int maxPrice){
        return price <= maxPrice;
    }

    public boolean isInStock(){
        return inStock;
    }

    public int getPrice(){
        return price;
    }

    public String toString(){
        return String.format("%s", this.name);
    }
}
