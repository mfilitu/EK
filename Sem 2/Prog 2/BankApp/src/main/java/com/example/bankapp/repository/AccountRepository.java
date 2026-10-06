package com.example.bankapp.repository;

import com.example.bankapp.model.Account;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import javax.sql.DataSource;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;

@Repository
public class AccountRepository {

    @Autowired
    private DataSource dataSource;


    public ArrayList<Account> getAllAccounts() {
        ArrayList<Account> accountList = new ArrayList<>();

        String sql = "SELECT * FROM account";

        try (Connection connection = dataSource.getConnection(); PreparedStatement statement = connection.prepareStatement(sql); ResultSet resultSet = statement.executeQuery()) {

            while (resultSet.next()) {
                Account account = new Account();
                account.setAccountNumber(resultSet.getInt("account_number"));
                account.setAccountName(resultSet.getString("account_name"));
                account.setBalance(resultSet.getFloat("balance"));
                accountList.add(account);
            }

        } catch (SQLException e) {
            e.printStackTrace();
        }

        return accountList;

    }

    public void deleteAccount(int accountNumber) {
        String sql = "DELETE FROM account WHERE account_number = ?";

        try (Connection connection = dataSource.getConnection(); PreparedStatement statement = connection.prepareStatement(sql)) {

            statement.setInt(1, accountNumber);
            statement.executeUpdate();


        } catch (SQLException e) {
            e.printStackTrace();
        }

    }

    public void save(Account account) {
        String sql = "INSERT INTO account (account_number, account_name, balance) VALUES (?, ?, ?)";
        try (Connection connection = dataSource.getConnection(); PreparedStatement statement = connection.prepareStatement(sql)) {

            statement.setInt(1, account.getAccountNumber());
            statement.setString(2, account.getAccountName());
            statement.setDouble(3, account.getBalance());

            statement.executeUpdate();
        } catch (SQLException e) {
            e.printStackTrace();
        }
    }

    public void updateBalance(int accountNumber, double amount) throws Exception{
        String sql1 = "SELECT balance FROM account WHERE account_number = ? FOR UPDATE";
        String sql2 = "UPDATE account SET balance = ? WHERE account_number = ?";

        try (Connection con = dataSource.getConnection()) {
            try {
                // Start transaction
                con.setAutoCommit(false);

                // Get balance and Lock row
                PreparedStatement ps1 = con.prepareStatement(sql1);
                ps1.setInt(1, accountNumber);
                ResultSet rs = ps1.executeQuery();
                con.commit();
                if (rs.next()) {
                    double balance = rs.getDouble("balance");
                } else throw new Exception("Withdraw failed. Unknown account: " + accountNumber);

                // Withdraw amount
                PreparedStatement ps2 = con.prepareStatement(sql2);
                ps2.setDouble(1, amount);
                ps2.setInt(2, accountNumber);
                if (ps2.executeUpdate() == 0) throw new Exception("Withdraw failed. Unknown account " + accountNumber);

                // Commit and unlock row
                con.commit();
            } catch (Exception e) {
                // Rollback
                con.rollback();
                throw e;
            } finally {
                // Reset autocommit
                con.setAutoCommit(true);
            }
        }
    }

    public Account getAccountByNumber(int Number) {
        Account account = new Account();
        String sql = "SELECT * FROM account WHERE account_number = ?";

        try (Connection connection = dataSource.getConnection(); PreparedStatement statement = connection.prepareStatement(sql)) {

            statement.setInt(1, Number);

            try (ResultSet resultSet = statement.executeQuery()) {
                if (resultSet.next()) {
                    account.setAccountNumber(resultSet.getInt("account_number"));
                    account.setAccountName(resultSet.getString("account_name"));
                    account.setBalance(resultSet.getDouble("balance"));
                }
            }
        } catch (SQLException e) {
            e.printStackTrace();
        }

        return account;
    }

}
