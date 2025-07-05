import java.awt.Point;
import java.util.*;

public class Main {

    public double getPerimeter(List<Point> points) {
        double totalPerim = 0.0;
        if (points.size() < 2) return 0;
        Point prevPt = points.get(points.size() - 1);
        for (Point currPt : points) {
            totalPerim += prevPt.distance(currPt);
            prevPt = currPt;
        }
        return totalPerim;
    }

    public List<Point> readPointsFromUser() {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter the number of points in the shape: ");
        int n = scanner.nextInt();

        List<Point> points = new ArrayList<>();
        for (int i = 0; i < n; i++) {
            System.out.print("Enter x coordinate of point " + (i+1) + ": ");
            int x = scanner.nextInt();
            System.out.print("Enter y coordinate of point " + (i+1) + ": ");
            int y = scanner.nextInt();
            points.add(new Point(x, y));
        }
        return points;
    }

    public void testPerimeter() {
        List<Point> shapePoints = readPointsFromUser();
        double length = getPerimeter(shapePoints);
        System.out.println("Perimeter = " + length);
    }

    public static void main(String[] args) {
        Main pr = new Main();
        pr.testPerimeter();
    }
}
