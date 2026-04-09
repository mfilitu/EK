public class Main {
    public static void main(String[] args) {

        Person father = new Person("Andrzej", Gender.MALE);
        Person mother = new Person("Sylwia", Gender.FEMALE);

        Person child = new Person("Mateusz", Gender.MALE, new Person[]{father, mother});
        Person child2 = new Person("Alan", Gender.MALE, new Person[]{father, mother});

        Person[] parents = child.getParents();
        System.out.println(child);
        System.out.println("Far: " + parents[0]);
        System.out.println("Mor: " + parents[1]);

        Person bobby = new Person("Bobby", Gender.MALE, new Person[]{child, null});
        Person bobla = new Person("bobla", Gender.FEMALE, new Person[]{child, null});
        Person bob = new Person("bob", Gender.MALE, new Person[]{child, null});


        for (int i = 0; i < child.getChildCount(); i++) {
            System.out.println(child.getChildren()[i]);
        }

        Person bobber = new Person("bob Jr", Gender.MALE, new Person[]{bob, bobla});
        Person bobby2 = new Person("Bobby2", Gender.MALE, new Person[]{bob, bobla});

        Person[] siblings = bob.getSiblings();
        for (Person s : siblings) {
            System.out.println(s);
        }

        Person[] cousins = bobber.getCousins();
        System.out.println("Fætre og kusiner til " + bobber + ":");
        for (Person c : cousins) {
            System.out.println("- " + c);
        }

        father.printTree();
    }
}