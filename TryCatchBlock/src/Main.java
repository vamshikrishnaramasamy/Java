import java.util.InputMismatchException;
import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        try {
            System.out.println("Enter a whole number to divide: ");
            int x = scanner.nextInt();
            System.out.println("Enter a whole number to divide by: ");
            int y = scanner.nextInt();

            int z = x / y;
            System.out.println("Result: " + z);
        } catch (ArithmeticException exception) {
            System.out.println("You can't divide by zero!");
        } catch (InputMismatchException exception) {
            System.out.println("Wrong input type!");
        } catch (Exception exception) {
            System.out.println("Something went wrong, please try again!");
        } finally {
            System.out.println("This will always execute.");
        }
    }
}