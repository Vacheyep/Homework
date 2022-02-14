package HOMEWORK.Day9;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        weekday_and_num();

    }

    //ex1,2
    public static void initializ_from_console() {
        Scanner sc = new Scanner(System.in);
        String a = sc.nextLine();
        String b = sc.nextLine();
        //first condition
        if (a == b) {
            System.out.println("string a equals to string b");
        } else {
            System.out.println("nope");
        }
        //second condition
       /* if (a.equals(b)) {
            System.out.println("string a equals to string b");
        } else {
            System.out.println("nope");
        }*/

    }

    //ex3,4
    public static void init_using_new_keyword() {
        Scanner sc = new Scanner(System.in);
        String a = "text";
        String b = sc.nextLine();
        //second condition
        if (a.equals(b)) {
            System.out.println("string a equals to string b");
        } else {
            System.out.println("nope");

        }
    }

    //ex5
    public static void positive_or_negative() {
        Scanner sc = new Scanner(System.in);
        int a = sc.nextInt();
        //first condition
        System.out.println(a > 0 ? "positive" : "negative");
        //second condition
        System.out.println(a > 0 ? "positive" : a == 0 ? 0 : "negative");

    }

    //ex6
    public static int using_ternary_operator() {
        Scanner sc = new Scanner(System.in);
        int a = sc.nextInt();
        int b = sc.nextInt();
        return a > b ? a : b;
        //condition 1
        // System.out.println(Math.max(a,b));
        //condition 2
        //System.out.println(Math.abs(a));


    }

    //ex7
    public static int checking_the_string() {

        String txt = null;

        return txt == null ? -1 : txt.equals(" ") ? 0 : 1;

    }

    //ex8
    public static void finding_max() {
        Scanner sc = new Scanner(System.in);
        int a = sc.nextInt();
        int b = sc.nextInt();
        int c = sc.nextInt();

        System.out.println(a > b ? Math.max(a, c) : Math.max(b, c));

    }

    //ex9
    public static void correct_answer() {
        // "What is the correct way to declare a variable\n to store an integer value in Java";
        //a: "int 1x=10";
        //b: "int x=10";
        //c: "float x =10.0f";
        //d: "string x= " + "10";
        Scanner sc = new Scanner(System.in);
        char answer = sc.next().charAt(0);

        switch (answer) {
            case 'a':
                System.out.println("invalide choice");
                break;
            case 'b':
                System.out.println("invalide choice");
                break;
            case 'c':
                System.out.println("invalide choice");
                break;
            case 'd':
                System.out.println("invalide choice");
                break;

            default:
                System.out.println("Enter your choice");
        }
    }

    //ex10
    public static void cheking_Vowel_or_constant() {
        Scanner sc = new Scanner(System.in);
        char character = sc.next().charAt(0);

        switch (character) {
            case 'A':
                System.out.println(character + " is a Vowel");
                break;
            case 'E':
                System.out.println(character + " is a Vowel");
                break;
            case 'I':
                System.out.println(character + " is a Vowel");
                break;
            case 'O':
                System.out.println(character + " is a Vowel");
                break;
            case 'U':
                System.out.println(character + " is a Vowel");
                break;
            default:
                System.out.println(character + " is a Consonant");
        }

    }

    //ex11

    //ex12

    //ex13
    public static int weekday_and_num() {
        Scanner sc = new Scanner(System.in);
        String day = sc.nextLine();
        switch (day){
            case "Mondey":
                return 1;
            case "Tuesday":
                return 2;
            case "Wednesday":
                return 3;
            case "Thursday":
                return 4;
            case "Fridey":
                return 5;
            case "Saturday":
                return 6;
            case "Sundey":
                return 7;
            default:
                return 0;
        }

    }

    //ex14
}