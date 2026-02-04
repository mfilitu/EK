public class Invitations {
    public static void main(String[] args) {
        System.out.println(Greet("Mat") + inviteTo("house warming") + dagOgTid("fredag", "19"));
        System.out.println(Greet("Bo") + inviteTo("kæmpe fest") + dagOgTid("mandag", "8:00"));
    }

    private static String dagOgTid(String dag, String tid) {
        return " på " + dag + " kl. " + tid + ".";
    }

    private static String inviteTo(String place) {
        return "inviteret til " + place;
    }

    private static String Greet(String name) {
        return "Hej " + name + ", du er ";
    }
}