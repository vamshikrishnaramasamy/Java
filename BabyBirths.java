import edu.duke.*;
import org.apache.commons.csv.*;
import java.util.*;

public class BabyBirths {

    public int countRows(CSVParser parser) {
        int rowCount = 0;
        for (CSVRecord record : parser) {
            rowCount++;
        }
        return rowCount;
    }

    private int getBabyCount(FileResource fr, String targetName) {
        CSVParser parser = fr.getCSVParser(false); 
        for (CSVRecord record : parser) {
            String name = record.get(0);
            if (name.equalsIgnoreCase(targetName)) {
                return Integer.parseInt(record.get(2));
            }
        }
        return -1; 
    }

    public String popularityRankFinder(FileResource fr, String name) {
        int targetCount = getBabyCount(fr, name);
        if (targetCount == -1) {
            return "Name not found";
        }

        int rank = 1;
        CSVParser parser = fr.getCSVParser(false);
        for (CSVRecord record : parser) {
            String currentName = record.get(0);
            int count = Integer.parseInt(record.get(2));
            if (!currentName.equalsIgnoreCase(name) && count > targetCount) {
                rank++;
            }
        }

        return Integer.toString(rank);
    }

    public String getNameAtRank(FileResource fr, int targetRank) {
        int currentRank = 1;
        CSVParser parser = fr.getCSVParser(false);

        for (CSVRecord record : parser) {
            String name = record.get(0);
            int count = Integer.parseInt(record.get(2));

            if (currentRank == targetRank) {
                return name;
            }
            currentRank++;
        }

        return "Rank not found";
    }

    public void testRank() {
        FileResource fr = new FileResource();
        Scanner scanner = new Scanner(System.in);
        System.out.print("What is your name: ");
        String name = scanner.nextLine();
        String rank = popularityRankFinder(fr, name);
        System.out.println("Rank of your name: " + rank);
    }

    public void findEquivalentNameInNewFile() {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Select the original file:");
        FileResource originalFile = new FileResource();
        System.out.print("What is your name? ");
        String name = scanner.nextLine();

        String rankStr = popularityRankFinder(originalFile, name);
        if (rankStr.equals("Name not found")) {
            System.out.println("That name was not found in the original file.");
            return;
        }

        int rank = Integer.parseInt(rankStr);
        System.out.println(name + " is ranked #" + rank + " in the original file.");

        System.out.println("Select the comparison file:");
        FileResource newFile = new FileResource();

        String newName = getNameAtRank(newFile, rank);
        System.out.println("In the new file, the name at the same rank (" + rank + ") is: " + newName);
    }
}
