public class EmailBrevfletning {
    public static void main(String[] args){
        emailGen("Mateusz", "mafi1000@stud.ek.dk", "Mor", "mor@mother.dk","Se hvor sej jeg er", "Hej Mor\nJeg er mega sej B).\nMvh Mateusz");
    }
    public static void emailGen(String recipient, String rEmail, String sender, String sEmail, String subject, String body){
        System.out.printf(
                "From: %s <%s>%n" +
                "To: %s <%s>%n" +
                "Subject: %s%n%n" +
                "%s", recipient, rEmail, sender, sEmail, subject, body);

    }
}
