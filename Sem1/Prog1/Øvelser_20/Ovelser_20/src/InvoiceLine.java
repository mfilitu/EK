public class InvoiceLine {
    private String itemNumber;
    private String description;
    private int quantity;
    private double price;

    public InvoiceLine(String itemNumber, String description, int quantity, double price) {
        this.itemNumber = itemNumber;
        this.description = description;
        this.quantity = quantity;
        this.price = price;
    }

    @Override
    public String toString() {
        return itemNumber + " | " + description + " | " + quantity + " | " + price;
    }
}