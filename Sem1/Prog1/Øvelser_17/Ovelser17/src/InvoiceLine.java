public class InvoiceLine {
    final private Product product;
    final private int quantity;

    public InvoiceLine(Product product, int quantity){
        this.product = product;
        this.quantity = quantity;
    }

    public int getQuantity() {
        return quantity;
    }

    public Product getProduct() {
        return product;
    }

    public double getLineTotal(){
        return quantity * product.getPrice();
    }

    @Override
    public String toString() {
        return String.format("%d x %s", getQuantity(), getProduct());
    }
}
