import java.util.Scanner;
import java.util.Arrays;

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
            System.out.print(userInputArray[i] + " ");
        }

        int sum = Arrays.stream(userInputArray).sum();
        System.out.println(" ");
        System.out.println("This is the sum of your array: "+sum);
        double average = (double)sum/(double)size;
        System.out.println("This is the average value of a number in your array: " + average);
    }
}