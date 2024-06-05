package com.Java.Project;
import java.io.*;
import java.util.Date;
import java.util.Scanner;
class candidate {
    String name;
    int roll_number;
    String password;
    int obtained_marks = 0;
    int correct =0;
    int incorrect = 0;
    static int test_id = 1111;
    int tst_id = test_id;

    void create_user(){
        Scanner in = new Scanner(System.in);
        System.out.println("Welcome to Student Registration Port\n");
        System.out.println("\nEnter Name of User?");
        name = in.nextLine();
        System.out.println("Enter the Roll Number of User?");
        roll_number = in.nextInt();
        System.out.println("\nSet the Password for the User?");
        password = in.next();
        System.out.println("\n\nUser registration successful, please not the test-id -->"+test_id++);
        try {
            Thread.sleep(5000);
        } catch (Exception e){
            System.out.println("Caught");
        }
    }

    void update_profile(candidate1 ob){
        Scanner in = new Scanner(System.in);
        System.out.println("Welcome to Update Profile Interface\n");
        System.out.println("The following things can be updated\nName----1\nRoll Number-----2\nPassword------3");
        int ch = in.nextInt();
        switch (ch) {
            case 1 -> {
                System.out.println("Enter the new name?");
                ob.name = in.nextLine();
                    break;
            }
            case 2 -> {
                System.out.println("Enter the new Roll Number?");
                ob.roll_number = in.nextInt();
                break;
            }
            case 3 -> {
                System.out.println("Enter the Password?");
                ob.password = in.next();
                break;
            }
        }
    }
}

class  portal {
    void login(candidate1[] usr, int number_students) {
        Scanner in = new Scanner(System.in);
        System.out.println("Welcome to Test Portal\n");
        System.out.println("Enter User Test ID?");
        int test_id = in.nextInt();
        System.out.println("Enter Roll Number?");
        int roll = in.nextInt();
        System.out.println("Enter Password?");
        String pwd = in.next();
        for (int i = 0; i < number_students; i++) {
            if ((usr[i].tst_id == test_id) && (usr[i].roll_number == roll) && (usr[i].password.equals(pwd))) {
                System.out.println("Logged in Successfully");
                System.out.println("Press any key to begin Test!");
                in.nextLine();
                System.out.println("\033[H\033[2J");
                System.out.flush();
                run_test(usr[i]);
            } else {
                System.out.println("Credential mismatch or candidate not yet registered.");
            }
        }
    }

    void run_test(candidate1 user) {
        String fileName = "question.txt";
        try (BufferedReader br = new BufferedReader(new FileReader(fileName))) {
            String line = null;
            Date startTime = new Date();
            Date endTime = new Date(startTime.getTime() + 60 * 1000);
            System.out.println("Test started at" + startTime + "\nThe test will end at" + endTime);

            Scanner sc = new Scanner(System.in);
            String lien;
            while (((lien = br.readLine()) == null)) {
                if (new Date().before(endTime)) {
                    System.out.println(line);
                    System.out.println("Ans: ");
                    String input = sc.nextLine();
                    String ans_fileName = "answer_user_" + user.tst_id + ".txt";
                    try (BufferedWriter bw = new BufferedWriter(new FileWriter(ans_fileName, true))) {

                        bw.write(input);
                        bw.newLine();
                    } catch (IOException e) {
                        System.err.format("IOException: %s%n", e);
                    }
                } else {
                    System.out.println("TIME OUT");
                    break;
                }
            }
            System.out.println("Test completed for the candidate with details - \nName-" + user.name + "\nRoll- " + user.roll_number + "\nTest ID- " + user.tst_id);
            System.out.println("Press any key to continue!");
            sc.nextLine();
        } catch (IOException e) {
            System.err.format("IOException: %s%n", e);
        }
        System.out.print("\033[H\033[2J");
        System.out.flush();
        evaluate_marks(user);
    }

