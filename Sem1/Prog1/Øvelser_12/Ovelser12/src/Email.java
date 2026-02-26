public class Email {
    String fromName;
    String fromEmail;
    String toName;
    String toEmail;
    String subject;
    String body;

    public Email(Contacts from,
                 Contacts to,
                 String subject, String body) {
        this.fromName = from.name;
        this.fromEmail = from.email;
        this.toName = to.name;
        this.toEmail = to.email;
        this.subject = subject;
        this.body = body;
    }

    public String toString(Contacts from, Contacts to) {
        return String.format("From: %s <%s>%n" +
                "To: %s <%s>%n" +
                "Subject: %s%n" +
                "%s", from.name, from.email, toName, toEmail, subject, body);
    }

    public String toString() {
        return String.format("From: %s <%s>%n" +
                "To: %s <%s>%n" +
                "Subject: %s%n" +
                "%s", fromName, toName, toName, toEmail, subject, body);
    }
}