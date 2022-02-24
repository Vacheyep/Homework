package HOMEWORK.Day17;

import java.util.Scanner;

public class main {
    static Scanner sc = new Scanner(System.in);
    public static void main(String[] args) {
       // add1(12,(float) 5.2);
       // dont2();
        reminder10(1564);
        //print4();
    }
    //ex1
        static void add1(int a, int b){
            System.out.println(a);
        }
        static void add1(int a, int b, int c){
            System.out.println(c);
        }
        static void add1(int a, float b){
            System.out.println(b);
        }
        static void add1(float a, int b){
            System.out.println(a);
        }


    //ex2 , 3
    static int dont2(float a){
        return 0;
    }
    static float dont2(int a){
        return 0;
    }

    //ex4
    static void print4(int[] arr){
        int n = sc.nextInt();
        for (int i = 0; i < n; i++)
            arr[i] = i;
    }
    static void print4(float[] arr){
        int n = sc.nextInt();
        for (int i = 0; i < n; i++)
            arr[i] = i;
    }
    static void print4(double[] arr){
            int n = sc.nextInt();
            for (int i = 0; i < n; i++) {
                arr[i] = i;
        }
    }

    //ex5
    public static int search5(int[] array){
        return array.length;
    }
    public static int search5(int[] array, int a){
        int n = sc.nextInt();
        for (int i = 0; i < n; i++)
            array[i] = i;
            return array[a];
    }
//    public static boolean search(int[] array, int argument, int index){
//            int n = sc.nextInt();
//            for (int i = 0; i < n; i++)
//                array[i] = i;
//
//
//    }

    //ex6
    static int square6(int a){
        a *= 2 * Math.PI;
        return a;
    }
    static float square6(float a){
        a *= a;
        return a;
    }
    static int square6(int a, int b){
        a *= (double) b / 2;
        return a;
    }

    //ex7
    static int max7(int a, int b) {
        if (a > b) {
            return a;
        }
        return b;
    }
    static int max7(int a, int b, int c){
        if (a > b && a > c){
            return a;
            }else if (b > c) {
            return b;
        }
        return c;
        }

    //ex8
    //static int distance9(int a1, int a2, int b1, int b2){
    // }

    //ex10
    static int reminder10(int a) {
        int i = 10;
        int count = 0;
        while (i < a) {
            i *= 10;
            count++;
        }
        int sum;
        for (sum = 0; sum < count; sum++) {
            sum += a % i;
            i /= 10;
        }
        System.out.println(sum);
        return sum;
    }
    }


