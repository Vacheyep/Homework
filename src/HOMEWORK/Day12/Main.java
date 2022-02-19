package HOMEWORK.Day12;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        cycleTheElements();
    }

    //ex1
    /*
    Print all elements of the array with even indices (that is, A [0], A
    [2], A [4]...)
    - Input natural integer N
    - define an array with size N,
    - Initialize it
    */
    public static void printEvenIndicesElements() {
        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();
        int i = 0;
        int[] array = new int[n];
        for (; i < n; i++) {
            array[i] = scanner.nextInt();
            if (i % 2 == 0)
                System.out.print(array[i]);
        }
    }

    //ex2
    /*
    Print all even numbered items in the list.
    */
    public static void allEvenItems() {
        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();
        int i = 0;
        int[] array = new int[n];
        for (; i < n; i++) {
            array[i] = scanner.nextInt();
            if (array[i] % 2 == 0) {
                System.out.println(array[i]);
            }
        }
    }

    //ex3
    /*
    Find the number of positive elements in the given array.
    */
    public static void positiveElements() {
        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();
        int i = 0;
        int[] array = new int[n];
        for (; i < n; i++) {
            array[i] = scanner.nextInt();

            if (array[i] > 0) {
                System.out.println(array[i]);
            }
        }
    }

    //ex4
    /*
    A list of numbers is given. Print all the elements of the list that are
    larger than the previous element.
    */
    public static void largerThenPrev() {
        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();
        int i = 0;
        int index = 0;
        for (; index < n; index++) {
            System.out.print(index + " ");
        }
        System.out.println();
        int[] array = new int[n];
        for (; i < n; ++i) {
            array[i] = scanner.nextInt();
        }
        for (int j = 1; j < n; j++) {

            if (array[j] > array[j - 1]) {
                System.out.println(array[j]);

            }
        }
    }

    //ex5
    /*
    An array of numbers is given. If it has two adjacent(հարևան)
    elements of the same sign, print these numbers. If there are no
    adjacent elements of the same character, do not print anything. If there
    are several such pairs of neighbors, print the first pair.
    */
    public static void adjacentElements() {
        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();
        int i = 0;

        int index = 0;
        for (; index < n; index++) {
            System.out.print(index + " ");
        }
        System.out.println();
        int[] array = new int[n];
        for (; i < n; ++i) {
            array[i] = scanner.nextInt();
        }
        for (int j = 1; j < n - 1; j++) {

            if (array[j - 1] > 0 && array[j] > 0 || array[j - 1] < 0 && array[j] < 0) {
                System.out.println(array[j - 1] + " " + array[j]);

            }
        }

    }

    //ex6
    /*
    An array of numbers is given. Print the value of the largest element in
    the array, and then the index of that element in the array. If there are
    several largest elements, print the index of the first of them.
    */
    public static void valueOfTheLargest() {
        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();
        int[] array = new int[n];
        for (int j = 0; j < n; j++) {
            array[j] = scanner.nextInt();
        }

        int index = 0;
        for (int i = 1; i < n; ++i) {
            if (array[i] > array[index]) {
                index++;
            }
        }
        System.out.print("the largest is " + array[index] + "  ");
        System.out.println("index is " + index);
    }

    //ex7
    /*
    Print the value of the smallest of all positive elements in the list. It is
    known that the list contains at least one positive element, and the
    absolute value of all elements of the list does not exceed 1000.
    */
    public static void valueOfTheSmallest() {
        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();

        int[] array = new int[n];
        for (int j = 0; j < n; j++) {
            array[j] = scanner.nextInt();
        }


        int index = 1;
        for (int i = 0; i < n; i++) {
            if (array[i] > 0) {
                if (i == 0) {
                    continue;
                }
                if (array[i] > array[i - 1]) {
                    index++;
                }
            }
        }
        System.out.println(array[index]);
    }


    //ex8
    /*
    You are given a list sorted by non-decreasing elements in it. Determine
    how many different elements are in it.
     */
    public static void differentElements() {
        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();
        int[] array = new int[n];

        for (int i = 0; i < n; ++i) {
            array[i] = scanner.nextInt();
        }
        int count = 1;
        for (int j = 1; j < n; j++) {
            if (array[j] > array[j - 1])
                count++;
        }
        System.out.println(count);
    }


    //ex9
    /*
    Print the elements of the given list in reverse order without changing
    the list itself.
     */
    public static void reversOrderIndex() {
        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();
        int[] array = new int[n];
        for (int i = 0; i < n; i++) {
            array[i] = scanner.nextInt();
        }
        for (int j = n; j > 0; j--) {
            System.out.print(array[j - 1] + " ");
        }
    }


    //ex10 rearrange without index
    /*
    Rearrange the elements of this array in reverse order, then print the
    elements of the resulting array.
     */
    public static void reversOrder() {
        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();
        int[] array = new int[n];
        for (int i = 0; i < n; i++) {
            array[i] = scanner.nextInt();
        }
        for (int j = 0; j < array.length; j++) {
            array[j] = array.length - j;
            System.out.println(array[j]);
        }
    }

    //ex11
    /*
    Rearrange the adjacent elements of the array (A [0] with A [1], A [2]
    with A [3], etc.). If there is an odd number of elements, then the last
    element remains in its place.
    */
    public static void rearrangeTwice() {
        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();
        int[] array = new int[n];
        for (int i = 0; i < n; i++) {
            array[i] = scanner.nextInt();
        }
        for (int j = 0; j < array.length - 1; j += 2) {
            array[j] += array[j + 1];
            array[j + 1] = array[j] - array[j + 1];
            array[j] = array[j] - array[j + 1];
            System.out.println(array[j]);
            System.out.println(array[j + 1]);
        }
        if(n % 2 != 0);
        System.out.println(array[n - 1]);
    }


    //ex12 X
    /*
    Cycle the elements of the array to the right (A [0] goes to A [1], A [1]
    to A [2], ..., the last element goes to A [0]).
     */
    public static void cycleTheElements() {
        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();
        int[] array = new int[n];
        for (int i = 0; i < n; i++) {
            array[i] = scanner.nextInt();
        }
        int k;
        for (int j = 1; j < n - 1; j++) {
            k = array[j];
            array[j] = array[j + 1];
            array[j + 1] = k;

        }
    }


    //ex13
    /*
    In the list, all items are different. Swap the minimum and maximum
    elements of this list.
    */
    public static void swapMaxMin() {
        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();
        int[] array = new int[n];
        for (int i = 0; i < n; i++) {
            array[i] = scanner.nextInt();
        }
        int maxInd = 0;
        int minind = 0;
        for (int j = 1; j < n; j++) {
            if (array[j] > array[j - 1]) {
                maxInd = j;
            }
            if (array[j] < array[j - 1]){
                minind = j;
            }
        }
        for (int k = 0; k < n; k++) {
            if (k == maxInd ){
                System.out.println(array[minind]);
            }else if (k == minind){
                System.out.println(array[maxInd]);
            }else{
                System.out.println(array[k]);
            }
        }
    }


    //ex14
    /*
    14.You are given an array of numbers and the index of an element in the
    array. Index is k. Remove the element with index k from the list by
    moving all elements to the right of the element with index k to the left.
    The program should shift directly in the array, and not do it when
    displaying elements. Also, you cannot use an additional array.
    At least decrement size of array, and print array;
    */

    //ex15
    /*
    A list is given. Print those elements of it that appear in the list
    only once. Items should be displayed in the order in which they
    appear in the list.
     */
        public static void uniqueElement () {
            Scanner scanner = new Scanner(System.in);
            int n = scanner.nextInt();
            int[] array = new int[n];
            for (int i = 0; i < n; i++) {
                array[i] = scanner.nextInt();
            }


            for (int j = 0; j < n; j++) {
                for (int k = 1; k < n; k++) {
                    if (j == k) {
                        continue;
                    }
                    if (array[j] == array[k]) {
                        break;
                    }
                    if (k == n - 1)
                        System.out.println(array[j]);
                }
            }
        }

    //ex16 X   DON'T SPEND UR TIME, THIS CODE SUCKS
    //x[i] = x[i+1]
    /*
    An array of integers is given. It is required to “compress” it by moving
    all non-zero elements to the left side of the array without changing their
    order, and all zeros to the right side. The order of nonzero elements
    cannot be changed, an additional list cannot be used, the task must be
    completed in one pass through the array. Print the resulting array.
    */
    public static void compressByMoving() {
        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();
        int[] array = new int[n];
        for (int i = 0; i < n; i++) {
            array[i] = scanner.nextInt();
        }
        int k;
        for (int j = 0; j < n; j++){
            if (array[j] == 0){
                 k = array[j];
                 array[j] = array[j + 1];
                 array[j + 1] = k;
            }else if (array[j + 2] == 0){
                     k = array[j];
                     array[j] = array[j + 2];
                     array[j + 2] = k;
                 }
                System.out.print(array[j]);
        }
    }
}













