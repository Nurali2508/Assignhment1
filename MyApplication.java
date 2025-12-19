import Models.Shape;
import java.io.File;
import Models.Point;
import java.io.FileNotFoundException;
import java.util.ArrayList;
import java.util.Locale;
import java.util.Scanner;

public class MyApplication {
    public static void main(String[] args) throws FileNotFoundException {

        File file = new File("C:\\Users\\Nurali\\IdeaProjects\\Assignhment st 2508\\src\\Source"); // проверь имя файла!
        Scanner sc = new Scanner(file).useLocale(Locale.US);
        sc.useLocale(Locale.US);

        Shape shape = new Shape(new ArrayList<>());

        while (sc.hasNextDouble()) {
            double x = sc.nextDouble();
            double y = sc.nextDouble();

            Point point = new Point(x, y);
            shape.addPoint(point);
        }
        sc.close();

        System.out.println(shape.perimeter());
        System.out.println(shape.Avgside());
        System.out.println(shape.Longestside());
    }
}
