package HOMEWORK.Day10;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
except_multiple_of_3();    }
    //ex1
    public static void print_all_integers() {
        int y = 1;

        while (true){
            y++;
            if (y == 10)
                break;
            System.out.println(y);
        }

    }

    //ex2
    public static void print_all_even() {
        int y = 2;
        while (true){
            System.out.println(y);
            y =2 + y;
            if (y == 20)
                break;
        }

    }

    //ex3 x
    public static void exact_squares() {
        Scanner sc = new Scanner(System.in);
        int a = sc.nextInt();
        int i = 0;

        while (true){

            if (i== 0)
                i++;
            System.out.println(i);
            if (i == a)
                break;

        }


    }

    //ex4 x
    public static void smallest_natural_division(){
        Scanner sc = new Scanner(System.in);
        int a = sc.nextInt();
        int i = 1;
        while (true){
            if (a % i == 0)
                i++;

                System.out.println(i);
        }


    }

    //ex5
    public static void powers_of_two() {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int x = 1;

        while (true){
            System.out.println(x);
            x += x;

            if (x > n)
                break;

        }

    }

    //ex6
    public static void descending_order() {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        //int y = 0;
        while (true){
            System.out.println(n);
            n--;
            if (n == 0)
                break;

        }
    }

    //ex7
    public static void all_multiple_integers_of_2() {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        while (true) {

            if (n % 2 == 0){
                System.out.println(n);
            }
            n--;
            if (n == 0)
                break;
        }
    }

    //ex8 x
    public static int till_n_would_be_exact_power_of_2() {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        while (true){
            System.out.println(n);
            if (isPow2(sc.nextInt()))
            break;
        }
        return n;
    }
    public static boolean isPow2(int n){
        if (n < 1) {return false;}
        return(n & --n) == 0;
    }

    //ex9 x
    public static void print_the_smallest_integer_k() {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int k = 5;
        while (Math.pow(2, k) >= n){
            System.out.println(k);

        }

    }

    //ex10 x
    public static void table_of_characters() {

    }

    //ex11
    public static void except_multiple_of_3() {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int x = 0;
        while (x % 3 != 0) {
            x++;
            System.out.println(x);
            if (x % 3 == 0)
            continue;

        }

    }

    //ex12 x
    public static void fibonacci_number() {

    }

    //ex13
    public static void determine_the_num_of_day() {
        Scanner sc = new Scanner(System.in);
        int y = sc.nextInt();



    }

    }
