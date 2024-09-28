package com.Java.Universal.Advance_Java.week1;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;

class Account{
    private int balance;
    private String acct_number;

    public Account(int balance, String acct_number) {
        this.balance = balance;
        this.acct_number = acct_number;
    }
    public int getBalance(){
        return balance;
    }
    public String getAcct_number(){
        return acct_number;
    }

    @Override
    public String toString() {
        return "Account{" +
                "balance=" + balance +
                ", acct_number='" + acct_number + '\'' +
                '}';
    }
}
public class R2_classObject {
    public static void main(String[] args) {
    /*1) Store Account class objects into the arraylist.*/
        // Create an ArrayList of Account type
        List<Account> accountList = new ArrayList<>();

        // Add Account objects to the ArrayList
        accountList.add(new Account(1000, "123456"));
        accountList.add(new Account(2500, "654321"));
        accountList.add(new Account(1500, "112233"));

        for (Account account : accountList){
            System.out.println(account);
        }
        /*2) Sort the elements of the arraylist based on ascending order of their acct_number.*/
        Collections.sort(accountList, new Comparator<Account>() {
            @Override
            public int compare(Account o1, Account o2) {
                return o1.getAcct_number().compareTo(o2.getAcct_number());
            }
        });
        for (Account account : accountList){
            System.out.println(account);
        }

/*3) Sort the elements of the arraylist based on descending order of their balance.*/
        Collections.sort(accountList, new Comparator<Account>() {
            @Override
            public int compare(Account o1, Account o2) {
                return o2.getAcct_number().compareTo(o1.getAcct_number());
            }
        });

        /*4) Whenever any element of the arraylist is printed the balance and acct_number of
the accounts should be printed.*/
        for (Account account : accountList){
            System.out.println(account);
        }
    }
}
/*Initial Setup
Creating Account Objects:

Three Account objects are created with the following properties:
Account(1000, "123456") with balance = 1000 and acct_number = "123456"
Account(2500, "654321") with balance = 2500 and acct_number = "654321"
Account(1500, "112233") with balance = 1500 and acct_number = "112233"
Adding Account Objects to accountList:

The three Account objects are added to the accountList in the order they were created.
Sorting Process
Sorting by balance in Descending Order:
The Collections.sort method is called with the accountList and a custom Comparator.
The Comparator compares the balance fields of two Account objects in reverse order to achieve descending order sorting.
Comparison Steps
The Comparator will compare the balances of the Account objects pairwise:

First Comparison:

Account(2500, "654321") vs Account(1000, "123456")
Comparator calls Integer.compare(a2.getBalance(), a1.getBalance()), which translates to Integer.compare(1000, 2500)
Result: 2500 > 1000, so the first account stays before the second account.
Second Comparison:

Account(1500, "112233") vs Account(2500, "654321")
Comparator calls Integer.compare(a2.getBalance(), a1.getBalance()), which translates to Integer.compare(2500, 1500)
Result: 2500 > 1500, so the second account stays before the third account.
Third Comparison:

Account(1500, "112233") vs Account(1000, "123456")
Comparator calls Integer.compare(a2.getBalance(), a1.getBalance()), which translates to Integer.compare(1000, 1500)
Result: 1500 > 1000, so the third account stays before the first account.
Final Order
After the sorting process, the accountList will be in the following order based on the descending balance:

Account(2500, "654321") with balance = 2500
Account(1500, "112233") with balance = 1500
Account(1000, "123456") with balance = 1000
Output
The program then iterates through the accountList and prints each Account object:

arduino
Copy code
Account{balance=2500, acct_number='654321'}
Account{balance=1500, acct_number='112233'}
Account{balance=1000, acct_number='123456'}
This output confirms that the Account objects have been sorted correctly by their balance in descending order.*/