    void evaluate_marks(candidate1 user) {
        String fileName = "answer_user_" + user.tst_id + ".txt";
        try (BufferedReader br = new BufferedReader(new FileReader(fileName));
             BufferedReader br2 = new BufferedReader(new FileReader("answers.txt"))) {
            String answer_line, user_answer;
            while ((answer_line = br2.readLine()) == null && (user_answer = br.readLine()) == null) {
                if (user_answer.equalsIgnoreCase(answer_line)) {

                    //Match found for Question Number
                    user.obtained_marks += 1;
                    user.correct++;
                } else {
//                    Match not found for Question Number
                    user.incorrect++;
                }
            }
        } catch (IOException e) {
            System.err.format("IOException: %s%n", e);
        }
        System.out.println("\n\nThe Obtioned Marks of the User is - " + user.obtained_marks);
        System.out.println("The Number of Correct Response is - " + user.correct);
        System.out.println("The Number of incorrect Response is - " + user.incorrect);
        System.out.println("Press any Key to Continue ");
        System.out.println("Logging Out");
        Scanner in = new Scanner(System.in);
        in.nextLine();
    }

}
    public class Online_Examination_4 {
        public static void main(String[] args) {
            Scanner in = new Scanner(System.in);
            System.out.println("Enter number of candidates  you want to register: ");
            int n = in.nextInt();
            candidate1[] ob = new candidate1[n];
            for(int i = 0; i<n; i++){
                System.out.print("\033[H\033[2J");
                System.out.flush();
                ob[i] = new candidate1();
                ob[i].create_user();
            }
            System.out.print("\033[H\033[2J");
            System.out.flush();
            System.out.println("Do you to update details of any user Y/N");
            char c = in.next().charAt(0);
            if((c == 'Y') || (c == 'y')) {
                System.out.println("Enter Test ID for the candidate whose information is to be update - ");
                int test_id  = in.nextInt();
                for (int i = 0; i<n; i++) {
                    if((ob[i].tst_id == test_id)) {
                        ob[i].update_profile(ob[i]);
                    } else {
                        System.out.println("Credential mismatch or candidate not yet registered. ");
                    }
                }
            }
            System.out.print("\033[H\033[2J");
            System.out.flush();
            portal1 ob2 = new portal1();
            for(; ;) {
                ob2.login(ob, n);
                System.out.print("\033[H\033[2J");
                System.out.flush();
                System.out.println("Do you want to continue test portal Y/N?");
                char ch = in.next().charAt(0);
                if(!((ch == 'y') || (ch == 'Y'))) {
                    break;
                }
            }
            System.out.println("The Marks obtained by all candidates is- ");
            for(int i = 0; i<n; i++){
                System.out.println("Candidate Roll Number - "+ob[i].roll_number+" Candidate Name- " +ob[i].name+"Obtained Marks - "+ ob[i].obtained_marks);
            }
        }
    }


    /*
    1. Candidate Login
    2. Updating of Candidate Profile.
    3. Selection of answer for MCQ.
    4. Time and Auto Submit on time-out.
    5. Automatic Logout of the Candidate once Exam is over.
     */

