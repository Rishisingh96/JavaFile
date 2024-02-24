package com.Oasis_Infobyte_Rishi;
import java.io.*;
import java.util.*;

class Account{
    static int acc_number = 1111;
    String acc_holder_name ;
    int pin;
    double balance;
    String unique_id;
    int a_no;
    void createAcc(){
        a_no = acc_number;
        Scanner in = new Scanner(System.in);
        System.out.println("Enter account holder name ?");
        acc_holder_name = in.nextLine();
        System.out.println("\nEnter Username?");
        unique_id = in.nextLine();

        int length_pin = 0;
        do{
            System.out.println("Enter secret 4 digit pin?");
            pin = in.nextInt();
            length_pin = String.valueOf(pin).length();
        }while (length_pin != 4);

        System.out.print("Enter initial deposit amount?");
        balance = in.nextDouble();
        System.out.println("Congratulations Account Successfully Created !\n");
        System.out.println("Account Details - \n" + "Account Number -" + a_no + "\nAccount Holder Name - " + acc_holder_name + "\nBalance - " + balance + "\nThank You" );

        //  Create a file with the account number
        String fileName = acc_number + ".txt";
        File file = new File(fileName);
        try{
            file.createNewFile();
            FileWriter writer = new FileWriter(file);
            writer.write("Account Created\n");
            writer.write("Account Number: "+ acc_number + "\n");
            writer.write("USER ID - r: " + unique_id + "\n");
            writer.write("Account Holder Name: " + acc_holder_name + "\n");
            writer.write("PIN" + pin +"\n");
            writer.write("Date: " + new Date() + "\n\n\n");
            writer.close();

            // System.out.println("File" + fileName + created successfully.");
        } catch (IOException e){
            System.out.println("An error occurred while creating the file " + fileName);
            e.printStackTrace();
        }
        try {
            Thread.sleep(5000);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
        acc_number++;
    }
}

class ATM {
    void withdraw(Account acc){
        Scanner in = new Scanner(System.in);
        System.out.println("\033[H\033[2J");
        System.out.flush();
        System.out.println("Withdraw Money Mode\n");
        System.out.println("Enter amount in Multiples of 100 - ");
        double amount = in.nextDouble();
        if(amount % 100 == 0) {
            if(acc.balance >= amount){
                acc.balance -= amount;
                System.out.println("Your Transaction is Processing\n");
                try{

                    // Open the text file for appending new transaction
                    String fileName = acc.a_no + ".text";

                    //System.out.println("The File Name - " + fileName);
                    FileWriter fileWriter = new FileWriter(fileName, true);
                    BufferedWriter bufferedWriter = new BufferedWriter(fileWriter);

                    // Write the transaction details to the text file
                    bufferedWriter.write("Date: " + new Date() + "\n");
                    bufferedWriter.write( "Withdrawal: "+ amount + "\n");
                    bufferedWriter.write( " Account Number :"+acc.a_no+"\n");
                    bufferedWriter.write( "Remaining Balance: " + acc.balance + "\n\n");

                    // Close the file writer and buffered writer
                    bufferedWriter.close();
                    fileWriter.close();
                } catch (IOException e){
                    System.out.println("An error occurred while writing to the file. ");
                    e.printStackTrace();
                }
                System.out.println("Thank You For Banking with Us!");
                try {
                    Thread.sleep(6000);
                }catch ( InterruptedException e){
                    e.printStackTrace();
                }
                System.out.println("\033[H\003\2J");
                System.out.flush();
            }else {
                System.out.println("Insufficient Funds");
            }
        }else {
            System.out.println("Amount not in multiples of 100");
            System.out.println("Try again");
        }
    }
    void deposit_by_transfer(Account acc , double amount){
        acc.balance += amount;
        try{
            String fileName = acc.a_no + ".txt";
            FileWriter fileWriter = new FileWriter(fileName, true);
            BufferedWriter bufferedWriter = new BufferedWriter(fileWriter);
            bufferedWriter.write("Deposit: "+amount+"\n");
            bufferedWriter.write("Date: "+new Date()+"\n");
            bufferedWriter.write("Account Number: "+acc.a_no +"\n");
            bufferedWriter.write("Remaining Balance: "+ acc.balance + "\n\n");
            bufferedWriter.close();
            fileWriter.close();

        }catch (IOException e){
            System.out.println("An error occurred while writing to the file.");
            e.printStackTrace();
        }
    }
    void deposit(Account acc){
        Scanner in = new Scanner(System.in);
        System.out.print("\033[H\033[2J");
        System.out.flush();
        System.out.println("Money Deposit Mode\n");
        System.out.println("Enter amount you want to Deposit?");
        double amount = in.nextDouble();
        acc.balance += amount;
        System.out.printf("\033[H\033[2J");
        System.out.flush();
        try{
            String fileName = acc.a_no + ".txt";
            System.out.println("The File Name - " +fileName);
            FileWriter fileWriter = new FileWriter(fileName, true);
            BufferedWriter bufferedWriter = new BufferedWriter(fileWriter);
            bufferedWriter.write("Deposit: "+amount+"\n");
            bufferedWriter.write("Date: "+new Date()+"\n");
            bufferedWriter.write("Account Number: "+acc.a_no +"\n");
            bufferedWriter.write("Remaining Balance: "+ acc.balance + "\n\n");
            bufferedWriter.close();
            fileWriter.close();

        }catch (IOException e){
            System.out.println("An error occurred while writing to the file.");
            e.printStackTrace();
        }
        System.out.printf("Processing Your Request! Please Wait");
        try {
            Thread.sleep(5000);
        } catch (InterruptedException e){
            e.printStackTrace();
        }
        System.out.printf("\033[H\033[2J");
        System.out.flush();
        System.out.println("Transaction completed successfully!");
        System.out.println("\n\nThank you for Banking with Us!");

        System.out.println("----Going to Login Page----");
        try{
            Thread.sleep(3000);

        }catch (InterruptedException e){
            e.printStackTrace();
        }
    }
    void Transfer(Account acc1,Account acc2, double amount) {
        if(acc1.balance >= amount){
            acc1.balance -= amount;
            ATM a = new ATM();
            a.deposit_by_transfer(acc2,amount);
            try{
                String fileName = acc1.a_no + ".txt";
                FileWriter fileWriter = new FileWriter(fileName, true);
                BufferedWriter bufferedWriter = new BufferedWriter(fileWriter);
                bufferedWriter.write("Transferred: "+amount+"\n");
                bufferedWriter.write("Date: "+new Date()+"\n");
                bufferedWriter.write("Account Number: "+acc1.a_no +"\n");
                bufferedWriter.write("Remaining Balance: "+ acc1.balance + "\n\n");
                bufferedWriter.close();
                fileWriter.close();

            }catch (IOException e){
                System.out.println("An error occurred while writing to the file.");
                e.printStackTrace();
            }
            System.out.println("Processing Your Request, Please Wait !\n");
            try {
                Thread.sleep(5000);
            } catch (InterruptedException e){
                e.printStackTrace();
            }
            System.out.printf("\033[H\033[2J");
            System.out.flush();
            System.out.println("\nAccount Transfer completed Successfully!\n ---Going to Login Page----- ");
            try{
                Thread.sleep(5000);
            } catch (InterruptedException e){
                e.printStackTrace();
            }
        }
    }

