package HOMEWORK.Day13;

public class Main {
    public static void main(String[] args) {
        bestTrow();
    }

    //1
    /*
    1.Create an n × n array and fill it according to the following rule:
    - the numbers on the diagonal going from the upper right to the lower left
    corner are equal to 1;
    - the other elements are 0;
    - print matrix
    *///matrix[i][n-1-i]
    public static void fillSecondDiagonal() {
        int[][] matrix = {{4, 5, 8}, {2, 7, 0}, {7, 5, 6}};
        for (int i = 0; i < matrix.length; i++) {
            for (int j = 0; j <= matrix.length; j++) {
                if (j == 3) {
                    System.out.println();
                } else if (j == matrix.length - 1) {
                    matrix[i][j] = 1;
                    System.out.print(matrix[i][j]);
                } else {
                    System.out.print(matrix[i][j]);
                }

            }

        }
    }

    //ex2
    /*
    Create an n × n array and fill it according to the following rule:
    - the numbers on the diagonal going from the upper right to the lower left
    corner are equal to 1;
    - numbers above this diagonal are equal to 0;
    - the numbers below this diagonal are equal to 2
    */
    public static void fillAboveAndBelow() {
        int[][] matrix = {{4, 5, 8}, {2, 7, 0}, {7, 5, 6}};
        for (int i = 0; i < matrix.length; i++) {
            for (int j = 0; j <= matrix.length; j++) {
                if (j == 3) {
                    System.out.println();
                } else if (j == i) {
                    matrix[i][j] = 1;
                    System.out.print(matrix[i][j]);
                } else if (i > j) {
                    System.out.print(0);
                } else {
                    System.out.print(2);
                }
            }
        }
    }

    //ex3
    /*
    Check if the two-dimensional array is symmetrical about the main
    diagonal. The main diagonal is the one that goes from the upper left
    corner of the two-dimensional array to the lower right.
     */
    public static void twoMatrixCheck() {
        int[][] matrix = {{1, 5, 5}, {2, 7, 0}, {7, 5, 6}};
        int[][] matrix2 = {{4, 5, 8}, {2, 7, 0}, {7, 5, 6}};
        int count = 0;
        for (int i = 0; i < matrix.length; i++) {
            for (int j = 0; j <= matrix.length; j++) {
                if (i == j && matrix[i][j] == matrix2[i][j])
                    count++;
            }
        }
        if (count == 3) {
            System.out.println("yes");
        } else {
            System.out.println("no");
        }
    }

    //ex4
    /*
    Input` The program receives as input two numbers n and m, which are
    the number of rows and columns in the array. Then in the input stream
    there are n lines containing m numbers each, which are the elements of
    the array.
    Output` The program should display 2 numbers: the amount and the line
    number for which this amount is reached. If there are several such lines,
    then the number of the smallest of them is displayed. Do not forget that
    line numbering (for athletes) starts at 0.
    */
    public static void atletSum() {
        int[][] matrix = {{1, 2, 3},
                {2, 4, 4}};

        int count = 0;
        int count2 = 0;
        for (int i = 0; i < 2; i++) {
            for (int j = 0; j < 3; j++) {
                if (i == 0) {
                    count += matrix[i][j];
                }
                if (i == 1) {
                    count2 += matrix[i][j];
                }
            }
        }
        if (count > count2) {
            System.out.println(count);
            {
                System.out.println(count2);
            }
        }
    }

    //ex5
    /*
    There are n athletes competing in hammer throw. Each of them made
    m throws. The winner of the competition is the athlete who has the best
    result in all throws. Thus, the program must find the value of the
    maximum element in the given array, as well as its indices (that is, the
    number of the athlete and the number of the attempt).
    Input `
    The program receives as input two numbers n and m, which are the
    number of rows and columns in the array. Then in the input stream there
    are n lines containing m numbers each, which are the elements of the
    array.
    Output`
    The program prints out the value of the maximum element, then the
    row number and the column number in which it occurs. If there are
    several maximum elements in the array, then you need to display the
    minimum line number in which such an element occurs, and if there are
    several such elements in this line, then you need to display the minimum
    column number. Remember that all rows and columns are numbered
    from 0.
     */
    public static void bestResult() {
        int[][] matrix = {{1, 2, 3},
                {2, 4, 4}, {3, 9, 4}};
        int x = 0;
        for (int i = 0; i < matrix.length; i++){
        for (int j = 1; j < matrix.length; j++)

                if (matrix[i][j] > matrix[i][j - 1]){
                        x = matrix[i][j];
                }
        }
        System.out.println(x);
    }


    //ex6
    public static void bestTrow() {
        int[][] matrix = {{1, 5, 5}, {2, 7, 0}, {7, 5, 6}};
        int x = 0;
        int y = 0;
        for (int i = 0; i < 3; i++)
            for (int j = 0; j < 3; j++) {
                if (matrix[i][j] > x) {
                    x = matrix[i][j];
                }
                else{
                    y = x;

            }
        }if (x == y){
            System.out.println("draw");
        }
        System.out.println(y);
}

        //ex8
    /*
    Write a Java program to add two matrices of the same size.
    */
        public static void twoMatrix() {
            int[][] matrix = {{1, 5, 5}, {2, 7, 0}, {7, 5, 6}};
            int[][] matrix2 = {{4, 5, 8}, {2, 7, 0}, {7, 5, 6}};
            int j = 0;
            for (int i = 0; i < 3; i++) {
                for (; j < 3; j++)


                    System.out.print(matrix[i][j] + matrix2[i][j] + "  ");

                if (j == 3) {
                    System.out.println();
                    j = j - 3;
                }
//                System.out.println(matrix[i][j] + matrix2[i][j]);
            }

        }

        //ex9
        /*

         */
    }
