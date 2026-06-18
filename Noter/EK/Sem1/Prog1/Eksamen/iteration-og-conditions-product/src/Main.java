import java.util.ArrayList;
import java.util.List;

public class Main {
    public static void main(String[] args) {
        List<Product> productList = new ArrayList<>();

        Product ost = new Product("ost", 5, true);
        Product kød = new Product("kød", 50, true);
        Product mælk = new Product("mælk", 10, true);
        Product is = new Product("is", 15, false);

        productList.add(ost);
        productList.add(kød);
        productList.add(mælk);
        productList.add(is);

        System.out.println(ost.isAffordable(20));
        System.out.println(ost.isAffordable(10));


        System.out.println(getCheapest(productList));


    }

    private static Product getCheapest(List<Product> productList) {
        Product cheapest = null;
        for (Product product : productList) {
            if (product.isInStock()) {
                if (cheapest == null || product.getPrice() < cheapest.getPrice()) {
                    cheapest = product;
                }
            }

        }
        return cheapest;
    }
}
