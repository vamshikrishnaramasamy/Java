public class Main {
    public static void main(String[] args) {
        System.out.println("This is how to use pi "+Math.PI);
        System.out.println("This is how to use e "+Math.E);

        // Below for 
        double results;
        results = Math.pow(2,3);
        System.out.println("This is an example of using the  function "+ results);

        // Below for absolute value
        results = Math.abs(-69);
        System.out.println("This is an example of using the absolute value function " + results);

        // Below for square root
        results = Math.sqrt(9);
        System.out.println("This is an example of using the square root function "+results);

        // Below for rounding to nearest integer value
        results = Math.round(6.9);
        System.out.println("This is an example of rounding to the nearest integer "+results);

        // Below for forced round down
        results = Math.floor(6.9);
        System.out.println("This is an example of a forced round down "+results);

        // Below for forced round up
        results = Math.ceil(Math.PI);
        System.out.println("This is an example of a forced round up "+results);

        // Below to find maximum between two numbers
        results = Math.max(69,420);
        System.out.println("This is an example of using the max function to find which of 2 numbers has the highest value "+results);

        // Below to find minimum between two numbers
        results = Math.min(69,420);
        System.out.println("This is an example of using the min function to find which of 2 numbers has the lowest value "+results);
    }
}