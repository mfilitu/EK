import java.util.Locale;
import java.util.Scanner;

public class main {
    public static void main(String[] args) {
        Opskrifter[] opskriftArr = new Opskrifter[100];


        Boolean running = true;

        Scanner scanner = new Scanner(System.in);
        int count = 0;

        while (running) {
            System.out.println("--------------------------------------");
            System.out.println("Menu:");
            System.out.println("1. Tilføj en opskrift\n");
            System.out.println("2. Lav en indkøbsliste\n");
            System.out.println("3. Søgning\n");
            System.out.println("4. Rating\n");
            System.out.println("5. Kommentar\n");
            System.out.println("6. Del en opskrift\n");
            System.out.println("--------------------------------------");

            int valg = scanner.nextInt();
            scanner.nextLine();

            switch (valg) {
                case 1:
                    opskriftArr[count] = opretOpskrit();
                    count++;
                    break;
                case 2:
                    //scanner.nextLine();
                    System.out.println("Søg efter titel så jeg kan lave en inkøbsliste: ");
                    String søgning = scanner.nextLine();
                    for (int i = 0; i < opskriftArr.length; i++) {
                        if (opskriftArr[i] != null) {
                            if (opskriftArr[i].getTitel().toLowerCase().contains((søgning.toLowerCase()))) {
                                System.out.println("Indkøbsliste: " + opskriftArr[i].getIngredienser());
                            }
                        }
                    }
                    break;
                case 3:
                    //scanner.nextLine();
                    System.out.println("Søg efter titel eller ingredienser: ");
                    String søgning2 = scanner.nextLine();
                    for (int i = 0; i < opskriftArr.length; i++) {
                        if (opskriftArr[i] != null) {
                            if (opskriftArr[i].getTitel().toLowerCase().contains((søgning2.toLowerCase())) ||
                                    opskriftArr[i].getIngredienser().toLowerCase().contains((søgning2.toLowerCase()))) {
                                System.out.println("Opskrift:\n" + opskriftArr[i]);
                            }
                        }
                    }
                    break;
                case 4:
                    System.out.println("Skriv titel på opskriften du vil rate:\n");
                    String søgning3 = scanner.nextLine();
                    for (int i = 0; i < opskriftArr.length; i++) {
                        if (opskriftArr[i] != null) {
                            if (opskriftArr[i].getTitel().toLowerCase().contains((søgning3.toLowerCase()))) {
                                System.out.println("Rate 1-5: ");
                                int rating = scanner.nextInt();
                                if (rating < 1 || rating > 5) {
                                    System.out.println("Prøv igen!\n");
                                    break;
                                } else {
                                    opskriftArr[i].setRating(rating);
                                    System.out.println("Tak for din rating! :)");
                                }
                            }
                        }
                    }
                    break;
                case 5:
                    System.out.println("Søg efter opskriften du vil kommentere:\n");
                    String søgning5 = scanner.nextLine();
                    for (int i = 0; i < opskriftArr.length; i++) {
                        if (opskriftArr[i] != null) {
                            if (opskriftArr[i].getTitel().toLowerCase().contains((søgning5.toLowerCase()))) {
                                System.out.print("Kommentar: ");
                                String kommentar = scanner.nextLine();
                                opskriftArr[i].setKommentar(kommentar);
                                System.out.println("Tak for din kommentar! :)");
                            }
                        }
                    }
                    break;
                case 6:
                    System.out.println("Skriv titel på opskrift du vil dele:\n");
                    String søgning6 = scanner.nextLine();
                    for (int i = 0; i < opskriftArr.length; i++) {
                        if (opskriftArr[i] != null) {
                            if (opskriftArr[i].getTitel().toLowerCase().contains((søgning6.toLowerCase()))) {
                                System.out.print("Hvad er emailen: ");
                                String email = scanner.nextLine();
                                System.out.println("Email: "+email + "\n"+ opskriftArr[i].toString() +"\n");
                                System.out.println("Opskriften er delt! :)");
                            }
                        }
                    }

            }

        }

        //Tests
        //Task 1:
        //testTask1();
    }

    public static Opskrifter opretOpskrit() {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Titel:");
        String title = scanner.nextLine();

        System.out.println("Ingredienser:");
        String ingredienser = scanner.nextLine();

        System.out.println("Fremgangsmåde:");
        String fremgangsmåde = scanner.nextLine();

        System.out.println("Kategori:");
        String kategori = scanner.nextLine();

        Opskrifter opskrift = new Opskrifter(title, ingredienser, fremgangsmåde, kategori);
        return opskrift;
    }

}
