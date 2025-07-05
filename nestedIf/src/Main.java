import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        boolean isStudent;
        boolean isSenior;
        double price = 9.99;
        Scanner scanner = new Scanner(System.in);

        System.out.println("Are you a student: ");
        String askStudent = scanner.nextLine();
        askStudent = askStudent.toUpperCase();
        if (askStudent.equals("YES")) {
            isStudent = true;
        }
        else {
            isStudent = false;
        }

        System.out.println("Are you a senior: ");
        String askSenior = scanner.nextLine();
        askSenior = askSenior.toUpperCase();
        if (askSenior.equals("YES")) {
            isSenior = true;
        }
        else {
            isSenior = false;
        }

        if (isStudent) {
            System.out.println("You get the student discount!");
            price = price*0.9;
            if (isSenior){
                System.out.println("You also get the senior discount!");
                price=price*0.9;
                System.out.println("Your total is $"+price);
            }
            else {
                System.out.println("Your total is $"+price);
            }

        } else if (isSenior) {
            System.out.println("You get the senior discount!");
            price=price*0.9;
            System.out.println("Your total is $"+price);
        } else {
            System.out.println("Your total is $"+price);
        }

    }
}