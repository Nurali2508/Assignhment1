import Models.Point;
import Models.Shape;
import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;
import java.util.ArrayList;


class MyApplication {
    public static void main(String[] args) throws FileNotFoundException {
        File file = new File("C:\\Users\\Nurali\\IdeaProjects\\Assignhment st 2508\\src\\Source");

        Scanner sc = new Scanner(file);
        Shape shape = new Shape(new ArrayList<>());

        while (sc.hasNext()) {
            double x = Double.parseDouble(sc.next());
            double y = Double.parseDouble(sc.next());

            Point point = new Point(x, y);
            shape.addPoint(point);
        }

        System.out.println("Perimeter: " + shape.perimeter());
        System.out.println("Average side: " + shape.Avgside());
        System.out.println("Longest side: " + shape.Longestside());


    }
}
