import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Please enter your name: ");
        // use scanner.nextLine() for strings
        // use scanner.nextInt() for integers
        // use scanner.nextDouble() for decimal point numbers
        // use scanner.next Boolean() for boolean values
        String name = scanner.nextLine();

        System.out.print("Are you a student? (true/false): ");
        boolean isStudent = scanner.nextBoolean();

        System.out.print("Please state your age: ");
        int age = scanner.nextInt();

        System.out.print("Please state your GPA: ");
        double GPA = scanner.nextDouble();



        System.out.println("Name: " + name + "\nStudent: " + isStudent + "\nAge: " + age + "\nGPA: " + GPA);

        scanner.close();
    }
}