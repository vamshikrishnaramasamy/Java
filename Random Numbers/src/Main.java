import java.util.Random;

public class Main {
    public static void main(String[] args) {
        Random random = new Random();

        int randomNumber;
        randomNumber = random.nextInt(1,11);
        System.out.println(randomNumber);

        double randomDecimal;
        randomDecimal = random.nextDouble(1,11);
        System.out.println(randomDecimal);

        boolean coin;
        coin = random.nextBoolean();
        if (coin) {
            System.out.println("Heads");
        }
        else {
            System.out.println("Tails");
        }
    }
}