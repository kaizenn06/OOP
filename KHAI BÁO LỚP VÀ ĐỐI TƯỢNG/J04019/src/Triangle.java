package J04019;

public class Triangle {
    private Point a, b, c;
    private double ab, ac, bc;
    private double Perimeter;
    public Triangle(Point a, Point b, Point c) {
        this.a = a;
        this.b = b;
        this.c = c;
    }
    public boolean valid() {
        ab = a.distance(b);
        ac = a.distance(c);
        bc = b.distance(c);
        Perimeter = ab + ac + bc;
        if (ab + ac > bc && ab + bc > ac && ac + bc > ab) return true;
        else return false;
    }
    public String getPerimeter() {
        return String.format("%.3f", Perimeter);
    }

}
