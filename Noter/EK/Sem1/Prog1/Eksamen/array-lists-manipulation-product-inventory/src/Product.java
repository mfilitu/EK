public class Product {
    private String name;
    private int quantity;
    private int price;

    public Product(String name, int quantity, int price){
        this.name = name;
        this.quantity = quantity;
        this.price = price;
    }

    public boolean isOutOfStock() {
        if (quantity == 0){
            return true;
        } else return false;
    }

    public String getName(){
        return name;
    }

    public void setPrice(int newPrice){
        this.price = newPrice;
    }

    public String toString(){
        return String.format("Name: %s, Quantity: %s, Price: %s", getName(), quantity, price);
    }


}
