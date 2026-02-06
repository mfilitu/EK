public class SwitchCase {
    public static void main(String[] args){
        System.out.println(seasonForMonth(1));
        System.out.println(seasonForMonth(12));
        System.out.println(seasonForMonth(6));
        System.out.println(seasonForMonth(3));

        System.out.println("new: " + seasonForMonthNEW(3));
    }
    public static String seasonForMonth(int month){
        String season;
        switch (month) {
            case 1, 2, 12:
                season = "winter";
                break;
            case 3, 4, 5:
                season = "spring";
                break;
            case 6, 7, 8:
                season = "autumn";
                break;
            default:
                season = "invalid";
        }
        return season;
    }

    public static String seasonForMonthNEW(int month){
        String season;
        return switch (month) {
            case 1, 2, 12 ->"winter";
            case 3, 4, 5 -> "spring";
            case 6, 7, 8 -> "autumn";
            default -> "invalid";
        };
    }
}
