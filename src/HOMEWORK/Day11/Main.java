package HOMEWORK.Day11;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        chosenPic();
    }

    //ex1
    /*
    Write a java program to print all even numbers from a given
    range, from a to b. Input a and b from console.
     */
    public static void all_even_num() {
        Scanner sc = new Scanner(System.in);
        int rangea = sc.nextInt();
        int rangeb = sc.nextInt();
        rangea += 1;
        //int j = 0;
        while (rangea % 2 == 0) {
            rangea++;
        }
        for (; rangea < rangeb; rangea = rangea + 2) {
            System.out.println(rangea);

        }
    }

    //ex2
    /*
    Print all numbers on the segment from a to b that give the
    remainder of c when divided by d. If such numbers do not exist,
    then you do not need to display anything.
     */
    public static void all_numbers_div_by_d() {
        Scanner sc = new Scanner(System.in);
        int a = sc.nextInt();
        int b = sc.nextInt();
        int d = sc.nextInt();
        int c = sc.nextInt();
        if (d == 0) {
            System.out.println("error");
            return;
        }

        for (; a < b; a++) {
            if (a % d == c) {
                System.out.println(a);
            }
        }
    }

    //ex3
    /*
    Integers a and b are entered. It is guaranteed that a does not
    exceed b.
    Print all numbers on the segment from a to b that are exact
    squares. If there are no such numbers, then you do not need to
    display anything.
     */
    public static void print_exact_nums() {
        Scanner sc = new Scanner(System.in);
        int a = sc.nextInt();
        int b = sc.nextInt();
        for (; a < b; a++) {
            if ((int) Math.sqrt(a) % Math.sqrt(a) == 0)
                System.out.println(a);
        }
    }

    //ex4
    /*
    Enters 2 integer numbers : x and d from console
    Count and print one number - how many times the digit d occurs in
    the representation of a natural number x.
     */
    public static void num_of_how_many_times_digit_d_in_x() {
        Scanner sc = new Scanner(System.in);
        int x = sc.nextInt();
        int d = sc.nextInt();
        int c = 0;
        for (; x > 0; x = x / 10) {
            int a = x % 10;
            if (a == d)
                c++;
        }
        System.out.println(c);

    }

    //ex5
    /*
    Given an integer number x
    Print the number consisting of the digits of the given number x in reverse
    order. You do not need to output leading zeros.
     */

    public static void print_digits_in_revers_order() {
        Scanner sc = new Scanner(System.in);
        int x = sc.nextInt();
        int c = 0;
        for (; x > 0; x = x / 10) {
            int a = x % 10;
            System.out.print(a);
        }
    }

    //ex6 x
    /*
    Given an integer number x
    Find the smallest natural divisor of x other than 1 (2 <= x <= 30000).
     */
    public static int smallestNaturalDiv() {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        for (int i = 2; i <= n / 2 + 1; i++) {
            if (n % i == 0) {
                return i;
            }
        }
        return n;
    }

    //ex7
    /*
    Given an integer number x
    Print all natural divisors of the number x in ascending order (including 1
    and the number itself).
     */
    public static void the_smallest_natural_divisor() {
        Scanner sc = new Scanner(System.in);
        int x = sc.nextInt();
        for (int j = 1; j <= x; j++) {
            if (x % j == 0) {
                System.out.println(j);
            }
        }


    }

    //ex8
    /*
    Given an integer x
    Count the number of natural divisors of x (including 1).
     */
    public static void count_the_num_of_divisors() {
        Scanner sc = new Scanner(System.in);
        int x = sc.nextInt();
        int a = 0;
        for (int j = 1; j <= x; j++) {
            if (x % j == 0) {
                a++;
            }

        }
        System.out.println(a);
    }

    //ex9
    public static int sum_of_the_given_10() {
        Scanner sc = new Scanner(System.in);
        int n = 0;
        for (int i = 0; i < 10; i++) {
            n += sc.nextInt();
        }
        return n;

    }

    //ex10
    /*
    Convert a natural number from binary to decimal (no more than 10
    digits in a binary number).
     */
    public static void binaryToDecimal() {
        Scanner sc = new Scanner(System.in);
        int b = sc.nextInt();
        int d = 0;
        int i = 0;
        for (; b > 0; b /= 10) {
            d += b % 10 * Math.pow(2, i);
            i++;
        }
        System.out.println(d);
    }

    //ex13
    /*
    13. Write a Java program by using two for loops to produce the output
    shown below:
    1.Input N natural number, print picture like below in size N*N
     */
    public static void printPic() {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < n; j++) {

                System.out.print("*");
            }
            System.out.println("");
        }
    }

    //ex14
    /*
    Write a program that prompts the user for the size (a non-negative
    integer in int); and prints the following checkerboard pattern.
     */
    public static void printCheckboard() {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < n; ++j) {
                if (n > j) {
                    if (i % 2 == 0) {
                        System.out.print("# ");
                    } else {
                        System.out.print(" #");
                    }
                }
            }
            System.out.println();
        }

    }

    //ex15
    /*
    Write a program that prompts user for the size (a positive integer in
    int); and prints the multiplication table as shown:
    Enter the size: 10
        * | 1 2 3 4 5 6 7 8 9 10
        --------------------------------------------
        1 | 1 2 3 4 5 6 7 8 9 10
        2 | 2 4 6 8 10 12 14 16 18 20
        3 | 3 6 9 12 15 18 21 24 27 30
        4 | 4 8 12 16 20 24 28 32 36 40
        5 | 5 10 15 20 25 30 35 40 45 50
        6 | 6 12 18 24 30 36 42 48 54 60
        7 | 7 14 21 28 35 42 49 56 63 70
        8 | 8 16 24 32 40 48 56 64 72 80
        9 | 9 18 27 36 45 54 63 72 81 90
        10 | 10 20 30 40 50 60 70 80 90 100
     */
    public static void multiplicationTable() {
        Scanner sc = new Scanner(System.in);
        int size = sc.nextInt();
        // int syun = 0;
        //System.out.print("*  ");
        for (int i = 1; i <= size; i++) {
            System.out.print(i + "  ");
        }
        System.out.print("\n--------------------------------------\n");
        for (int i = 1; i <= size; i++) {
            for (int j = 1; j <= size; j++) {
                System.out.print(j * i);
                if (i * j / 10 == 0) {
                    System.out.print("  ");
                } else {
                    System.out.print(" ");
                }
                if (j == size) {
                    System.out.println();
                    // System.out.println(syun + " | ");
                }
            }
        }
    }

    //ex16
    public static void chosenPic() {
        Scanner sc = new Scanner(System.in);
        int x = sc.nextInt();
        for (int i = 0; i < x; i++) {
            for (int j = 0; j == i; ++j) {


                System.out.print("* ");
            }
            System.out.println("");
        }
    }
}