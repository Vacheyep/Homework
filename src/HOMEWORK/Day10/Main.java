package HOMEWORK.Day10;

import java.util.Random;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
fibonacci_number();

    }
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

    //ex3
    public static void exact_squares() {
        Scanner sc = new Scanner(System.in);
        int a = sc.nextInt();
        int i = 1;

        while ((i * i) <= a) {
            System.out.println(i * i);
            i++;
        }
    }

    //ex4 question about break
    public static void smallest_natural_division(){
        Scanner sc = new Scanner(System.in);
        int a = sc.nextInt();
        if (a <= 2){
            System.out.println("must be greather then 2");
        }
        int i = 2;
        while (2 < a){
            if (a % i == 0){
                System.out.println(i);
                break;
            }
                i++;
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
            // x << 1;

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
    /*
    Input N natural number till N would be the exact power of 2.If N is
the exact power of 2 .
- Print N
- Print count of input integers
- break loop
     */
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

    //ex9
    public static void print_the_smallest_integer_k() {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int p = 1;
        int k = 0;
        while (p < n) {
            p *= 2;
            k++;
        }
        System.out.println(k);

    }

    //ex10
    public static void table_of_characters() {
        int a = 32;
        int count;
        while (true){
            if (a > 122) {
                break;
            }
            count = 0;
            while (count < 10){
                count += 1;
                if (a > 122){
                    break;
                }
                System.out.println((char) a);
                a += 1;
            }
        }

    }

    //ex11
    public static void except_multiple_of_3() {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int x = 0;
        x++;
        while (x % 3 == 0) {
            if (x <= n){

            continue;
            }
        }
        System.out.println(x);


    }

    //ex12
    public static int fibonacci_number() {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int i = 0;
        int f = 0;
        while (f <= n){
            i++;

            if (f > n){
                break;
            }else if (f == n){
                return i;
            }
        }
        return -1;
    }



    //ex13
    public static void determine_the_num_of_day() {
        Scanner sc = new Scanner(System.in);
        int y = sc.nextInt();
        int x = sc.nextInt();
        int i = 0;
        while (x < y){
            i++;
            x = x + x * 10/ 100;
            if (x > y)
                break;
        }
            System.out.println(i);



    }


    //ex14
    /*
    deposit is x
    percent is p
    contribution y
    z years
     */
    public static void determine_how_many_years() {
        Scanner sc = new Scanner(System.in);
        int x = sc.nextInt();
        int p = sc.nextInt();
        int y = sc.nextInt();
        int z = 0;

        while (y > x){
            z++;
            x = x + x/p;
            if (y < x)
                break;
        }
        System.out.println(z);
    }

    //ex15
    public static int second_largest_element() {
        Scanner sc = new Scanner(System.in);
        int input = sc.nextInt();
        int max = sc.nextInt();
        int second = sc.nextInt();
        while (true) {
            System.out.println("enter number - ");
            if (input != 0)
                if (input > second && input < max) {
                    second = input;
                    continue;
                } else if (input > second && input > max) {
                    second = max;
                    max = input;
                    continue;
                }
        }
    }

    //ex16
    public static void guess_the_number() {
        Random random = new Random();
        int num = random.nextInt();
        Scanner sc = new Scanner(System.in);
        int input = sc.nextInt();
        while (input != num){
            System.out.println("enter your number");
            num = sc.nextInt();
            if (input > num){
                System.out.println("too high, try again.");
            }else if(input < num){
                System.out.println("too low, try again.");
            }else {
                System.out.println("Congrats");
            }
        }
    }

    //ex17 Not today
    /*
    Write a Java Program to Compute the Sum of Digits in a given
Integer.
     */
    public static void compute_the_sum_of_digits() {
    }
    }

