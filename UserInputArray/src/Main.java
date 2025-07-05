import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Please enter the size of the array: ");
        int size = scanner.nextInt();
        int userInputArray[] = new int[size];
        for (int i = 0; i < size; i++) {
            System.out.print("Please enter a number: ");
            userInputArray[i] = scanner.nextInt();
        }

        System.out.print("This is your array: ");
        for (int i = 0; i < size; i++) {
            System.out.print(userInputArray[i] + ", ");
        }
    }
}