    void display_details(Account acc){
        System.out.print("\033[H\033[2J");
        System.out.flush();
        System.out.println("Displaying account Details\n");
        try {
            Thread.sleep(2000);
        } catch (InterruptedException e){
            e.printStackTrace();
        }
        String file_name = String.valueOf(acc.a_no) + ".txt";
        File file = new File(file_name);
        try {
            FileReader fileReader = new FileReader(file);
            BufferedReader bufferedReader = new BufferedReader(fileReader);
            String line = null;
            while ((line = bufferedReader.readLine()) != null) {
                System.out.println(line);
            }
            bufferedReader.close();
        } catch (FileNotFoundException e){
            System.out.println("File not found: "+ e.getMessage());
        } catch (IOException e){
            System.out.println("Error reading file: " + e.getMessage());
    }
        System.out.println("Screen will automatically timeout ofter 30 seconds........");
        try{
            Thread.sleep(30000);
        } catch (InterruptedException e){
            e.printStackTrace();
        }
    }
    void quit(){
        System.out.print("Thank You For Banking with Us !!");
    }
}

    class run_atm {
    int account_search_by_unique_id(Account[] ac, String unique_id){
        for(int i = 0; i<5; i++){
            if(Objects.equals(unique_id,ac[i].unique_id))
                return  i;
        }
        return -1;
    }
    int account_search_by_unique_id(Account[] ac, int account_number) {
        for(int i = 0; i<5; i++) {
            if(Objects.equals(account_number, ac[i].a_no ))
                return  i;
        }
        return  -1;
    }
    void demo (Account[] ac){
        Scanner in = new Scanner(System.in);
        System.out.print("\n\nWelcome to ATM\n");
        System.out.println("\nEnter Your Card/Unique ID");
        String unique_id = in.nextLine();
        int i = account_search_by_unique_id(ac,unique_id);
        if(i == -1){
            System.out.println("Account not registered Yet!");
            try{
                Thread.sleep(3000);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
            return;
        }else {
            System.out.println("Enter Your PIN");
            int pin  = in.nextInt();
            if(pin == ac[i].pin){
//                Account Details
                System.out.println("Select the Options as Given Below!\nWithdraw?-------1\nDeposit?----------2\nAccount Transfer?----------3\nDisplay Account Details?------4\nQuit-------5");
                int ch;
                ATM atm = new ATM();
                ch = in.nextInt();
                switch (ch){
                    case 1 -> atm.withdraw(ac[i]);
                    case 2 -> atm.deposit(ac[i]);
                    case 3 ->{
                        System.out.print("\033[H\033[2J");
                        System.out.flush();
                        System.out.print("Enter account number to transfer funds?");
                        int account_transfer = in.nextInt();
                        int j = account_search_by_unique_id(ac, account_transfer);
                        if(j == -1) {
                            System.out.println("Account not yet Registered!");
                            return;
                        }else {
                            System.out.println("Enter Amount for Transferring founds?");
                            double amount = in.nextDouble();
                            atm.Transfer(ac[i], ac[j],amount);
                        }
                    }
                    case  4 -> atm.display_details(ac[i]);
                    case 5 -> atm.quit();
                }
            } else{
                System.out.println("Wrong PIN Entered!\n Try Again");
                try {
                    Thread.sleep(3000);
                } catch (InterruptedException e) {
                    e.printStackTrace();
                }
                return;
            }
        }
    }
}
public class ATM_Interface_3 {
    public static void main(String[] args){
        Scanner in = new Scanner(System.in);
        Account[] ac = new Account[5];
        for(int i = 0; i<5; i++) {
            System.out.print("\033[H\033[2J");
            System.out.flush();
            System.out.println("Creating Account Mode - \n");
            ac[i] = new Account();
            ac[i].createAcc();
            System.out.print("\033[H\033[2J");
            System.out.flush();
        }

        run_atm ob = new run_atm();
        for(; ; ) {
            System.out.print("\033[H\033[2J");
            System.out.flush();
            ob.demo(ac);
        }
    }

}
