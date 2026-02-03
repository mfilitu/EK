public class NauticalMilesConverter {
    public static void main(String[] args){
        double nmile = 10;
        double km = convertNmileToKm(nmile);
        System.out.println(nmile + " nmile er " + km + " km.");
    }
    public static double convertNmileToKm(double nmile){
        return nmile * 1.852;
    }
}
