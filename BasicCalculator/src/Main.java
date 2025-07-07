import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        char operator;
        double result=0;
        double number1;
        double number2;
        boolean validOperation = true;

        System.out.print("Please enter the first number: ");
        number1 = scanner.nextDouble();
        System.out.println("Please enter one of the following operators:");
        System.out.print("+, -, *, /, ^ : ");
        operator = scanner.next().charAt(0);
        System.out.print("Please enter the second number: ");
        number2 = scanner.nextDouble();

        switch(operator) {
            case '+' -> result = number1 + number2;
            case '-' -> result = number1 - number2;
            case '*' -> result = number1 * number2;
            case '/' -> {
                            if (number2 == 0) {
                                System.out.println("You cannot divide by zero. Please try again!");
                                validOperation = false;
                            } else {
                                result = number1/number2;
                            }
                        }
            case '^' -> result = Math.pow(number1,number2);
            default -> {
                System.out.println("You have not entered a valid operator. Please try again.");
                validOperation =false;
            }
        }
        if (validOperation == true) {
            System.out.println("Your answer is : " + result);
        } else {

        }
    }
}