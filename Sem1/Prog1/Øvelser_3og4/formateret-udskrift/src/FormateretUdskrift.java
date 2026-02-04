public class FormateretUdskrift {
    public static void main(String[] args){
        String pizza1 = "Margherita";
        String pizza2 = "Pepperoni";
        String pizza3 = "Portobello";

        double prisMarg = 89.00;
        double prisPep = 99.00;
        double prisPort = 69.50;

        System.out.printf("Pizza %s:\t%.2f kr%n", pizza1, prisMarg);
        System.out.printf("Pizza %s:\t%.2f kr%n", pizza2, prisPep);
        System.out.printf("Pizza %s:\t%.2f kr%n", pizza3, prisPort);
        System.out.println();

        String vareNr1 = "000001";
        String vareNavn1 = "Gaffelnøglesæt";
        String vareNr2 = "000002";
        String vareNavn2 = "Torxnøglesæt";
        String vareNr3 = "000212";
        String vareNavn3 = "Unbrakonøglesæt";
        String vareNr4 = "030200";
        String vareNavn4 = "Lappegrej";
        String vareNr5 = "030302";
        String vareNavn5 = "Drikkedunk";
        String vareNr6 = "145012";
        String vareNavn6 = "Skiftegreb";


        System.out.println("Varenr Vare");
        System.out.printf("%s %s%n", vareNr1, vareNavn1);
        System.out.printf("%s %s%n", vareNr2, vareNavn2);
        System.out.printf("%s %s%n", vareNr3, vareNavn3);
        System.out.printf("%s %s%n", vareNr4, vareNavn4);
        System.out.printf("%s %s%n", vareNr5, vareNavn5);
        System.out.printf("%s %s%n", vareNr6, vareNavn6);

    }
}
