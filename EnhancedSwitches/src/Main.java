import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Please enter what day of the week it is: ");
        String day = scanner.nextLine();
        day = day.toLowerCase();
        switch (day) {
            case "monday", "tuesday", "wednesday", "thursday", "friday"  -> System.out.println("Its a weekday.");
            case "saturday", "sunday" -> System.out.println("Its a weekend!");
            default -> System.out.println(day + " is not a day.");
        }
    }
}