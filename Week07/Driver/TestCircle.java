package Week07.Driver;

import Week07.Circle;
import Week07.Cylinder;
import Week07.Point;

public class TestCircle {

    public static void main(String[] args) {
//
//        Point p1 = new Point();
//        Point p2 = new Point(5,3);
//
//        Circle c1 = new Circle();
//        Circle c2 = new Circle(2,4,5);

        Cylinder c1 = new Cylinder();
        Cylinder c2 = new Cylinder(0,0,0,0);

        System.out.println(c1);
        System.out.println(c2);
    }
}
