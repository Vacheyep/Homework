package HOMEWORK.day22.task1;

import java.util.Random;
import java.util.Scanner;

public class Task1 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        method(sc.nextLine());
    }
        public static String method(String input) {
            while (true) {
                try {
                    Integer.parseInt(input);
                } catch (NumberFormatException e) {
                    System.out.println("try new input");
                }
                System.out.println(Integer.parseInt(input));
                return input;
            }
        }
    }

