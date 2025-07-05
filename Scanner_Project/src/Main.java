import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        // Calculate area of a rectangle

        double width = 0;
        double height = 0;

        Scanner scanner = new Scanner(System.in);

        System.out.println("This is a program to find the area of a rectangle");
        System.out.print("Please enter the width of the rectangle: ");
        width = scanner.nextDouble();

        System.out.print("Please enter the height of the rectangle: ");
        height = scanner.nextDouble();

        double area = width*height;

        System.out.print("The area of the rectangle is: " + area + " units²");
    }
}