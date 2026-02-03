public class returnType {
    public static void main(String[] args){
        System.out.println("resultatet er: " + add(5, 10));
        System.out.println("resultatet er: " + add(5.0,10.0));
        System.out.println("resultatet er: " + isWeekend(3));
        System.out.println("resultatet er: " + isWeekend(7));
        System.out.println("resultatet er: " + fullName("mat", "fil"));
        System.out.println("resultatet er: " + getLength("12345"));
        //System.out.println("resultatet er: " + greet("s"));
    }
    public static int add(int a, int b){
        return a + b;
    }
    public static double add(double a, double b){
        return a + b;
    }
    public static boolean isWeekend(int dayOfWeek){
        return dayOfWeek == 6 || dayOfWeek == 7;
    }
    public static void sendEmail(String text) {
        //EmailService.send(text);
    }
    public static String fullName(String firstName,
                               String lastName) {
        return firstName + " " + lastName;
    }
    public static int getLength(String text) {
        return text.length();
    }
    public static void greet(String name) {
        System.out.println("Hello, " + name + "!");
    }
}
