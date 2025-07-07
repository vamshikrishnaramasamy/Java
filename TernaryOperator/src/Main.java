

public class Main {
    public static void main(String[] args) {
        int score = 70;
        if (score>=60) {
            System.out.println("You passed!");
        } else {
            System.out.println("You failed!");
        }

        String passOrFail = (score>= 60) ? "You Ternary Passed!" : "You Ternary Failed!";
        System.out.println(passOrFail);
    }
}