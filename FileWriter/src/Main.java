import java.io.FileNotFoundException;
import java.io.FileWriter;
import java.io.IOException;

public class Main {
    public static void main(String[] args) {
        try {
            FileWriter writer = new FileWriter("poem.txt", false);
            writer.write("Roses are red\nViolets are blue");
            writer.close();
        } catch (FileNotFoundException e) {
            System.out.println("File not found :(");
        } catch (IOException e) {
            System.out.println("IO Exception/Error");
        }
    }
}
