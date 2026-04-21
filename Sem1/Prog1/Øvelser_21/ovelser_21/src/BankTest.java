import org.junit.Test;

import static org.junit.jupiter.api.Assertions.*;

public class BankTest {

    @Test
    public void addAccount() {
        Bank bank = new Bank();
        ChildrensAccount childrens = new ChildrensAccount(1000);

        bank.addAccount(childrens);

        assertEquals(1, bank.getSizeOfList());
    }

    @Test
    public void getInterestBearingAccounts() {
        Bank bank = new Bank();
        ChildrensAccount childrens = new ChildrensAccount(1000);
        CheckingAccount checkingAccount = new CheckingAccount(1000);

        bank.addAccount(childrens);
        bank.addAccount(checkingAccount);

        assertEquals(1, bank.getInterestBearingAccounts().size());
    }

    @Test
    public void testApplyInterest(){
        Bank bank = new Bank();
        ChildrensAccount childrens = new ChildrensAccount(1000);
        CheckingAccount checkingAccount = new CheckingAccount(1000);

        bank.addAccount(childrens);
        bank.addAccount(checkingAccount);

        bank.applyInterest();

        assertEquals(1010, childrens.getBalance());
        assertEquals(1000, checkingAccount.getBalance());

    }
}