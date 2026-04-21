import java.util.ArrayList;
import java.util.List;

public class Bank {
    private List<BankAccount> listOfBankAccounts;
    // Hvad er fordelen ved at bruge List<BankAccount> i stedet for en konkret liste-implementering som ArrayList<BankAccount>

    // Den primære fordel ved at bruge interfacet List<BankAccount> i stedet for den konkrete
    // implementering ArrayList<BankAccount> er fleksibilitet og løs kobling (loose coupling) i din kode.
    // Når du bruger interfacet, programmerer du til en kontrakt i stedet for en
    // specifik implementering, hvilket gør det nemmere at ændre underliggende
    // datastrukturer senere uden at skulle omskrive store dele af programmet.

    public Bank() {
        this.listOfBankAccounts = new ArrayList<>();
    }

    public void addAccount(BankAccount account) {
        listOfBankAccounts.add(account);
    }

    public int getSizeOfList(){
        return listOfBankAccounts.size();
    }

    public void applyInterest(){
        for (int i = 0; i < listOfBankAccounts.size(); i++) {
            if (listOfBankAccounts.get(i) instanceof InterestBearing) {
                ((InterestBearing) listOfBankAccounts.get(i)).applyInterest();
            }
        }
    }

    public ArrayList<BankAccount> getInterestBearingAccounts() {
        ArrayList<BankAccount> listOfInterestBearing = new ArrayList<>();
        for (int i = 0; i < listOfBankAccounts.size(); i++) {
            if (listOfBankAccounts.get(i) instanceof InterestBearing) {
                listOfInterestBearing.add(listOfBankAccounts.get(i));
            }
        }

        return listOfInterestBearing;
    }
}
