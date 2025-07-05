import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Please enter your age: ");
        int age = scanner.nextInt();

        if (age >= 18) {
            System.out.print("You may vote.");
        } else if (age < 0) {
            System.out.print("Blud has NOT even been born yet.");
        } else {
            System.out.print("You may NOT vote.");
        }
    }
}