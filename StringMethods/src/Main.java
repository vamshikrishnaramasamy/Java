public class Main {
    public static void main(String[] args) {
        String name = "Vamshikrishna Ramasamy";

        int length = name.length();
        System.out.println("My name is "+(length-1) + " letters long.");

        char letter = name.charAt(13);
        System.out.println("Take"+letter+"a look at the code for this line.");

        int parsedString = 0;
        String remainingString = "";
        int index;
        for (int i = 0; i < 5; i++) {
            index = name.indexOf("a", parsedString);
            parsedString = index+1;
            System.out.println(index);
        }
    }
}