import java.util.Arrays;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String[] fruits = {"Eggplant", "Banana", "Watermelon", "Durian", "Apple"};
        fruits[1] = "Bornana";
        int numberOfFruits = fruits.length;
        System.out.println(fruits[1]);
        System.out.println("There are " + numberOfFruits + " fruits in this array.");

        // If you want to print all the elements of an array do below

        for (int i = 0; i < 5; i++) {
            System.out.println(fruits[i]);
        }

        System.out.println("\nI will now print the fruits in alphabetical order.\n");

        // Must import arrays before you can use the sort method

        Arrays.sort(fruits);
        for (int i = 0; i < 5; i++) {
            System.out.println(fruits[i]);
        }
