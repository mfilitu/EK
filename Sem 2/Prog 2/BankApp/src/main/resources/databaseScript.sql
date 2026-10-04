DROP DATABASE IF EXISTS BankDB;

CREATE DATABASE BankDB;

USE BankDB;

CREATE TABLE account (
                         account_number INT PRIMARY KEY,
                         account_name VARCHAR(100) NOT NULL,
                         balance DECIMAL(15,2) NOT NULL
);

INSERT INTO account (account_number, account_name, balance) VALUES (1, 'Mateusz', 1000), (2, 'Peter', 2000), (3, 'Bo', -500);


