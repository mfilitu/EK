import java.util.ArrayList;

public class Main {
    public static void main(String[] args) {
        Product product1 = new Product("Mælk", 12, 15);
        Product product2 = new Product("æg", 1, 22);
        Product product3 = new Product("brød", 0, 14);
        Product product4 = new Product("Is", 10, 2);
        Product product5 = new Product("øl", 12, 0);

        ArrayList<Product> products = new ArrayList<>();

        products.add(product1);
        products.add(product2);
        products.add(product3);
        products.add(product4);
        products.add(product5);



        changePrice(products, "mælk", 55);



        removeSoldOut(products);
        for (Product prod : products) {
            System.out.println(prod);
        }
    }

    public static void changePrice(ArrayList<Product> products, String name, int newPrice) {
        for (Product prod : products) {
            if (prod.getName().equalsIgnoreCase(name)) {
                prod.setPrice(newPrice);
            }
        }
    }

    public static void removeSoldOut(ArrayList<Product> products) {
        products.removeIf(product -> product.isOutOfStock() == true);

    }
}
