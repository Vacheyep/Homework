package HOMEWORK.Day8;

import java.util.Random;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        // Scanner sc = new Scanner(System.in);
        //float a = sc.nextInt();

        // Random random = new Random();
        // int x = random.nextInt();
        check_cords();


    }

    //ex1
    public static void age_for_vote(int a) {
        if (a >= 18) {
            System.out.println("the person is eligible to vote.");
        } else {
            System.out.println("the person is not eligible to vote.");
        }
    }

    //ex2
    public static void determine_even(int a) {
        if (a % 2 == 0) {
            System.out.println("this number is even:" + " " + a);
        } else {
            System.out.println("this number is odd:" + " " + a);
        }
    }

    //ex3 why wile give false int
    public static int generate_random() {
        /*
        int x = (int) ((Math.random() * 6) + 2);
        System.out.println(x);
        return x;
        }
     */
        Random random = new Random();
        int a = random.nextInt();
        while (a > 2 && a < 7) {
        }
        System.out.println(a);

        return a;
    }

    //ex4
    public static void determine_multiple(int a) {
        if (a % 5 == 0) {
            System.out.println("this number is multiple of a 5:" + " " + a);
        } else {
            System.out.println("this number isn't multiple of a 5:" + " " + a);
        }

    }

    //ex5
    public static void greatest() {
        Scanner sc = new Scanner(System.in);
        int e = sc.nextInt();
        int b = sc.nextInt();
        int c = sc.nextInt();
        if (e > b && e > c) {
            System.out.println(e);
        } else if (b > c) {
            System.out.println(b);
        } else {
            System.out.println(c);
        }


    }

    //ex6
    public static void read_floating_point_num() {
        Scanner sc = new Scanner(System.in);
        double a = sc.nextInt();
        if (a == 0) {
            System.out.println("zero");
        } else if (a > 0) {
            System.out.println("positive");
            if (Math.abs(a) > 1_000_000) {
                System.out.println("large");
            } else if (Math.abs(a) < 1) {
                System.out.println("small");
            }
        } else if (a < 0) {
            System.out.println("negative");
            if (Math.abs(a) > 1_000_000) {
                System.out.println("large");
            } else if (Math.abs(a) < 1) {
                System.out.println("small");
            }
        }

    }

    //ex7
    public static void dysplay_weekday(int a) {
        int day = a % 7 + 1;
        if (day == 1) {
            System.out.println("Mondey");
        } else if (day == 2) {
            System.out.println("Tuesday");
        } else if (day == 3) {
            System.out.println("Wednesday");
        } else if (day == 4) {
            System.out.println("Thursday");
        } else if (day == 5) {
            System.out.println("Fridey");
        } else if (day == 6) {
            System.out.println("Saturday");
        } else if (day == 7) {
            System.out.println("Sunday");
        }


    }

    //ex8.1
    public static void ice_cream(int a) {
        if (a % 3 == 0 || a % 5 == 0 || a % 8 == 0) {
            System.out.println("yes u can");
        } else {
            System.out.println("nope");
        }
    }

    //ex9.1
    public static void leep_or_not(int a) {
        if (a % 4 == 0) {
            if (a % 100 == 0) {
                if (a % 400 == 0) {
                    System.out.println("Leap Year");
                } else {
                    System.out.println("Not a Leap Year");
                }
            } else {
                System.out.println("Leap Year");
            }
        } else {
            System.out.println("Not a leap year");
        }
    }

    //ex8.2
    public static boolean generate_rand_value() {
        Random random = new Random();
        int x = random.nextInt();
        int g = -1000;
        int l = 1000;

        //condition 1
        if (x > g && x < l && x % 3 == 0 || x % 5 == 0) {
            return true;
        } else {
            return false;
        }

    }

    //ex9.2
    public static void both_legal(String[] args) {
        Scanner sc = new Scanner(System.in);
        int a = sc.nextInt();
        int b = sc.nextInt();
        //condition 1
        if (a > 10 && b != 10) {
            System.out.println("Both a and b legal");
        } else if (a > 10) {
            System.out.println("a is legal, b isn't");
        } else if (b == 10) {
            System.out.println("b is legal, a isn't");
        } else {
            System.out.println("Both a and b ilegal");
        }
        //condition 2
        if (a > 0 && b > 0) {
            System.out.println("Both a and b legal");
        } else if (a > 0) {
            System.out.println("a is legal, b isn't");
        } else if (b > 0) {
            System.out.println("b is legal, a isn't");
        } else {
            System.out.println("Both a and b ilegal");
        }
        //condition 3
        if (a < 0 && b < 0) {
            System.out.println("Both a and b legal");
        } else if (a < 0) {
            System.out.println("a is legal, b isn't");
        } else if (b < 0) {
            System.out.println("b is legal, a isn't");
        } else {
            System.out.println("Both a and b ilegal");
        }
        //condition 4
        if (a > 10 && b < 1 && a % 2 == 0 && b % 2 == 0) {
            System.out.println("Both a and b legal");
        } else if (a > 10 && a % 2 == 0) {
            System.out.println("a is legal, b isn't");
        } else if (b < 1 && b % 2 == 0) {
            System.out.println("b is legal, a isn't");
        } else {
            System.out.println("Both a and b ilegal");
        }
        //condition 5
        if (a % 5 == 0 || b % 5 == 0) {
            System.out.println("Both a and b legal");
        } else if (a % 5 != 0) {
            System.out.println("b is legal, a isn't");
        } else if (b % 5 != 0) {
            System.out.println("a is legal, b isn't");
        } else {
            System.out.println("Both a and b ilegal");
        }
        //condition 6
        if (a % 5 != 0 && b % 5 == 0) {
            System.out.println("Both a and b legal");
        } else if (a % 5 != 0) {
            System.out.println("a is legal, b isn't");
        } else if (b % 5 != 0) {
            System.out.println("b is legal, a isn't");
        } else {
            System.out.println("Both a and b ilegal");
        }
    }

    //ex10 how to do it with wile????????
    public static void input_a_and_b() {
        Scanner sc = new Scanner(System.in);
        int a = sc.nextInt();
        int b = sc.nextInt();
        //condition 1
        if ((a % 7 == 0 || b % 7 == 0) && b > 0 && a > b) {
            do {
                b++;
            }
            while (a > b && b % 2 == 0);
            System.out.println(b);
        }

    }

    //ex11
    public static void check_cords() {
        Scanner sc = new Scanner(System.in);
        int ax = sc.nextInt();
        int ay = sc.nextInt();
        int bx = sc.nextInt();
        int by = sc.nextInt();

        if (ax > 0 && ay > 0 && bx > 0 && by > 0) {
            System.out.println("in same quarter");
        } else if (ax < 0 && ay > 0 && bx < 0 && by > 0) {
            System.out.println("in same quarter");
        } else if (ax < 0 && ay < 0 && bx < 0 && by < 0) {
            System.out.println("in same quarter");
        } else if (ax > 0 && ay < 0 && bx > 0 && by < 0) {
            System.out.println("in same quarter");
        } else if (ax == 0 || ay == 0 || bx == 0 || by == 0) {
            System.out.println("any x and(or) y cords = 0");
        } else {
            System.out.println("not in same quarter");

        }
    }

    //ex12
    public static void determine_triangle() {
        Scanner sc = new Scanner(System.in);
        int a = sc.nextInt();
        int b = sc.nextInt();
        int c = sc.nextInt();
        if (a + b > a && a + c > b && b + c < a) {
            System.out.println("there is a non-degenerate triangle\n with such sides");
        } else {
            System.out.println("there isn't a non-degenerate triangle\n with such sides");
        }
    }

    //ex13
    public static void count_of_numbers() {
        Scanner sc = new Scanner(System.in);
        int a = sc.nextInt();
        int b = sc.nextInt();
        int c = sc.nextInt();
        if (a == b && b == c) {
            System.out.println(3);
        } else if (a == b || a == c || b == c) {
            System.out.println(2);
        } else {
            System.out.println(0);
        }


    }

    //ex14
    public static void finding_decisions() {
        Scanner sc = new Scanner(System.in);
        int a = sc.nextInt();
        int b = sc.nextInt();
        int c = sc.nextInt();
        int x = b * b - 4 * a * c;
        if (x < 0) {
            System.out.println("Can't be");
        } else if (x == 0) {
            System.out.println(-b / (2 * a));
        } else {
            System.out.println(((-b + Math.sqrt(x)) / (2 * a)) + " " + ((-b - Math.sqrt(x)) / (2 * a)));
        }
    }

    //ex15
    public static void arranging_integers(String[] args) {


        Scanner sc = new Scanner(System.in);
        int a = sc.nextInt();
        int b = sc.nextInt();
        int c = sc.nextInt();
        if (a <= b && b <= c) {
            System.out.println(a + "\n" + b + "\n" + c);
        }else if (a >= b && b >= c){
            System.out.println(c + "\n" + b + "\n" + a);
        }else if (b <= a && c <= a){
            System.out.println(b + "\n" + c + "\n" + a);
        }
    }
}