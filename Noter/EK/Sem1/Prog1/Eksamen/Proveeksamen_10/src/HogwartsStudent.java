public class HogwartsStudent {
    private String firstName;
    private String lastName;
    private String house;

    public HogwartsStudent(String firstName, String lastName) {
        this.firstName = firstName;
        this.lastName = lastName;
    }

    public void setHouse(String newHouse) throws Exception {
        if (newHouse.equals("Griffindor") || newHouse.equals("Hufflepuff") || newHouse.equals("Ravenclaw") || newHouse.equals("Slytherin")) {
            this.house = newHouse;
        } else throw new Exception("Not a valid house!");
    }

    public String getFirstName() {
        return firstName;
    }

    public String getLastName() {
        return lastName;
    }

    public String getHouse() {
        if (this.house != null) {
            return house;
        } else return "Not in a house!";
    }

    public String toString() {
        return String.format("name: %s %s house: %s", getFirstName(), getLastName(), getHouse());
    }
}
