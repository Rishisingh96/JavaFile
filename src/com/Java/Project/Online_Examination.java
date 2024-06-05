package com.Java.Project;

import java.io.*;
import java.util.Date;
import java.util.Scanner;

class candidate1 {
    String name;
    int roll_number;
    String password;
    int obtained_marks = 0;
    int correct = 0;
    int incorrect = 0;
    static int test_id = 1111;
    int tst_id = test_id;

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
            Thread.sleep(2000);
        } catch (Exception e) {
            System.out.println("Caught");
        }
    }

    void update_profile(candidate1 ob) {
        Scanner in = new Scanner(System.in);
        System.out.println("Welcome to Update Profile Interface\n");
        System.out.println("The following things can be updated\nName----1\nRoll Number-----2\nPassword------3");
        int ch = in.nextInt();
        in.nextLine(); // consume the newline character
        switch (ch) {
            case 1 -> {
                System.out.println("Enter the new name?");
                ob.name = in.nextLine();
            }
            case 2 -> {
                System.out.println("Enter the new Roll Number?");
                ob.roll_number = in.nextInt();
            }
            case 3 -> {
                System.out.println("Enter the Password?");
                ob.password = in.next();
            }
        }
    }
}

class portal1 {
    void login(candidate1[] usr, int number_students) {
        Scanner in = new Scanner(System.in);
        System.out.println("Welcome to Test Portal\n");
        System.out.println("Enter User Test ID?");
        int test_id = in.nextInt();
        System.out.println("Enter Roll Number?");
        int roll = in.nextInt();
        System.out.println("Enter Password?");
        String pwd = in.next();
        boolean loggedIn = false;
        for (int i = 0; i < number_students; i++) {
            if ((usr[i].tst_id == test_id) && (usr[i].roll_number == roll) && (usr[i].password.equals(pwd))) {
                System.out.println("Logged in Successfully");
                System.out.println("Press Enter to begin Test!");
                in.nextLine(); // consume the newline character
                in.nextLine(); // wait for Enter key press
                clearConsole();
                run_test(usr[i]);
                loggedIn = true;
                break;
            }
        }
        if (!loggedIn) {
            System.out.println("Credential mismatch or candidate not yet registered.");
        }
    }

    void run_test(candidate1 user) {
        String questionFile = "question.txt";
        String answerFile = "answer_user_" + user.tst_id + ".txt";

        try (BufferedReader br = new BufferedReader(new FileReader(questionFile))) {
            String line;
            Date startTime = new Date();
            Date endTime = new Date(startTime.getTime() + 60 * 1000);
            System.out.println("Test started at " + startTime + "\nThe test will end at " + endTime);

            Scanner sc = new Scanner(System.in);
            try (BufferedWriter bw = new BufferedWriter(new FileWriter(answerFile, true))) {
                while ((line = br.readLine()) != null) {
                    if (new Date().before(endTime)) {
                        System.out.println(line);
                        System.out.print("Ans: ");
                        String input = sc.nextLine();
                        bw.write(input);
                        bw.newLine();
                    } else {
                        System.out.println("TIME OUT");
                        break;
                    }
                }
            }
            System.out.println("Test completed for the candidate with details - \nName-" + user.name + "\nRoll- " + user.roll_number + "\nTest ID- " + user.tst_id);
            System.out.println("Press Enter to continue!");
            sc.nextLine();
        } catch (IOException e) {
            System.err.format("IOException: %s%n", e);
        }
        clearConsole();
        evaluate_marks(user);
    }

    void evaluate_marks(candidate1 user) {
        String userAnswerFile = "answer_user_" + user.tst_id + ".txt";
        String correctAnswersFile = "answers.txt";
        try (BufferedReader userBr = new BufferedReader(new FileReader(userAnswerFile));
             BufferedReader correctBr = new BufferedReader(new FileReader(correctAnswersFile))) {
            String correctAnswer, userAnswer;
            while ((correctAnswer = correctBr.readLine()) != null && (userAnswer = userBr.readLine()) != null) {
                if (userAnswer.equalsIgnoreCase(correctAnswer)) {
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
        System.out.println("Press Enter to Continue ");
        System.out.println("Logging Out");
        new Scanner(System.in).nextLine();
    }

    private void clearConsole() {
        try {
            if (System.getProperty("os.name").contains("Windows")) {
                new ProcessBuilder("cmd", "/c", "cls").inheritIO().start().waitFor();
            } else {
                System.out.print("\033[H\033[2J");
                System.out.flush();
            }
        } catch (Exception ex) {
            System.out.println("Error clearing console: " + ex.getMessage());
        }
    }
}

public class Online_Examination {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.println("Enter number of candidates you want to register: ");
        int n = in.nextInt();
        candidate1[] ob = new candidate1[n];
        for (int i = 0; i < n; i++) {
            clearConsole();
            ob[i] = new candidate1();
            ob[i].create_user();
        }
        clearConsole();
        System.out.println("Do you want to update details of any user Y/N");
        char c = in.next().charAt(0);
        if ((c == 'Y') || (c == 'y')) {
            System.out.println("Enter Test ID for the candidate whose information is to be updated - ");
            int test_id = in.nextInt();
            boolean found = false;
            for (int i = 0; i < n; i++) {
                if (ob[i].tst_id == test_id) {
                    ob[i].update_profile(ob[i]);
                    found = true;
                    break;
                }
            }
            if (!found) {
                System.out.println("Credential mismatch or candidate not yet registered.");
            }
        }
        clearConsole();
        portal1 ob2 = new portal1();
        while (true) {
            ob2.login(ob, n);
            clearConsole();
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

    private static void clearConsole() {
        try {
            if (System.getProperty("os.name").contains("Windows")) {
                new ProcessBuilder("cmd", "/c", "cls").inheritIO().start().waitFor();
            } else {
                System.out.print("\033[H\033[2J");
                System.out.flush();
            }
        } catch (Exception ex) {
            System.out.println("Error clearing console: " + ex.getMessage());
        }
    }
}
/*Sure, here are the contents for the `question.txt` and the corresponding `answer_user_1111.txt` files.

### `question.txt`
```
Question 1: What is the capital of France?
Question 2: What is 2 + 2?
Question 3: Who wrote 'To Kill a Mockingbird'?
```

### `answer_user_1111.txt`
```
Paris
4
Harper Lee
```

With these files in place, the program will read questions from `question.txt` and the answers provided by the user will be written to `answer_user_1111.txt`. The evaluation of the answers will be done by comparing `answer_user_1111.txt` with a predefined `answers.txt`.

### `answers.txt`
Here is an example of the `answers.txt` file that contains the correct answers:
```
Paris
4
Harper Lee
```

### Directory Structure

Ensure your project directory structure looks like this:
```
/path/to/your/project/
    ├── Online_Examination_4.java
    ├── question.txt
    ├── answer_user_1111.txt
    └── answers.txt
```

This setup will allow the program to function correctly, reading questions and answers from the specified files and evaluating them properly.
*/