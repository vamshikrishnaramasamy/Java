import java.io.FileReader;
import java.io.IOException;
import java.io.FileNotFoundException;
public class Main {
    public static void main(String[] args) {
        try {
            FileReader reader = new FileReader("poem.txt");
            int ascii = reader.read();
            while (ascii != -1) {
                System.out.print((char)ascii);
                ascii = reader.read();
            }
        } catch (FileNotFoundException e) {
            System.out.println("File not found");
        } catch (IOException e) {
            System.out.println("IO Error/exception");
        }
    }
}