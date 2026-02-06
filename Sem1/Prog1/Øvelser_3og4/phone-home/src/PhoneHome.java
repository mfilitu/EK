public class PhoneHome {
    public static void main(String[] args) {
        String number = "004512345678";
        System.out.println("Gyldigt dansk telefonnummer? " + isDanish(number));
    }

    public static boolean isDanish(String number) {
        return checkRegion(number) && checkNumLength(number);
    }

    public static boolean checkRegion(String number) {
        String region = "0045";
        return number.startsWith(region);
    }

    public static boolean checkNumLength(String number) {
        int numLength = 12;
        return number.length() == numLength;
    }
}
