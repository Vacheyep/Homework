package HOMEWORK.Day14;

import java.util.Locale;
import java.util.Scanner;

import static java.lang.Character.isDigit;

public class Main {
    private static
    Scanner sc = new Scanner(System.in);


    public static void main(String[] args) {
firstNonRepeated();

    }

    //ex1
    /*
    Write a function which returns the length of a given String.
     */
    public static void lengthOfString() {
        String input = sc.nextLine();
        int a = input.length();
        System.out.println(" " + a + a);
    }

    //ex2
    /*
    Write a function which returns a character of a given index,from a given String. Pass as a
    parameters String str, int index
    */
    public static void charReturn() {
        String input = sc.nextLine();
        int x = sc.nextInt();
        System.out.println(input.charAt(x));

    }

    //ex3 X
    /*
    Write a function which checks if the given String contains a given character.Pass as parameters
    String str, char ch
    */
    public static boolean charInString() {
        String str = sc.nextLine();
        char ch = (char) sc.nextShort();
       // System.out.println(str.contains());
        return str.indexOf(ch) > -1;
    }

    //ex4
    /*
    Write a function which returns the count of vowels of a given String
    - - write also an overloaded function which returns count of constants.
    */
    public static int countOfVowels() {
        String str = sc.nextLine();
        int count = 0;
        char a = 'A';
        char e = 'E';
        char i = 'I';
        char o = 'O';
        char u = 'U';
        char y = 'Y';
        str = str.toUpperCase();
        char[] chars = str.toCharArray();
        for (int j = 0; j < str.length(); j++) {
            if (str.charAt(j) == 'A'
                    || str.charAt(j) == 'E'
                    || str.charAt(j) == 'I'
                    || str.charAt(j) == 'O'
                    || str.charAt(j) == 'U'
                    || str.charAt(j) == 'Y') {
                count++;
            }
        }
        return count;
    }

    //ex5
    /*
    Write a function called reverseString, which prompts the user for a String, and prints the
    reverse of the String by extracting and processing each character. The output shall look like:
    Enter a String: abcdef
    The reverse of the String &quot;abcdef&quot; is &quot;fedcba&quot;
    */
    public static void reversString() {
        String str = sc.nextLine();
        char[] chars = str.toCharArray();
        for (int j = 0; j < chars.length; j++) {
            chars[j] = (char) (chars.length - j);
            System.out.print(chars[j]);
        }
        //return chars;
    }

    //ex6
    /*
    Write a program called countVowelsDigits, which get as parameter a String, counts the
    number of vowels (a, e, i, o, u, A, E, I, O, U) and digits (0-9) contained in the string, and prints
    the counts and the percentages (rounded to 2 decimal places). For example`

    Enter a String: testing12345
    Number of vowels: 2 (16.67%)
    Number of digits: 5 (41.67%)
    */
    public static void countVowelsDigits() {
        String str = sc.nextLine();

        int countchar = 0;
        int countint = 0;
        char a = 'A';
        char e = 'E';
        char i = 'I';
        char o = 'O';
        char u = 'U';
        char y = 'Y';
        str = str.toUpperCase();
        char[] chars = str.toCharArray();
        for (int j = 0; j < str.length(); j++) {
            if (str.charAt(j) == 'A'
                    || str.charAt(j) == 'E'
                    || str.charAt(j) == 'I'
                    || str.charAt(j) == 'O'
                    || str.charAt(j) == 'U') {
                countchar++;
            }
            if (chars[j] >= (char) '0' && chars[j] <= '9') {
                countint++;
            }
        }
        System.out.printf("Number of vowels: " + countchar);
        System.out.println();
        System.out.printf("Number of digits: " + countint);
    }

    //ex7
    /*
    Caesar&#39;s Code is one of the simplest encryption techniques. Each letter in the plaintext is
    replaced by a letter with some fixed number of positions (n) down the alphabet cyclically. In this
    exercise, we shall pick n=3. That is, A; is replaced by D; B; by E; C; by F; ..., X; by
    A; ..., Z; by C;.
    Write a function called caesarCode to cipher Caesar&#39;s code. The program shall prompt the user
    for a plaintext string consisting of mix-case letters only; compute the ciphertext; and print the
    ciphertext in uppercase. For example,
        Enter a plaintext string: Testing
        The ciphertext string is: WHVWLQJ
     */

    //ex8
    /*
    Write a function to check if the passed String palindrome or not
    Print “xxx” is|is not a Palindrome.
    */
    public static void palindromeCheck() {
        System.out.println("input string");
        String str = sc.nextLine();
        str = str.toUpperCase();
        char[] chars = str.toCharArray();
        int a = str.length();
        int count = 0;
        for (int j = 0; j <= a / 2; j++) {
            if (chars[j] == chars[a - 1]) {
                a--;
                count++;
            } else {
                System.out.println("Is not Palidrome");
                break;
            }
        }
        if (count == str.length() / 2) {
            System.out.print("yes");
        }
    }

    //ex9
    /*

     */

    //ex12
    public static void duplicateCharacters() {
        System.out.println("input string");
        String str = sc.nextLine();
        str = str.toUpperCase();
        char[] chars = str.toCharArray();
        int count1 = 0;
        int count = 0;
        for (int i = 0; i < str.length(); i++) {
            for (int j = i + 1; j < str.length(); j++) {
                if (chars[i] == chars[j]) {
                    count++;
                }
            }
            if (count == 1) {
                count = 0;
            } else {
                count1++;
            }
            System.out.println(count1);
        }
    }

    //ex13
    /*
    Write a function that returns the first non-repeated character from a given string.
    */
    public static char firstNonRepeated() {
        String input = sc.nextLine();
        char[] chars = input.toCharArray();
        int count = 0;
        for (int i = 0; i < chars.length; i++) {
            for (int j = 0; j < chars.length; j++) {
                if (chars[i] == chars[j]) {
                    count++;
                    if (count > 1) {
                        break;
                    }
                }
            }if (count == 1){
                return chars[i];
            }
        }
        return 0;
    }

    //ex14
    /*

     */
}