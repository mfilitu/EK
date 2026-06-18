import java.util.ArrayList;

public class Main {
    public static void main(String[] args) {
        Contact mateusz = new Contact("mateusz", "+4540535463");
        Contact mat = new Contact("mat", "+4640535463");
        Contact bo = new Contact("bo", "+4540535463");
        Contact fie = new Contact("fie", "5440535463");

        ArrayList<Contact> contacts = new ArrayList<>();

        contacts.add(mateusz);
        contacts.add(mat);
        contacts.add(bo);
        contacts.add(fie);

        for (Contact contact : contacts){
            System.out.println(contact);
        }
        System.out.println();
        deleteInvalidNumbers(contacts);

        for (Contact contact : contacts){
            System.out.println(contact);
        }


    }

    public static String getNumberByName(ArrayList<Contact> contacts, String name){
        for (Contact contact : contacts){
            if (contact.getName().equalsIgnoreCase(name)){
                return contact.getPhoneNumber();
            }
        }
        return null;
    }

    public static void changeNumberByName(ArrayList<Contact> contacts, String name, String newNumber){
        for (Contact contact : contacts){
            if (contact.getName().equalsIgnoreCase(name)){
                contact.setPhoneNumber(newNumber);
            }
        }
    }

    public static void deleteInvalidNumbers(ArrayList<Contact> contacts){
        contacts.removeIf(contact -> !contact.getPhoneNumber().startsWith("+"));
    }
}
