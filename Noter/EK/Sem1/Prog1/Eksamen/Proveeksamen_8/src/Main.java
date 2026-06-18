public class Main {
    public static void main(String[] args) {
        String longText =
                "Java er et populært programmeringssprog. " +
                        "Java bruges til udvikling af mange forskellige typer software. " +
                        "Objektorienteretprogrammering er et vigtigt begreb i Java. " +
                        "Programmering kræver øvelse og forståelse af grundlæggende principper.";

        Article article = new Article(
                "Introduktion til Java",
                longText,
                "Anders Hansen"
        );

        System.out.println("Heading: " + article.heading);
        System.out.println("Author: " + article.author);
        System.out.println("Body: " + article.body);

        System.out.println("\nLængste ord:");
        System.out.println(article.getLongestWord());

        System.out.println("\nOrd uden dubletter:");
        System.out.println(article.getWords());
    }
}