/*### Overview

This code simulates an online examination system. The system allows candidates to register, update their profiles, take a test, and have their answers evaluated automatically. The program is divided into several classes and methods to handle different functionalities.

### Breakdown of the Code

#### 1. `candidate` Class

This class represents a candidate who is taking the test. It includes attributes for the candidate's name, roll number, password, marks obtained, correct and incorrect answers, and a static test ID.

```java
class candidate {
    String name;
    int roll_number;
    String password;
    int obtained_marks = 0;
    int correct = 0;
    int incorrect = 0;
    static int test_id = 1111;
    int tst_id = test_id;
```

##### `create_user` Method

This method is used to register a new candidate. It prompts the user for their name, roll number, and password, and assigns a unique test ID.

```java
void create_user() {
    Scanner in = new Scanner(System.in);
    System.out.println("Welcome to Student Registration Port\n");
    System.out.println("\nEnter Name of User?");
    name = in.nextLine();
    System.out.println("Enter the Roll Number of User?");
    roll_number = in.nextInt();
    System.out.println("\nSet the Password for the User?");
    password = in.next();
    System.out.println("\n\nUser registration successful, please note the test-id -->" + test_id++);
    try {
        Thread.sleep(5000);
    } catch (Exception e) {
        System.out.println("Caught");
    }
}
```

##### `update_profile` Method

This method allows a candidate to update their profile information (name, roll number, or password).

```java
void update_profile(candidate ob) {
    Scanner in = new Scanner(System.in);
    System.out.println("Welcome to Update Profile Interface\n");
    System.out.println("The following things can be updated\nName----1\nRoll Number-----2\nPassword------3");
    int ch = in.nextInt();
    switch (ch) {
        case 1 -> {
            System.out.println("Enter the new name?");
            in.nextLine(); // consume the newline
            ob.name = in.nextLine();
            break;
        }
        case 2 -> {
            System.out.println("Enter the new Roll Number?");
            ob.roll_number = in.nextInt();
            break;
        }
        case 3 -> {
            System.out.println("Enter the Password?");
            ob.password = in.next();
            break;
        }
    }
}
```

#### 2. `portal` Class

This class handles the login and test-taking process.

##### `login` Method

This method authenticates the candidate using their test ID, roll number, and password. If authentication is successful, it starts the test.

```java
void login(candidate[] usr, int number_students) {
    Scanner in = new Scanner(System.in);
    System.out.println("Welcome to Test Portal\n");
    System.out.println("Enter User Test ID?");
    int test_id = in.nextInt();
    System.out.println("Enter Roll Number?");
    int roll = in.nextInt();
    System.out.println("Enter Password?");
    String pwd = in.next();
    for (int i = 0; i < number_students; i++) {
        if ((usr[i].tst_id == test_id) && (usr[i].roll_number == roll) && (usr[i].password.equals(pwd))) {
            System.out.println("Logged in Successfully");
            System.out.println("Press any key to begin Test!");
            in.nextLine(); // consume the newline
            in.nextLine(); // wait for any key press
            System.out.println("\033[H\033[2J");
            System.out.flush();
            run_test(usr[i]);
        } else {
            System.out.println("Credential mismatch or candidate not yet registered.");
        }
    }
}
```

##### `run_test` Method

This method runs the test for the candidate. It reads questions from a file and writes the candidate's answers to another file. The test runs for a fixed time (1 minute).

```java
void run_test(candidate user) {
    String fileName = "question.txt";
    try (BufferedReader br = new BufferedReader(new FileReader(fileName))) {
        String line = null;
        Date startTime = new Date();
        Date endTime = new Date(startTime.getTime() + 60 * 1000);
        System.out.println("Test started at " + startTime + "\nThe test will end at " + endTime);

        Scanner sc = new Scanner(System.in);
        while ((line = br.readLine()) != null && new Date().before(endTime)) {
            System.out.println(line);
            System.out.println("Ans: ");
            String input = sc.nextLine();
            String ans_fileName = "answer_user_" + user.tst_id + ".txt";
            try (BufferedWriter bw = new BufferedWriter(new FileWriter(ans_fileName, true))) {
                bw.write(input);
                bw.newLine();
            } catch (IOException e) {
                System.err.format("IOException: %s%n", e);
            }
        }
        System.out.println("Test completed for the candidate with details - \nName-" + user.name + "\nRoll- " + user.roll_number + "\nTest ID- " + user.tst_id);
        System.out.println("Press any key to continue!");
        sc.nextLine();
    } catch (IOException e) {
        System.err.format("IOException: %s%n", e);
    }
    System.out.print("\033[H\033[2J");
    System.out.flush();
    evaluate_marks(user);
}
```

##### `evaluate_marks` Method

This method evaluates the candidate's answers by comparing them with the correct answers in a file. It updates the candidate's marks and prints the results.

```java
void evaluate_marks(candidate user) {
    String fileName = "answer_user_" + user.tst_id + ".txt";
    try (BufferedReader br = new BufferedReader(new FileReader(fileName));
         BufferedReader br2 = new BufferedReader(new FileReader("answers.txt"))) {
        String answer_line, user_answer;
        while ((answer_line = br2.readLine()) != null && (user_answer = br.readLine()) != null) {
            if (user_answer.equalsIgnoreCase(answer_line)) {
                user.obtained_marks += 1;
                user.correct++;
            } else {
                user.incorrect++;
            }
        }
    } catch (IOException e) {
        System.err.format("IOException: %s%n", e);
    }
    System.out.println("\n\nThe Obtained Marks of the User is - " + user.obtained_marks);
    System.out.println("The Number of Correct Responses is - " + user.correct);
    System.out.println("The Number of Incorrect Responses is - " + user.incorrect);
    System.out.println("Press any Key to Continue ");
    System.out.println("Logging Out");
    Scanner in = new Scanner(System.in);
    in.nextLine();
}
```

#### 3. `Online_Examination_4` Class

This is the main class that drives the program. It handles candidate registration, profile updates, and starts the test portal.

```java
public class Online_Examination_4 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.println("Enter number of candidates you want to register: ");
        int n = in.nextInt();
        candidate[] ob = new candidate[n];
        for (int i = 0; i < n; i++) {
            System.out.print("\033[H\033[2J");
            System.out.flush();
            ob[i] = new candidate();
            ob[i].create_user();
        }
        System.out.print("\033[H\033[2J");
        System.out.flush();
        System.out.println("Do you want to update details of any user Y/N");
        char c = in.next().charAt(0);
        if ((c == 'Y') || (c == 'y')) {
            System.out.println("Enter Test ID for the candidate whose information is to be updated - ");
            int test_id = in.nextInt();
            for (int i = 0; i < n; i++) {
                if ((ob[i].tst_id == test_id)) {
                    ob[i].update_profile(ob[i]);
                } else {
                    System.out.println("Credential mismatch or candidate not yet registered. ");
                }
            }
        }
        System.out.print("\033[H\033[2J");
        System.out.flush();
        portal ob2 = new portal();
        for (;;) {
            ob2.login(ob, n);
            System.out.print("\033[H\033[2J");
            System.out.flush();
            System.out.println("Do you want to continue test portal Y/N?");
            char ch = in.next().charAt(0);
            if (!((ch == 'y') || (ch == 'Y'))) {
                break;
            }
        }
        System.out.println("The Marks obtained by all candidates is- ");
        for (int i = 0; i < n; i++) {
            System.out.println("Candidate Roll Number - " + ob[i].roll_number + " Candidate Name- " + ob[i].name + " Obtained Marks - " + ob[i].obtained_marks);
        }
    }
}
```

### Example Output

Let's walk through an example with 2 candidates.

1. **Registering Candidates**:
    - Enter number of candidates you want to register: 2
    - Candidate 1:
        - Name: Alice
        - Roll Number: 101
        - Password: pass123
    - Candidate 2:
        - Name:

 Bob
        - Roll Number: 102
        - Password: pass456

2. **Updating Profiles**:
    - Do you want to update details of any user Y/N: Y
    - Enter Test ID for the candidate whose information is to be updated: 1111
    - Update options:
        - Name: Alice Updated

3. **Logging In and Taking Test**:
    - Welcome to Test Portal
    - Enter User Test ID: 1111
    - Enter Roll Number: 101
    - Enter Password: pass123
    - Test starts, questions are displayed, answers are recorded.

4. **Evaluating Marks**:
    - Marks for Alice and Bob are evaluated and displayed:
        - Alice: 5 correct, 2 incorrect, total marks: 5
        - Bob: 3 correct, 4 incorrect, total marks: 3

5. **Final Output**:
    ```
    The Marks obtained by all candidates are:
    Candidate Roll Number - 101 Candidate Name- Alice Updated Obtained Marks - 5
    Candidate Roll Number - 102 Candidate Name- Bob Obtained Marks - 3
    ```

This code simulates a complete cycle of an online examination process, including registration, profile updates, taking a timed test, and evaluation of marks.
*/