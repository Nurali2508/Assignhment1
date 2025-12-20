package Models;

public class Point {
    private double x;
    private double y;
    public Point(double xCrd,double yCrd){
        x=xCrd;
        y=yCrd;
    }
    public double distance(Point p) {
        double deltaX = this.x - p.x;
        double deltaY = this.y - p.y;
        double distance = Math.sqrt(deltaX * deltaX + deltaY * deltaY);
        return distance;
    }
}
