public class Contacts {
    String name;
    String email;
    String phone;

    public Contacts(String name, String email, String phone){
        this.name = name;
        this.email = email;
        this.phone = phone;
    }

    public Contacts(String name, String email){
        this.name = name;
        this.email = email;
    }

    public String toString() {
        return String.format("Name: " + name + " Email: " + email + " Phone: " + phone);
    }
}
