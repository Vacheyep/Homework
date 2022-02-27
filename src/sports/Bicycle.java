package sports;

import java.util.Scanner;

public class Bicycle {
    String color = "red";
    private void printColor(String color){
        color = "purple";
        System.out.println(color);

    }
    Scanner sc;

    {
        sc = new Scanner(System.in);
    }

    public static void main(String[] rider){
        new Bicycle().printColor("blue");
    }
}
