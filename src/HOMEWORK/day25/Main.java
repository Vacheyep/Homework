package HOMEWORK.day25;

public class Main {
    public static void main(String[] args) {
        int[] arr1 = {1, 2, 3, 4, 5};
        //ex1
        System.out.println(sumOfArray(arr1, arr1.length));
        System.out.println(factorial(4));
        //ex2
        System.out.println(fib(4));
        //ex3
        System.out.println(numOfBlocks(4));
        //ex4
        System.out.println(sumOfDigits(0));
        //ex5
        System.out.println(countOfOccurrence(54556, 5));
        //ex6
        System.out.println(numOfLowercaseX("qwxxxex"));
        //ex7
        System.out.println(removeX("klaxxxksx"));
        //ex8
        System.out.println(revers("hello"));
        //ex9
        System.out.println(move("xxlkxx"));
        //ex10
        System.out.println(cleanedString("abbbcdd"));
        //ex11
        System.out.println(primeOrNot(11));
        //ex12
        System.out.println(theLargestDigit("1234024654956987"));
        //ex13
        System.out.println(theNumberOfDigit("4gda1dc5s4rv25s4e41"));
        //ex14
        System.out.println(add("lkjhgfdsa"));
        //ex15
        System.out.println(add2("asdfghjkl"));

    }

    //1.Write a recursive function
    //- to find the sum of a given array.
    //- to find the factorial of a given natural N.

    static int sumOfArray(int arr[], int n) {
        if (n <= 0) {
            return 0;
        }
        return (sumOfArray(arr, n - 1) + arr[n - 1]);
    }

    static int factorial(int N) {
        if (N >= 1)
            return N * factorial(N - 1);
        else
            return 1;
    }

    //2.Write a fib(int) function which returns n-th fibonacci number.
    static int fib(int n) {
        if (n >= 1) {
            return n;
        }
        return fib(n - 2) + fib(n - 1);
    }
    //3.We have triangles made of blocks. The topmost row has 1 block, the next
    //row down has 2 blocks, the next row has 3 blocks, and so on. Compute
    //recursively (no loops or multiplication) the total number of blocks in
    //such a triangle with the given number of rows.
    //Example`  triangle(0) -> 0
    //          triangle(1) -> 1
    //          triangle(2) -> 3

    static int numOfBlocks(int n) {
        if (n == 0) {
            return n;
        }
        return n + numOfBlocks(n - 1);
    }

    //4.Given a non-negative int n, return the sum of its digits recursively (no
    //loops).
    static int sumOfDigits(int n) {
        if (n == 0) {
            return n;
        }
        return n % 10 + sumOfDigits(n / 10);
    }

    //5.Given a non-negative int n, return the count of the occurrences of 7 as
    //a digit, so for example 717 yields 2.
    static int countOfOccurrence(int n, int m) {

        if (n == 0) {
            return 0;
        }
        if (n % 10 == m) {
            return 1 + countOfOccurrence(n / 10, m);
        }
        return countOfOccurrence(n / 10, m);
    }

    //6.Given a string, compute recursively (no loops) the number of
    //lowercase 'x' chars in the string.
    //Example`
    //countX("xxhixx") → 4
    //countX("xhixhix") → 3
    //countX("hi") → 0
    static int numOfLowercaseX(String str) {

        if (str.length() == 0) {
            return 0;
        }
        if (str.startsWith("x")) {
            return 1 + numOfLowercaseX(str.substring(1));
        }
        return numOfLowercaseX(str.substring(1));
    }

    //7.Given a string, compute recursively a new string where all the 'x' chars
    //have been removed.
    //Use` str.substring()
    static String removeX(String str) {
        if (str.length() == 0) {
            return "";
        }
        if (str.startsWith("x")) {
            return removeX(str.substring(1));
        }
        return str.charAt(0) + removeX(str.substring(1));
    }

    //8.Write recursive function that reverses the given String.
    //Example` HELLO -> OLLEH
    static String revers(String str) {
        if (str.length() == 0) {
            return "";
        }
        String out = String.valueOf(str.charAt(str.length() - 1));
        return out + revers(str.substring(0, str.length() - 1));
    }

