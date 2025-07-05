import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("What are you purchasing today: ");
        String item = scanner.nextLine();
        System.out.print("What is the price per " + item + ": ");
        double price = scanner.nextDouble();
        System.out.print("How many " + item + "s will you be purchasing today: ");
        int numberOfItems = scanner.nextInt();

        double taxRate = 1.0725;
        double cost = price*numberOfItems*taxRate;

        System.out.print("Your total price for " + numberOfItems + " " + item + "/s is $" + cost);
    }
}