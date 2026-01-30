public class AreYouWithMe {
    public static void main(String[] args){
        int n = 10;
        int c = 0;
        for (int i = 0; i < n; i++) {
            System.out.println(i);
            c++;
            if (c >= 2){
                System.out.println(i-c);
            }
        }
    }
}
