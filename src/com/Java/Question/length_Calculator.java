package com.Java.Question;
import java.util.Scanner;
public class length_Calculator {

    int Nanometres() {
        int s11;
        Scanner g = new Scanner(System.in);
        System.out.println("Enter your Nanometres :");
        s11 = g.nextInt();
        Swith_case();

        return 0;
    }

    int Microns() {
        int s10;
        Scanner g = new Scanner(System.in);
        System.out.println("Enter your Nanometres :");
         s10 = g.nextInt();
        Swith_case();
        System.out.println("Enter your number :");

        return 0;
    }

    int Millimetres() {
        int s9;
        Scanner g = new Scanner(System.in);
        System.out.println("Enter your Nanometres :");
        s9 = g.nextInt();
        Swith_case();
        System.out.println("Enter your number :");

        return 0;
    }

    int Centimetres() {
        int s8;
        Scanner g = new Scanner(System.in);
        System.out.println("Enter your Nanometres :");
        s8 = g.nextInt();
        Swith_case();
        System.out.println("Enter your number :");

        return 0;
    }

    int Metres() {
        int s7;
        Scanner g = new Scanner(System.in);
        System.out.println("Enter your Nanometres :");
        s7 = g.nextInt();
        Swith_case();
        System.out.println("Enter your number :");

        return 0;
    }

    int Kilometres() {
        int s6;
        Scanner g = new Scanner(System.in);
        System.out.println("Enter your Nanometres :");
        s6 = g.nextInt();
        Swith_case();
        System.out.println("Enter your number :");

        return 0;
    }

    int Inches() {
        int s5;
        Scanner g = new Scanner(System.in);
        System.out.println("Enter your Nanometres :");
        s5 = g.nextInt();
        Swith_case();
        System.out.println("Enter your number :");

        return 0;
    }

    int Feet() {
        int s4;
        Scanner g = new Scanner(System.in);
        System.out.println("Enter your Nanometres :");
        s4 = g.nextInt();
        Swith_case();
        System.out.println("Enter your number :");
        return 0;
    }

    int Yard() {
        int s3;
        Scanner g = new Scanner(System.in);
        System.out.println("Enter your Nanometres :");
        s3 = g.nextInt();
        Swith_case();
        System.out.println("Enter your number :");

        return 0;
    }

    int Mile() {
        int s2;
        Scanner g = new Scanner(System.in);
        System.out.println("Enter your Nanometres :");
        s2 = g.nextInt();
        Swith_case();
        return 0;
    }

    int Nautical_miles() {
        int s1;
        Scanner g = new Scanner(System.in);
        System.out.println("Enter your Nanometres :");
        s1 = g.nextInt();
        Swith_case();

        return 0;
    }

    int Swith_case() {
        int choose;
        int a1, a2, a3, a4, a5, a6, a7, a8, a9, a10, a11;
        System.out.println("Convert to -- \n 1: Nanometres \n2:Microns \n3:Millimetres \n4:Centimeters  \n5:Metres \n6:Kilometres \n7:Inches \n8:Feet \n9:Yards \n10:Miles \n11:Nautical_miles \nEnter your chose :");
        Scanner h = new Scanner(System.in);
        choose = h.nextInt();
        switch (choose) {
            case 1:
                a1 = Nanometres();
                break;
            case 2:
                a2 = Microns();
                break;
            case 3:
                a3 = Millimetres();
                break;
            case 4:
                a4 = Centimetres();
                break;
            case 5:
                a5 = Metres();
                break;
            case 6:
                a6 = Kilometres();
                break;
            case 7:
                a7 = Inches();
                break;
            case 8:
                a8 = Feet();
                break;
            case 9:
                a9 = Yard();
                break;
            case 10:
                a10 = Mile();
                break;
            case 11:
                a11 = Nautical_miles();
                break;
        }
        return 0;
    }
        public static void main(String[] args){
//        Nanometres x = new Nanometres();    // ctrl + alt+ /
            length_Calculator o = new length_Calculator();
            int n, m1, m2, c, m3, k, i, f, y, m4, n2;
            int x, choose1;
            Scanner obj = new Scanner(System.in);
            System.out.println("Enter your choice : \n 1:Nanometres \n2:Microns \n3:Millimetres \n4:Centimeters  \n5:Metres \n6:Kilometres \n7:Inches \n8:Feet \n9:Yards \n10:Miles \n11:Nautical_miles");
            choose1 = obj.nextInt();
            switch (choose1) {
                case 1:
                    n = o.Nanometres();
                    break;
                case 2:
                    m1 = o.Microns();
                    break;
                case 3:
                    m2 = o.Millimetres();
                    break;
                case 4:
                    c = o.Centimetres();
                    break;
                case 5:
                    m3 = o.Metres();
                    break;
                case 6:
                    k = o.Kilometres();
                    break;
                case 7:
                    i = o.Inches();
                    break;
                case 8:
                    f = o.Feet();
                    break;
                case 9:
                    y = o.Yard();
                    break;
                case 10:
                    m4 = o.Mile();
                    break;
                case 11:
                    n2 = o.Nautical_miles();
            }
        }
    }


