import Models.Point;
import Models.Shape;
import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;
import java.util.ArrayList;

public class MyApplication {
    public static void main(String[] args) throws FileNotFoundException {
        File file = new File("C:\\Users\\Nurali\\IdeaProjects\\Assignhment st 2508\\src\\Source");

        Scanner sc = new Scanner(file);

        Shape shape = new Shape(new ArrayList<>());

        while (sc.hasNextDouble()) {
            double x = sc.nextDouble();
            double y = sc.nextDouble();

            shape.addPoint(new Point(x, y));
        }

        System.out.println("Perimeter: " + shape.perimeter());
        System.out.println("Average side: " + shape.Avgside());
        System.out.println("Longest side: " + shape.Longestside());
    }
}
