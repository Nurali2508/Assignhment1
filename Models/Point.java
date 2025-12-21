package Models;

public class Point {
    private double x, y;
    public Point(double x, double y) {
        this.x = x;
        this.y = y;
    }

    public double distance(Point p) {
        double dx = this.x - p.x;
        double dy = this.y - p.y;
        double distance = Math.sqrt(dx * dx + dy * dy);
        return distance;
    }
}
