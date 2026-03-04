public class main {
    public static void main(String[] args) {
        opg2();

    }

    public static void opg2() {
        Person2 person = new Person2("1502007137");
        System.out.println(person); // Personen er voksen /
        System.out.println("Er voksen: " + person.isAdult());

        Person2 person2 = new Person2("1505007137");
        System.out.println(person2);
        System.out.println("Er voksen: " + person2.isAdult());
    }

    public static void opg1() {
        Person person = new Person();
        person.setName("");
        person.setAge(12);
        System.out.println(person); // Alfons Åberg, 5 år
        System.out.println("Voksen? " + person.isAdult());
    }
}