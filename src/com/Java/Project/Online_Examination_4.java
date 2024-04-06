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

    void update_profile(candidate ob){
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
                in.nextLine();
                System.out.println("\033[H\033[2J");
                System.out.flush();
                run_test(usr[i]);
            } else {
                System.out.println("Credential mismatch or candidate not yet registered.");
            }
        }
    }

    void run_test(candidate user) {
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

    void evaluate_marks(candidate user) {
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
            candidate[] ob = new candidate[n];
            for(int i = 0; i<n; i++){
                System.out.print("\033[H\033[2J");
                System.out.flush();
                ob[i] = new candidate();
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
            portal ob2 = new portal();
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




