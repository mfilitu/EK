public class Address {
    private final String name;
    private final String street;
    private final String city;

    public Address(String name, String street, String city) {
        this.name = name;
        this.street = street;
        this.city = city;
    }

    public String getName() {
        return name;
    }

    public String getStreet() {
        return street;
    }

    public String getCity() {
        return city;
    }

    public String toString() {
        return String.format("%s\n%s\n%s", getName(), getStreet(), getCity());
    }

}
