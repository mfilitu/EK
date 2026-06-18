public class Main {
    public static void main(String[] args) {
        User mateusz = new User("Mateusz Filipowski", "mafi1234");
        User mateusz_fake = new User("Mateusz Filipowski", "mafi12345");

        System.out.println(mateusz.validUserID());
        System.out.println(mateusz.createUserID());
    }
}
