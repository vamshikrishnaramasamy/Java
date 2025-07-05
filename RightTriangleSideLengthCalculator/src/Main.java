import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("This is a program to calculate the missing side length of a right triangle.");

        try {
            Thread.sleep(2000);
        } catch (InterruptedException ie) {
        }

        System.out.print("Would you like to calculate the hypotenuse or the leg of a triangle? ");
        String whichSideLength = scanner.nextLine();

        double sideLength1;
        double sideLength2;
        double hypotenuse;

        if (whichSideLength.equals("hypotenuse")||whichSideLength.equals("Hypotenuse")) {
            System.out.print("Please enter the length of the first leg: ");
            sideLength1 = scanner.nextDouble();
            System.out.print("Please enter the length of the second leg: ");
            sideLength2 = scanner.nextDouble();
            hypotenuse = Math.sqrt(Math.pow(sideLength1,2) + Math.pow(sideLength2,2));
            System.out.print("The hypotenuse of this triangle is "+hypotenuse+" units long.");
        }
        else if (whichSideLength.equals("Leg")||whichSideLength.equals("leg")){
            System.out.print("Please enter the length of the hypotenuse: ");
            hypotenuse = scanner.nextDouble();
            System.out.print("Please enter the length of the leg: ");
            sideLength1 = scanner.nextDouble();
            sideLength2 = Math.sqrt(Math.pow(hypotenuse,2)-Math.pow(sideLength1,2));
            System.out.print("The missing leg of this triangle is "+sideLength2+" units long.");
        }
        else {
            System.out.print("You have entered an invalid input. Please run the program again to start over.");
        }
    }
}