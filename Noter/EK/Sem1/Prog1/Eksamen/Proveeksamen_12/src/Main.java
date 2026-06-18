public class Main {
    public static void main(String[] args) {
        Users users = new Users();

        User mateusz = new User("Mateusz", "Mate", Role.Admin);
        User mads = new User("Mads", "Mads", Role.Admin);
        User morten = new User("Morten", "Mort", Role.Reader);
        User adam = new User("Adam", "Adam", Role.Editor);

        users.addExistingUser(mateusz);
        users.addExistingUser(mateusz);
        users.addExistingUser(mads);
        users.addExistingUser(morten);
        users.addExistingUser(adam);

        users.addUser("Anna", Role.Editor);
        users.addUser("Anna", Role.Editor);

        System.out.println(users.getUsersByRole(Role.Editor));


    }
}
