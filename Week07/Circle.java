package Week07;

public class Circle {

    private Point centre;
    private double radius;

    public Circle() {
    }

    public Circle(int x, int y, double radius) {
        this.centre = new Point(x, y);
        this.radius = radius;
    }

    public Point getCentre() {
        return centre;
    }

    public void setCentre(int x, int y) {
        this.centre = new Point(x, y);
    }

    public double getRadius() {
        return radius;
    }

    public void setRadius(double radius) {
        this.radius = radius;
    }

    public double area() {
        return Math.PI*getRadius()*getRadius();
    }

    public double perimeter() {
        return 2*Math.PI*getRadius();
    }


    @Override
    public String toString() {
        return "Circle " + getCentre() + "\nRadius " + getRadius() +
                "\nArea " + area() + "\nPerimeter " + perimeter();
    }
}
