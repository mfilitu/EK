public class ShippingCostCalculator {
    public static void main(String[] args){
        System.out.println(calculateShippingCost(0.8, true));
        System.out.println(calculateShippingCost(0.8, false));
        System.out.println(calculateShippingCost(2.8, true));
        System.out.println(calculateShippingCost(2.8, false));
        System.out.println(calculateShippingCost(5.8, true));
        System.out.println(calculateShippingCost(5.8, false));
        System.out.println(calculateShippingCost(11.8, true));
        System.out.println(calculateShippingCost(11.8, false));
        System.out.println(calculateShippingCost(16.8, true));
        System.out.println(calculateShippingCost(16.8, false));
        System.out.println(calculateShippingCost(220.8, true));
        System.out.println(calculateShippingCost(220.8, false));


    }
    public static int calculateShippingCost(double weight, boolean isHomeDelivery){
        if (weight <= 1.0) {
            if (isHomeDelivery){
                return 75;
            } else {
                return 60;
            }

        } else if (weight <= 2.0){
            if (isHomeDelivery){
                return 80;
            } else {
                return 65;
            }
        } else if (weight <= 5.0){
            if (isHomeDelivery){
                return 85;
            } else {
                return 70;
            }
        } else if (weight <= 10.0){
            if (isHomeDelivery){
                return 105;
            } else {
                return 90;
            }
        } else {
            if (isHomeDelivery){
                return 175;
            } else {
                return 160;
            }
        }
    }
}