    //9.Given a string, compute recursively a new string where all the
    //lowercase 'x' chars have been moved to the end of the string.
    //EXample`
    //endX("xxre") → "rexx"
    //endX("xxhixx") → "hixxxx";

    static String move(String str) {
        if (str.length() == 0) {
            return "";
        }
        if (str.startsWith("x")) {
            return move(str.substring(1)) + 'x';
        }
        return str.charAt(0) + move(str.substring(1));
    }
    //10.Given a string, return recursively a "cleaned" string where adjacent
    //chars that are the same have been reduced to a single char. So "yyzzz";
    //yields "yz".
    //EXample`
    //stringClean("yyzzz") → "yz"
    //stringClean("abbbcdd") → "abcd"

    static String cleanedString(String str) {
        if (str.length() == 0) {
            return "";
        }
        if (str.length() == 1) {
            return str;
        }
        if (str.startsWith(String.valueOf(str.charAt(1)))) {
            return str.charAt(0) + cleanedString(str.substring(2));
        }
        return str.charAt(0) + cleanedString(str.substring(2));
    }

    //11.Write a function to determine if a number is prime or not.
    static boolean primeOrNot(int num) {
        final int i = num;
        if (num == 1) {
            return true;
        }
        if (i % (num - 1) == 0) {
            return false;
        }
        return primeOrNot(num - 1);
    }


    //12.Given a string containing only decimal digits. Find and display the
    //largest digit.
    static String theLargestDigit(String num) {
        if (num.length() == 1 || num.length() == 0) {
            return num;
        }
        if (num.charAt(num.length() - 1) > num.charAt(0)) {
            return theLargestDigit(num.substring(1));
        }
        return theLargestDigit(num.substring(0, num.length() - 1));
    }

    //13.You are given a string containing numbers and English letters
    //(uppercase and lowercase). Find and display the number of digits.
    static int theNumberOfDigit(String num) {
        if (num.length() == 1 && Character.isDigit(num.charAt(0))) {
            return 1;
        }
        if (Character.isDigit(num.charAt(0))) {
            return 1 + theNumberOfDigit(num.substring(1));
        }
        return theNumberOfDigit(num.substring(1));
    }

    //14.Given a string containing only English letters (uppercase and
    //lowercase). Add the ‘*’ (asterisk) character between letters (you don’t
    //need to add ‘*’ before the first letter and after the last).
    //Example ` LItBeoFLcSGBOFQxMHoIuDDWcqcVgkcRoAeocXO
    //L*I*t*B*e*o*F*L*c*S*G*B*O*F*Q*x*M*H*o*I*u*D*D*W*c*q*c*V*g*k*c*
    //R*o*A*e*o*c*X*O
    static String add(String str) {
        if (str.length() <= 1) {
            return str;
        }
        return str.charAt(0) + "*" + add(str.substring(1));
    }

    //15.Given a string containing only English letters (uppercase and
    //lowercase). Add opening and closing parentheses according to the
    //following pattern: &quot;example&quot; -&gt; &quot;(e (x (a (m) p) l) e)&quot; (Added opening
    //parentheses to the middle, closing parentheses after the middle. In case
    //the string length is even there must be 2 characters in the brackets in the
    //middle. (&quot;card -&gt; (c (ar) d)&quot; but not &quot;(c (a () r) d)&quot;).
    //Example`
    //LItBeoFLcSGBOFQxMHoIuDDWcqcVgkcRoAeocXO
    //(L(I(t(B(e(o(F(L(c(S(G(B(O(F(Q(x(M(H(o(I)u)D)D)W)c)q)
    //c)V)g)k)c)R)o)A)e)o)c)X)O)
    static String add2(String num) {
        if (num.length() == 1) {
            return num;
        }
        if (num.charAt((num.length() / 2) - 1) == '(') {
            return ")" + num.charAt(0) + add2(num.substring(1));
        }
        return "(" + num.charAt(0) + add2(num.substring(1));
    }
}