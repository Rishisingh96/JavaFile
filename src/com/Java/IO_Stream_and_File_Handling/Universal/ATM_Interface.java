package com.Java.IO_Stream_and_File_Handling.Universal;

import java.util.Scanner;

class TransactionException extends Exception {
    public TransactionException(String issue) {
        super(issue);
        System.out.println("Issue Generated: " + issue);
    }

    void showMsg() {
        System.out.println("Transaction Failed..........");
    }

    void PanCard() {
        System.out.println("Need a PanCard..............");
    }
}

class TransactionWithdrowlException extends Exception {
    public TransactionWithdrowlException(String issue) {
        super(issue);
        System.out.println("Issue is: " + issue);
    }
}

public class ATM_Interface {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        double availableBalance = 45000;
        int choice;

        do {
            System.out.println("Enter your choice: \n1: Deposit \n2: Withdrawal \n3: Quit");
            choice = scanner.nextInt();

            switch (choice) {
                case 1:
                    System.out.println("Current Available Balance: " + availableBalance);
                    System.out.println("Enter the amount to be Deposited:");
                    double depAmt = scanner.nextDouble();

                    try {
                        availableBalance = deposit(depAmt, availableBalance);
                    } catch (TransactionException e) {
                        e.showMsg();
                        e.PanCard();
                    } finally {
                        System.out.println("Your available balance is: " + availableBalance);
                    }
                    break;

                case 2:
                    System.out.println("Current Available Balance: " + availableBalance);
                    System.out.println("Enter the amount to be Withdrawn:");
                    double withAmt = scanner.nextDouble();

                    try {
                        availableBalance = withdrawal(withAmt, availableBalance);
                    } catch (TransactionWithdrowlException e) {
                        System.out.println(e.getMessage());
                    } finally {
                        System.out.println("Your available balance is: " + availableBalance);
                    }
                    break;

                case 3:
                    System.out.println("Exiting... Thank you for using the ATM.");
                    break;

                default:
                    System.out.println("Invalid choice. Please try again.");
                    break;
            }
        } while (choice != 3);
    }

    public static double deposit(double depAmt, double availableBal) throws TransactionException {
        if (depAmt >= 50000) {
            throw new TransactionException("Deposit Amount is more than the limit");
        } else {
            availableBal += depAmt;
            return availableBal;
        }
    }

    public static double withdrawal(double withAmt, double availableBal) throws TransactionWithdrowlException {
        if (withAmt >= 20000) {
            throw new TransactionWithdrowlException("Your amount exceeds the limit. ATM withdrawal limit is less than 20000");
        } else {
            if (withAmt > availableBal) {
                throw new TransactionWithdrowlException("Insufficient balance for withdrawal");
            }
            availableBal -= withAmt;
            return availableBal;
        }
    }
}
