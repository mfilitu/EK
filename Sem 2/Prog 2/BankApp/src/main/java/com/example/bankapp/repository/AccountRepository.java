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


    public ArrayList<Account> getAllAccounts(){
        ArrayList<Account> accountList = new ArrayList<>();

        String sql = "SELECT * FROM account";

        try (Connection connection = dataSource.getConnection();
        PreparedStatement statement = connection.prepareStatement(sql);
        ResultSet resultSet = statement.executeQuery()) {

            while (resultSet.next()) {
                Account account = new Account();
                account.setAccountNumber(resultSet.getInt("account_number"));
                account.setAccountName(resultSet.getString("account_name"));
                account.setBalance(resultSet.getFloat("balance"));
                accountList.add(account);
            }

        } catch (SQLException e){
            e.printStackTrace();
        }

        return accountList;

    }

    public void deleteAccount(int accountNumber){
        String sql = "DELETE FROM account WHERE account_number = ?";

        try (Connection connection = dataSource.getConnection();
             PreparedStatement statement = connection.prepareStatement(sql)){

            statement.setInt(1, accountNumber);
            statement.executeUpdate();


        } catch (SQLException e){
            e.printStackTrace();
        }

    }

    public void save(Account account) {
        String sql = "INSERT INTO account (account_number, account_name, balance) VALUES (?, ?, ?)";
        try (Connection connection = dataSource.getConnection();
             PreparedStatement statement = connection.prepareStatement(sql)) {

            statement.setInt(1, account.getAccountNumber());
            statement.setString(2, account.getAccountName());
            statement.setDouble(3, account.getBalance());

            statement.executeUpdate();
        } catch (SQLException e) {
            e.printStackTrace();
        }
    }

    public void updateBalance(int accountNumber, double amount){
        String sql = "UPDATE account SET balance = ? WHERE account_number = ?";

        try (Connection connection = dataSource.getConnection();
             PreparedStatement statement = connection.prepareStatement(sql)) {

            statement.setDouble(1, amount);
            statement.setInt(2, accountNumber);

            statement.executeUpdate();
        } catch (SQLException e) {
            e.printStackTrace();
        }


    }

    public Account getAccountByNumber(int Number) {
        Account account = new Account();
        String sql = "SELECT * FROM account WHERE account_number = ?";

        try (Connection connection = dataSource.getConnection();
             PreparedStatement statement = connection.prepareStatement(sql)) {

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
