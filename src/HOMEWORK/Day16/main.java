package HOMEWORK.Day16;


import java.time.LocalTime;
import java.util.Scanner;

public class main {
    static Scanner sc = new Scanner(System.in);

    public static void main(String[] args) {
        diagonalSequence();
    }

    //ex3
    /*
    A natural number N is given (entered from the keyboard). Calculate two to the power of N
    Display the calculated value (1 <= N <= 15).
    */
    public static void twoToThePowerOf() {
        int n = sc.nextInt();
        if (1 <= n && n <= 15) {
            System.out.println(Math.pow(2, n));
        }
    }

    //ex4
    /*
    Given number n. N minutes have passed since the beginning of the day. Determine how many
    hours and minutes the digital clock will show at this moment. The program should print two
    numbers: the number of hours (from 0 to 23) and the number of minutes (from 0 to 59). Note that
    the number n can be more than the number of minutes in a day.
    */
    public static void timeAfter() {
        int n = sc.nextInt();
        LocalTime now = LocalTime.of(0, 0, 0);
        now.plusMinutes(n);
        System.out.println(now.getHour() + " " + now.getMinute());

    }

    //ex5
    /*
    Write a java program to determine whether the number is prime or not.
    */
    public static void primeOrNot() {
        int n = sc.nextInt();
        boolean f = false;
        for (int i = 2; i < n; i++) {
            if (n % i == 0) {
                break;
            }
            f = true;
        }
    }

    //ex6
    /*
    You are given two four-digit numbers A and B. Print all four-digit numbers on the segment from A
    to B, the record of which is a palindrome.
    */
    public static void palidromBetween() {
        int a = sc.nextInt();
        int b = sc.nextInt();
        int reverse = 0;
        for (int k = a; k < b; k++) {

            reverse = 0;
            for (int i = k; i != 0; i = i / 10) {
                int remainder = i % 10;
                reverse = reverse * 10 + remainder;
            }
            if (k == reverse) {
                System.out.println(k);
            }
        }
    }

    //ex7
    /*
    A three-letter word is given. The word consists only of Latin letters, small and large. Print the
    same word, where the first letter is capitalized, the rest are small.
    */
    public static void letter() {
        String input = sc.nextLine();

        String output1 = input.substring(0, 1);
        output1 = output1.toUpperCase();

        String output2 = input.substring(1, input.length());
        output2 = output2.toLowerCase();

        String output = output1.concat(output2);
        System.out.println(output);

    }

    //ex8
    /*
    Enter the number N and draw an NxN checkerboard where the top left is white. Designate white
    margins O, black margins X. Use a for loop.
    */
    public static void checkboard() {
        int n = sc.nextInt();
        for (int i = 0; i < n * n; i++) {
            if (i % 2 == 1) {
                System.out.print("X");
            } else {
                System.out.print(0);
            }
            if ((i + 1) % n == 0) {
                System.out.println();
            }
        }

    }

    //ex9
    /*
    The first term and the denominator of the geometric progression are given (real numbers b1 and
    q, q! = 0). An integer n is also given. Print the n-th term of a geometric progression. Don't use the
    pow function, use a for loop. Print the answer with precision exactly two characters after the
    period.
    */
    public static void home() {
        int n = sc.nextInt();
        float q = sc.nextInt();
        float b1 = sc.nextInt();

        for (int i = 1; i < n; i++) {
            b1 *= q;
            System.out.print(b1 + " ");
        }
        System.out.println("\n" + b1);

    }

    //ex10
    /*
    A natural number >= 2 is specified. Expand it into prime factors.
    */
    public static void primeFactors() {
        int n = sc.nextInt();
        for (int i = n / 2; i > 2; i--) {
            for (int j = 0; j < i - 1; j++) {
                if (i % j == 0)
                    break;
                if (n % i == 0) {
                    System.out.print(i);
                }
            }
        }
    }

    //ex11 X
    /*
    Two numbers n and m are given. Create a two-dimensional array A [n] [m], fill it with the
    multiplication table A [i] [j] = i * j and display it. In this case, you cannot use nested loops, the entire
    filling of the array must be done in one cycle.
    */
    public static void twoDimensionalArray() {
        int n = sc.nextInt();
        int m = sc.nextInt();
        int[] arr1 = new int[n];
        int[] arr2 = new int[m];
        int j = 0;
        for (int i = 0; i < n; i++) {

        }
    }
    //ex12 X
    public static void diagonalSequence() {
            int m = sc.nextInt();
            int n = sc.nextInt();
            int[] matrix = new int[m * n];
                for (int i = 0; i < m * n; i++) {
                    if (i % m == 0) {
                        System.out.println();
                    }
                        matrix[i] = i;
                    System.out.print(matrix[i] + " ");
                    if (i < m) {
                        System.out.print(" ");
                    }
                }
            }
    //ex13 X
    /*
    Given numbers n and m. Create an array A [n] [m] and fill it with a snake
    */
    public static void snake() {
        int m = sc.nextInt();
        int n = sc.nextInt();
        int[] matrix = new int[m * n];
        for (int j = 0; j < n; j++) {
            for (int i = 0; i < m * n; i++) {
                if (i % m == 0) {
                    System.out.println();
                }
                if (j % 2 != 0) {
                    matrix[i] = (j * m - 1);
                    System.out.print(matrix[i]);
                } else
                    matrix[i] = i;
                System.out.print(matrix[i] + " ");

                if (i < m) {
                    System.out.print(" ");
                }
            }

        }
    }
}