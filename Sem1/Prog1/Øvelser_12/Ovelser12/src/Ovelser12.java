public class Ovelser12 {
    public static void main(String[] args) {
        //Opgave 1
        //opg1();

        //Opgave 2 og 3
        opg2();


    }

    public static void opg2() {
        Contacts alice = new Contacts("Alice", "Alice@gmailc.com");
        Contacts bo = new Contacts("bo", "bo@gmailc.com");
        Contacts bob = new Contacts("bob", "bob@gmailc.com");
        Contacts bobby = new Contacts("bobby", "bobby@gmailc.com");

        Email[] arr = {new Email(
                alice,
                bo,
                "Long time no see",
                "Hej Bo, hvad går du og laver?"),

                new Email(bob,
                        bobby,
                        "Long time no see",
                        "Hej Bo, hvad går du og laver?")};

        for (int i = 0; i < arr.length; i++) {
            System.out.println(arr[i].toString());
            System.out.println();
        }


    }

    public static void opg1() {
        Contacts[] arr = {new Contacts("Mateusz", "mate@email.com", "112"),
                new Contacts("bo", "bo@email.com", "911"),
                new Contacts("Bob", "bob@email.com", "111"),
                new Contacts("Billy", "Billy@gmail.com"),
                new Contacts("Bobby", "bobby@gmail.com")};

        for (int i = 0; i < arr.length; i++) {
            System.out.println(arr[i]);
        }
    }
}
