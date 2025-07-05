public class Main {
    public static void main(String[] args) {
        int integer = 10;
        System.out.println("This is an integer: " + integer);
        double decimal = integer;
        System.out.println("This is a double: " + decimal);

        // for some conversions the computer will do it by itself like above, but for
        // others you have to specify

        double pi = 3.141592653;
        System.out.println("This is a double: " + pi);
        int pie = (int)pi;
        System.out.println("And this is an integer: " + pie);

        String textNumber = "3";
        System.out.println("This is a string (No, I didn't make a mistake): " + textNumber);
        int number = Integer.parseInt(textNumber);
        System.out.println("This is the above string converted to an integer: " + number);

    }
}