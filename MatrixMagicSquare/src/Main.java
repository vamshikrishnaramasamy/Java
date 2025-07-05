// Write a Java program that:
//        1. Takes a square matrix (NxN) of integers as input.
//        2. Checks whether the matrix is a magic square:
//         • All rows, columns, and diagonals must add up to the same number.
//        3. Uses:
//        • A class to encapsulate matrix behavior
//        • Methods to check row, column, and diagonal sums
//          for loops, if statements, and nested loops
//
// What's a Magic Square?
// A matrix is a magic square if all rows, columns, and diagonals sum to 15
// Requirements:
// Use a Matrix class with methods:
// isMagicSquare()
// printMatrix()
// Accept matrix input from the user
// Use for loops and nested loops for calculation
// Compare sums using if conditions

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("This is a program to check if a 3x3 square matrix is a magic square or not.");

        System.out.print("Please enter the value of row one column one: ");
        int oneOne = scanner.nextInt();
        System.out.print("Please enter the value of row one column two: ");
        int oneTwo = scanner.nextInt();
        System.out.print("Please enter the value of row one column three: ");
        int oneThree = scanner.nextInt();
        System.out.print("Please enter the value of row two column one: ");
        int twoOne = scanner.nextInt();
        System.out.print("Please enter the value of row two column two: ");
        int twoTwo = scanner.nextInt();
        System.out.print("Please enter the value of row two column three: ");
        int twoThree = scanner.nextInt();
        System.out.print("Please enter the value of row three column one: ");
        int threeOne = scanner.nextInt();
        System.out.print("Please enter the value of row three column two: ");
        int threeTwo = scanner.nextInt();
        System.out.print("Please enter the value of row three column three: ");
        int threeThree = scanner.nextInt();

        isMagicSquare(oneOne,oneTwo,oneThree,twoOne,twoTwo,twoThree,threeOne,threeTwo,threeThree);
    }
    public static void isMagicSquare (int one, int two, int three, int four, int five, int six, int seven, int eight, int nine) {
        int sum1 = one+two+three;
        int sum2 = four+five+six;
        int sum3 = seven+eight+nine;

        System.out.println("This is your matrix:");
        System.out.println(one + " " + two + " " + three);
        System.out.println(four + " " + five + " " + six);
        System.out.println(seven + " " + eight + " " + nine);

        int sum4 = one+four+seven;
        int sum5 = two+five+eight;
        int sum6 = three+six+nine;

        int sum7 = one+five+nine;
        int sum8 = three+five+seven;

        if (sum1 == sum2 && sum1==sum3 && sum1==sum4 && sum1==sum5 && sum1==sum6 && sum1==sum7 && sum1==sum8) {
            System.out.println("This IS a magic square");
        }
        else {
            System.out.println("This is NOT a magic square!");
        }
    }
}
