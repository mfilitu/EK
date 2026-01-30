public class Cookies {
    public static void main(String[] args){
        int cookies = 44;
        double flourPerCookie = 0.045d;
        double totalFlour = cookies * flourPerCookie;
        double howManyCookies = 2.0d/flourPerCookie;
        System.out.printf("%.2f kg mel \n", totalFlour);
        System.out.printf("%.3f antal cookies ", howManyCookies);
    }
}
