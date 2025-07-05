import java.io.BufferedWriter;
import java.io.FileWriter;
public class Main {
    public static void main(String[] args) {
        BufferedWriter writer = new BufferedWriter(new FileWriter("pokemon.txt"));
    }
}