public class Contact {
    private String name;
    private String phoneNumber;

    public Contact(String name, String phoneNumber){
        this.name = name;
        this.phoneNumber = phoneNumber;
    }

    public boolean isValidNumber(){
        return true ? phoneNumber.startsWith("+45") : false;
    }

    public String getName(){
        return name;
    }

    public void setPhoneNumber(String newNumber){
        phoneNumber = newNumber;
    }

    public String getPhoneNumber(){
        return phoneNumber;
    }

    public String toString(){
        return String.format("Name: %s, Number: %s, Valid: %s", getName(), phoneNumber, isValidNumber());
    }
}
