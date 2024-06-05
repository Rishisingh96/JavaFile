package com.Java.Project;

import java.io.*;
import java.util.Date;
import java.util.Objects;
import java.util.Scanner;

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

class ATM extends Account {
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


/*"C:\Users\Rishi singh\.jdks\openjdk-21.0.2\bin\java.exe" "-javaagent:C:\Program Files\JetBrains\IntelliJ IDEA Community Edition 2023.3.4\lib\idea_rt.jar=62135:C:\Program Files\JetBrains\IntelliJ IDEA Community Edition 2023.3.4\bin" -Dfile.encoding=UTF-8 -Dsun.stdout.encoding=UTF-8 -Dsun.stderr.encoding=UTF-8 -classpath "E:\JavaFile\All Java Program\out\production\All Java Program" com.Java.Project.ATM_Interface_3
Creating Account Mode -

Enter account holder name ?
Rishi singh

Enter Username?
rishi234
Enter secret 4 digit pin?
4564
Enter initial deposit amount?50000
Congratulations Account Successfully Created !

Account Details -
Account Number -1111
Account Holder Name - Rishi singh
Balance - 50000.0
Thank You
Creating Account Mode -

Enter account holder name ?
Suman singh

Enter Username?
suman234
Enter secret 4 digit pin?
4532
Enter initial deposit amount?100000
Congratulations Account Successfully Created !

Account Details -
Account Number -1112
Account Holder Name - Suman singh
Balance - 100000.0
Thank You
Creating Account Mode -

Enter account holder name ?
Ranjeet singh

Enter Username?
ranjeet345
Enter secret 4 digit pin?
6532
Enter initial deposit amount?200000
Congratulations Account Successfully Created !

Account Details -
Account Number -1113
Account Holder Name - Ranjeet singh
Balance - 200000.0
Thank You
Creating Account Mode -

Enter account holder name ?
Garima singh

Enter Username?
garima3453
Enter secret 4 digit pin?
1234
Enter initial deposit amount?50000
Congratulations Account Successfully Created !

Account Details -
Account Number -1114
Account Holder Name - Garima singh
Balance - 50000.0
Thank You
Creating Account Mode -

Enter account holder name ?
Mohit

Enter Username?
mohit567
Enter secret 4 digit pin?
3421
Enter initial deposit amount?60000
Congratulations Account Successfully Created !

Account Details -
Account Number -1115
Account Holder Name - Mohit
Balance - 60000.0
Thank You


Welcome to ATM

Enter Your Card/Unique ID
garima3453
Enter Your PIN
1234
Select the Options as Given Below!
Withdraw?-------1
Deposit?----------2
Account Transfer?----------3
Display Account Details?------4
Quit-------5
1

Withdraw Money Mode

Enter amount in Multiples of 100 -
20000
Your Transaction is Processing

Thank You For Banking with Us!
J


Welcome to ATM

Enter Your Card/Unique ID
garima3453
Enter Your PIN
1234
Select the Options as Given Below!
Withdraw?-------1
Deposit?----------2
Account Transfer?----------3
Display Account Details?------4
Quit-------5
4
Displaying account Details

Account Created
Account Number: 1114
USER ID - r: garima3453
Account Holder Name: Garima singh
PIN1234
Date: Sun Jun 02 20:02:58 IST 2024


Screen will automatically timeout ofter 30 seconds........


Welcome to ATM

Enter Your Card/Unique ID
garima3453
Enter Your PIN
1234
Select the Options as Given Below!
Withdraw?-------1
Deposit?----------2
Account Transfer?----------3
Display Account Details?------4
Quit-------5
3
Enter account number to transfer funds?
Process finished with exit code 130
*/

/*Sure, let's go through the code step by step and provide an in-depth explanation along with a dry run and example output.

### Overview
The program simulates an ATM system where users can create accounts, withdraw money, deposit money, transfer money, and view account details. It consists of several classes and methods to handle different functionalities.

### Classes and Methods

1. **Class `Account`**: Represents a bank account with attributes and methods for creating an account.
   - **Static int `acc_number`**: Tracks the account number starting from 1111.
   - **Attributes**: `acc_holder_name`, `pin`, `balance`, `unique_id`, `a_no`.
   - **Method `createAcc`**: Creates a new account by taking user input and writes the details to a file.

2. **Class `ATM`**: Extends `Account` and contains methods for ATM operations.
   - **Methods**:
     - `withdraw(Account acc)`: Withdraws money from the account.
     - `deposit_by_transfer(Account acc, double amount)`: Deposits money into an account via transfer.
     - `deposit(Account acc)`: Deposits money into the account.
     - `Transfer(Account acc1, Account acc2, double amount)`: Transfers money between two accounts.
     - `display_details(Account acc)`: Displays account details.
     - `quit()`: Exits the ATM.

3. **Class `run_atm`**: Contains methods to handle ATM transactions.
   - **Methods**:
     - `account_search_by_unique_id(Account[] ac, String unique_id)`: Searches for an account by unique ID.
     - `account_search_by_unique_id(Account[] ac, int account_number)`: Searches for an account by account number.
     - `demo(Account[] ac)`: Handles the main interaction with the user for ATM transactions.

4. **Main Class `ATM_Interface_3`**: Initializes accounts and starts the ATM interface.

### Detailed Explanation and Dry Run

#### Class `Account`

```java
class Account {
    static int acc_number = 1111;
    String acc_holder_name;
    int pin;
    double balance;
    String unique_id;
    int a_no;

    void createAcc() {
        a_no = acc_number;
        Scanner in = new Scanner(System.in);
        System.out.println("Enter account holder name ?");
        acc_holder_name = in.nextLine();

        System.out.println("\nEnter Username?");
        unique_id = in.nextLine();

        int length_pin = 0;
        do {
            System.out.println("Enter secret 4 digit pin?");
            pin = in.nextInt();
            length_pin = String.valueOf(pin).length();
        } while (length_pin != 4);

        System.out.print("Enter initial deposit amount?");
        balance = in.nextDouble();
        System.out.println("Congratulations Account Successfully Created !\n");
        System.out.println("Account Details - \n" + "Account Number -" + a_no + "\nAccount Holder Name - " + acc_holder_name + "\nBalance - " + balance + "\nThank You");

        // Create a file with the account number
        String fileName = acc_number + ".txt";
        File file = new File(fileName);
        try {
            file.createNewFile();
            FileWriter writer = new FileWriter(file);
            writer.write("Account Created\n");
            writer.write("Account Number: " + acc_number + "\n");
            writer.write("USER ID - r: " + unique_id + "\n");
            writer.write("Account Holder Name: " + acc_holder_name + "\n");
            writer.write("PIN" + pin + "\n");
            writer.write("Date: " + new Date() + "\n\n\n");
            writer.close();
        } catch (IOException e) {
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
```

**Dry Run Example**:
- **Step 1**: Account Creation
  - User inputs:
    - Account holder name: "John Doe"
    - Username: "john123"
    - PIN: 1234
    - Initial deposit: 5000
  - Outputs:
    - Account created with details written to `1111.txt`.

#### Class `ATM`

```java
class ATM extends Account {
    void withdraw(Account acc) {
        Scanner in = new Scanner(System.in);
        System.out.println("\033[H\033[2J");
        System.out.flush();
        System.out.println("Withdraw Money Mode\n");
        System.out.println("Enter amount in Multiples of 100 - ");
        double amount = in.nextDouble();
        if (amount % 100 == 0) {
            if (acc.balance >= amount) {
                acc.balance -= amount;
                System.out.println("Your Transaction is Processing\n");
                try {
                    String fileName = acc.a_no + ".text";
                    FileWriter fileWriter = new FileWriter(fileName, true);
                    BufferedWriter bufferedWriter = new BufferedWriter(fileWriter);
                    bufferedWriter.write("Date: " + new Date() + "\n");
                    bufferedWriter.write("Withdrawal: " + amount + "\n");
                    bufferedWriter.write("Account Number: " + acc.a_no + "\n");
                    bufferedWriter.write("Remaining Balance: " + acc.balance + "\n\n");
                    bufferedWriter.close();
                    fileWriter.close();
                } catch (IOException e) {
                    System.out.println("An error occurred while writing to the file. ");
                    e.printStackTrace();
                }
                System.out.println("Thank You For Banking with Us!");
                try {
                    Thread.sleep(6000);
                } catch (InterruptedException e) {
                    e.printStackTrace();
                }
                System.out.println("\033[H\003\2J");
                System.out.flush();
            } else {
                System.out.println("Insufficient Funds");
            }
        } else {
            System.out.println("Amount not in multiples of 100");
            System.out.println("Try again");
        }
    }

    void deposit_by_transfer(Account acc, double amount) {
        acc.balance += amount;
        try {
            String fileName = acc.a_no + ".txt";
            FileWriter fileWriter = new FileWriter(fileName, true);
            BufferedWriter bufferedWriter = new BufferedWriter(fileWriter);
            bufferedWriter.write("Deposit: " + amount + "\n");
            bufferedWriter.write("Date: " + new Date() + "\n");
            bufferedWriter.write("Account Number: " + acc.a_no + "\n");
            bufferedWriter.write("Remaining Balance: " + acc.balance + "\n\n");
            bufferedWriter.close();
            fileWriter.close();
        } catch (IOException e) {
            System.out.println("An error occurred while writing to the file.");
            e.printStackTrace();
        }
    }

    void deposit(Account acc) {
        Scanner in = new Scanner(System.in);
        System.out.print("\033[H\033[2J");
        System.out.flush();
        System.out.println("Money Deposit Mode\n");
        System.out.println("Enter amount you want to Deposit?");
        double amount = in.nextDouble();
        acc.balance += amount;
        System.out.printf("\033[H\033[2J");
        System.out.flush();
        try {
            String fileName = acc.a_no + ".txt";
            System.out.println("The File Name - " + fileName);
            FileWriter fileWriter = new FileWriter(fileName, true);
            BufferedWriter bufferedWriter = new BufferedWriter(fileWriter);
            bufferedWriter.write("Deposit: " + amount + "\n");
            bufferedWriter.write("Date: " + new Date() + "\n");
            bufferedWriter.write("Account Number: " + acc.a_no + "\n");
            bufferedWriter.write("Remaining Balance: " + acc.balance + "\n\n");
            bufferedWriter.close();
            fileWriter.close();
        } catch (IOException e) {
            System.out.println("An error occurred while writing to the file.");
            e.printStackTrace();
        }
        System.out.printf("Processing Your Request! Please Wait");
        try {
            Thread.sleep(5000);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
        System.out.printf("\033[H\033[2J");
        System.out.flush();
        System.out.println("Transaction completed successfully!");
        System.out.println("\n\nThank you for Banking with Us!");
        System.out.println("----Going to Login Page----");
        try {
            Thread.sleep(3000);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
    }

    void Transfer(Account acc1, Account acc2, double amount) {
        if (acc1.balance >= amount) {
            acc1.balance -= amount;
            ATM a = new ATM();
            a.deposit_by_transfer(acc2, amount);
            try {
                String fileName = acc1.a_no + ".txt";
                FileWriter fileWriter = new FileWriter(fileName, true);
                BufferedWriter bufferedWriter = new BufferedWriter(fileWriter);
                bufferedWriter.write("Transferred: " + amount + "\n");
                bufferedWriter.write("Date: " + new Date() + "\n");
                bufferedWriter.write("Account Number: " + acc1.a_no + "\n");
                bufferedWriter.write("Remaining Balance: " + acc1.balance + "\n\n");
                bufferedWriter.close();
                fileWriter.close();
            } catch (IOException e) {
                System.out.println("An error occurred while writing to the file.");
                e.printStackTrace();
            }
            System.out.println("Processing Your Request, Please Wait !\n");
            try {
                Thread.sleep(

5000);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
            System.out.printf("\033[H\033[2J");
            System.out.flush();
            System.out.println("\nAccount Transfer completed Successfully!\n ---Going to Login Page----- ");
            try {
                Thread.sleep(5000);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }
    }

    void display_details(Account acc) {
        System.out.print("\033[H\033[2J");
        System.out.flush();
        System.out.println("Displaying account Details\n");
        try {
            Thread.sleep(2000);
        } catch (InterruptedException e) {
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
        } catch (FileNotFoundException e) {
            System.out.println("File not found: " + e.getMessage());
        } catch (IOException e) {
            System.out.println("Error reading file: " + e.getMessage());
        }
        System.out.println("Screen will automatically timeout after 30 seconds........");
        try {
            Thread.sleep(30000);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
    }

    void quit() {
        System.out.print("Thank You For Banking with Us !!");
    }
}
```

**Dry Run Example**:
- **Step 2**: Withdrawal
  - User inputs:
    - Unique ID: "john123"
    - PIN: 1234
    - Withdrawal amount: 2000
  - Outputs:
    - Balance before: 5000
    - Balance after: 3000
    - Details written to `1111.txt`.

#### Class `run_atm`

```java
class run_atm {
    int account_search_by_unique_id(Account[] ac, String unique_id) {
        for (int i = 0; i < 5; i++) {
            if (Objects.equals(unique_id, ac[i].unique_id))
                return i;
        }
        return -1;
    }

    int account_search_by_unique_id(Account[] ac, int account_number) {
        for (int i = 0; i < 5; i++) {
            if (Objects.equals(account_number, ac[i].a_no))
                return i;
        }
        return -1;
    }

    void demo(Account[] ac) {
        Scanner in = new Scanner(System.in);
        System.out.print("\n\nWelcome to ATM\n");
        System.out.println("\nEnter Your Card/Unique ID");
        String unique_id = in.nextLine();
        int i = account_search_by_unique_id(ac, unique_id);
        if (i == -1) {
            System.out.println("Account not registered Yet!");
            try {
                Thread.sleep(3000);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
            return;
        } else {
            System.out.println("Enter Your PIN");
            int pin = in.nextInt();
            if (pin == ac[i].pin) {
                System.out.println("Select the Options as Given Below!\nWithdraw?-------1\nDeposit?----------2\nAccount Transfer?----------3\nDisplay Account Details?------4\nQuit-------5");
                int ch;
                ATM atm = new ATM();
                ch = in.nextInt();
                switch (ch) {
                    case 1 -> atm.withdraw(ac[i]);
                    case 2 -> atm.deposit(ac[i]);
                    case 3 -> {
                        System.out.print("\033[H\033[2J");
                        System.out.flush();
                        System.out.print("Enter account number to transfer funds?");
                        int account_transfer = in.nextInt();
                        int j = account_search_by_unique_id(ac, account_transfer);
                        if (j == -1) {
                            System.out.println("Account not yet Registered!");
                            return;
                        } else {
                            System.out.println("Enter Amount for Transferring funds?");
                            double amount = in.nextDouble();
                            atm.Transfer(ac[i], ac[j], amount);
                        }
                    }
                    case 4 -> atm.display_details(ac[i]);
                    case 5 -> atm.quit();
                }
            } else {
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
```

**Dry Run Example**:
- **Step 3**: ATM Interaction
  - User inputs:
    - Unique ID: "john123"
    - PIN: 1234
    - Option: 1 (Withdraw)
  - Outputs:
    - Withdraw successful
    - Updated balance in `1111.txt`.

#### Main Class `ATM_Interface_3`

```java
public class ATM_Interface_3 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        Account[] ac = new Account[5];
        for (int i = 0; i < 5; i++) {
            System.out.print("\033[H\033[2J");
            System.out.flush();
            System.out.println("Creating Account Mode - \n");
            ac[i] = new Account();
            ac[i].createAcc();
            System.out.print("\033[H\033[2J");
            System.out.flush();
        }

        run_atm ob = new run_atm();
        for (; ; ) {
            System.out.print("\033[H\033[2J");
            System.out.flush();
            ob.demo(ac);
        }
    }
}
```

**Example Output**:
- User creates 5 accounts with unique details.
- User performs various ATM operations such as withdrawal, deposit, transfer, and viewing account details.
- Outputs reflect successful transactions and account updates written to corresponding files.

### Summary
This code simulates a simple ATM system where users can create accounts and perform various banking transactions. It uses file handling to save and retrieve account details. The dry run demonstrates how the system processes user inputs and updates account information accordingly.
*/

/*The lines:

```java
System.out.print("\033[H\033[2J");
System.out.flush();
```

are used to clear the console screen. Here's an explanation of each line and its purpose:

1. **Clearing the Console**:
   ```java
   System.out.print("\033[H\033[2J");
   ```
   - **"\033[H"**: This is an ANSI escape code that moves the cursor to the home position (top-left corner) of the console.
   - **"\033[2J"**: This is another ANSI escape code that clears the entire screen.

2. **Flushing the Output Stream**:
   ```java
   System.out.flush();
   ```
   - This ensures that all the output written to the console (including the escape codes) is actually sent to the console immediately. Without this, the output might be buffered and not appear until later.

### Why These Lines are Used

1. **Improved User Experience**:
   - Clearing the screen before displaying new information helps in providing a cleaner and more readable interface. It prevents the clutter of previous commands and outputs, making it easier for users to focus on the current state and options.

2. **Simulating a Real ATM Environment**:
   - In a real ATM, the screen typically refreshes and clears after each transaction or input, showing only the relevant information. These lines help simulate that behavior in the console application, making the user interaction more intuitive and realistic.

By using these lines, the program ensures that each new screen or menu is displayed clearly without the remnants of previous interactions, thereby enhancing the overall usability and user experience.
*/