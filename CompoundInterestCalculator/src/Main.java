import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        double principal;
        double interestRate;
        double numberOfCompoundings;
        double years;
        double finalAmount;
        System.out.println("Please enter how much principal you are investing: ");
        principal = scanner.nextDouble();
        System.out.println("Please enter the interest rate (ex. 7% = 0.07): ");
        interestRate = scanner.nextDouble();
        System.out.println("Please enter the number of compoundings per year: ");
        numberOfCompoundings = scanner.nextDouble();
        System.out.println("Please enter the amount of time in years that your money will remain invested: ");
        years=scanner.nextDouble();

        double hardPart = Math.pow((1+interestRate/numberOfCompoundings),(numberOfCompoundings*years));
        finalAmount=principal*hardPart;
        System.out.println("After "+years+" years, you will have $"+finalAmount);
    }
}