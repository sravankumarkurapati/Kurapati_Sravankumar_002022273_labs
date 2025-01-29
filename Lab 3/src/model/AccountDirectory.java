/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package model;

import java.util.ArrayList;

/**
 * This is the Directory/Catalog class which will provide utilities to add, get, delete and search an account
 *
 * @author sravankumarkurapati
 * @version 1.0
 * @since 2025-01-24
 */
public class AccountDirectory {

    private ArrayList<Account> accounts;

    public AccountDirectory() {
        this.accounts = new ArrayList<Account>();
    }

    public ArrayList<Account> getAccounts() {
        return accounts;
    }

    public void setAccounts(ArrayList<Account> accounts) {
        this.accounts = accounts;
    }

    public Account addAccount() {
        Account a = new Account();
        accounts.add(a);
        return a;
    }

    public void deleteAccount(Account account) {
        accounts.remove(account);
    }
}
