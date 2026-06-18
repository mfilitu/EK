import java.util.Locale;
import java.util.Random;

public class User {
    private String fullName;
    private String userID;

    public User(String fullName, String userID){
        this.fullName = fullName;
        this.userID = userID;
    }

    public boolean validUserID(){
        String letters = userID.substring(0,4);
        String digits = userID.substring(4);
        if (letters.equals(letters.toLowerCase()) && digits.length() == 4){
            return true;
        } else return false;

    }

    public String createUserID(){
        String[] names = fullName.split(" ");
        String userID = "";
        String digits = "";

        for (String name : names){
            userID += name.substring(0,2).toLowerCase();
        }

        Random random = new Random();

        for (int i = 0; i < 4; i++) {
            digits += random.nextInt(0, 10);
        }
        return userID + digits;
    }
}
