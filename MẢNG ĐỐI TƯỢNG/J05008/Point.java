package J05008;

public class Point {
    private double x, y;
    public Point() {};
    public Point(double x, double y) {
        this.x = x;
        this.y = y;
    }
    public Point(Point that) {
        this.x = that.x;
        this.y = that.y;
    }
    public double getX() { return x; }
    public double getY() { return y; }
    public double distance(Point that) {
        return Math.sqrt(Math.pow(this.x - that.x, 2) + Math.pow(this.y - that.y, 2));
    }
    public static double distance(Point p1, Point p2) {
        return Math.sqrt(Math.pow(p1.x - p2.x, 2) + Math.pow(p1.y - p2.y, 2));
    }
}
