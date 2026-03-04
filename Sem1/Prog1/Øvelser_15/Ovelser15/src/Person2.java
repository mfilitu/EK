import java.time.LocalDate;
import java.time.Period;

public class Person2 {
    private String cpr; // 1502007137

    public Person2(String cpr){
        this.cpr = cpr;
    }

    public int getAge() {
        int year = getYear();
        int month = getMonth();
        int day = getDay();
        
        if (year > 30) {
            year += 1900;
        } else {
            year += 2000;
        }

        LocalDate birthday = LocalDate.of(year, month, day);
        LocalDate today = LocalDate.now();

        Period age2 = Period.between(birthday, today); //between
        String age3 = age2.toString(); // Period laves om til toString
        int realAge = Integer.parseInt(age3.substring(1,3)); //Substring af alder
        return realAge;
    }

    private int getDay() {
        int day = Integer.parseInt(cpr.substring(0,2)); //15
        return day;
    }

    private int getMonth() {
        int month = Integer.parseInt(cpr.substring(2,4)); //02
        return month;
    }

    private int getYear() {
        int year = Integer.parseInt(cpr.substring(4, 6)); //00
        return year;
    }

    public boolean isAdult() {
        if (getAge() < 18) {
            return false;
        } else {
            return true;
        }
    }

    public String toString(){
        if (getAge() < 18) {
            return String.format("Personen er ikke voksen: %s", getAge());
        } else {
            return String.format("Personen er voksen: %s", getAge());
        }

    }
}
